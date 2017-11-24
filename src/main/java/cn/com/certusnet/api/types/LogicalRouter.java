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
public class LogicalRouter extends ApiObjectBase {
    private RouteTargetList configured_route_target_list;
    private IdPermsType id_perms;
    private PermType2 perms2;
    private String display_name;
    private List<ObjectReference<ApiPropertyBase>> virtual_machine_interface_refs;
    private List<ObjectReference<ApiPropertyBase>> route_target_refs;
    private List<ObjectReference<ApiPropertyBase>> virtual_network_refs;
    private List<ObjectReference<ApiPropertyBase>> service_instance_refs;
    private transient List<ObjectReference<ApiPropertyBase>> vpnservice_back_refs;

    @Override
    public String getObjectType() {
	return "logical-router";
    }

    @Override
    public List<String> getDefaultParent() {
	return ImmutableList.of("default-domain", "default-project");
    }

    @Override
    public String getDefaultParentType() {
	return "project";
    }

    public RouteTargetList getConfiguredRouteTargetList() {
	return configured_route_target_list;
    }

    public void setConfiguredRouteTargetList(RouteTargetList configured_route_target_list) {
	this.configured_route_target_list = configured_route_target_list;
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

    public List<ObjectReference<ApiPropertyBase>> getVirtualMachineInterface() {
	return virtual_machine_interface_refs;
    }

    public void setVirtualMachineInterface(VirtualMachineInterface obj) {
	virtual_machine_interface_refs = new ArrayList<ObjectReference<ApiPropertyBase>>();

	ObjectReference<ApiPropertyBase> ref = new ObjectReference<ApiPropertyBase>(obj.getQualifiedName(), null);
	ref.setReference(obj.getQualifiedName(), null, null, obj.getUuid());
	virtual_machine_interface_refs.add(ref);
    }

    public void addVirtualMachineInterface(VirtualMachineInterface obj) {
	if (virtual_machine_interface_refs == null) {
	    virtual_machine_interface_refs = new ArrayList<ObjectReference<ApiPropertyBase>>();
	}

	ObjectReference<ApiPropertyBase> ref = new ObjectReference<ApiPropertyBase>(obj.getQualifiedName(), null);
	ref.setReference(obj.getQualifiedName(), null, null, obj.getUuid());
	virtual_machine_interface_refs.add(ref);
    }

    public void clearVirtualMachineInterface() {
	if (virtual_machine_interface_refs != null) {
	    virtual_machine_interface_refs.clear();
	    return;
	}
	virtual_machine_interface_refs = null;
    }

    public List<ObjectReference<ApiPropertyBase>> getRouteTarget() {
	return route_target_refs;
    }

    public void setRouteTarget(RouteTarget obj) {
	route_target_refs = new ArrayList<ObjectReference<ApiPropertyBase>>();
	route_target_refs.add(new ObjectReference<ApiPropertyBase>(obj.getQualifiedName(), null));
    }

    public void addRouteTarget(RouteTarget obj) {
	if (route_target_refs == null) {
	    route_target_refs = new ArrayList<ObjectReference<ApiPropertyBase>>();
	}
	route_target_refs.add(new ObjectReference<ApiPropertyBase>(obj.getQualifiedName(), null));
    }

    public void clearRouteTarget() {
	if (route_target_refs != null) {
	    route_target_refs.clear();
	    return;
	}
	route_target_refs = null;
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

    public List<ObjectReference<ApiPropertyBase>> getVpnserviceBackRefs() {
	return vpnservice_back_refs;
    }
}