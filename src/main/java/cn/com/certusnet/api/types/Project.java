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
public class Project extends ApiObjectBase {
    private QuotaType quota;
    private QosElementType project_qos;
    private IdPermsType id_perms;
    private PermType2 perms2;
    private String display_name;
    private List<ObjectReference<SubnetType>> namespace_refs;
    private List<ObjectReference<ApiPropertyBase>> security_groups;
    private List<ObjectReference<ApiPropertyBase>> virtual_networks;
    private List<ObjectReference<ApiPropertyBase>> qos_queues;
    private List<ObjectReference<ApiPropertyBase>> qos_forwarding_classs;
    private List<ObjectReference<ApiPropertyBase>> network_ipams;
    private List<ObjectReference<ApiPropertyBase>> network_policys;
    private List<ObjectReference<ApiPropertyBase>> virtual_machine_interfaces;
    private List<ObjectReference<ApiPropertyBase>> floating_ip_pool_refs;
    private List<ObjectReference<ApiPropertyBase>> bgp_as_a_services;
    private List<ObjectReference<ApiPropertyBase>> routing_policys;
    private List<ObjectReference<ApiPropertyBase>> route_aggregates;
    private List<ObjectReference<ApiPropertyBase>> service_instances;
    private List<ObjectReference<ApiPropertyBase>> service_health_checks;
    private List<ObjectReference<ApiPropertyBase>> route_tables;
    private List<ObjectReference<ApiPropertyBase>> interface_route_tables;
    private List<ObjectReference<ApiPropertyBase>> logical_routers;
    private List<ObjectReference<ApiPropertyBase>> api_access_lists;
    private List<ObjectReference<ApiPropertyBase>> loadbalancer_pools;
    private List<ObjectReference<ApiPropertyBase>> loadbalancer_healthmonitors;
    private List<ObjectReference<ApiPropertyBase>> virtual_ips;
    private List<ObjectReference<ApiPropertyBase>> loadbalancer_listeners;
    private List<ObjectReference<ApiPropertyBase>> loadbalancers;
    private List<ObjectReference<ApiPropertyBase>> firewallrules;
    private List<ObjectReference<ApiPropertyBase>> firewallservices;
    private List<ObjectReference<ApiPropertyBase>> firewallpolicys;
    private List<ObjectReference<ApiPropertyBase>> firewallnats;
    private List<ObjectReference<ApiPropertyBase>> firewallnets;
    private List<ObjectReference<ApiPropertyBase>> vpnservices;
    private List<ObjectReference<ApiPropertyBase>> ipsecsite_connections;
    private List<ObjectReference<ApiPropertyBase>> ikepolicys;
    private List<ObjectReference<ApiPropertyBase>> ipsecpolicys;
    private List<ObjectReference<ApiPropertyBase>> vpn_credentials;
    private List<ObjectReference<ApiPropertyBase>> sslvpn_connections;
    private List<ObjectReference<ApiPropertyBase>> l2_dci_connects;
    private List<ObjectReference<ApiPropertyBase>> l3_dci_connects;
    private transient List<ObjectReference<ApiPropertyBase>> floating_ip_back_refs;

    @Override
    public String getObjectType() {
        return "project";
    }

    @Override
    public List<String> getDefaultParent() {
        return ImmutableList.of("default-domain");
    }

    @Override
    public String getDefaultParentType() {
        return "domain";
    }
    
    public QuotaType getQuota() {
        return quota;
    }
    
    public void setQuota(QuotaType quota) {
        this.quota = quota;
    }
    
    
    public QosElementType getQos() {
        return project_qos;
    }
    
