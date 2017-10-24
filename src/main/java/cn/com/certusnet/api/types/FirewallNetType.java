/*
 * Copyright © 2017 CertusNet, Inc. and others.  All rights reserved.
 *
 * This program and the accompanying materials are made available under the
 * terms of the Eclipse Public License v1.0 which accompanies this distribution,
 * and is available at http://www.eclipse.org/legal/epl-v10.html
 */
package cn.com.certusnet.api.types;

public class FirewallNetType extends ApiPropertyBase {
    String net_type;
    public FirewallNetType() {
    }
    public FirewallNetType(String net_type) {
        this.net_type = net_type;
    }
    
    public String getNetType() {
        return net_type;
    }
    
    public void setNetType(String net_type) {
        this.net_type = net_type;
    }
    
}
