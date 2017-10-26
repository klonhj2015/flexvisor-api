/*
 * Copyright © 2017 CertusNet, Inc. and others.  All rights reserved.
 *
 * This program and the accompanying materials are made available under the
 * terms of the Eclipse Public License v1.0 which accompanies this distribution,
 * and is available at http://www.eclipse.org/legal/epl-v10.html
 */
package cn.com.certusnet.api.types;

public class MACMoveLimitControlType extends ApiPropertyBase {
	Integer mac_move_limit;
	Integer mac_move_time_window;
	String mac_move_limit_action;

	public MACMoveLimitControlType() {
	}

	public MACMoveLimitControlType(Integer mac_move_limit, Integer mac_move_time_window, String mac_move_limit_action) {
		this.mac_move_limit = mac_move_limit;
		this.mac_move_time_window = mac_move_time_window;
		this.mac_move_limit_action = mac_move_limit_action;
	}

	public MACMoveLimitControlType(Integer mac_move_limit) {
		this(mac_move_limit, 10, "log");
	}

	public MACMoveLimitControlType(Integer mac_move_limit, Integer mac_move_time_window) {
		this(mac_move_limit, mac_move_time_window, "log");
	}

	public Integer getMacMoveLimit() {
		return mac_move_limit;
	}

	public void setMacMoveLimit(Integer mac_move_limit) {
		this.mac_move_limit = mac_move_limit;
	}

	public Integer getMacMoveTimeWindow() {
		return mac_move_time_window;
	}

	public void setMacMoveTimeWindow(Integer mac_move_time_window) {
		this.mac_move_time_window = mac_move_time_window;
	}

	public String getMacMoveLimitAction() {
		return mac_move_limit_action;
	}

	public void setMacMoveLimitAction(String mac_move_limit_action) {
		this.mac_move_limit_action = mac_move_limit_action;
	}

}
