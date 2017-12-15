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


public class QosBandwidthRuleEntriesType extends ApiPropertyBase {
    public static class QosBandwidthRuleType {
        String rule_uuid;
        Integer max_kbps;
        Integer max_burst_kbps;
        String direction;
        public QosBandwidthRuleType() {
        }
        public QosBandwidthRuleType(String rule_uuid, Integer max_kbps, Integer max_burst_kbps, String direction) {
            this.rule_uuid = rule_uuid;
            this.max_kbps = max_kbps;
            this.max_burst_kbps = max_burst_kbps;
            this.direction = direction;
        }
        public QosBandwidthRuleType(String rule_uuid) {
            this(rule_uuid, null, null, null);         }
        public QosBandwidthRuleType(String rule_uuid, Integer max_kbps) {
            this(rule_uuid, max_kbps, null, null);         }
        public QosBandwidthRuleType(String rule_uuid, Integer max_kbps, Integer max_burst_kbps) {
            this(rule_uuid, max_kbps, max_burst_kbps, null);         }
        
        public String getRuleUuid() {
            return rule_uuid;
        }
        
        public void setRuleUuid(String rule_uuid) {
            this.rule_uuid = rule_uuid;
        }
        
        
        public Integer getMaxKbps() {
            return max_kbps;
        }
        
        public void setMaxKbps(Integer max_kbps) {
            this.max_kbps = max_kbps;
        }
        
        
        public Integer getMaxBurstKbps() {
            return max_burst_kbps;
        }
        
        public void setMaxBurstKbps(Integer max_burst_kbps) {
            this.max_burst_kbps = max_burst_kbps;
        }
        
        
        public String getDirection() {
            return direction;
        }
        
        public void setDirection(String direction) {
            this.direction = direction;
        }
        
    }
    List<QosBandwidthRuleType> qos_policy_rule;
    public QosBandwidthRuleEntriesType() {
    }
    public QosBandwidthRuleEntriesType(List<QosBandwidthRuleType> qos_policy_rule) {
        this.qos_policy_rule = qos_policy_rule;
    }
    
    public List<QosBandwidthRuleType> getQosPolicyRule() {
        return qos_policy_rule;
    }
    
    
    public void addQosPolicyRule(QosBandwidthRuleType obj) {
        if (qos_policy_rule == null) {
            qos_policy_rule = new ArrayList<QosBandwidthRuleType>();
        }
        qos_policy_rule.add(obj);
    }
    public void clearQosPolicyRule() {
        qos_policy_rule = null;
    }
    
    
    public void addQosPolicyRule(String rule_uuid, Integer max_kbps, Integer max_burst_kbps, String direction) {
        if (qos_policy_rule == null) {
            qos_policy_rule = new ArrayList<QosBandwidthRuleType>();
        }
        qos_policy_rule.add(new QosBandwidthRuleType(rule_uuid, max_kbps, max_burst_kbps, direction));
    }
    
}
