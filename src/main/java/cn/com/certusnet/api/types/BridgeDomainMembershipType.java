/*
 * Copyright © 2017 CertusNet, Inc. and others.  All rights reserved.
 *
 * This program and the accompanying materials are made available under the
 * terms of the Eclipse Public License v1.0 which accompanies this distribution,
 * and is available at http://www.eclipse.org/legal/epl-v10.html
 */
package cn.com.certusnet.api.types;


public class BridgeDomainMembershipType extends ApiPropertyBase {
    Integer vlan_tag;
    public BridgeDomainMembershipType() {
    }
    public BridgeDomainMembershipType(Integer vlan_tag) {
        this.vlan_tag = vlan_tag;
    }
    
    public Integer getVlanTag() {
        return vlan_tag;
    }
    
    public void setVlanTag(Integer vlan_tag) {
        this.vlan_tag = vlan_tag;
    }
    
}
