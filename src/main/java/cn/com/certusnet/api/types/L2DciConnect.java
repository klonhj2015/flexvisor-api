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
import com.google.common.collect.ImmutableList;

@SuppressWarnings("serial")
public class L2DciConnect extends ApiObjectBase {
    private Integer l2_dci_vni;
    private RouteTargetList l2_dci_import_target_list;
    private RouteTargetList l2_dci_export_target_list;
    private IdPermsType id_perms;
    private PermType2 perms2;
    private String display_name;
    private List<ObjectReference<ApiPropertyBase>> virtual_network_refs;

    @Override
    public String getObjectType() {
        return "l2-dci-connect";
    }

    @Override
    public List<String> getDefaultParent() {
        return ImmutableList.of("default-domain", "default-project");
    }

    @Override
    public String getDefaultParentType() {
        return "project";
    }
    
    public Integer getL2DciVni() {
        return l2_dci_vni;
    }
    
    public void setL2DciVni(Integer l2_dci_vni) {
        this.l2_dci_vni = l2_dci_vni;
    }
    
    
    public RouteTargetList getL2DciImportTargetList() {
        return l2_dci_import_target_list;
    }
    
    public void setL2DciImportTargetList(RouteTargetList l2_dci_import_target_list) {
        this.l2_dci_import_target_list = l2_dci_import_target_list;
    }
    
    
    public RouteTargetList getL2DciExportTargetList() {
        return l2_dci_export_target_list;
    }
    
    public void setL2DciExportTargetList(RouteTargetList l2_dci_export_target_list) {
        this.l2_dci_export_target_list = l2_dci_export_target_list;
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
    

    public List<ObjectReference<ApiPropertyBase>> getVirtualNetwork() {
        return virtual_network_refs;
    }

    public void setVirtualNetwork(VirtualNetwork obj) {
        virtual_network_refs = new ArrayList<ObjectReference<ApiPropertyBase>>();
        virtual_network_refs.add(new ObjectReference<ApiPropertyBase>(obj.getQualifiedName(), null));
    }
    public void addVirtualNetwork(VirtualNetwork obj) {
        if (virtual_network_refs == null) {
            virtual_network_refs = new ArrayList<ObjectReference<ApiPropertyBase>>();
        }
        virtual_network_refs.add(new ObjectReference<ApiPropertyBase>(obj.getQualifiedName(), null));
    }
    public void clearVirtualNetwork() {
        if (virtual_network_refs != null) {
            virtual_network_refs.clear();
            return;
        }
        virtual_network_refs = null;
    }

}