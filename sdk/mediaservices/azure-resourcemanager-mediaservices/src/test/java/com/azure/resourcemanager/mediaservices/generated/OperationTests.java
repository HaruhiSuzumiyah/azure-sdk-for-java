// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT License.
// Code generated by Microsoft (R) AutoRest Code Generator.

package com.azure.resourcemanager.mediaservices.generated;

import com.azure.core.util.BinaryData;
import com.azure.resourcemanager.mediaservices.models.ActionType;
import com.azure.resourcemanager.mediaservices.models.Operation;
import com.azure.resourcemanager.mediaservices.models.OperationDisplay;
import com.azure.resourcemanager.mediaservices.models.Properties;
import org.junit.jupiter.api.Assertions;

public final class OperationTests {
    @org.junit.jupiter.api.Test
    public void testDeserialize() throws Exception {
        Operation model =
            BinaryData
                .fromString(
                    "{\"name\":\"aqwi\",\"display\":{\"provider\":\"prozvcputegjvwmf\",\"resource\":\"t\",\"operation\":\"mdvpjhulsu\",\"description\":\"mkjozkrwf\"},\"origin\":\"iodjp\",\"properties\":{\"serviceSpecification\":{\"logSpecifications\":[],\"metricSpecifications\":[]}},\"isDataAction\":true,\"actionType\":\"Internal\"}")
                .toObject(Operation.class);
        Assertions.assertEquals("aqwi", model.name());
        Assertions.assertEquals("prozvcputegjvwmf", model.display().provider());
        Assertions.assertEquals("t", model.display().resource());
        Assertions.assertEquals("mdvpjhulsu", model.display().operation());
        Assertions.assertEquals("mkjozkrwf", model.display().description());
        Assertions.assertEquals("iodjp", model.origin());
        Assertions.assertEquals(true, model.isDataAction());
        Assertions.assertEquals(ActionType.INTERNAL, model.actionType());
    }

    @org.junit.jupiter.api.Test
    public void testSerialize() throws Exception {
        Operation model =
            new Operation()
                .withName("aqwi")
                .withDisplay(
                    new OperationDisplay()
                        .withProvider("prozvcputegjvwmf")
                        .withResource("t")
                        .withOperation("mdvpjhulsu")
                        .withDescription("mkjozkrwf"))
                .withOrigin("iodjp")
                .withProperties(new Properties())
                .withIsDataAction(true)
                .withActionType(ActionType.INTERNAL);
        model = BinaryData.fromObject(model).toObject(Operation.class);
        Assertions.assertEquals("aqwi", model.name());
        Assertions.assertEquals("prozvcputegjvwmf", model.display().provider());
        Assertions.assertEquals("t", model.display().resource());
        Assertions.assertEquals("mdvpjhulsu", model.display().operation());
        Assertions.assertEquals("mkjozkrwf", model.display().description());
        Assertions.assertEquals("iodjp", model.origin());
        Assertions.assertEquals(true, model.isDataAction());
        Assertions.assertEquals(ActionType.INTERNAL, model.actionType());
    }
}