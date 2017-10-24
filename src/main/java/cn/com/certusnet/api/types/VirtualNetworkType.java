/*
 * Copyright © 2017 CertusNet, Inc. and others.  All rights reserved.
 *
 * This program and the accompanying materials are made available under the
 * terms of the Eclipse Public License v1.0 which accompanies this distribution,
 * and is available at http://www.eclipse.org/legal/epl-v10.html
 */
package cn.com.certusnet.api.types;

public class VirtualNetworkType extends ApiPropertyBase {
    boolean allow_transit;
    Integer network_id;
    Integer vxlan_network_identifier;
    String forwarding_mode;
    String rpf;
    Integer qos_inbound;
    Integer qos_outbound;
    Integer qos_burst;
    Integer qos_dscp;
    public VirtualNetworkType() {
    }
    public VirtualNetworkType(boolean allow_transit, Integer network_id, Integer vxlan_network_identifier, String forwarding_mode, String rpf, Integer qos_inbound, Integer qos_outbound, Integer qos_burst, Integer qos_dscp) {
        this.allow_transit = allow_transit;
        this.network_id = network_id;
        this.vxlan_network_identifier = vxlan_network_identifier;
        this.forwarding_mode = forwarding_mode;
        this.rpf = rpf;
        this.qos_inbound = qos_inbound;
        this.qos_outbound = qos_outbound;
        this.qos_burst = qos_burst;
        this.qos_dscp = qos_dscp;
    }
    public VirtualNetworkType(boolean allow_transit) {
        this(allow_transit, null, null, null, null, -1, -1, null, null);     }
    public VirtualNetworkType(boolean allow_transit, Integer network_id) {
        this(allow_transit, network_id, null, null, null, -1, -1, null, null);     }
    public VirtualNetworkType(boolean allow_transit, Integer network_id, Integer vxlan_network_identifier) {
        this(allow_transit, network_id, vxlan_network_identifier, null, null, -1, -1, null, null);     }
    public VirtualNetworkType(boolean allow_transit, Integer network_id, Integer vxlan_network_identifier, String forwarding_mode) {
        this(allow_transit, network_id, vxlan_network_identifier, forwarding_mode, null, -1, -1, null, null);     }
    public VirtualNetworkType(boolean allow_transit, Integer network_id, Integer vxlan_network_identifier, String forwarding_mode, String rpf) {
        this(allow_transit, network_id, vxlan_network_identifier, forwarding_mode, rpf, -1, -1, null, null);     }
    public VirtualNetworkType(boolean allow_transit, Integer network_id, Integer vxlan_network_identifier, String forwarding_mode, String rpf, Integer qos_inbound) {
        this(allow_transit, network_id, vxlan_network_identifier, forwarding_mode, rpf, qos_inbound, -1, null, null);     }
    public VirtualNetworkType(boolean allow_transit, Integer network_id, Integer vxlan_network_identifier, String forwarding_mode, String rpf, Integer qos_inbound, Integer qos_outbound) {
        this(allow_transit, network_id, vxlan_network_identifier, forwarding_mode, rpf, qos_inbound, qos_outbound, null, null);     }
    public VirtualNetworkType(boolean allow_transit, Integer network_id, Integer vxlan_network_identifier, String forwarding_mode, String rpf, Integer qos_inbound, Integer qos_outbound, Integer qos_burst) {
        this(allow_transit, network_id, vxlan_network_identifier, forwarding_mode, rpf, qos_inbound, qos_outbound, qos_burst, null);     }
    
    public boolean getAllowTransit() {
        return allow_transit;
    }
    
    public void setAllowTransit(boolean allow_transit) {
        this.allow_transit = allow_transit;
    }
    
    
    public Integer getNetworkId() {
        return network_id;
    }
    
    public void setNetworkId(Integer network_id) {
        this.network_id = network_id;
    }
    
    
    public Integer getVxlanNetworkIdentifier() {
        return vxlan_network_identifier;
    }
    
    public void setVxlanNetworkIdentifier(Integer vxlan_network_identifier) {
        this.vxlan_network_identifier = vxlan_network_identifier;
    }
    
    
    public String getForwardingMode() {
        return forwarding_mode;
    }
    
    public void setForwardingMode(String forwarding_mode) {
        this.forwarding_mode = forwarding_mode;
    }
    
    
    public String getRpf() {
        return rpf;
    }
    
    public void setRpf(String rpf) {
        this.rpf = rpf;
    }
    
    
    public Integer getQosInbound() {
        return qos_inbound;
    }
    
    public void setQosInbound(Integer qos_inbound) {
        this.qos_inbound = qos_inbound;
    }
    
    
    public Integer getQosOutbound() {
        return qos_outbound;
    }
    
    public void setQosOutbound(Integer qos_outbound) {
        this.qos_outbound = qos_outbound;
    }
    
    
    public Integer getQosBurst() {
        return qos_burst;
    }
    
    public void setQosBurst(Integer qos_burst) {
        this.qos_burst = qos_burst;
    }
    
    
    public Integer getQosDscp() {
        return qos_dscp;
    }
    
    public void setQosDscp(Integer qos_dscp) {
        this.qos_dscp = qos_dscp;
    }
    
}
