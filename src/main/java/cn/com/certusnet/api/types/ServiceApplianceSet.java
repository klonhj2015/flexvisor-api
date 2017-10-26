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
public class ServiceApplianceSet extends ApiObjectBase {
	private KeyValuePairs service_appliance_set_properties;
	private String service_appliance_driver;
	private String service_appliance_ha_mode;
	private IdPermsType id_perms;
	private PermType2 perms2;
	private KeyValuePairs annotations;
	private String display_name;
	private List<ObjectReference<ApiPropertyBase>> service_appliances;
	private transient List<ObjectReference<ApiPropertyBase>> service_template_back_refs;
	private transient List<ObjectReference<ApiPropertyBase>> loadbalancer_pool_back_refs;
	private transient List<ObjectReference<ApiPropertyBase>> loadbalancer_back_refs;

	@Override
	public String getObjectType() {
		return "service-appliance-set";
	}

	@Override
	public List<String> getDefaultParent() {
		return ImmutableList.of("default-global-system-config");
	}

	@Override
	public String getDefaultParentType() {
		return "global-system-config";
	}

	public KeyValuePairs getProperties() {
		return service_appliance_set_properties;
	}

	public void setProperties(KeyValuePairs service_appliance_set_properties) {
		this.service_appliance_set_properties = service_appliance_set_properties;
	}

	public String getServiceApplianceDriver() {
		return service_appliance_driver;
	}

	public void setServiceApplianceDriver(String service_appliance_driver) {
		this.service_appliance_driver = service_appliance_driver;
	}

	public String getServiceApplianceHaMode() {
		return service_appliance_ha_mode;
	}

	public void setServiceApplianceHaMode(String service_appliance_ha_mode) {
		this.service_appliance_ha_mode = service_appliance_ha_mode;
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

	public List<ObjectReference<ApiPropertyBase>> getServiceAppliances() {
		return service_appliances;
	}

	public List<ObjectReference<ApiPropertyBase>> getServiceTemplateBackRefs() {
		return service_template_back_refs;
	}

	public List<ObjectReference<ApiPropertyBase>> getLoadbalancerPoolBackRefs() {
		return loadbalancer_pool_back_refs;
	}

	public List<ObjectReference<ApiPropertyBase>> getLoadbalancerBackRefs() {
		return loadbalancer_back_refs;
	}
}