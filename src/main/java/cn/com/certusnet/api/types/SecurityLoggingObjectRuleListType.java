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



public class SecurityLoggingObjectRuleListType extends ApiPropertyBase {
    public static class SecurityLoggingObjectRuleEntryType {
        String rule_uuid;
        Integer rate;
        public SecurityLoggingObjectRuleEntryType() {
        }
        public SecurityLoggingObjectRuleEntryType(String rule_uuid, Integer rate) {
            this.rule_uuid = rule_uuid;
            this.rate = rate;
        }
        public SecurityLoggingObjectRuleEntryType(String rule_uuid) {
            this(rule_uuid, 100);         }
        
        public String getRuleUuid() {
            return rule_uuid;
        }
        
        public void setRuleUuid(String rule_uuid) {
            this.rule_uuid = rule_uuid;
        }
        
        
        public Integer getRate() {
            return rate;
        }
        
        public void setRate(Integer rate) {
            this.rate = rate;
        }
        
    }
    List<SecurityLoggingObjectRuleEntryType> rule;
    public SecurityLoggingObjectRuleListType() {
    }
    public SecurityLoggingObjectRuleListType(List<SecurityLoggingObjectRuleEntryType> rule) {
        this.rule = rule;
    }
    
    public List<SecurityLoggingObjectRuleEntryType> getRule() {
        return rule;
    }
    
    
    public void addRule(SecurityLoggingObjectRuleEntryType obj) {
        if (rule == null) {
            rule = new ArrayList<SecurityLoggingObjectRuleEntryType>();
        }
        rule.add(obj);
    }
    public void clearRule() {
        rule = null;
    }
    
    
    public void addRule(String rule_uuid, Integer rate) {
        if (rule == null) {
            rule = new ArrayList<SecurityLoggingObjectRuleEntryType>();
        }
        rule.add(new SecurityLoggingObjectRuleEntryType(rule_uuid, rate));
    }
    
}
