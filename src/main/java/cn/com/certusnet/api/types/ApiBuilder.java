/*
 * Copyright © 2017 CertusNet, Inc. and others.  All rights reserved.
 *
 * This program and the accompanying materials are made available under the
 * terms of the Eclipse Public License v1.0 which accompanies this distribution,
 * and is available at http://www.eclipse.org/legal/epl-v10.html
 */

package cn.com.certusnet.api.types;

import java.io.IOException;
import java.util.ArrayList;
import java.util.List;

import com.google.gson.Gson;
import com.google.gson.JsonArray;
import com.google.gson.JsonElement;
import com.google.gson.JsonObject;
import com.google.gson.JsonParser;

import cn.com.certusnet.api.types.ApiSerializer;

public class ApiBuilder {

    
    public String getTypename(Class<?> cls) {
        String clsname = cls.getName();
        int loc = clsname.lastIndexOf('.');
        if (loc > 0) {
            clsname = clsname.substring(loc + 1);
        }
        String typename = new String();
        for (int i = 0; i < clsname.length(); i++) {
            char ch = clsname.charAt(i);
            if (Character.isUpperCase(ch)) {
                if (i > 0) {
                    typename += "-";
                }
                ch = Character.toLowerCase(ch);
            }
            typename += ch;
        }
        return typename;
    }

    public ApiObjectBase jsonToApiObject(String data, Class<? extends ApiObjectBase> cls) {
        if (data == null) {
            return null;
        }
        final String typename = getTypename(cls);
        final JsonParser parser = new JsonParser();
        final JsonObject js_obj = parser.parse(data).getAsJsonObject();
        if (js_obj == null) {
            return null;
        }
        final JsonElement element = js_obj.get(typename);
        if (element == null) {
            return null;
        }
        ApiObjectBase resp = ApiSerializer.deserialize(element.toString(), cls);
        return resp;
    }

    // body: {"type": class, "fq_name": [parent..., name]}
    public String buildFqnJsonString(Class<? extends ApiObjectBase> cls, List<String> name_list) {
        Gson json = new Gson();
        JsonObject js_dict = new JsonObject();
        js_dict.add("type", json.toJsonTree(getTypename(cls)));
        js_dict.add("fq_name", json.toJsonTree(name_list));
        return   js_dict.toString();
     }

     public String getUuid(String data) {
        if (data == null) {
            return null;
        }
        final JsonParser parser = new JsonParser();
        final JsonObject js_obj= parser.parse(data).getAsJsonObject();
        if (js_obj == null) {
            return null;
        }
        final JsonElement element = js_obj.get("uuid");
        if (element == null) {
            return null;
        }
        return element.getAsString();
    }

    public List<? extends ApiObjectBase> jsonToApiObjects(String data, Class<? extends ApiObjectBase> cls, List<String> parent) throws IOException {
        if (data == null) {
            return null;
        }
        final String typename = getTypename(cls);
        List<ApiObjectBase> list = new ArrayList<ApiObjectBase>();
        final JsonParser parser = new JsonParser();
        final JsonObject js_obj= parser.parse(data).getAsJsonObject();
        if (js_obj == null) {
            return null;
        }
        final JsonArray array = js_obj.getAsJsonArray(typename + "s");
        if (array == null) {
            return null;
        }
        Gson json = ApiSerializer.getDeserializer();
        for (JsonElement element : array) {
            ApiObjectBase obj = json.fromJson(element.toString(), cls);
            if (obj == null) {
                continue;
            }
            list.add(obj);
        }
        return list;
    }
}
