/*
 * Copyright © 2017 CertusNet, Inc. and others.  All rights reserved.
 *
 * This program and the accompanying materials are made available under the
 * terms of the Eclipse Public License v1.0 which accompanies this distribution,
 * and is available at http://www.eclipse.org/legal/epl-v10.html
 */
package cn.com.certusnet.api.types;

public class FirewallRuleEntriesType extends ApiPropertyBase {
    public static class PortType {
        Integer start_port;
        Integer end_port;
        public PortType() {
        }
        public PortType(Integer start_port, Integer end_port) {
            this.start_port = start_port;
            this.end_port = end_port;
        }
        public PortType(Integer start_port) {
            this(start_port, 65535);         }
        
        public Integer getStartPort() {
            return start_port;
        }
        
        public void setStartPort(Integer start_port) {
            this.start_port = start_port;
        }
        
        
        public Integer getEndPort() {
            return end_port;
        }
        
        public void setEndPort(Integer end_port) {
            this.end_port = end_port;
        }
        
    }
    String protocol;
    String src_address;
    PortType src_port;
    String dst_address;
    PortType dst_port;
    String action;
    boolean enabled;
    Integer ip_version;
    boolean shared;
    String pre_rule;
    String next_rule;
    public FirewallRuleEntriesType() {
    }
    public FirewallRuleEntriesType(String protocol, String src_address, PortType src_port, String dst_address, PortType dst_port, String action, boolean enabled, Integer ip_version, boolean shared, String pre_rule, String next_rule) {
        this.protocol = protocol;
        this.src_address = src_address;
        this.src_port = src_port;
        this.dst_address = dst_address;
        this.dst_port = dst_port;
        this.action = action;
        this.enabled = enabled;
        this.ip_version = ip_version;
        this.shared = shared;
        this.pre_rule = pre_rule;
        this.next_rule = next_rule;
    }
    public FirewallRuleEntriesType(String protocol) {
        this(protocol, null, null, null, null, null, true, 4, false, null, null);     }
    public FirewallRuleEntriesType(String protocol, String src_address) {
        this(protocol, src_address, null, null, null, null, true, 4, false, null, null);     }
    public FirewallRuleEntriesType(String protocol, String src_address, PortType src_port) {
        this(protocol, src_address, src_port, null, null, null, true, 4, false, null, null);     }
    public FirewallRuleEntriesType(String protocol, String src_address, PortType src_port, String dst_address) {
        this(protocol, src_address, src_port, dst_address, null, null, true, 4, false, null, null);     }
    public FirewallRuleEntriesType(String protocol, String src_address, PortType src_port, String dst_address, PortType dst_port) {
        this(protocol, src_address, src_port, dst_address, dst_port, null, true, 4, false, null, null);     }
    public FirewallRuleEntriesType(String protocol, String src_address, PortType src_port, String dst_address, PortType dst_port, String action) {
        this(protocol, src_address, src_port, dst_address, dst_port, action, true, 4, false, null, null);     }
    public FirewallRuleEntriesType(String protocol, String src_address, PortType src_port, String dst_address, PortType dst_port, String action, boolean enabled) {
        this(protocol, src_address, src_port, dst_address, dst_port, action, enabled, 4, false, null, null);     }
    public FirewallRuleEntriesType(String protocol, String src_address, PortType src_port, String dst_address, PortType dst_port, String action, boolean enabled, Integer ip_version) {
        this(protocol, src_address, src_port, dst_address, dst_port, action, enabled, ip_version, false, null, null);     }
    public FirewallRuleEntriesType(String protocol, String src_address, PortType src_port, String dst_address, PortType dst_port, String action, boolean enabled, Integer ip_version, boolean shared) {
        this(protocol, src_address, src_port, dst_address, dst_port, action, enabled, ip_version, shared, null, null);     }
    public FirewallRuleEntriesType(String protocol, String src_address, PortType src_port, String dst_address, PortType dst_port, String action, boolean enabled, Integer ip_version, boolean shared, String pre_rule) {
        this(protocol, src_address, src_port, dst_address, dst_port, action, enabled, ip_version, shared, pre_rule, null);     }
    
    public String getProtocol() {
        return protocol;
    }
    
    public void setProtocol(String protocol) {
        this.protocol = protocol;
    }
    
    
    public String getSrcAddress() {
        return src_address;
    }
    
    public void setSrcAddress(String src_address) {
        this.src_address = src_address;
    }
    
    
    public PortType getSrcPort() {
        return src_port;
    }
    
    public void setSrcPort(PortType src_port) {
        this.src_port = src_port;
    }
    
    
    public String getDstAddress() {
        return dst_address;
    }
    
    public void setDstAddress(String dst_address) {
        this.dst_address = dst_address;
    }
    
    
    public PortType getDstPort() {
        return dst_port;
    }
    
    public void setDstPort(PortType dst_port) {
        this.dst_port = dst_port;
    }
    
    
    public String getAction() {
        return action;
    }
    
    public void setAction(String action) {
        this.action = action;
    }
    
    
    public boolean getEnabled() {
        return enabled;
    }
    
    public void setEnabled(boolean enabled) {
        this.enabled = enabled;
    }
    
    
    public Integer getIpVersion() {
        return ip_version;
    }
    
    public void setIpVersion(Integer ip_version) {
        this.ip_version = ip_version;
    }
    
    
    public boolean getShared() {
        return shared;
    }
    
    public void setShared(boolean shared) {
        this.shared = shared;
    }
    
    
    public String getPreRule() {
        return pre_rule;
    }
    
    public void setPreRule(String pre_rule) {
        this.pre_rule = pre_rule;
    }
    
    
    public String getNextRule() {
        return next_rule;
    }
    
    public void setNextRule(String next_rule) {
        this.next_rule = next_rule;
    }
    
}
