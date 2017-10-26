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


public class MacAddressesType extends ApiPropertyBase {
    List<String> mac_address;
    public MacAddressesType() {
    }
    public MacAddressesType(List<String> mac_address) {
        this.mac_address = mac_address;
    }
    
    public List<String> getMacAddress() {
        return mac_address;
    }
    
    
    public void addMacAddress(String obj) {
        if (mac_address == null) {
            mac_address = new ArrayList<String>();
        }
        mac_address.add(obj);
    }
    public void clearMacAddress() {
        mac_address = null;
    }
    
}
