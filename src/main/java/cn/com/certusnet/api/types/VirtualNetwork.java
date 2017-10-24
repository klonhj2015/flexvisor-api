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



public class VirtualNetwork extends ApiObjectBase {
    /**
	 * 
	 */
	private static final long serialVersionUID = 1L;
	private EcmpHashingIncludeFields ecmp_hashing_include_fields;
    private VirtualNetworkType virtual_network_properties;
    private ProviderDetails provider_properties;
    private Integer virtual_network_network_id;
    private boolean port_security_enabled;
    private RouteTargetList route_target_list;
    private RouteTargetList import_route_target_list;
    private RouteTargetList export_route_target_list;
    private boolean router_external;
    private boolean is_shared;
    private boolean external_ipam;
    private boolean flood_unknown_unicast;
    private String multi_policy_service_chains_enabled;
    private IdPermsType id_perms;
    private PermType2 perms2;
    private String display_name;
    private List<ObjectReference<ApiPropertyBase>> qos_forwarding_class_refs;
    private List<ObjectReference<VnSubnetsType>> network_ipam_refs;
    private List<ObjectReference<VirtualNetworkPolicyType>> network_policy_refs;
    private List<ObjectReference<ApiPropertyBase>> access_control_lists;
    private List<ObjectReference<ApiPropertyBase>> floating_ip_pools;
    private List<ObjectReference<ApiPropertyBase>> routing_instances;
    private List<ObjectReference<ApiPropertyBase>> route_table_refs;
    private transient List<ObjectReference<ApiPropertyBase>> virtual_machine_interface_back_refs;
    private transient List<ObjectReference<ApiPropertyBase>> instance_ip_back_refs;
    private transient List<ObjectReference<ApiPropertyBase>> physical_router_back_refs;
    private transient List<ObjectReference<ApiPropertyBase>> logical_router_back_refs;
    private transient List<ObjectReference<FirewallNetType>> firewallservice_back_refs;

    @Override
    public String getObjectType() {
        return "virtual-network";
    }

    @Override
    public List<String> getDefaultParent() {
        return ImmutableList.of("default-domain", "default-project");
    }

    @Override
    public String getDefaultParentType() {
        return "project";
    }
    
    public EcmpHashingIncludeFields getEcmpHashingIncludeFields() {
        return ecmp_hashing_include_fields;
    }
    
    public void setEcmpHashingIncludeFields(EcmpHashingIncludeFields ecmp_hashing_include_fields) {
        this.ecmp_hashing_include_fields = ecmp_hashing_include_fields;
    }
    
    
    public VirtualNetworkType getProperties() {
        return virtual_network_properties;
    }
    
    public void setProperties(VirtualNetworkType virtual_network_properties) {
        this.virtual_network_properties = virtual_network_properties;
    }
    
    
    public ProviderDetails getProviderProperties() {
        return provider_properties;
    }
    
    public void setProviderProperties(ProviderDetails provider_properties) {
        this.provider_properties = provider_properties;
    }
    
    
    public Integer getNetworkId() {
        return virtual_network_network_id;
    }
    
    public void setNetworkId(Integer virtual_network_network_id) {
        this.virtual_network_network_id = virtual_network_network_id;
    }
    
    
    public boolean getPortSecurityEnabled() {
        return port_security_enabled;
    }
    
    public void setPortSecurityEnabled(boolean port_security_enabled) {
        this.port_security_enabled = port_security_enabled;
    }
    
    
    public RouteTargetList getRouteTargetList() {
        return route_target_list;
    }
    
    public void setRouteTargetList(RouteTargetList route_target_list) {
        this.route_target_list = route_target_list;
    }
    
    
    public RouteTargetList getImportRouteTargetList() {
        return import_route_target_list;
    }
    
    public void setImportRouteTargetList(RouteTargetList import_route_target_list) {
        this.import_route_target_list = import_route_target_list;
    }
    
    
    public RouteTargetList getExportRouteTargetList() {
        return export_route_target_list;
    }
    
    public void setExportRouteTargetList(RouteTargetList export_route_target_list) {
        this.export_route_target_list = export_route_target_list;
    }
    
    
    public boolean getRouterExternal() {
        return router_external;
    }
    
    public void setRouterExternal(boolean router_external) {
        this.router_external = router_external;
    }
    
    
    public boolean getIsShared() {
        return is_shared;
    }
    
    public void setIsShared(boolean is_shared) {
        this.is_shared = is_shared;
    }
    
    
    public boolean getExternalIpam() {
        return external_ipam;
    }
    
    public void setExternalIpam(boolean external_ipam) {
        this.external_ipam = external_ipam;
    }
    
    
    public boolean getFloodUnknownUnicast() {
        return flood_unknown_unicast;
    }
    
    public void setFloodUnknownUnicast(boolean flood_unknown_unicast) {
        this.flood_unknown_unicast = flood_unknown_unicast;
    }
    
    
    public String getMultiPolicyServiceChainsEnabled() {
        return multi_policy_service_chains_enabled;
    }
    
