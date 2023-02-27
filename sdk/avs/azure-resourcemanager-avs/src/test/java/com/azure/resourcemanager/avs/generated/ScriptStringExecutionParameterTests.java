// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT License.
// Code generated by Microsoft (R) AutoRest Code Generator.

package com.azure.resourcemanager.avs.generated;

import com.azure.core.util.BinaryData;
import com.azure.resourcemanager.avs.models.ScriptStringExecutionParameter;
import org.junit.jupiter.api.Assertions;

public final class ScriptStringExecutionParameterTests {
    @org.junit.jupiter.api.Test
    public void testDeserialize() throws Exception {
        ScriptStringExecutionParameter model =
            BinaryData
                .fromString("{\"type\":\"Value\",\"value\":\"cx\",\"name\":\"frpdsofbshrns\"}")
                .toObject(ScriptStringExecutionParameter.class);
        Assertions.assertEquals("frpdsofbshrns", model.name());
        Assertions.assertEquals("cx", model.value());
    }

    @org.junit.jupiter.api.Test
    public void testSerialize() throws Exception {
        ScriptStringExecutionParameter model =
            new ScriptStringExecutionParameter().withName("frpdsofbshrns").withValue("cx");
        model = BinaryData.fromObject(model).toObject(ScriptStringExecutionParameter.class);
        Assertions.assertEquals("frpdsofbshrns", model.name());
        Assertions.assertEquals("cx", model.value());
    }
}