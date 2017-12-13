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

public class DCIL3EntriesType extends ApiPropertyBase {
    String router_id;
    boolean fw_enable;
    String logic_fw_id;
    List<String> local_subnets;
    List<String> peer_cidrs;
    public DCIL3EntriesType() {
    }
    public DCIL3EntriesType(String router_id, boolean fw_enable, String logic_fw_id, List<String> local_subnets, List<String> peer_cidrs) {
        this.router_id = router_id;
        this.fw_enable = fw_enable;
        this.logic_fw_id = logic_fw_id;
        this.local_subnets = local_subnets;
        this.peer_cidrs = peer_cidrs;
    }
    public DCIL3EntriesType(String router_id) {
        this(router_id, false, null, null, null);     }
    public DCIL3EntriesType(String router_id, boolean fw_enable) {
        this(router_id, fw_enable, null, null, null);     }
    public DCIL3EntriesType(String router_id, boolean fw_enable, String logic_fw_id) {
        this(router_id, fw_enable, logic_fw_id, null, null);     }
    public DCIL3EntriesType(String router_id, boolean fw_enable, String logic_fw_id, List<String> local_subnets) {
        this(router_id, fw_enable, logic_fw_id, local_subnets, null);     }
    
    public String getRouterId() {
        return router_id;
    }
    
    public void setRouterId(String router_id) {
        this.router_id = router_id;
    }
    
    
    public boolean getFwEnable() {
        return fw_enable;
    }
    
    public void setFwEnable(boolean fw_enable) {
        this.fw_enable = fw_enable;
    }
    
    
    public String getLogicFwId() {
        return logic_fw_id;
    }
    
    public void setLogicFwId(String logic_fw_id) {
        this.logic_fw_id = logic_fw_id;
    }
    
    
    public List<String> getLocalSubnets() {
        return local_subnets;
    }
    
    
    public void addLocalSubnets(String obj) {
        if (local_subnets == null) {
            local_subnets = new ArrayList<String>();
        }
        local_subnets.add(obj);
    }
    public void clearLocalSubnets() {
        local_subnets = null;
    }
    
    
    public List<String> getPeerCidrs() {
        return peer_cidrs;
    }
    
    
    public void addPeerCidrs(String obj) {
        if (peer_cidrs == null) {
            peer_cidrs = new ArrayList<String>();
        }
        peer_cidrs.add(obj);
    }
    public void clearPeerCidrs() {
        peer_cidrs = null;
    }
    
}
