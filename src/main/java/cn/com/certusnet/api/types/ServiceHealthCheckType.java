/*
 * Copyright © 2017 CertusNet, Inc. and others.  All rights reserved.
 *
 * This program and the accompanying materials are made available under the
 * terms of the Eclipse Public License v1.0 which accompanies this distribution,
 * and is available at http://www.eclipse.org/legal/epl-v10.html
 */
package cn.com.certusnet.api.types;

public class ServiceHealthCheckType extends ApiPropertyBase {
	boolean enabled;
	String health_check_type;
	String monitor_type;
	Integer delay;
	Integer timeout;
	Integer max_retries;
	String http_method;
	String url_path;
	String expected_codes;

	public ServiceHealthCheckType() {
	}

	public ServiceHealthCheckType(boolean enabled, String health_check_type, String monitor_type, Integer delay,
			Integer timeout, Integer max_retries, String http_method, String url_path, String expected_codes) {
		this.enabled = enabled;
		this.health_check_type = health_check_type;
		this.monitor_type = monitor_type;
		this.delay = delay;
		this.timeout = timeout;
		this.max_retries = max_retries;
		this.http_method = http_method;
		this.url_path = url_path;
		this.expected_codes = expected_codes;
	}

	public ServiceHealthCheckType(boolean enabled) {
		this(enabled, null, null, null, null, null, null, null, null);
	}

	public ServiceHealthCheckType(boolean enabled, String health_check_type) {
		this(enabled, health_check_type, null, null, null, null, null, null, null);
	}

	public ServiceHealthCheckType(boolean enabled, String health_check_type, String monitor_type) {
		this(enabled, health_check_type, monitor_type, null, null, null, null, null, null);
	}

	public ServiceHealthCheckType(boolean enabled, String health_check_type, String monitor_type, Integer delay) {
		this(enabled, health_check_type, monitor_type, delay, null, null, null, null, null);
	}

	public ServiceHealthCheckType(boolean enabled, String health_check_type, String monitor_type, Integer delay,
			Integer timeout) {
		this(enabled, health_check_type, monitor_type, delay, timeout, null, null, null, null);
	}

	public ServiceHealthCheckType(boolean enabled, String health_check_type, String monitor_type, Integer delay,
			Integer timeout, Integer max_retries) {
		this(enabled, health_check_type, monitor_type, delay, timeout, max_retries, null, null, null);
	}

	public ServiceHealthCheckType(boolean enabled, String health_check_type, String monitor_type, Integer delay,
			Integer timeout, Integer max_retries, String http_method) {
		this(enabled, health_check_type, monitor_type, delay, timeout, max_retries, http_method, null, null);
	}

	public ServiceHealthCheckType(boolean enabled, String health_check_type, String monitor_type, Integer delay,
			Integer timeout, Integer max_retries, String http_method, String url_path) {
		this(enabled, health_check_type, monitor_type, delay, timeout, max_retries, http_method, url_path, null);
	}

	public boolean getEnabled() {
		return enabled;
	}

	public void setEnabled(boolean enabled) {
		this.enabled = enabled;
	}

	public String getHealthCheckType() {
		return health_check_type;
	}

	public void setHealthCheckType(String health_check_type) {
		this.health_check_type = health_check_type;
	}

	public String getMonitorType() {
		return monitor_type;
	}

	public void setMonitorType(String monitor_type) {
		this.monitor_type = monitor_type;
	}

	public Integer getDelay() {
		return delay;
	}

	public void setDelay(Integer delay) {
		this.delay = delay;
	}

	public Integer getTimeout() {
		return timeout;
	}

	public void setTimeout(Integer timeout) {
		this.timeout = timeout;
	}

	public Integer getMaxRetries() {
		return max_retries;
	}

	public void setMaxRetries(Integer max_retries) {
		this.max_retries = max_retries;
	}

	public String getHttpMethod() {
		return http_method;
	}

	public void setHttpMethod(String http_method) {
		this.http_method = http_method;
	}

	public String getUrlPath() {
		return url_path;
	}

	public void setUrlPath(String url_path) {
		this.url_path = url_path;
	}

	public String getExpectedCodes() {
		return expected_codes;
	}

	public void setExpectedCodes(String expected_codes) {
		this.expected_codes = expected_codes;
	}

}
