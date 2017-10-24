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


public class QosForwardingClass extends ApiObjectBase {
    /**
	 * 
	 */
	private static final long serialVersionUID = 1L;
	private Integer dscp;
    private boolean trusted;
    private IdPermsType id_perms;
    private PermType2 perms2;
    private String display_name;
    private List<ObjectReference<ApiPropertyBase>> qos_queue_refs;
    private transient List<ObjectReference<ApiPropertyBase>> virtual_network_back_refs;
    private transient List<ObjectReference<ApiPropertyBase>> virtual_machine_interface_back_refs;

    @Override
    public String getObjectType() {
        return "qos-forwarding-class";
    }

    @Override
    public List<String> getDefaultParent() {
        return ImmutableList.of("default-domain", "default-project");
    }

    @Override
    public String getDefaultParentType() {
        return "project";
    }
    
    public Integer getDscp() {
        return dscp;
    }
    
    public void setDscp(Integer dscp) {
        this.dscp = dscp;
    }
    
    
    public boolean getTrusted() {
        return trusted;
    }
    
    public void setTrusted(boolean trusted) {
        this.trusted = trusted;
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
    

    public List<ObjectReference<ApiPropertyBase>> getQosQueue() {
        return qos_queue_refs;
    }

    public void setQosQueue(QosQueue obj) {
        qos_queue_refs = new ArrayList<ObjectReference<ApiPropertyBase>>();
        qos_queue_refs.add(new ObjectReference<ApiPropertyBase>(obj.getQualifiedName(), null));
    }
    public void addQosQueue(QosQueue obj) {
        if (qos_queue_refs == null) {
            qos_queue_refs = new ArrayList<ObjectReference<ApiPropertyBase>>();
        }
        qos_queue_refs.add(new ObjectReference<ApiPropertyBase>(obj.getQualifiedName(), null));
    }
    public void clearQosQueue() {
        if (qos_queue_refs != null) {
            qos_queue_refs.clear();
            return;
        }
        qos_queue_refs = null;
    }

    public List<ObjectReference<ApiPropertyBase>> getVirtualNetworkBackRefs() {
        return virtual_network_back_refs;
    }

    public List<ObjectReference<ApiPropertyBase>> getVirtualMachineInterfaceBackRefs() {
        return virtual_machine_interface_back_refs;
    }
}