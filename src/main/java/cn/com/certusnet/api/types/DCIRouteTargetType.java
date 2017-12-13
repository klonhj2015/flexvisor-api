/*
 * Copyright © 2017 CertusNet, Inc. and others.  All rights reserved.
 *
 * This program and the accompanying materials are made available under the
 * terms of the Eclipse Public License v1.0 which accompanies this distribution,
 * and is available at http://www.eclipse.org/legal/epl-v10.html
 */

package cn.com.certusnet.api.types;



public class DCIRouteTargetType extends ApiPropertyBase {
    String direction;
    public DCIRouteTargetType() {
    }
    public DCIRouteTargetType(String direction) {
        this.direction = direction;
    }
    
    public String getDirection() {
        return direction;
    }
    
    public void setDirection(String direction) {
        this.direction = direction;
    }
    
}