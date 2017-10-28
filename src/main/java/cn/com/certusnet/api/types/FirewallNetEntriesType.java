/*
 * Copyright © 2017 CertusNet, Inc. and others.  All rights reserved.
 *
 * This program and the accompanying materials are made available under the
 * terms of the Eclipse Public License v1.0 which accompanies this distribution,
 * and is available at http://www.eclipse.org/legal/epl-v10.html
 */
package cn.com.certusnet.api.types;

public class FirewallNetEntriesType extends ApiPropertyBase {
    String left_net;
    String right_net;
    boolean enabled;
    boolean shared;
    public FirewallNetEntriesType() {
    }
    public FirewallNetEntriesType(String left_net, String right_net, boolean enabled, boolean shared) {
        this.left_net = left_net;
        this.right_net = right_net;
        this.enabled = enabled;
        this.shared = shared;
    }
    public FirewallNetEntriesType(String left_net) {
        this(left_net, null, true, false);     }
    public FirewallNetEntriesType(String left_net, String right_net) {
        this(left_net, right_net, true, false);     }
    public FirewallNetEntriesType(String left_net, String right_net, boolean enabled) {
        this(left_net, right_net, enabled, false);     }
    
    public String getLeftNet() {
        return left_net;
    }
    
    public void setLeftNet(String left_net) {
        this.left_net = left_net;
    }
    
    
    public String getRightNet() {
        return right_net;
    }
    
    public void setRightNet(String right_net) {
        this.right_net = right_net;
    }
    
    
    public boolean getEnabled() {
        return enabled;
    }
    
    public void setEnabled(boolean enabled) {
        this.enabled = enabled;
    }
    
    
    public boolean getShared() {
        return shared;
    }
    
    public void setShared(boolean shared) {
        this.shared = shared;
    }
    
}
