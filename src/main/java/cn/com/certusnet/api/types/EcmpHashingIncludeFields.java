/*
 * Copyright © 2017 CertusNet, Inc. and others.  All rights reserved.
 *
 * This program and the accompanying materials are made available under the
 * terms of the Eclipse Public License v1.0 which accompanies this distribution,
 * and is available at http://www.eclipse.org/legal/epl-v10.html
 */
package cn.com.certusnet.api.types;

public class EcmpHashingIncludeFields extends ApiPropertyBase {
    boolean hashing_configured;
    boolean source_ip;
    boolean destination_ip;
    boolean ip_protocol;
    boolean source_port;
    boolean destination_port;
    public EcmpHashingIncludeFields() {
    }
    public EcmpHashingIncludeFields(boolean hashing_configured, boolean source_ip, boolean destination_ip, boolean ip_protocol, boolean source_port, boolean destination_port) {
        this.hashing_configured = hashing_configured;
        this.source_ip = source_ip;
        this.destination_ip = destination_ip;
        this.ip_protocol = ip_protocol;
        this.source_port = source_port;
        this.destination_port = destination_port;
    }
    public EcmpHashingIncludeFields(boolean hashing_configured) {
        this(hashing_configured, true, true, true, true, true);     }
    public EcmpHashingIncludeFields(boolean hashing_configured, boolean source_ip) {
        this(hashing_configured, source_ip, true, true, true, true);     }
    public EcmpHashingIncludeFields(boolean hashing_configured, boolean source_ip, boolean destination_ip) {
        this(hashing_configured, source_ip, destination_ip, true, true, true);     }
    public EcmpHashingIncludeFields(boolean hashing_configured, boolean source_ip, boolean destination_ip, boolean ip_protocol) {
        this(hashing_configured, source_ip, destination_ip, ip_protocol, true, true);     }
    public EcmpHashingIncludeFields(boolean hashing_configured, boolean source_ip, boolean destination_ip, boolean ip_protocol, boolean source_port) {
        this(hashing_configured, source_ip, destination_ip, ip_protocol, source_port, true);     }
    
    public boolean getHashingConfigured() {
        return hashing_configured;
    }
    
    public void setHashingConfigured(boolean hashing_configured) {
        this.hashing_configured = hashing_configured;
    }
    
    
    public boolean getSourceIp() {
        return source_ip;
    }
    
    public void setSourceIp(boolean source_ip) {
        this.source_ip = source_ip;
    }
    
    
    public boolean getDestinationIp() {
        return destination_ip;
    }
    
    public void setDestinationIp(boolean destination_ip) {
        this.destination_ip = destination_ip;
    }
    
    
    public boolean getIpProtocol() {
        return ip_protocol;
    }
    
    public void setIpProtocol(boolean ip_protocol) {
        this.ip_protocol = ip_protocol;
    }
    
    
    public boolean getSourcePort() {
        return source_port;
    }
    
    public void setSourcePort(boolean source_port) {
        this.source_port = source_port;
    }
    
    
    public boolean getDestinationPort() {
        return destination_port;
    }
    
    public void setDestinationPort(boolean destination_port) {
        this.destination_port = destination_port;
    }
    
}
