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
public class QosPolicy extends ApiObjectBase {
    private boolean is_shared;
    private QosBandwidthRuleEntriesType qos_bandwidth_rule_entries;
    private IdPermsType id_perms;
    private PermType2 perms2;
    private String display_name;
    private transient List<ObjectReference<ApiPropertyBase>> virtual_network_back_refs;
    private transient List<ObjectReference<ApiPropertyBase>> virtual_machine_interface_back_refs;
    private transient List<ObjectReference<ApiPropertyBase>> floating_ip_back_refs;

    @Override
    public String getObjectType() {
        return "qos-policy";
    }

    @Override
    public List<String> getDefaultParent() {
        return ImmutableList.of("default-domain", "default-project");
    }

    @Override
    public String getDefaultParentType() {
        return "project";
    }
    
    public boolean getIsShared() {
        return is_shared;
    }
    
    public void setIsShared(boolean is_shared) {
        this.is_shared = is_shared;
    }
    
    
    public QosBandwidthRuleEntriesType getQosBandwidthRuleEntries() {
        return qos_bandwidth_rule_entries;
    }
    
    public void setQosBandwidthRuleEntries(QosBandwidthRuleEntriesType qos_bandwidth_rule_entries) {
        this.qos_bandwidth_rule_entries = qos_bandwidth_rule_entries;
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
    

    public List<ObjectReference<ApiPropertyBase>> getVirtualNetworkBackRefs() {
        return virtual_network_back_refs;
    }

    public List<ObjectReference<ApiPropertyBase>> getVirtualMachineInterfaceBackRefs() {
        return virtual_machine_interface_back_refs;
    }

    public List<ObjectReference<ApiPropertyBase>> getFloatingIpBackRefs() {
        return floating_ip_back_refs;
    }
}