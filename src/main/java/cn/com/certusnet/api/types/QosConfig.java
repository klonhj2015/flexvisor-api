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
public class QosConfig extends ApiObjectBase {
    private String qos_config_type;
    private QosIdForwardingClassPairs dscp_entries;
    private QosIdForwardingClassPairs vlan_priority_entries;
    private QosIdForwardingClassPairs mpls_exp_entries;
    private Integer default_forwarding_class_id;
    private IdPermsType id_perms;
    private PermType2 perms2;
    private KeyValuePairs annotations;
    private String display_name;
    private List<ObjectReference<ApiPropertyBase>> global_system_config_refs;
    private transient List<ObjectReference<ApiPropertyBase>> virtual_network_back_refs;
    private transient List<ObjectReference<ApiPropertyBase>> virtual_machine_interface_back_refs;

    @Override
    public String getObjectType() {
        return "qos-config";
    }

    @Override
    public List<String> getDefaultParent() {
        return ImmutableList.of("default-global-system-config", "default-global-qos-config");
    }

    @Override
    public String getDefaultParentType() {
        return "global-qos-config";
    }
    
    public String getType() {
        return qos_config_type;
    }
    
    public void setType(String qos_config_type) {
        this.qos_config_type = qos_config_type;
    }
    
    
    public QosIdForwardingClassPairs getDscpEntries() {
        return dscp_entries;
    }
    
    public void setDscpEntries(QosIdForwardingClassPairs dscp_entries) {
        this.dscp_entries = dscp_entries;
    }
    
    
    public QosIdForwardingClassPairs getVlanPriorityEntries() {
        return vlan_priority_entries;
    }
    
    public void setVlanPriorityEntries(QosIdForwardingClassPairs vlan_priority_entries) {
        this.vlan_priority_entries = vlan_priority_entries;
    }
    
    
    public QosIdForwardingClassPairs getMplsExpEntries() {
        return mpls_exp_entries;
    }
    
    public void setMplsExpEntries(QosIdForwardingClassPairs mpls_exp_entries) {
        this.mpls_exp_entries = mpls_exp_entries;
    }
    
    
    public Integer getDefaultForwardingClassId() {
        return default_forwarding_class_id;
    }
    
    public void setDefaultForwardingClassId(Integer default_forwarding_class_id) {
        this.default_forwarding_class_id = default_forwarding_class_id;
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
    
    
    public KeyValuePairs getAnnotations() {
        return annotations;
    }
    
    public void setAnnotations(KeyValuePairs annotations) {
        this.annotations = annotations;
    }
    
    
    public String getDisplayName() {
        return display_name;
    }
    
    public void setDisplayName(String display_name) {
        this.display_name = display_name;
    }
    

    public List<ObjectReference<ApiPropertyBase>> getGlobalSystemConfig() {
        return global_system_config_refs;
    }

    public void setGlobalSystemConfig(GlobalSystemConfig obj) {
        global_system_config_refs = new ArrayList<ObjectReference<ApiPropertyBase>>();
        global_system_config_refs.add(new ObjectReference<ApiPropertyBase>(obj.getQualifiedName(), null));
    }
    public void addGlobalSystemConfig(GlobalSystemConfig obj) {
        if (global_system_config_refs == null) {
            global_system_config_refs = new ArrayList<ObjectReference<ApiPropertyBase>>();
        }
        global_system_config_refs.add(new ObjectReference<ApiPropertyBase>(obj.getQualifiedName(), null));
    }
    public void clearGlobalSystemConfig() {
        if (global_system_config_refs != null) {
            global_system_config_refs.clear();
            return;
        }
        global_system_config_refs = null;
    }

    public List<ObjectReference<ApiPropertyBase>> getVirtualNetworkBackRefs() {
        return virtual_network_back_refs;
    }

    public List<ObjectReference<ApiPropertyBase>> getVirtualMachineInterfaceBackRefs() {
        return virtual_machine_interface_back_refs;
    }
}