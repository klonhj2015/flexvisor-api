/*
 * Copyright © 2017 CertusNet, Inc. and others.  All rights reserved.
 *
 * This program and the accompanying materials are made available under the
 * terms of the Eclipse Public License v1.0 which accompanies this distribution,
 * and is available at http://www.eclipse.org/legal/epl-v10.html
 */
package cn.com.certusnet.api.types;

public class FirewallserviceEntriesType extends ApiPropertyBase {
    String status;
    boolean admin_state_up;
    boolean shared;
    String firewall_type;
    String public_ip;
    String left_ip;
    String left_net;
    String router;
    boolean enable_ha;
    public FirewallserviceEntriesType() {
    }
    public FirewallserviceEntriesType(String status, boolean admin_state_up, boolean shared, String firewall_type, String public_ip, String left_ip, String left_net, String router, boolean enable_ha) {
        this.status = status;
        this.admin_state_up = admin_state_up;
        this.shared = shared;
        this.firewall_type = firewall_type;
        this.public_ip = public_ip;
        this.left_ip = left_ip;
        this.left_net = left_net;
        this.router = router;
        this.enable_ha = enable_ha;
    }
    public FirewallserviceEntriesType(String status) {
        this(status, false, false, null, null, null, null, null, false);     }
    public FirewallserviceEntriesType(String status, boolean admin_state_up) {
        this(status, admin_state_up, false, null, null, null, null, null, false);     }
    public FirewallserviceEntriesType(String status, boolean admin_state_up, boolean shared) {
        this(status, admin_state_up, shared, null, null, null, null, null, false);     }
    public FirewallserviceEntriesType(String status, boolean admin_state_up, boolean shared, String firewall_type) {
        this(status, admin_state_up, shared, firewall_type, null, null, null, null, false);     }
    public FirewallserviceEntriesType(String status, boolean admin_state_up, boolean shared, String firewall_type, String public_ip) {
        this(status, admin_state_up, shared, firewall_type, public_ip, null, null, null, false);     }
    public FirewallserviceEntriesType(String status, boolean admin_state_up, boolean shared, String firewall_type, String public_ip, String left_ip) {
        this(status, admin_state_up, shared, firewall_type, public_ip, left_ip, null, null, false);     }
    public FirewallserviceEntriesType(String status, boolean admin_state_up, boolean shared, String firewall_type, String public_ip, String left_ip, String left_net) {
        this(status, admin_state_up, shared, firewall_type, public_ip, left_ip, left_net, null, false);     }
    public FirewallserviceEntriesType(String status, boolean admin_state_up, boolean shared, String firewall_type, String public_ip, String left_ip, String left_net, String router) {
        this(status, admin_state_up, shared, firewall_type, public_ip, left_ip, left_net, router, false);     }
    
    public String getStatus() {
        return status;
    }
    
    public void setStatus(String status) {
        this.status = status;
    }
    
    
    public boolean getAdminStateUp() {
        return admin_state_up;
    }
    
    public void setAdminStateUp(boolean admin_state_up) {
        this.admin_state_up = admin_state_up;
    }
    
    
    public boolean getShared() {
        return shared;
    }
    
    public void setShared(boolean shared) {
        this.shared = shared;
    }
    
    
    public String getFirewallType() {
        return firewall_type;
    }
    
    public void setFirewallType(String firewall_type) {
        this.firewall_type = firewall_type;
    }
    
    
    public String getPublicIp() {
        return public_ip;
    }
    
    public void setPublicIp(String public_ip) {
        this.public_ip = public_ip;
    }
    
    
    public String getLeftIp() {
        return left_ip;
    }
    
    public void setLeftIp(String left_ip) {
        this.left_ip = left_ip;
    }
    
    
    public String getLeftNet() {
        return left_net;
    }
    
    public void setLeftNet(String left_net) {
        this.left_net = left_net;
    }
    
    
    public String getRouter() {
        return router;
    }
    
    public void setRouter(String router) {
        this.router = router;
    }
    
    
    public boolean getEnableHa() {
        return enable_ha;
    }
    
    public void setEnableHa(boolean enable_ha) {
        this.enable_ha = enable_ha;
    }
    
}
