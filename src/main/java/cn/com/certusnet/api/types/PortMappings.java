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

public class PortMappings extends ApiPropertyBase {
	public static class PortMap {
		String protocol;
		Integer src_port;
		Integer dst_port;

		public PortMap() {
		}

		public PortMap(String protocol, Integer src_port, Integer dst_port) {
			this.protocol = protocol;
			this.src_port = src_port;
			this.dst_port = dst_port;
		}

		public PortMap(String protocol) {
			this(protocol, null, null);
		}

		public PortMap(String protocol, Integer src_port) {
			this(protocol, src_port, null);
		}

		public String getProtocol() {
			return protocol;
		}

		public void setProtocol(String protocol) {
			this.protocol = protocol;
		}

		public Integer getSrcPort() {
			return src_port;
		}

		public void setSrcPort(Integer src_port) {
			this.src_port = src_port;
		}

		public Integer getDstPort() {
			return dst_port;
		}

		public void setDstPort(Integer dst_port) {
			this.dst_port = dst_port;
		}

	}

	List<PortMap> port_mappings;

	public PortMappings() {
	}

	public PortMappings(List<PortMap> port_mappings) {
		this.port_mappings = port_mappings;
	}

	public List<PortMap> getPortMappings() {
		return port_mappings;
	}

	public void addPortMappings(PortMap obj) {
		if (port_mappings == null) {
			port_mappings = new ArrayList<PortMap>();
		}
		port_mappings.add(obj);
	}

	public void clearPortMappings() {
		port_mappings = null;
	}

	public void addPortMappings(String protocol, Integer src_port, Integer dst_port) {
		if (port_mappings == null) {
			port_mappings = new ArrayList<PortMap>();
		}
		port_mappings.add(new PortMap(protocol, src_port, dst_port));
	}

}
