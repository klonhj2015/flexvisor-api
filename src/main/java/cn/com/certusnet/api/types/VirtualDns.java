/*
 * Copyright © 2017 CertusNet, Inc. and others.  All rights reserved.
 *
 * This program and the accompanying materials are made available under the
 * terms of the Eclipse Public License v1.0 which accompanies this distribution,
 * and is available at http://www.eclipse.org/legal/epl-v10.html
 */
package cn.com.certusnet.api.types;

import java.util.List;
import com.google.common.collect.ImmutableList;


@SuppressWarnings("serial")
public class VirtualDns extends ApiObjectBase {

	private VirtualDnsType virtual_DNS_data;
    private IdPermsType id_perms;
    private PermType2 perms2;
    private String display_name;
    private List<ObjectReference<ApiPropertyBase>> virtual_DNS_records;
    private transient List<ObjectReference<ApiPropertyBase>> network_ipam_back_refs;

    @Override
    public String getObjectType() {
        return "virtual-DNS";
    }

    @Override
    public List<String> getDefaultParent() {
        return ImmutableList.of("default-domain");
    }

    @Override
    public String getDefaultParentType() {
        return "domain";
    }
    
    public VirtualDnsType getData() {
        return virtual_DNS_data;
    }
    
    public void setData(VirtualDnsType virtual_DNS_data) {
        this.virtual_DNS_data = virtual_DNS_data;
    }
    
    
    public IdPermsType getIdPerms() {
        return id_perms;
    }
    
    public void setIdPerms(IdPermsType id_perms) {
        this.id_perms = id_perms;
    }
    
    
    public PermType2 getPerms2() {
        return perms2;
    }
    
    public void setPerms2(PermType2 perms2) {
        this.perms2 = perms2;
    }
    
    
    public String getDisplayName() {
        return display_name;
    }
    
    public void setDisplayName(String display_name) {
        this.display_name = display_name;
    }
    

    public List<ObjectReference<ApiPropertyBase>> getVirtualDnsRecords() {
        return virtual_DNS_records;
    }

    public List<ObjectReference<ApiPropertyBase>> getNetworkIpamBackRefs() {
        return network_ipam_back_refs;
    }
}