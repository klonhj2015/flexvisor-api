/*
 * Copyright © 2017 CertusNet, Inc. and others.  All rights reserved.
 *
 * This program and the accompanying materials are made available under the
 * terms of the Eclipse Public License v1.0 which accompanies this distribution,
 * and is available at http://www.eclipse.org/legal/epl-v10.html
 */

package cn.com.certusnet.api.types;

import java.lang.reflect.Constructor;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

public class ApiConnectorFactory {
	private static final Logger s_logger = LoggerFactory.getLogger(ApiConnectorFactory.class);
    static private ApiConnectorFactory _singleton;
    private Class<? extends ApiConnector> _cls;

    private ApiConnectorFactory() {
	_cls = ApiConnectorImpl.class;
    }

    private Constructor<? extends ApiConnector> getConstructor() throws NoSuchMethodException {
        return _cls.getConstructor(String.class, Integer.TYPE);
    }
    
    private static synchronized ApiConnectorFactory getInstance() {
        if (_singleton == null) {
            _singleton = new ApiConnectorFactory();
        }
        return _singleton;
    }
    
    /**
     * Create an ApiConnector object.
     * @param hostname name or IP address of contrail VNC api server.
     * @port  api server port.
     * @return ApiConnector implementation.
     */
    public static ApiConnector build(String hostname, int port) {
        ApiConnectorFactory factory = getInstance();
        try {
            Constructor<? extends ApiConnector> constructor = factory.getConstructor();
            return constructor.newInstance(hostname, port);
        } catch (Exception ex) {
        	
        	s_logger.error("Unable to create object", ex);
        }
        return null;
    }
    
    public static void setImplementation(Class<? extends ApiConnector> cls) {
        ApiConnectorFactory factory = getInstance();
        factory._cls = cls;
    }
}
