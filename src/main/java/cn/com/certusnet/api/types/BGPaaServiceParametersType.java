/*
 * Copyright © 2017 CertusNet, Inc. and others.  All rights reserved.
 *
 * This program and the accompanying materials are made available under the
 * terms of the Eclipse Public License v1.0 which accompanies this distribution,
 * and is available at http://www.eclipse.org/legal/epl-v10.html
 */
package cn.com.certusnet.api.types;

public class BGPaaServiceParametersType extends ApiPropertyBase {
	Integer port_start;
	Integer port_end;

	public BGPaaServiceParametersType() {
	}

	public BGPaaServiceParametersType(Integer port_start, Integer port_end) {
		this.port_start = port_start;
		this.port_end = port_end;
	}

	public BGPaaServiceParametersType(Integer port_start) {
		this(port_start, 50512);
	}

	public Integer getPortStart() {
		return port_start;
	}

	public void setPortStart(Integer port_start) {
		this.port_start = port_start;
	}

	public Integer getPortEnd() {
		return port_end;
	}

	public void setPortEnd(Integer port_end) {
		this.port_end = port_end;
	}

}
