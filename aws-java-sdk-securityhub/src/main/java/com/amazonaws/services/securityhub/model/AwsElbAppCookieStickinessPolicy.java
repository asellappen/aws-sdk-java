/*
 * Copyright 2016-2021 Amazon.com, Inc. or its affiliates. All Rights Reserved.
 * 
 * Licensed under the Apache License, Version 2.0 (the "License"). You may not use this file except in compliance with
 * the License. A copy of the License is located at
 * 
 * http://aws.amazon.com/apache2.0
 * 
 * or in the "license" file accompanying this file. This file is distributed on an "AS IS" BASIS, WITHOUT WARRANTIES OR
 * CONDITIONS OF ANY KIND, either express or implied. See the License for the specific language governing permissions
 * and limitations under the License.
 */
package com.amazonaws.services.securityhub.model;

import java.io.Serializable;
import javax.annotation.Generated;
import com.amazonaws.protocol.StructuredPojo;
import com.amazonaws.protocol.ProtocolMarshaller;

/**
 * <p>
 * Contains information about a stickiness policy that was created using <code>CreateAppCookieStickinessPolicy</code>.
 * </p>
 * 
 * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/securityhub-2018-10-26/AwsElbAppCookieStickinessPolicy"
 *      target="_top">AWS API Documentation</a>
 */
@Generated("com.amazonaws:aws-java-sdk-code-generator")
public class AwsElbAppCookieStickinessPolicy implements Serializable, Cloneable, StructuredPojo {

    /**
     * <p>
     * The name of the application cookie used for stickiness.
     * </p>
     */
    private String cookieName;
    /**
     * <p>
     * The mnemonic name for the policy being created. The name must be unique within the set of policies for the load
     * balancer.
     * </p>
     */
    private String policyName;

    /**
     * <p>
     * The name of the application cookie used for stickiness.
     * </p>
     * 
     * @param cookieName
     *        The name of the application cookie used for stickiness.
     */

    public void setCookieName(String cookieName) {
        this.cookieName = cookieName;
    }

    /**
     * <p>
     * The name of the application cookie used for stickiness.
     * </p>
     * 
     * @return The name of the application cookie used for stickiness.
     */

    public String getCookieName() {
        return this.cookieName;
    }

    /**
     * <p>
     * The name of the application cookie used for stickiness.
     * </p>
     * 
     * @param cookieName
     *        The name of the application cookie used for stickiness.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public AwsElbAppCookieStickinessPolicy withCookieName(String cookieName) {
        setCookieName(cookieName);
        return this;
    }

    /**
     * <p>
     * The mnemonic name for the policy being created. The name must be unique within the set of policies for the load
     * balancer.
     * </p>
     * 
     * @param policyName
     *        The mnemonic name for the policy being created. The name must be unique within the set of policies for the
     *        load balancer.
     */

    public void setPolicyName(String policyName) {
        this.policyName = policyName;
    }

    /**
     * <p>
     * The mnemonic name for the policy being created. The name must be unique within the set of policies for the load
     * balancer.
     * </p>
     * 
     * @return The mnemonic name for the policy being created. The name must be unique within the set of policies for
     *         the load balancer.
     */

    public String getPolicyName() {
        return this.policyName;
    }

    /**
     * <p>
     * The mnemonic name for the policy being created. The name must be unique within the set of policies for the load
     * balancer.
     * </p>
     * 
     * @param policyName
     *        The mnemonic name for the policy being created. The name must be unique within the set of policies for the
     *        load balancer.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public AwsElbAppCookieStickinessPolicy withPolicyName(String policyName) {
        setPolicyName(policyName);
        return this;
    }

    /**
     * Returns a string representation of this object. This is useful for testing and debugging. Sensitive data will be
     * redacted from this string using a placeholder value.
     *
     * @return A string representation of this object.
     *
     * @see java.lang.Object#toString()
     */
    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("{");
        if (getCookieName() != null)
            sb.append("CookieName: ").append(getCookieName()).append(",");
        if (getPolicyName() != null)
            sb.append("PolicyName: ").append(getPolicyName());
        sb.append("}");
        return sb.toString();
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj)
            return true;
        if (obj == null)
            return false;

        if (obj instanceof AwsElbAppCookieStickinessPolicy == false)
            return false;
        AwsElbAppCookieStickinessPolicy other = (AwsElbAppCookieStickinessPolicy) obj;
        if (other.getCookieName() == null ^ this.getCookieName() == null)
            return false;
        if (other.getCookieName() != null && other.getCookieName().equals(this.getCookieName()) == false)
            return false;
        if (other.getPolicyName() == null ^ this.getPolicyName() == null)
            return false;
        if (other.getPolicyName() != null && other.getPolicyName().equals(this.getPolicyName()) == false)
            return false;
        return true;
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int hashCode = 1;

        hashCode = prime * hashCode + ((getCookieName() == null) ? 0 : getCookieName().hashCode());
        hashCode = prime * hashCode + ((getPolicyName() == null) ? 0 : getPolicyName().hashCode());
        return hashCode;
    }

    @Override
    public AwsElbAppCookieStickinessPolicy clone() {
        try {
            return (AwsElbAppCookieStickinessPolicy) super.clone();
        } catch (CloneNotSupportedException e) {
            throw new IllegalStateException("Got a CloneNotSupportedException from Object.clone() " + "even though we're Cloneable!", e);
        }
    }

    @com.amazonaws.annotation.SdkInternalApi
    @Override
    public void marshall(ProtocolMarshaller protocolMarshaller) {
        com.amazonaws.services.securityhub.model.transform.AwsElbAppCookieStickinessPolicyMarshaller.getInstance().marshall(this, protocolMarshaller);
    }
}
