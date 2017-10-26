/*
 * Copyright © 2017 CertusNet, Inc. and others.  All rights reserved.
 *
 * This program and the accompanying materials are made available under the
 * terms of the Eclipse Public License v1.0 which accompanies this distribution,
 * and is available at http://www.eclipse.org/legal/epl-v10.html
 */
package cn.com.certusnet.api.types;


public class QosElementType extends ApiPropertyBase {
    Integer qos_inbound;
    Integer qos_outbound;
    Integer qos_burst;
    Integer qos_dscp;
    public QosElementType() {
    }
    public QosElementType(Integer qos_inbound, Integer qos_outbound, Integer qos_burst, Integer qos_dscp) {
        this.qos_inbound = qos_inbound;
        this.qos_outbound = qos_outbound;
        this.qos_burst = qos_burst;
        this.qos_dscp = qos_dscp;
    }
    public QosElementType(Integer qos_inbound) {
        this(qos_inbound, -1, null, null);     }
    public QosElementType(Integer qos_inbound, Integer qos_outbound) {
        this(qos_inbound, qos_outbound, null, null);     }
    public QosElementType(Integer qos_inbound, Integer qos_outbound, Integer qos_burst) {
        this(qos_inbound, qos_outbound, qos_burst, null);     }
    
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
