/*
 * Copyright © 2017 CertusNet, Inc. and others.  All rights reserved.
 *
 * This program and the accompanying materials are made available under the
 * terms of the Eclipse Public License v1.0 which accompanies this distribution,
 * and is available at http://www.eclipse.org/legal/epl-v10.html
 */
package cn.com.certusnet.api.types;

import java.io.IOException;
import java.util.List;

public interface ApiConnector {
    ApiConnector credentials(String username, String password);
    ApiConnector tenantName(String tenantName);
    ApiConnector authToken(String token);
    ApiConnector authServer(String type, String url);

    boolean create(ApiObjectBase obj) throws IOException;
    boolean read(ApiObjectBase obj) throws IOException;
    boolean update(ApiObjectBase obj) throws IOException;
    void delete(ApiObjectBase obj) throws IOException;
    void delete(Class<? extends ApiObjectBase> cls, String uuid) throws IOException;
    ApiObjectBase findById(Class<? extends ApiObjectBase> cls, String uuid) throws IOException;
    /**
     * Query the api-server name-to-uuid mappings.
     * 
     * @param cls the class of the api object.
     * @param parent parent object. If null the default parent for this object type is used.
     * @param name unqualified object name.
     * @return the uuid of the specified object, if found.
     * @throws IOException
     */
    String findByName(Class<? extends ApiObjectBase> cls, ApiObjectBase parent, String name) throws IOException;
    /**
     * Query the api-server name-to-uuid mappings.
     * 
     * @param cls the class of the api object.
     * @param fqn fully qualified name as a list of strings.
     * @return the uuid of the specified object, if found.
     */
    String findByName(Class<? extends ApiObjectBase> cls, List<String> fqn) throws IOException;
    ApiObjectBase find(Class<? extends ApiObjectBase> cls, ApiObjectBase parent, String name) throws IOException;
    ApiObjectBase findByFQN(Class<? extends ApiObjectBase> cls, String fullName) throws IOException;
    List<? extends ApiObjectBase> list(Class <? extends ApiObjectBase> cls, List<String> parent) throws IOException;
    public <T extends ApiPropertyBase> List<? extends ApiObjectBase> getObjects(Class<? extends ApiObjectBase> cls,
            List<ObjectReference<T>> refList) throws IOException;
}
