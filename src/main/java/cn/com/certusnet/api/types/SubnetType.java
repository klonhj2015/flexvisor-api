/*
 * Copyright © 2017 CertusNet, Inc. and others.  All rights reserved.
 *
 * This program and the accompanying materials are made available under the
 * terms of the Eclipse Public License v1.0 which accompanies this distribution,
 * and is available at http://www.eclipse.org/legal/epl-v10.html
 */
package cn.com.certusnet.api.types;

public class SubnetType extends ApiPropertyBase {
    String ip_prefix;
    Integer ip_prefix_len;
    public SubnetType() {
    }
    public SubnetType(String ip_prefix, Integer ip_prefix_len) {
        this.ip_prefix = ip_prefix;
        this.ip_prefix_len = ip_prefix_len;
    }
    public SubnetType(String ip_prefix) {
        this(ip_prefix, null);     }
    
    public String getIpPrefix() {
        return ip_prefix;
    }
    
    public void setIpPrefix(String ip_prefix) {
        this.ip_prefix = ip_prefix;
    }
    
    
    public Integer getIpPrefixLen() {
        return ip_prefix_len;
    }
    
    public void setIpPrefixLen(Integer ip_prefix_len) {
        this.ip_prefix_len = ip_prefix_len;
    }
    
}
