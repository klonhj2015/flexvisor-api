/*
 * Copyright © 2017 CertusNet, Inc. and others.  All rights reserved.
 *
 * This program and the accompanying materials are made available under the
 * terms of the Eclipse Public License v1.0 which accompanies this distribution,
 * and is available at http://www.eclipse.org/legal/epl-v10.html
 */
package cn.com.certusnet.api.types;

public class FirewallPolicyEntriesType extends ApiPropertyBase {
    boolean audited;
    boolean shared;
    public FirewallPolicyEntriesType() {
    }
    public FirewallPolicyEntriesType(boolean audited, boolean shared) {
        this.audited = audited;
        this.shared = shared;
    }
    public FirewallPolicyEntriesType(boolean audited) {
        this(audited, false);     }
    
    public boolean getAudited() {
        return audited;
    }
    
    public void setAudited(boolean audited) {
        this.audited = audited;
    }
    
    
    public boolean getShared() {
        return shared;
    }
    
    public void setShared(boolean shared) {
        this.shared = shared;
    }
    
}
