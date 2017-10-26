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

public class JunosServicePorts extends ApiPropertyBase {
	List<String> service_port;

	public JunosServicePorts() {
	}

	public JunosServicePorts(List<String> service_port) {
		this.service_port = service_port;
	}

	public List<String> getServicePort() {
		return service_port;
	}

	public void addServicePort(String obj) {
		if (service_port == null) {
			service_port = new ArrayList<String>();
		}
		service_port.add(obj);
	}

	public void clearServicePort() {
		service_port = null;
	}

}
