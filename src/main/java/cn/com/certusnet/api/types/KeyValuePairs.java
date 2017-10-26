/*
 * Copyright © 2017 CertusNet, Inc. and others.  All rights reserved.
 *
 * This program and the accompanying materials are made available under the
 * terms of the Eclipse Public License v1.0 which accompanies this distribution,
 * and is available at http://www.eclipse.org/legal/epl-v10.html
 */
package cn.com.certusnet.api.types;

import java.util.List;
import java.util.ArrayList;


public class KeyValuePairs extends ApiPropertyBase {
    public static class KeyValuePair {
        String key;
        String value;
        public KeyValuePair() {
        }
        public KeyValuePair(String key, String value) {
            this.key = key;
            this.value = value;
        }
        public KeyValuePair(String key) {
            this(key, null);         }
        
        public String getKey() {
            return key;
        }
        
        public void setKey(String key) {
            this.key = key;
        }
        
        
        public String getValue() {
            return value;
        }
        
        public void setValue(String value) {
            this.value = value;
        }
        
    }
    List<KeyValuePair> key_value_pair;
    public KeyValuePairs() {
    }
    public KeyValuePairs(List<KeyValuePair> key_value_pair) {
        this.key_value_pair = key_value_pair;
    }
    
    public List<KeyValuePair> getKeyValuePair() {
        return key_value_pair;
    }
    
    
    public void addKeyValuePair(KeyValuePair obj) {
        if (key_value_pair == null) {
            key_value_pair = new ArrayList<KeyValuePair>();
        }
        key_value_pair.add(obj);
    }
    public void clearKeyValuePair() {
        key_value_pair = null;
    }
    
    
    public void addKeyValuePair(String key, String value) {
        if (key_value_pair == null) {
            key_value_pair = new ArrayList<KeyValuePair>();
        }
        key_value_pair.add(new KeyValuePair(key, value));
    }
    
}
