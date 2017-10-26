/*
 * Copyright © 2017 CertusNet, Inc. and others.  All rights reserved.
 *
 * This program and the accompanying materials are made available under the
 * terms of the Eclipse Public License v1.0 which accompanies this distribution,
 * and is available at http://www.eclipse.org/legal/epl-v10.html
 */
package cn.com.certusnet.api.types;

public class ServiceInterfaceTag extends ApiPropertyBase {
	String interface_type;

	public ServiceInterfaceTag() {
	}

	public ServiceInterfaceTag(String interface_type) {
		this.interface_type = interface_type;
	}

	public String getInterfaceType() {
		return interface_type;
	}

	public void setInterfaceType(String interface_type) {
		this.interface_type = interface_type;
	}

}
