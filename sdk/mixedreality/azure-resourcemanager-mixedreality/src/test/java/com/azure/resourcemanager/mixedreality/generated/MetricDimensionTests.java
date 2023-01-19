// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT License.
// Code generated by Microsoft (R) AutoRest Code Generator.

package com.azure.resourcemanager.mixedreality.generated;

import com.azure.core.util.BinaryData;
import com.azure.resourcemanager.mixedreality.models.MetricDimension;
import org.junit.jupiter.api.Assertions;

public final class MetricDimensionTests {
    @org.junit.jupiter.api.Test
    public void testDeserialize() throws Exception {
        MetricDimension model =
            BinaryData
                .fromString(
                    "{\"name\":\"hhbcsglummajtjao\",\"displayName\":\"obnbdxkqpxokaj\",\"internalName\":\"npime\",\"toBeExportedForShoebox\":false}")
                .toObject(MetricDimension.class);
        Assertions.assertEquals("hhbcsglummajtjao", model.name());
        Assertions.assertEquals("obnbdxkqpxokaj", model.displayName());
        Assertions.assertEquals("npime", model.internalName());
        Assertions.assertEquals(false, model.toBeExportedForShoebox());
    }

    @org.junit.jupiter.api.Test
    public void testSerialize() throws Exception {
        MetricDimension model =
            new MetricDimension()
                .withName("hhbcsglummajtjao")
                .withDisplayName("obnbdxkqpxokaj")
                .withInternalName("npime")
                .withToBeExportedForShoebox(false);
        model = BinaryData.fromObject(model).toObject(MetricDimension.class);
        Assertions.assertEquals("hhbcsglummajtjao", model.name());
        Assertions.assertEquals("obnbdxkqpxokaj", model.displayName());
        Assertions.assertEquals("npime", model.internalName());
        Assertions.assertEquals(false, model.toBeExportedForShoebox());
    }
}