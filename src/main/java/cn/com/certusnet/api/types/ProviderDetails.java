/*
 * Copyright © 2017 CertusNet, Inc. and others.  All rights reserved.
 *
 * This program and the accompanying materials are made available under the
 * terms of the Eclipse Public License v1.0 which accompanies this distribution,
 * and is available at http://www.eclipse.org/legal/epl-v10.html
 */
package cn.com.certusnet.api.types;

public class ProviderDetails extends ApiPropertyBase {
    Integer segmentation_id;
    String physical_network;
    public ProviderDetails() {
    }
    public ProviderDetails(Integer segmentation_id, String physical_network) {
        this.segmentation_id = segmentation_id;
        this.physical_network = physical_network;
    }
    public ProviderDetails(Integer segmentation_id) {
        this(segmentation_id, null);     }
    
    public Integer getSegmentationId() {
        return segmentation_id;
    }
    
    public void setSegmentationId(Integer segmentation_id) {
        this.segmentation_id = segmentation_id;
    }
    
    
    public String getPhysicalNetwork() {
        return physical_network;
    }
    
    public void setPhysicalNetwork(String physical_network) {
        this.physical_network = physical_network;
    }
    
}
