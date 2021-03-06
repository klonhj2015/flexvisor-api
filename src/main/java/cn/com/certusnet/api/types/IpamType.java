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

public class IpamType extends ApiPropertyBase {
    public static class IpamDnsAddressType {
        public static class IpAddressesType {
            List<String> ip_address;
            public IpAddressesType() {
            }
            public IpAddressesType(List<String> ip_address) {
                this.ip_address = ip_address;
            }
            
            public List<String> getIpAddress() {
                return ip_address;
            }
            
            
            public void addIpAddress(String obj) {
                if (ip_address == null) {
                    ip_address = new ArrayList<String>();
                }
                ip_address.add(obj);
            }
            public void clearIpAddress() {
                ip_address = null;
            }
            
        }
        IpAddressesType tenant_dns_server_address;
        String virtual_dns_server_name;
        public IpamDnsAddressType() {
        }
        public IpamDnsAddressType(IpAddressesType tenant_dns_server_address, String virtual_dns_server_name) {
            this.tenant_dns_server_address = tenant_dns_server_address;
            this.virtual_dns_server_name = virtual_dns_server_name;
        }
        public IpamDnsAddressType(IpAddressesType tenant_dns_server_address) {
            this(tenant_dns_server_address, null);         }
        
        public IpAddressesType getTenantDnsServerAddress() {
            return tenant_dns_server_address;
        }
        
        public void setTenantDnsServerAddress(IpAddressesType tenant_dns_server_address) {
            this.tenant_dns_server_address = tenant_dns_server_address;
        }
        
        
        public String getVirtualDnsServerName() {
            return virtual_dns_server_name;
        }
        
        public void setVirtualDnsServerName(String virtual_dns_server_name) {
            this.virtual_dns_server_name = virtual_dns_server_name;
        }
        
    }
    String ipam_method;
    String ipam_dns_method;
    IpamDnsAddressType ipam_dns_server;
    DhcpOptionsListType dhcp_option_list;
    SubnetType cidr_block;
    RouteTableType host_routes;
    public IpamType() {
    }
    public IpamType(String ipam_method, String ipam_dns_method, IpamDnsAddressType ipam_dns_server, DhcpOptionsListType dhcp_option_list, SubnetType cidr_block, RouteTableType host_routes) {
        this.ipam_method = ipam_method;
        this.ipam_dns_method = ipam_dns_method;
        this.ipam_dns_server = ipam_dns_server;
        this.dhcp_option_list = dhcp_option_list;
        this.cidr_block = cidr_block;
        this.host_routes = host_routes;
    }
    public IpamType(String ipam_method) {
        this(ipam_method, null, null, null, null, null);     }
    public IpamType(String ipam_method, String ipam_dns_method) {
        this(ipam_method, ipam_dns_method, null, null, null, null);     }
    public IpamType(String ipam_method, String ipam_dns_method, IpamDnsAddressType ipam_dns_server) {
        this(ipam_method, ipam_dns_method, ipam_dns_server, null, null, null);     }
    public IpamType(String ipam_method, String ipam_dns_method, IpamDnsAddressType ipam_dns_server, DhcpOptionsListType dhcp_option_list) {
        this(ipam_method, ipam_dns_method, ipam_dns_server, dhcp_option_list, null, null);     }
    public IpamType(String ipam_method, String ipam_dns_method, IpamDnsAddressType ipam_dns_server, DhcpOptionsListType dhcp_option_list, SubnetType cidr_block) {
        this(ipam_method, ipam_dns_method, ipam_dns_server, dhcp_option_list, cidr_block, null);     }
    
    public String getIpamMethod() {
        return ipam_method;
    }
    
    public void setIpamMethod(String ipam_method) {
        this.ipam_method = ipam_method;
    }
    
    
    public String getIpamDnsMethod() {
        return ipam_dns_method;
    }
    
    public void setIpamDnsMethod(String ipam_dns_method) {
        this.ipam_dns_method = ipam_dns_method;
    }
    
    
    public IpamDnsAddressType getIpamDnsServer() {
        return ipam_dns_server;
    }
    
    public void setIpamDnsServer(IpamDnsAddressType ipam_dns_server) {
        this.ipam_dns_server = ipam_dns_server;
    }
    
    
    public DhcpOptionsListType getDhcpOptionList() {
        return dhcp_option_list;
    }
    
    public void setDhcpOptionList(DhcpOptionsListType dhcp_option_list) {
        this.dhcp_option_list = dhcp_option_list;
    }
    
    
    public SubnetType getCidrBlock() {
        return cidr_block;
    }
    
    public void setCidrBlock(SubnetType cidr_block) {
        this.cidr_block = cidr_block;
    }
    
    
    public RouteTableType getHostRoutes() {
        return host_routes;
    }
    
    public void setHostRoutes(RouteTableType host_routes) {
        this.host_routes = host_routes;
    }
    
}
