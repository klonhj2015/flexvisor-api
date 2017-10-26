/*
 * Copyright © 2017 CertusNet, Inc. and others.  All rights reserved.
 *
 * This program and the accompanying materials are made available under the
 * terms of the Eclipse Public License v1.0 which accompanies this distribution,
 * and is available at http://www.eclipse.org/legal/epl-v10.html
 */
package cn.com.certusnet.api.types;

import java.lang.reflect.Type;

import com.google.gson.ExclusionStrategy;
import com.google.gson.FieldAttributes;
import com.google.gson.Gson;
import com.google.gson.GsonBuilder;
import com.google.gson.JsonElement;
import com.google.gson.JsonNull;
import com.google.gson.JsonObject;
import com.google.gson.JsonSerializationContext;
import com.google.gson.JsonSerializer;


public class ApiSerializer {
    private static class ReferenceSerializer implements JsonSerializer<ObjectReference<? extends ApiPropertyBase>> {
        @SuppressWarnings("deprecation")
		@Override
        public JsonElement serialize(ObjectReference<? extends ApiPropertyBase> objref, Type type,
                JsonSerializationContext context) {
            JsonObject obj = new JsonObject();
            obj.add("to", context.serialize(objref.getReferredName()));
            JsonElement js_attr;
            if (objref.getAttr() == null) {
                js_attr = new JsonNull();
            } else {
                js_attr = context.serialize(objref.getAttr());
            }
            obj.add("attr", js_attr);
            obj.addProperty("href", objref.getHRef());
            obj.addProperty("uuid", objref.getUuid());
           return obj;
        }
    }

    static Gson getDeserializer() {
        GsonBuilder builder = new GsonBuilder();
        // Do not attempt to deserialize ApiObjectBase.parent
        return builder
//        		.excludeFieldsWithModifiers(Modifier.VOLATILE)
        		.setDateFormat("yyyy-MM-dd'T'HH:mm:ss.SSS")
        		.setExclusionStrategies(new ExclusionStrategy() {
					
					@Override
					public boolean shouldSkipField(FieldAttributes f) {
						// TODO Auto-generated method stub
						return f.getName().contains("uuid_lslong") || 
								f.getName().contains("uuid_mslong");
					}
					
					@Override
					public boolean shouldSkipClass(Class<?> clazz) {
						// TODO Auto-generated method stub
						return false;
					}
				})
        		.create();
    }
    
    static private Gson getSerializer() {
        GsonBuilder builder = new GsonBuilder();
        builder.registerTypeAdapter(ObjectReference.class, new ReferenceSerializer());
        return builder.create();
    }
    
    static ApiObjectBase deserialize(String str, Class<? extends ApiObjectBase> cls) {
        Gson json = getDeserializer();
        return json.fromJson(str, cls);
    }
    
    static String serializeObject(String typename, ApiObjectBase obj) {
        Gson json = getSerializer();
        JsonObject js_dict = new JsonObject();
        js_dict.add(typename, json.toJsonTree(obj));
        return js_dict.toString();
    }
}
