/*
 * Copyright © 2017 CertusNet, Inc. and others.  All rights reserved.
 *
 * This program and the accompanying materials are made available under the
 * terms of the Eclipse Public License v1.0 which accompanies this distribution,
 * and is available at http://www.eclipse.org/legal/epl-v10.html
 */
package cn.com.certusnet.api.types;

import java.util.ArrayList;
import java.util.List;

import com.google.common.collect.ImmutableList;

@SuppressWarnings("serial")
public class Firewallpolicy extends ApiObjectBase {
    private FirewallPolicyEntriesType firewallpolicy_entries;
    private IdPermsType id_perms;
    private PermType2 perms2;
    private String display_name;
    private List<ObjectReference<ApiPropertyBase>> firewallrule_refs;
    private transient List<ObjectReference<ApiPropertyBase>> firewallservice_back_refs;

    @Override
    public String getObjectType() {
        return "firewallpolicy";
    }

    @Override
    public List<String> getDefaultParent() {
        return ImmutableList.of("default-domain", "default-project");
    }

    @Override
    public String getDefaultParentType() {
        return "project";
    }
    
    public FirewallPolicyEntriesType getEntries() {
        return firewallpolicy_entries;
    }
    
    public void setEntries(FirewallPolicyEntriesType firewallpolicy_entries) {
        this.firewallpolicy_entries = firewallpolicy_entries;
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
    

    public List<ObjectReference<ApiPropertyBase>> getFirewallrule() {
        return firewallrule_refs;
    }

    public void setFirewallrule(Firewallrule obj) {
        firewallrule_refs = new ArrayList<ObjectReference<ApiPropertyBase>>();
        firewallrule_refs.add(new ObjectReference<ApiPropertyBase>(obj.getQualifiedName(), null));
    }
    public void addFirewallrule(Firewallrule obj) {
        if (firewallrule_refs == null) {
            firewallrule_refs = new ArrayList<ObjectReference<ApiPropertyBase>>();
        }
        firewallrule_refs.add(new ObjectReference<ApiPropertyBase>(obj.getQualifiedName(), null));
    }
    public void clearFirewallrule() {
        if (firewallrule_refs != null) {
            firewallrule_refs.clear();
            return;
        }
        firewallrule_refs = null;
    }

    public List<ObjectReference<ApiPropertyBase>> getFirewallserviceBackRefs() {
        return firewallservice_back_refs;
    }
}