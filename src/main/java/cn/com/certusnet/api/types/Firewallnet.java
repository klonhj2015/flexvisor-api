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
public class Firewallnet extends ApiObjectBase {
    private FirewallNetEntriesType firewallnet_entries;
    private IdPermsType id_perms;
    private PermType2 perms2;
    private String display_name;
    private transient List<ObjectReference<ApiPropertyBase>> firewallservice_back_refs;

    @Override
    public String getObjectType() {
        return "firewallnet";
    }

    @Override
    public List<String> getDefaultParent() {
        return ImmutableList.of("default-domain", "default-project");
    }

    @Override
    public String getDefaultParentType() {
        return "project";
    }
    
    public FirewallNetEntriesType getEntries() {
        return firewallnet_entries;
    }
    
    public void setEntries(FirewallNetEntriesType firewallnet_entries) {
        this.firewallnet_entries = firewallnet_entries;
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
    

    public List<ObjectReference<ApiPropertyBase>> getFirewallserviceBackRefs() {
        return firewallservice_back_refs;
    }
}