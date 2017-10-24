/*
 * Copyright © 2017 CertusNet, Inc. and others.  All rights reserved.
 *
 * This program and the accompanying materials are made available under the
 * terms of the Eclipse Public License v1.0 which accompanies this distribution,
 * and is available at http://www.eclipse.org/legal/epl-v10.html
 */
package cn.com.certusnet.api.types;

import java.util.List;
import com.google.common.collect.ImmutableList;


public class QosQueue extends ApiObjectBase {
    /**
	 * 
	 */
	private static final long serialVersionUID = 1L;
	private Integer min_bandwidth;
    private Integer max_bandwidth;
    private IdPermsType id_perms;
    private PermType2 perms2;
    private String display_name;
    private transient List<ObjectReference<ApiPropertyBase>> qos_forwarding_class_back_refs;

    @Override
    public String getObjectType() {
        return "qos-queue";
    }

    @Override
    public List<String> getDefaultParent() {
        return ImmutableList.of("default-domain", "default-project");
    }

    @Override
    public String getDefaultParentType() {
        return "project";
    }
    
    public Integer getMinBandwidth() {
        return min_bandwidth;
    }
    
    public void setMinBandwidth(Integer min_bandwidth) {
        this.min_bandwidth = min_bandwidth;
    }
    
    
    public Integer getMaxBandwidth() {
        return max_bandwidth;
    }
    
    public void setMaxBandwidth(Integer max_bandwidth) {
        this.max_bandwidth = max_bandwidth;
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
    

    public List<ObjectReference<ApiPropertyBase>> getQosForwardingClassBackRefs() {
        return qos_forwarding_class_back_refs;
    }
}