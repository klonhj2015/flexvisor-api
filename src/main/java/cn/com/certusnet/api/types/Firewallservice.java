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
public class Firewallservice extends ApiObjectBase {
    private FirewallserviceEntriesType firewall_entries;
    private IdPermsType id_perms;
    private PermType2 perms2;
    private String display_name;
    private List<ObjectReference<ApiPropertyBase>> service_instance_refs;
    private List<ObjectReference<ApiPropertyBase>> firewallpolicy_refs;
    private List<ObjectReference<ApiPropertyBase>> firewallnat_refs;
    private List<ObjectReference<ApiPropertyBase>> firewallnet_refs;
    private List<ObjectReference<FirewallNetType>> virtual_network_refs;

    @Override
    public String getObjectType() {
        return "firewallservice";
    }

    @Override
    public List<String> getDefaultParent() {
        return ImmutableList.of("default-domain", "default-project");
    }

    @Override
    public String getDefaultParentType() {
        return "project";
    }
    
    public FirewallserviceEntriesType getFirewallEntries() {
        return firewall_entries;
    }
    
    public void setFirewallEntries(FirewallserviceEntriesType firewall_entries) {
        this.firewall_entries = firewall_entries;
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
    

    public List<ObjectReference<ApiPropertyBase>> getServiceInstance() {
        return service_instance_refs;
    }

    public void setServiceInstance(ServiceInstance obj) {
        service_instance_refs = new ArrayList<ObjectReference<ApiPropertyBase>>();
        service_instance_refs.add(new ObjectReference<ApiPropertyBase>(obj.getQualifiedName(), null));
    }
    public void addServiceInstance(ServiceInstance obj) {
        if (service_instance_refs == null) {
            service_instance_refs = new ArrayList<ObjectReference<ApiPropertyBase>>();
        }
        service_instance_refs.add(new ObjectReference<ApiPropertyBase>(obj.getQualifiedName(), null));
    }
    public void clearServiceInstance() {
        if (service_instance_refs != null) {
            service_instance_refs.clear();
            return;
        }
        service_instance_refs = null;
    }

    public List<ObjectReference<ApiPropertyBase>> getFirewallpolicy() {
        return firewallpolicy_refs;
    }

    public void setFirewallpolicy(Firewallpolicy obj) {
        firewallpolicy_refs = new ArrayList<ObjectReference<ApiPropertyBase>>();
        firewallpolicy_refs.add(new ObjectReference<ApiPropertyBase>(obj.getQualifiedName(), null));
    }
    public void addFirewallpolicy(Firewallpolicy obj) {
        if (firewallpolicy_refs == null) {
            firewallpolicy_refs = new ArrayList<ObjectReference<ApiPropertyBase>>();
        }
        firewallpolicy_refs.add(new ObjectReference<ApiPropertyBase>(obj.getQualifiedName(), null));
    }
    public void clearFirewallpolicy() {
        if (firewallpolicy_refs != null) {
            firewallpolicy_refs.clear();
            return;
        }
        firewallpolicy_refs = null;
    }

    public List<ObjectReference<ApiPropertyBase>> getFirewallnat() {
        return firewallnat_refs;
    }

    public void setFirewallnat(Firewallnat obj) {
        firewallnat_refs = new ArrayList<ObjectReference<ApiPropertyBase>>();
        firewallnat_refs.add(new ObjectReference<ApiPropertyBase>(obj.getQualifiedName(), null));
    }
    public void addFirewallnat(Firewallnat obj) {
        if (firewallnat_refs == null) {
            firewallnat_refs = new ArrayList<ObjectReference<ApiPropertyBase>>();
        }
        firewallnat_refs.add(new ObjectReference<ApiPropertyBase>(obj.getQualifiedName(), null));
    }
    public void clearFirewallnat() {
        if (firewallnat_refs != null) {
            firewallnat_refs.clear();
            return;
        }
        firewallnat_refs = null;
    }

    public List<ObjectReference<ApiPropertyBase>> getFirewallnet() {
        return firewallnet_refs;
    }

    public void setFirewallnet(Firewallnet obj) {
        firewallnet_refs = new ArrayList<ObjectReference<ApiPropertyBase>>();
        firewallnet_refs.add(new ObjectReference<ApiPropertyBase>(obj.getQualifiedName(), null));
    }
    public void addFirewallnet(Firewallnet obj) {
        if (firewallnet_refs == null) {
            firewallnet_refs = new ArrayList<ObjectReference<ApiPropertyBase>>();
        }
        firewallnet_refs.add(new ObjectReference<ApiPropertyBase>(obj.getQualifiedName(), null));
    }
    public void clearFirewallnet() {
        if (firewallnet_refs != null) {
            firewallnet_refs.clear();
            return;
        }
        firewallnet_refs = null;
    }

    public List<ObjectReference<FirewallNetType>> getVirtualNetwork() {
        return virtual_network_refs;
    }

    public void setVirtualNetwork(VirtualNetwork obj, FirewallNetType data) {
        virtual_network_refs = new ArrayList<ObjectReference<FirewallNetType>>();
        virtual_network_refs.add(new ObjectReference<FirewallNetType>(obj.getQualifiedName(), data));
    }

    public void addVirtualNetwork(VirtualNetwork obj, FirewallNetType data) {
        if (virtual_network_refs == null) {
            virtual_network_refs = new ArrayList<ObjectReference<FirewallNetType>>();
        }
        virtual_network_refs.add(new ObjectReference<FirewallNetType>(obj.getQualifiedName(), data));
    }

    public void removeVirtualNetwork(VirtualNetwork obj, FirewallNetType data) {
        if (virtual_network_refs != null) {
            virtual_network_refs.remove(new ObjectReference<FirewallNetType>(obj.getQualifiedName(), data));
        }
    }

    public void clearVirtualNetwork() {
        if (virtual_network_refs != null) {
            virtual_network_refs.clear();
            return;
        }
        virtual_network_refs = null;
    }

}