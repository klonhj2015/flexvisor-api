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
import java.util.Iterator;
import java.io.Serializable;

@SuppressWarnings("serial")
public abstract class ApiObjectBase implements Serializable {
	private String name;
    private String uuid;
    private List<String> fq_name;
    private transient ApiObjectBase parent;
    private String parent_type;
    private String parent_uuid;

    public String getName() {
	if (name == null && fq_name != null) {
	    return fq_name.get(fq_name.size() - 1);
	}
	return name;
    }

    /**
     * Retrieves a parent object that may be cached in the object due to a setParent operation.
     * 
     * @return parent
     */
    public ApiObjectBase getParent() {
        return this.parent;
    }
    
    public void setParent(ApiObjectBase parent) {
        this.parent = parent;
        if (name != null) {
            setName(name);
        }
    }

    public void setName(String name) {
	this.name = name;
	if (parent != null) {
	    fq_name = new ArrayList<String>(parent.getQualifiedName());
	    parent_type = parent.getObjectType();
	} else {
	    fq_name = new ArrayList<String>(getDefaultParent());
	    parent_type = getDefaultParentType();
	}
	fq_name.add(name);
    }

    public String getUuid() {
	return uuid;
    }
    public void setUuid(String uuid) {
	this.uuid = uuid;
    }

    public String getParentUuid() {
        return parent_uuid;
    }
    
    public void setParentUuid(String uuid) {
        this.parent_uuid = uuid;
    }

    public String getParentType() {
        return parent_type;
    }

    public void setParentType(String parent_type) {
        this.parent_type = parent_type;
    }

    public List<String> getQualifiedName() {
        return fqNameToList();
    }

    public List<String> fqNameToList() {
        List<String> lst = new ArrayList<String>();
        Iterator<String> iterator = fq_name.iterator();
        while (iterator.hasNext()) {
	    lst.add(iterator.next());
        }
        return lst;
    }

    public abstract String getObjectType();
    public abstract List<String> getDefaultParent();
    public abstract String getDefaultParentType();
}
