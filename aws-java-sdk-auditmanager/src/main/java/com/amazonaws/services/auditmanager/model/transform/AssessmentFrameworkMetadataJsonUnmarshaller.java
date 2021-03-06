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
package com.amazonaws.services.auditmanager.model.transform;

import java.math.*;

import javax.annotation.Generated;

import com.amazonaws.services.auditmanager.model.*;
import com.amazonaws.transform.SimpleTypeJsonUnmarshallers.*;
import com.amazonaws.transform.*;

import com.fasterxml.jackson.core.JsonToken;
import static com.fasterxml.jackson.core.JsonToken.*;

/**
 * AssessmentFrameworkMetadata JSON Unmarshaller
 */
@Generated("com.amazonaws:aws-java-sdk-code-generator")
public class AssessmentFrameworkMetadataJsonUnmarshaller implements Unmarshaller<AssessmentFrameworkMetadata, JsonUnmarshallerContext> {

    public AssessmentFrameworkMetadata unmarshall(JsonUnmarshallerContext context) throws Exception {
        AssessmentFrameworkMetadata assessmentFrameworkMetadata = new AssessmentFrameworkMetadata();

        int originalDepth = context.getCurrentDepth();
        String currentParentElement = context.getCurrentParentElement();
        int targetDepth = originalDepth + 1;

        JsonToken token = context.getCurrentToken();
        if (token == null)
            token = context.nextToken();
        if (token == VALUE_NULL) {
            return null;
        }

        while (true) {
            if (token == null)
                break;

            if (token == FIELD_NAME || token == START_OBJECT) {
                if (context.testExpression("arn", targetDepth)) {
                    context.nextToken();
                    assessmentFrameworkMetadata.setArn(context.getUnmarshaller(String.class).unmarshall(context));
                }
                if (context.testExpression("id", targetDepth)) {
                    context.nextToken();
                    assessmentFrameworkMetadata.setId(context.getUnmarshaller(String.class).unmarshall(context));
                }
                if (context.testExpression("type", targetDepth)) {
                    context.nextToken();
                    assessmentFrameworkMetadata.setType(context.getUnmarshaller(String.class).unmarshall(context));
                }
                if (context.testExpression("name", targetDepth)) {
                    context.nextToken();
                    assessmentFrameworkMetadata.setName(context.getUnmarshaller(String.class).unmarshall(context));
                }
                if (context.testExpression("description", targetDepth)) {
                    context.nextToken();
                    assessmentFrameworkMetadata.setDescription(context.getUnmarshaller(String.class).unmarshall(context));
                }
                if (context.testExpression("logo", targetDepth)) {
                    context.nextToken();
                    assessmentFrameworkMetadata.setLogo(context.getUnmarshaller(String.class).unmarshall(context));
                }
                if (context.testExpression("complianceType", targetDepth)) {
                    context.nextToken();
                    assessmentFrameworkMetadata.setComplianceType(context.getUnmarshaller(String.class).unmarshall(context));
                }
                if (context.testExpression("controlsCount", targetDepth)) {
                    context.nextToken();
                    assessmentFrameworkMetadata.setControlsCount(context.getUnmarshaller(Integer.class).unmarshall(context));
                }
                if (context.testExpression("controlSetsCount", targetDepth)) {
                    context.nextToken();
                    assessmentFrameworkMetadata.setControlSetsCount(context.getUnmarshaller(Integer.class).unmarshall(context));
                }
                if (context.testExpression("createdAt", targetDepth)) {
                    context.nextToken();
                    assessmentFrameworkMetadata.setCreatedAt(DateJsonUnmarshallerFactory.getInstance("unixTimestamp").unmarshall(context));
                }
                if (context.testExpression("lastUpdatedAt", targetDepth)) {
                    context.nextToken();
                    assessmentFrameworkMetadata.setLastUpdatedAt(DateJsonUnmarshallerFactory.getInstance("unixTimestamp").unmarshall(context));
                }
            } else if (token == END_ARRAY || token == END_OBJECT) {
                if (context.getLastParsedParentElement() == null || context.getLastParsedParentElement().equals(currentParentElement)) {
                    if (context.getCurrentDepth() <= originalDepth)
                        break;
                }
            }
            token = context.nextToken();
        }

        return assessmentFrameworkMetadata;
    }

    private static AssessmentFrameworkMetadataJsonUnmarshaller instance;

    public static AssessmentFrameworkMetadataJsonUnmarshaller getInstance() {
        if (instance == null)
            instance = new AssessmentFrameworkMetadataJsonUnmarshaller();
        return instance;
    }
}
