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
package com.amazonaws.services.codebuild.model;

import java.io.Serializable;
import javax.annotation.Generated;
import com.amazonaws.protocol.StructuredPojo;
import com.amazonaws.protocol.ProtocolMarshaller;

/**
 * 
 * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/codebuild-2016-10-06/ReportGroupTrendStats" target="_top">AWS
 *      API Documentation</a>
 */
@Generated("com.amazonaws:aws-java-sdk-code-generator")
public class ReportGroupTrendStats implements Serializable, Cloneable, StructuredPojo {

    private String average;

    private String max;

    private String min;

    /**
     * @param average
     */

    public void setAverage(String average) {
        this.average = average;
    }

    /**
     * @return
     */

    public String getAverage() {
        return this.average;
    }

    /**
     * @param average
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public ReportGroupTrendStats withAverage(String average) {
        setAverage(average);
        return this;
    }

    /**
     * @param max
     */

    public void setMax(String max) {
        this.max = max;
    }

    /**
     * @return
     */

    public String getMax() {
        return this.max;
    }

    /**
     * @param max
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public ReportGroupTrendStats withMax(String max) {
        setMax(max);
        return this;
    }

    /**
     * @param min
     */

    public void setMin(String min) {
        this.min = min;
    }

    /**
     * @return
     */

    public String getMin() {
        return this.min;
    }

    /**
     * @param min
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public ReportGroupTrendStats withMin(String min) {
        setMin(min);
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
        if (getAverage() != null)
            sb.append("Average: ").append(getAverage()).append(",");
        if (getMax() != null)
            sb.append("Max: ").append(getMax()).append(",");
        if (getMin() != null)
            sb.append("Min: ").append(getMin());
        sb.append("}");
        return sb.toString();
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj)
            return true;
        if (obj == null)
            return false;

        if (obj instanceof ReportGroupTrendStats == false)
            return false;
        ReportGroupTrendStats other = (ReportGroupTrendStats) obj;
        if (other.getAverage() == null ^ this.getAverage() == null)
            return false;
        if (other.getAverage() != null && other.getAverage().equals(this.getAverage()) == false)
            return false;
        if (other.getMax() == null ^ this.getMax() == null)
            return false;
        if (other.getMax() != null && other.getMax().equals(this.getMax()) == false)
            return false;
        if (other.getMin() == null ^ this.getMin() == null)
            return false;
        if (other.getMin() != null && other.getMin().equals(this.getMin()) == false)
            return false;
        return true;
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int hashCode = 1;

        hashCode = prime * hashCode + ((getAverage() == null) ? 0 : getAverage().hashCode());
        hashCode = prime * hashCode + ((getMax() == null) ? 0 : getMax().hashCode());
        hashCode = prime * hashCode + ((getMin() == null) ? 0 : getMin().hashCode());
        return hashCode;
    }

    @Override
    public ReportGroupTrendStats clone() {
        try {
            return (ReportGroupTrendStats) super.clone();
        } catch (CloneNotSupportedException e) {
            throw new IllegalStateException("Got a CloneNotSupportedException from Object.clone() " + "even though we're Cloneable!", e);
        }
    }

    @com.amazonaws.annotation.SdkInternalApi
    @Override
    public void marshall(ProtocolMarshaller protocolMarshaller) {
        com.amazonaws.services.codebuild.model.transform.ReportGroupTrendStatsMarshaller.getInstance().marshall(this, protocolMarshaller);
    }
}
