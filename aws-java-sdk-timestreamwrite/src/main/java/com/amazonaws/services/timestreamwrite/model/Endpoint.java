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
package com.amazonaws.services.timestreamwrite.model;

import java.io.Serializable;
import javax.annotation.Generated;
import com.amazonaws.protocol.StructuredPojo;
import com.amazonaws.protocol.ProtocolMarshaller;

/**
 * <p>
 * Represents an available endpoint against which to make API calls agaisnt, as well as the TTL for that endpoint.
 * </p>
 * 
 * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/timestream-write-2018-11-01/Endpoint" target="_top">AWS API
 *      Documentation</a>
 */
@Generated("com.amazonaws:aws-java-sdk-code-generator")
public class Endpoint implements Serializable, Cloneable, StructuredPojo {

    /**
     * <p>
     * An endpoint address.
     * </p>
     */
    private String address;
    /**
     * <p>
     * The TTL for the endpoint, in minutes.
     * </p>
     */
    private Long cachePeriodInMinutes;

    /**
     * <p>
     * An endpoint address.
     * </p>
     * 
     * @param address
     *        An endpoint address.
     */

    public void setAddress(String address) {
        this.address = address;
    }

    /**
     * <p>
     * An endpoint address.
     * </p>
     * 
     * @return An endpoint address.
     */

    public String getAddress() {
        return this.address;
    }

    /**
     * <p>
     * An endpoint address.
     * </p>
     * 
     * @param address
     *        An endpoint address.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public Endpoint withAddress(String address) {
        setAddress(address);
        return this;
    }

    /**
     * <p>
     * The TTL for the endpoint, in minutes.
     * </p>
     * 
     * @param cachePeriodInMinutes
     *        The TTL for the endpoint, in minutes.
     */

    public void setCachePeriodInMinutes(Long cachePeriodInMinutes) {
        this.cachePeriodInMinutes = cachePeriodInMinutes;
    }

    /**
     * <p>
     * The TTL for the endpoint, in minutes.
     * </p>
     * 
     * @return The TTL for the endpoint, in minutes.
     */

    public Long getCachePeriodInMinutes() {
        return this.cachePeriodInMinutes;
    }

    /**
     * <p>
     * The TTL for the endpoint, in minutes.
     * </p>
     * 
     * @param cachePeriodInMinutes
     *        The TTL for the endpoint, in minutes.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public Endpoint withCachePeriodInMinutes(Long cachePeriodInMinutes) {
        setCachePeriodInMinutes(cachePeriodInMinutes);
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
        if (getAddress() != null)
            sb.append("Address: ").append(getAddress()).append(",");
        if (getCachePeriodInMinutes() != null)
            sb.append("CachePeriodInMinutes: ").append(getCachePeriodInMinutes());
        sb.append("}");
        return sb.toString();
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj)
            return true;
        if (obj == null)
            return false;

        if (obj instanceof Endpoint == false)
            return false;
        Endpoint other = (Endpoint) obj;
        if (other.getAddress() == null ^ this.getAddress() == null)
            return false;
        if (other.getAddress() != null && other.getAddress().equals(this.getAddress()) == false)
            return false;
        if (other.getCachePeriodInMinutes() == null ^ this.getCachePeriodInMinutes() == null)
            return false;
        if (other.getCachePeriodInMinutes() != null && other.getCachePeriodInMinutes().equals(this.getCachePeriodInMinutes()) == false)
            return false;
        return true;
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int hashCode = 1;

        hashCode = prime * hashCode + ((getAddress() == null) ? 0 : getAddress().hashCode());
        hashCode = prime * hashCode + ((getCachePeriodInMinutes() == null) ? 0 : getCachePeriodInMinutes().hashCode());
        return hashCode;
    }

    @Override
    public Endpoint clone() {
        try {
            return (Endpoint) super.clone();
        } catch (CloneNotSupportedException e) {
            throw new IllegalStateException("Got a CloneNotSupportedException from Object.clone() " + "even though we're Cloneable!", e);
        }
    }

    @com.amazonaws.annotation.SdkInternalApi
    @Override
    public void marshall(ProtocolMarshaller protocolMarshaller) {
        com.amazonaws.services.timestreamwrite.model.transform.EndpointMarshaller.getInstance().marshall(this, protocolMarshaller);
    }
}
