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

public class DhcpOptionsListType extends ApiPropertyBase {
    public static class DhcpOptionType {
        String dhcp_option_name;
        String dhcp_option_value;
        String dhcp_option_value_bytes;
        public DhcpOptionType() {
        }
        public DhcpOptionType(String dhcp_option_name, String dhcp_option_value, String dhcp_option_value_bytes) {
            this.dhcp_option_name = dhcp_option_name;
            this.dhcp_option_value = dhcp_option_value;
            this.dhcp_option_value_bytes = dhcp_option_value_bytes;
        }
        public DhcpOptionType(String dhcp_option_name) {
            this(dhcp_option_name, null, null);         }
        public DhcpOptionType(String dhcp_option_name, String dhcp_option_value) {
            this(dhcp_option_name, dhcp_option_value, null);         }
        
        public String getDhcpOptionName() {
            return dhcp_option_name;
        }
        
        public void setDhcpOptionName(String dhcp_option_name) {
            this.dhcp_option_name = dhcp_option_name;
        }
        
        
        public String getDhcpOptionValue() {
            return dhcp_option_value;
        }
        
        public void setDhcpOptionValue(String dhcp_option_value) {
            this.dhcp_option_value = dhcp_option_value;
        }
        
        
        public String getDhcpOptionValueBytes() {
            return dhcp_option_value_bytes;
        }
        
        public void setDhcpOptionValueBytes(String dhcp_option_value_bytes) {
            this.dhcp_option_value_bytes = dhcp_option_value_bytes;
        }
        
    }
    List<DhcpOptionType> dhcp_option;
    public DhcpOptionsListType() {
    }
    public DhcpOptionsListType(List<DhcpOptionType> dhcp_option) {
        this.dhcp_option = dhcp_option;
    }
    
    public List<DhcpOptionType> getDhcpOption() {
        return dhcp_option;
    }
    
    
    public void addDhcpOption(DhcpOptionType obj) {
        if (dhcp_option == null) {
            dhcp_option = new ArrayList<DhcpOptionType>();
        }
        dhcp_option.add(obj);
    }
    public void clearDhcpOption() {
        dhcp_option = null;
    }
    
    
    public void addDhcpOption(String dhcp_option_name, String dhcp_option_value, String dhcp_option_value_bytes) {
        if (dhcp_option == null) {
            dhcp_option = new ArrayList<DhcpOptionType>();
        }
        dhcp_option.add(new DhcpOptionType(dhcp_option_name, dhcp_option_value, dhcp_option_value_bytes));
    }
    
}