    public void setQos(QosElementType project_qos) {
        this.project_qos = project_qos;
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
    

    public List<ObjectReference<SubnetType>> getNamespace() {
        return namespace_refs;
    }

    public void setNamespace(Namespace obj, SubnetType data) {
        namespace_refs = new ArrayList<ObjectReference<SubnetType>>();
        namespace_refs.add(new ObjectReference<SubnetType>(obj.getQualifiedName(), data));
    }

    public void addNamespace(Namespace obj, SubnetType data) {
        if (namespace_refs == null) {
            namespace_refs = new ArrayList<ObjectReference<SubnetType>>();
        }
        namespace_refs.add(new ObjectReference<SubnetType>(obj.getQualifiedName(), data));
    }

    public void removeNamespace(Namespace obj, SubnetType data) {
        if (namespace_refs != null) {
            namespace_refs.remove(new ObjectReference<SubnetType>(obj.getQualifiedName(), data));
        }
    }

    public void clearNamespace() {
        if (namespace_refs != null) {
            namespace_refs.clear();
            return;
        }
        namespace_refs = null;
    }


    public List<ObjectReference<ApiPropertyBase>> getSecurityGroups() {
        return security_groups;
    }

    public List<ObjectReference<ApiPropertyBase>> getVirtualNetworks() {
        return virtual_networks;
    }

    public List<ObjectReference<ApiPropertyBase>> getQosQueues() {
        return qos_queues;
    }

    public List<ObjectReference<ApiPropertyBase>> getQosForwardingClasss() {
        return qos_forwarding_classs;
    }

    public List<ObjectReference<ApiPropertyBase>> getNetworkIpams() {
        return network_ipams;
    }

    public List<ObjectReference<ApiPropertyBase>> getNetworkPolicys() {
        return network_policys;
    }

    public List<ObjectReference<ApiPropertyBase>> getVirtualMachineInterfaces() {
        return virtual_machine_interfaces;
    }

    public List<ObjectReference<ApiPropertyBase>> getFloatingIpPool() {
        return floating_ip_pool_refs;
    }

    public void setFloatingIpPool(FloatingIpPool obj) {
        floating_ip_pool_refs = new ArrayList<ObjectReference<ApiPropertyBase>>();
        floating_ip_pool_refs.add(new ObjectReference<ApiPropertyBase>(obj.getQualifiedName(), null));
    }
    public void addFloatingIpPool(FloatingIpPool obj) {
        if (floating_ip_pool_refs == null) {
            floating_ip_pool_refs = new ArrayList<ObjectReference<ApiPropertyBase>>();
        }
        floating_ip_pool_refs.add(new ObjectReference<ApiPropertyBase>(obj.getQualifiedName(), null));
    }
    public void clearFloatingIpPool() {
        if (floating_ip_pool_refs != null) {
            floating_ip_pool_refs.clear();
            return;
        }
        floating_ip_pool_refs = null;
    }

    public List<ObjectReference<ApiPropertyBase>> getBgpAsAServices() {
        return bgp_as_a_services;
    }

    public List<ObjectReference<ApiPropertyBase>> getRoutingPolicys() {
        return routing_policys;
    }

    public List<ObjectReference<ApiPropertyBase>> getRouteAggregates() {
        return route_aggregates;
    }

    public List<ObjectReference<ApiPropertyBase>> getServiceInstances() {
        return service_instances;
    }

    public List<ObjectReference<ApiPropertyBase>> getServiceHealthChecks() {
        return service_health_checks;
    }

    public List<ObjectReference<ApiPropertyBase>> getRouteTables() {
        return route_tables;
    }

    public List<ObjectReference<ApiPropertyBase>> getInterfaceRouteTables() {
        return interface_route_tables;
    }

    public List<ObjectReference<ApiPropertyBase>> getLogicalRouters() {
        return logical_routers;
    }

    public List<ObjectReference<ApiPropertyBase>> getApiAccessLists() {
        return api_access_lists;
    }

    public List<ObjectReference<ApiPropertyBase>> getLoadbalancerPools() {
        return loadbalancer_pools;
    }

    public List<ObjectReference<ApiPropertyBase>> getLoadbalancerHealthmonitors() {
        return loadbalancer_healthmonitors;
    }

    public List<ObjectReference<ApiPropertyBase>> getVirtualIps() {
        return virtual_ips;
    }

    public List<ObjectReference<ApiPropertyBase>> getLoadbalancerListeners() {
        return loadbalancer_listeners;
    }

    public List<ObjectReference<ApiPropertyBase>> getLoadbalancers() {
        return loadbalancers;
    }

    public List<ObjectReference<ApiPropertyBase>> getFirewallrules() {
        return firewallrules;
    }

    public List<ObjectReference<ApiPropertyBase>> getFirewallservices() {
        return firewallservices;
    }

    public List<ObjectReference<ApiPropertyBase>> getFirewallpolicys() {
        return firewallpolicys;
    }

    public List<ObjectReference<ApiPropertyBase>> getFirewallnats() {
        return firewallnats;
    }

    public List<ObjectReference<ApiPropertyBase>> getFirewallnets() {
        return firewallnets;
    }

    public List<ObjectReference<ApiPropertyBase>> getVpnservices() {
        return vpnservices;
    }

    public List<ObjectReference<ApiPropertyBase>> getIpsecsiteConnections() {
        return ipsecsite_connections;
    }

    public List<ObjectReference<ApiPropertyBase>> getIkepolicys() {
        return ikepolicys;
    }

    public List<ObjectReference<ApiPropertyBase>> getIpsecpolicys() {
        return ipsecpolicys;
    }

    public List<ObjectReference<ApiPropertyBase>> getVpnCredentials() {
        return vpn_credentials;
    }

    public List<ObjectReference<ApiPropertyBase>> getSslvpnConnections() {
        return sslvpn_connections;
    }

    public List<ObjectReference<ApiPropertyBase>> getL2DciConnects() {
        return l2_dci_connects;
    }

    public List<ObjectReference<ApiPropertyBase>> getL3DciConnects() {
        return l3_dci_connects;
    }
    
    public List<ObjectReference<ApiPropertyBase>> getFloatingIpBackRefs() {
        return floating_ip_back_refs;
    }
}