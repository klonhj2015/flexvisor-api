/*
 * Copyright © 2017 CertusNet, Inc. and others.  All rights reserved.
 *
 * This program and the accompanying materials are made available under the
 * terms of the Eclipse Public License v1.0 which accompanies this distribution,
 * and is available at http://www.eclipse.org/legal/epl-v10.html
 */
package cn.com.certusnet.api.types;


public class DomainLimitsType extends ApiPropertyBase {
    Integer project_limit;
    Integer virtual_network_limit;
    Integer security_group_limit;
    public DomainLimitsType() {
    }
    public DomainLimitsType(Integer project_limit, Integer virtual_network_limit, Integer security_group_limit) {
        this.project_limit = project_limit;
        this.virtual_network_limit = virtual_network_limit;
        this.security_group_limit = security_group_limit;
    }
    public DomainLimitsType(Integer project_limit) {
        this(project_limit, null, null);     }
    public DomainLimitsType(Integer project_limit, Integer virtual_network_limit) {
        this(project_limit, virtual_network_limit, null);     }
    
    public Integer getProjectLimit() {
        return project_limit;
    }
    
    public void setProjectLimit(Integer project_limit) {
        this.project_limit = project_limit;
    }
    
    
    public Integer getVirtualNetworkLimit() {
        return virtual_network_limit;
    }
    
    public void setVirtualNetworkLimit(Integer virtual_network_limit) {
        this.virtual_network_limit = virtual_network_limit;
    }
    
    
    public Integer getSecurityGroupLimit() {
        return security_group_limit;
    }
    
    public void setSecurityGroupLimit(Integer security_group_limit) {
        this.security_group_limit = security_group_limit;
    }
    
}
