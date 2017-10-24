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
import java.io.Serializable;

public class ObjectReference<AttrType extends ApiPropertyBase> implements Serializable {
    /**
	 * 
	 */
	private static final long serialVersionUID = 1L;
	List<String> to;
    String href;
    AttrType attr;
    String uuid;

    public ObjectReference() {
    }

    public ObjectReference(List<String> to, AttrType attr) {
        this.to = to;
        this.attr = attr;
    }
    public void setReference(List<String> to, AttrType attr, String href, String uuid) {
        this.to = new ArrayList<String>(to);
        this.attr = attr;
        this.href = href;
        this.uuid = uuid;
    }
    public String getHRef() {
        return href;
    }
    public String getUuid() {
        return uuid;
    }
    public List<String> getReferredName() {
        return to;
    }
    public AttrType getAttr() {
        return attr;
    }
    
    public static <T extends ApiPropertyBase> String getReferenceListUuid(List<ObjectReference<T>> reflist) {
        if (reflist != null && !reflist.isEmpty()) {
            ObjectReference<T> ref = reflist.get(0);
            return ref.getUuid();
        }
        return null;
    }
}
