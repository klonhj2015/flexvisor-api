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
public class ServiceHealthCheck extends ApiObjectBase {
	private ServiceHealthCheckType service_health_check_properties;
	private IdPermsType id_perms;
	private PermType2 perms2;
	private KeyValuePairs annotations;
	private String display_name;
	private List<ObjectReference<ServiceInterfaceTag>> service_instance_refs;
	private transient List<ObjectReference<ApiPropertyBase>> virtual_machine_interface_back_refs;

	@Override
	public String getObjectType() {
		return "service-health-check";
	}

	@Override
	public List<String> getDefaultParent() {
		return ImmutableList.of("default-domain", "default-project");
	}

	@Override
	public String getDefaultParentType() {
		return "project";
	}

	public ServiceHealthCheckType getProperties() {
		return service_health_check_properties;
	}

	public void setProperties(ServiceHealthCheckType service_health_check_properties) {
		this.service_health_check_properties = service_health_check_properties;
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

	public List<ObjectReference<ServiceInterfaceTag>> getServiceInstance() {
		return service_instance_refs;
	}

	public void setServiceInstance(ServiceInstance obj, ServiceInterfaceTag data) {
		service_instance_refs = new ArrayList<ObjectReference<ServiceInterfaceTag>>();
		service_instance_refs.add(new ObjectReference<ServiceInterfaceTag>(obj.getQualifiedName(), data));
	}

	public void addServiceInstance(ServiceInstance obj, ServiceInterfaceTag data) {
		if (service_instance_refs == null) {
			service_instance_refs = new ArrayList<ObjectReference<ServiceInterfaceTag>>();
		}
		service_instance_refs.add(new ObjectReference<ServiceInterfaceTag>(obj.getQualifiedName(), data));
	}

	public void removeServiceInstance(ServiceInstance obj, ServiceInterfaceTag data) {
		if (service_instance_refs != null) {
			service_instance_refs.remove(new ObjectReference<ServiceInterfaceTag>(obj.getQualifiedName(), data));
		}
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
}