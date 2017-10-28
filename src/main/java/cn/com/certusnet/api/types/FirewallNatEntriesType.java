/*
 * Copyright © 2017 CertusNet, Inc. and others.  All rights reserved.
 *
 * This program and the accompanying materials are made available under the
 * terms of the Eclipse Public License v1.0 which accompanies this distribution,
 * and is available at http://www.eclipse.org/legal/epl-v10.html
 */
package cn.com.certusnet.api.types;


public class FirewallNatEntriesType extends ApiPropertyBase {
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
    String nat_type;
    String before_address;
    PortType before_port;
    String after_address;
    PortType after_port;
    boolean enabled;
    Integer ip_version;
    boolean shared;
    public FirewallNatEntriesType() {
    }
    public FirewallNatEntriesType(String protocol, String nat_type, String before_address, PortType before_port, String after_address, PortType after_port, boolean enabled, Integer ip_version, boolean shared) {
        this.protocol = protocol;
        this.nat_type = nat_type;
        this.before_address = before_address;
        this.before_port = before_port;
        this.after_address = after_address;
        this.after_port = after_port;
        this.enabled = enabled;
        this.ip_version = ip_version;
        this.shared = shared;
    }
    public FirewallNatEntriesType(String protocol) {
        this(protocol, null, null, null, null, null, true, 4, false);     }
    public FirewallNatEntriesType(String protocol, String nat_type) {
        this(protocol, nat_type, null, null, null, null, true, 4, false);     }
    public FirewallNatEntriesType(String protocol, String nat_type, String before_address) {
        this(protocol, nat_type, before_address, null, null, null, true, 4, false);     }
    public FirewallNatEntriesType(String protocol, String nat_type, String before_address, PortType before_port) {
        this(protocol, nat_type, before_address, before_port, null, null, true, 4, false);     }
    public FirewallNatEntriesType(String protocol, String nat_type, String before_address, PortType before_port, String after_address) {
        this(protocol, nat_type, before_address, before_port, after_address, null, true, 4, false);     }
    public FirewallNatEntriesType(String protocol, String nat_type, String before_address, PortType before_port, String after_address, PortType after_port) {
        this(protocol, nat_type, before_address, before_port, after_address, after_port, true, 4, false);     }
    public FirewallNatEntriesType(String protocol, String nat_type, String before_address, PortType before_port, String after_address, PortType after_port, boolean enabled) {
        this(protocol, nat_type, before_address, before_port, after_address, after_port, enabled, 4, false);     }
    public FirewallNatEntriesType(String protocol, String nat_type, String before_address, PortType before_port, String after_address, PortType after_port, boolean enabled, Integer ip_version) {
        this(protocol, nat_type, before_address, before_port, after_address, after_port, enabled, ip_version, false);     }
    
    public String getProtocol() {
        return protocol;
    }
    
    public void setProtocol(String protocol) {
        this.protocol = protocol;
    }
    
    
    public String getNatType() {
        return nat_type;
    }
    
    public void setNatType(String nat_type) {
        this.nat_type = nat_type;
    }
    
    
    public String getBeforeAddress() {
        return before_address;
    }
    
    public void setBeforeAddress(String before_address) {
        this.before_address = before_address;
    }
    
    
    public PortType getBeforePort() {
        return before_port;
    }
    
    public void setBeforePort(PortType before_port) {
        this.before_port = before_port;
    }
    
    
    public String getAfterAddress() {
        return after_address;
    }
    
    public void setAfterAddress(String after_address) {
        this.after_address = after_address;
    }
    
    
    public PortType getAfterPort() {
        return after_port;
    }
    
    public void setAfterPort(PortType after_port) {
        this.after_port = after_port;
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
    
}
