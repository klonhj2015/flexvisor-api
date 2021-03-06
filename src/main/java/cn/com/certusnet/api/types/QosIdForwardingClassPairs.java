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


public class QosIdForwardingClassPairs extends ApiPropertyBase {
    public static class QosIdForwardingClassPair {
        Integer key;
        Integer forwarding_class_id;
        public QosIdForwardingClassPair() {
        }
        public QosIdForwardingClassPair(Integer key, Integer forwarding_class_id) {
            this.key = key;
            this.forwarding_class_id = forwarding_class_id;
        }
        public QosIdForwardingClassPair(Integer key) {
            this(key, null);         }
        
        public Integer getKey() {
            return key;
        }
        
        public void setKey(Integer key) {
            this.key = key;
        }
        
        
        public Integer getForwardingClassId() {
            return forwarding_class_id;
        }
        
        public void setForwardingClassId(Integer forwarding_class_id) {
            this.forwarding_class_id = forwarding_class_id;
        }
        
    }
    List<QosIdForwardingClassPair> qos_id_forwarding_class_pair;
    public QosIdForwardingClassPairs() {
    }
    public QosIdForwardingClassPairs(List<QosIdForwardingClassPair> qos_id_forwarding_class_pair) {
        this.qos_id_forwarding_class_pair = qos_id_forwarding_class_pair;
    }
    
    public List<QosIdForwardingClassPair> getQosIdForwardingClassPair() {
        return qos_id_forwarding_class_pair;
    }
    
    
    public void addQosIdForwardingClassPair(QosIdForwardingClassPair obj) {
        if (qos_id_forwarding_class_pair == null) {
            qos_id_forwarding_class_pair = new ArrayList<QosIdForwardingClassPair>();
        }
        qos_id_forwarding_class_pair.add(obj);
    }
    public void clearQosIdForwardingClassPair() {
        qos_id_forwarding_class_pair = null;
    }
    
    
    public void addQosIdForwardingClassPair(Integer key, Integer forwarding_class_id) {
        if (qos_id_forwarding_class_pair == null) {
            qos_id_forwarding_class_pair = new ArrayList<QosIdForwardingClassPair>();
        }
        qos_id_forwarding_class_pair.add(new QosIdForwardingClassPair(key, forwarding_class_id));
    }
    
}
