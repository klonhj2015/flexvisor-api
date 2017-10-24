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

public class RouteTargetList extends ApiPropertyBase {
    List<String> route_target;
    public RouteTargetList() {
    }
    public RouteTargetList(List<String> route_target) {
        this.route_target = route_target;
    }
    
    public List<String> getRouteTarget() {
        return route_target;
    }
    
    
    public void addRouteTarget(String obj) {
        if (route_target == null) {
            route_target = new ArrayList<String>();
        }
        route_target.add(obj);
    }
    public void clearRouteTarget() {
        route_target = null;
    }
    
}