    public void setMultiPolicyServiceChainsEnabled(String multi_policy_service_chains_enabled) {
        this.multi_policy_service_chains_enabled = multi_policy_service_chains_enabled;
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
    

    public List<ObjectReference<ApiPropertyBase>> getQosForwardingClass() {
        return qos_forwarding_class_refs;
    }

    public void setQosForwardingClass(QosForwardingClass obj) {
        qos_forwarding_class_refs = new ArrayList<ObjectReference<ApiPropertyBase>>();
        qos_forwarding_class_refs.add(new ObjectReference<ApiPropertyBase>(obj.getQualifiedName(), null));
    }
    public void addQosForwardingClass(QosForwardingClass obj) {
        if (qos_forwarding_class_refs == null) {
            qos_forwarding_class_refs = new ArrayList<ObjectReference<ApiPropertyBase>>();
        }
        qos_forwarding_class_refs.add(new ObjectReference<ApiPropertyBase>(obj.getQualifiedName(), null));
    }
    public void clearQosForwardingClass() {
        if (qos_forwarding_class_refs != null) {
            qos_forwarding_class_refs.clear();
            return;
        }
        qos_forwarding_class_refs = null;
    }

    public List<ObjectReference<VnSubnetsType>> getNetworkIpam() {
        return network_ipam_refs;
    }

    public void setNetworkIpam(NetworkIpam obj, VnSubnetsType data) {
        network_ipam_refs = new ArrayList<ObjectReference<VnSubnetsType>>();
        network_ipam_refs.add(new ObjectReference<VnSubnetsType>(obj.getQualifiedName(), data));
    }

    public void addNetworkIpam(NetworkIpam obj, VnSubnetsType data) {
        if (network_ipam_refs == null) {
            network_ipam_refs = new ArrayList<ObjectReference<VnSubnetsType>>();
        }
        network_ipam_refs.add(new ObjectReference<VnSubnetsType>(obj.getQualifiedName(), data));
    }

    public void removeNetworkIpam(NetworkIpam obj, VnSubnetsType data) {
        if (network_ipam_refs != null) {
            network_ipam_refs.remove(new ObjectReference<VnSubnetsType>(obj.getQualifiedName(), data));
        }
    }

    public void clearNetworkIpam() {
        if (network_ipam_refs != null) {
            network_ipam_refs.clear();
            return;
        }
        network_ipam_refs = null;
    }


    public List<ObjectReference<VirtualNetworkPolicyType>> getNetworkPolicy() {
        return network_policy_refs;
    }

    public void setNetworkPolicy(NetworkPolicy obj, VirtualNetworkPolicyType data) {
        network_policy_refs = new ArrayList<ObjectReference<VirtualNetworkPolicyType>>();
        network_policy_refs.add(new ObjectReference<VirtualNetworkPolicyType>(obj.getQualifiedName(), data));
    }

    public void addNetworkPolicy(NetworkPolicy obj, VirtualNetworkPolicyType data) {
        if (network_policy_refs == null) {
            network_policy_refs = new ArrayList<ObjectReference<VirtualNetworkPolicyType>>();
        }
        network_policy_refs.add(new ObjectReference<VirtualNetworkPolicyType>(obj.getQualifiedName(), data));
    }

    public void removeNetworkPolicy(NetworkPolicy obj, VirtualNetworkPolicyType data) {
        if (network_policy_refs != null) {
            network_policy_refs.remove(new ObjectReference<VirtualNetworkPolicyType>(obj.getQualifiedName(), data));
        }
    }

    public void clearNetworkPolicy() {
        if (network_policy_refs != null) {
            network_policy_refs.clear();
            return;
        }
        network_policy_refs = null;
    }


    public List<ObjectReference<ApiPropertyBase>> getAccessControlLists() {
        return access_control_lists;
    }

    public List<ObjectReference<ApiPropertyBase>> getFloatingIpPools() {
        return floating_ip_pools;
    }

    public List<ObjectReference<ApiPropertyBase>> getRoutingInstances() {
        return routing_instances;
    }

    public List<ObjectReference<ApiPropertyBase>> getRouteTable() {
        return route_table_refs;
    }

    public void setRouteTable(RouteTable obj) {
        route_table_refs = new ArrayList<ObjectReference<ApiPropertyBase>>();
        route_table_refs.add(new ObjectReference<ApiPropertyBase>(obj.getQualifiedName(), null));
    }
    public void addRouteTable(RouteTable obj) {
        if (route_table_refs == null) {
            route_table_refs = new ArrayList<ObjectReference<ApiPropertyBase>>();
        }
        route_table_refs.add(new ObjectReference<ApiPropertyBase>(obj.getQualifiedName(), null));
    }
    public void clearRouteTable() {
        if (route_table_refs != null) {
            route_table_refs.clear();
            return;
        }
        route_table_refs = null;
    }

    public List<ObjectReference<ApiPropertyBase>> getVirtualMachineInterfaceBackRefs() {
        return virtual_machine_interface_back_refs;
    }

    public List<ObjectReference<ApiPropertyBase>> getInstanceIpBackRefs() {
        return instance_ip_back_refs;
    }

    public List<ObjectReference<ApiPropertyBase>> getPhysicalRouterBackRefs() {
        return physical_router_back_refs;
    }

    public List<ObjectReference<ApiPropertyBase>> getLogicalRouterBackRefs() {
        return logical_router_back_refs;
    }

    public List<ObjectReference<FirewallNetType>> getFirewallserviceBackRefs() {
        return firewallservice_back_refs;
    }
}