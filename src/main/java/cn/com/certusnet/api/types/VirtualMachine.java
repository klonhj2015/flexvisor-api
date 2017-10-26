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
public class VirtualMachine extends ApiObjectBase {
	private IdPermsType id_perms;
	private PermType2 perms2;
	private KeyValuePairs annotations;
	private String display_name;
	private List<ObjectReference<ApiPropertyBase>> virtual_machine_interfaces;
	private List<ObjectReference<ApiPropertyBase>> service_instance_refs;
	private transient List<ObjectReference<ApiPropertyBase>> virtual_machine_interface_back_refs;
	private transient List<ObjectReference<ApiPropertyBase>> virtual_router_back_refs;

	@Override
	public String getObjectType() {
		return "virtual-machine";
	}

	@Override
	public List<String> getDefaultParent() {
		return ImmutableList.of();
	}

	@Override
	public String getDefaultParentType() {
		return null;
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

	public List<ObjectReference<ApiPropertyBase>> getVirtualMachineInterfaces() {
		return virtual_machine_interfaces;
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

	public List<ObjectReference<ApiPropertyBase>> getVirtualMachineInterfaceBackRefs() {
		return virtual_machine_interface_back_refs;
	}

	public List<ObjectReference<ApiPropertyBase>> getVirtualRouterBackRefs() {
		return virtual_router_back_refs;
	}
}