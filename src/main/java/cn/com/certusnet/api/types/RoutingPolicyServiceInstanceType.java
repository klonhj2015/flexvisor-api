/*
 * Copyright © 2017 CertusNet, Inc. and others.  All rights reserved.
 *
 * This program and the accompanying materials are made available under the
 * terms of the Eclipse Public License v1.0 which accompanies this distribution,
 * and is available at http://www.eclipse.org/legal/epl-v10.html
 */
package cn.com.certusnet.api.types;

public class RoutingPolicyServiceInstanceType extends ApiPropertyBase {
	String left_sequence;
	String right_sequence;

	public RoutingPolicyServiceInstanceType() {
	}

	public RoutingPolicyServiceInstanceType(String left_sequence, String right_sequence) {
		this.left_sequence = left_sequence;
		this.right_sequence = right_sequence;
	}

	public RoutingPolicyServiceInstanceType(String left_sequence) {
		this(left_sequence, null);
	}

	public String getLeftSequence() {
		return left_sequence;
	}

	public void setLeftSequence(String left_sequence) {
		this.left_sequence = left_sequence;
	}

	public String getRightSequence() {
		return right_sequence;
	}

	public void setRightSequence(String right_sequence) {
		this.right_sequence = right_sequence;
	}

}
