/*
 * Copyright © 2017 CertusNet, Inc. and others.  All rights reserved.
 *
 * This program and the accompanying materials are made available under the
 * terms of the Eclipse Public License v1.0 which accompanies this distribution,
 * and is available at http://www.eclipse.org/legal/epl-v10.html
 */
package cn.com.certusnet.api.types;

public class MACLimitControlType extends ApiPropertyBase {
	Integer mac_limit;
	String mac_limit_action;

	public MACLimitControlType() {
	}

	public MACLimitControlType(Integer mac_limit, String mac_limit_action) {
		this.mac_limit = mac_limit;
		this.mac_limit_action = mac_limit_action;
	}

	public MACLimitControlType(Integer mac_limit) {
		this(mac_limit, "log");
	}

	public Integer getMacLimit() {
		return mac_limit;
	}

	public void setMacLimit(Integer mac_limit) {
		this.mac_limit = mac_limit;
	}

	public String getMacLimitAction() {
		return mac_limit_action;
	}

	public void setMacLimitAction(String mac_limit_action) {
		this.mac_limit_action = mac_limit_action;
	}

}
