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
public class L3DciConnect extends ApiObjectBase {
    private DCIL3EntriesType l3_dci_connect_entries;
    private RouteTargetList l3_dci_import_target_list;
    private RouteTargetList l3_dci_export_target_list;
    private IdPermsType id_perms;
    private PermType2 perms2;
    private String display_name;

    @Override
    public String getObjectType() {
        return "l3-dci-connect";
    }

    @Override
    public List<String> getDefaultParent() {
        return ImmutableList.of("default-domain", "default-project");
    }

    @Override
    public String getDefaultParentType() {
        return "project";
    }
    
    public DCIL3EntriesType getEntries() {
        return l3_dci_connect_entries;
    }
    
    public void setEntries(DCIL3EntriesType l3_dci_connect_entries) {
        this.l3_dci_connect_entries = l3_dci_connect_entries;
    }
    
    
    public RouteTargetList getL3DciImportTargetList() {
        return l3_dci_import_target_list;
    }
    
    public void setL3DciImportTargetList(RouteTargetList l3_dci_import_target_list) {
        this.l3_dci_import_target_list = l3_dci_import_target_list;
    }
    
    
    public RouteTargetList getL3DciExportTargetList() {
        return l3_dci_export_target_list;
    }
    
    public void setL3DciExportTargetList(RouteTargetList l3_dci_export_target_list) {
        this.l3_dci_export_target_list = l3_dci_export_target_list;
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
}