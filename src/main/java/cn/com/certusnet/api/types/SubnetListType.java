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

public class SubnetListType extends ApiPropertyBase {
	List<SubnetType> subnet;

	public SubnetListType() {
	}

	public SubnetListType(List<SubnetType> subnet) {
		this.subnet = subnet;
	}

	public List<SubnetType> getSubnet() {
		return subnet;
	}

	public void addSubnet(SubnetType obj) {
		if (subnet == null) {
			subnet = new ArrayList<SubnetType>();
		}
		subnet.add(obj);
	}

	public void clearSubnet() {
		subnet = null;
	}

	public void addSubnet(String ip_prefix, Integer ip_prefix_len) {
		if (subnet == null) {
			subnet = new ArrayList<SubnetType>();
		}
		subnet.add(new SubnetType(ip_prefix, ip_prefix_len));
	}

}
