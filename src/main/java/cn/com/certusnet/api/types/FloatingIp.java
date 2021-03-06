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
public class FloatingIp extends ApiObjectBase {
	private String floating_ip_address;
	private boolean floating_ip_is_virtual_ip;
	private String floating_ip_fixed_ip_address;
	private String floating_ip_address_family;
	private boolean floating_ip_port_mappings_enable;
	private PortMappings floating_ip_port_mappings;
	private String floating_ip_traffic_direction;
	private IdPermsType id_perms;
	private PermType2 perms2;
	private KeyValuePairs annotations;
	private String display_name;
	private List<ObjectReference<ApiPropertyBase>> project_refs;
	private List<ObjectReference<ApiPropertyBase>> virtual_machine_interface_refs;
	private transient List<ObjectReference<ApiPropertyBase>> customer_attachment_back_refs;

	@Override
	public String getObjectType() {
		return "floating-ip";
	}

	@Override
	public List<String> getDefaultParent() {
		return ImmutableList.of("default-domain", "default-project", "default-virtual-network",
				"default-floating-ip-pool");
	}

	@Override
	public String getDefaultParentType() {
		return "floating-ip-pool";
	}

	public String getAddress() {
		return floating_ip_address;
	}

	public void setAddress(String floating_ip_address) {
		this.floating_ip_address = floating_ip_address;
	}

	public boolean getIsVirtualIp() {
		return floating_ip_is_virtual_ip;
	}

	public void setIsVirtualIp(boolean floating_ip_is_virtual_ip) {
		this.floating_ip_is_virtual_ip = floating_ip_is_virtual_ip;
	}

	public String getFixedIpAddress() {
		return floating_ip_fixed_ip_address;
	}

	public void setFixedIpAddress(String floating_ip_fixed_ip_address) {
		this.floating_ip_fixed_ip_address = floating_ip_fixed_ip_address;
	}

	public String getAddressFamily() {
		return floating_ip_address_family;
	}

	public void setAddressFamily(String floating_ip_address_family) {
		this.floating_ip_address_family = floating_ip_address_family;
	}

	public boolean getPortMappingsEnable() {
		return floating_ip_port_mappings_enable;
	}

	public void setPortMappingsEnable(boolean floating_ip_port_mappings_enable) {
		this.floating_ip_port_mappings_enable = floating_ip_port_mappings_enable;
	}

	public PortMappings getPortMappings() {
		return floating_ip_port_mappings;
	}

	public void setPortMappings(PortMappings floating_ip_port_mappings) {
		this.floating_ip_port_mappings = floating_ip_port_mappings;
	}

	public String getTrafficDirection() {
		return floating_ip_traffic_direction;
	}

	public void setTrafficDirection(String floating_ip_traffic_direction) {
		this.floating_ip_traffic_direction = floating_ip_traffic_direction;
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

	public List<ObjectReference<ApiPropertyBase>> getProject() {
		return project_refs;
	}

	public void setProject(Project obj) {
		project_refs = new ArrayList<ObjectReference<ApiPropertyBase>>();
		project_refs.add(new ObjectReference<ApiPropertyBase>(obj.getQualifiedName(), null));
	}

	public void addProject(Project obj) {
		if (project_refs == null) {
			project_refs = new ArrayList<ObjectReference<ApiPropertyBase>>();
		}
		project_refs.add(new ObjectReference<ApiPropertyBase>(obj.getQualifiedName(), null));
	}

	public void clearProject() {
		if (project_refs != null) {
			project_refs.clear();
			return;
		}
		project_refs = null;
	}

	public List<ObjectReference<ApiPropertyBase>> getVirtualMachineInterface() {
		return virtual_machine_interface_refs;
	}

	public void setVirtualMachineInterface(VirtualMachineInterface obj) {
		virtual_machine_interface_refs = new ArrayList<ObjectReference<ApiPropertyBase>>();
		virtual_machine_interface_refs.add(new ObjectReference<ApiPropertyBase>(obj.getQualifiedName(), null));
	}

	public void addVirtualMachineInterface(VirtualMachineInterface obj) {
		if (virtual_machine_interface_refs == null) {
			virtual_machine_interface_refs = new ArrayList<ObjectReference<ApiPropertyBase>>();
		}
		virtual_machine_interface_refs.add(new ObjectReference<ApiPropertyBase>(obj.getQualifiedName(), null));
	}

	public void clearVirtualMachineInterface() {
		if (virtual_machine_interface_refs != null) {
			virtual_machine_interface_refs.clear();
			return;
		}
		virtual_machine_interface_refs = null;
	}

	public List<ObjectReference<ApiPropertyBase>> getCustomerAttachmentBackRefs() {
		return customer_attachment_back_refs;
	}
}