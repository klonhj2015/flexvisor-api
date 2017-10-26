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
public class PhysicalInterface extends ApiObjectBase {
	private String ethernet_segment_identifier;
	private IdPermsType id_perms;
	private PermType2 perms2;
	private KeyValuePairs annotations;
	private String display_name;
	private List<ObjectReference<ApiPropertyBase>> logical_interfaces;
	private List<ObjectReference<ApiPropertyBase>> physical_interface_refs;
	private transient List<ObjectReference<ServiceApplianceInterfaceType>> service_appliance_back_refs;
	private transient List<ObjectReference<ApiPropertyBase>> virtual_machine_interface_back_refs;
	private transient List<ObjectReference<ApiPropertyBase>> physical_interface_back_refs;

	@Override
	public String getObjectType() {
		return "physical-interface";
	}

	@Override
	public List<String> getDefaultParent() {
		return ImmutableList.of("default-global-system-config", "default-physical-router");
	}

	@Override
	public String getDefaultParentType() {
		return "physical-router";
	}

	public String getEthernetSegmentIdentifier() {
		return ethernet_segment_identifier;
	}

	public void setEthernetSegmentIdentifier(String ethernet_segment_identifier) {
		this.ethernet_segment_identifier = ethernet_segment_identifier;
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

	public List<ObjectReference<ApiPropertyBase>> getLogicalInterfaces() {
		return logical_interfaces;
	}

	public List<ObjectReference<ApiPropertyBase>> getPhysicalInterface() {
		return physical_interface_refs;
	}

	public void setPhysicalInterface(PhysicalInterface obj) {
		physical_interface_refs = new ArrayList<ObjectReference<ApiPropertyBase>>();
		physical_interface_refs.add(new ObjectReference<ApiPropertyBase>(obj.getQualifiedName(), null));
	}

	public void addPhysicalInterface(PhysicalInterface obj) {
		if (physical_interface_refs == null) {
			physical_interface_refs = new ArrayList<ObjectReference<ApiPropertyBase>>();
		}
		physical_interface_refs.add(new ObjectReference<ApiPropertyBase>(obj.getQualifiedName(), null));
	}

	public void clearPhysicalInterface() {
		if (physical_interface_refs != null) {
			physical_interface_refs.clear();
			return;
		}
		physical_interface_refs = null;
	}

	public List<ObjectReference<ServiceApplianceInterfaceType>> getServiceApplianceBackRefs() {
		return service_appliance_back_refs;
	}

	public List<ObjectReference<ApiPropertyBase>> getVirtualMachineInterfaceBackRefs() {
		return virtual_machine_interface_back_refs;
	}

	public List<ObjectReference<ApiPropertyBase>> getPhysicalInterfaceBackRefs() {
		return physical_interface_back_refs;
	}
}