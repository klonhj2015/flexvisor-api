/*
 * Copyright © 2017 CertusNet, Inc. and others.  All rights reserved.
 *
 * This program and the accompanying materials are made available under the
 * terms of the Eclipse Public License v1.0 which accompanies this distribution,
 * and is available at http://www.eclipse.org/legal/epl-v10.html
 */
package cn.com.certusnet.api.types;

import java.util.ArrayList;
import java.util.List;

public class UserDefinedLogStatList extends ApiPropertyBase {
	public static class UserDefinedLogStat {
		String name;
		String pattern;

		public UserDefinedLogStat() {
		}

		public UserDefinedLogStat(String name, String pattern) {
			this.name = name;
			this.pattern = pattern;
		}

		public UserDefinedLogStat(String name) {
			this(name, null);
		}

		public String getName() {
			return name;
		}

		public void setName(String name) {
			this.name = name;
		}

		public String getPattern() {
			return pattern;
		}

		public void setPattern(String pattern) {
			this.pattern = pattern;
		}

	}

	List<UserDefinedLogStat> statlist;

	public UserDefinedLogStatList() {
	}

	public UserDefinedLogStatList(List<UserDefinedLogStat> statlist) {
		this.statlist = statlist;
	}

	public List<UserDefinedLogStat> getStatlist() {
		return statlist;
	}

	public void addStatlist(UserDefinedLogStat obj) {
		if (statlist == null) {
			statlist = new ArrayList<UserDefinedLogStat>();
		}
		statlist.add(obj);
	}

	public void clearStatlist() {
		statlist = null;
	}

	public void addStatlist(String name, String pattern) {
		if (statlist == null) {
			statlist = new ArrayList<UserDefinedLogStat>();
		}
		statlist.add(new UserDefinedLogStat(name, pattern));
	}

}
