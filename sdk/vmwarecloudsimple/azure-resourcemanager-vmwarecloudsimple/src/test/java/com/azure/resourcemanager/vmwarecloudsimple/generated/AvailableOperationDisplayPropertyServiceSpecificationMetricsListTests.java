// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT License.
// Code generated by Microsoft (R) AutoRest Code Generator.

package com.azure.resourcemanager.vmwarecloudsimple.generated;

import com.azure.core.util.BinaryData;
import com.azure.resourcemanager.vmwarecloudsimple.models.AggregationType;
import com.azure.resourcemanager.vmwarecloudsimple.models.AvailableOperationDisplayPropertyServiceSpecificationMetricsItem;
import com.azure.resourcemanager.vmwarecloudsimple.models.AvailableOperationDisplayPropertyServiceSpecificationMetricsList;
import java.util.Arrays;
import org.junit.jupiter.api.Assertions;

public final class AvailableOperationDisplayPropertyServiceSpecificationMetricsListTests {
    @org.junit.jupiter.api.Test
    public void testDeserialize() throws Exception {
        AvailableOperationDisplayPropertyServiceSpecificationMetricsList model =
            BinaryData
                .fromString(
                    "{\"metricSpecifications\":[{\"aggregationType\":\"Average\",\"displayDescription\":\"czwlokjyem\",\"displayName\":\"kvnipjoxz\",\"name\":\"nchgej\",\"unit\":\"podmailzydehojwy\"}]}")
                .toObject(AvailableOperationDisplayPropertyServiceSpecificationMetricsList.class);
        Assertions.assertEquals(AggregationType.AVERAGE, model.metricSpecifications().get(0).aggregationType());
        Assertions.assertEquals("czwlokjyem", model.metricSpecifications().get(0).displayDescription());
        Assertions.assertEquals("kvnipjoxz", model.metricSpecifications().get(0).displayName());
        Assertions.assertEquals("nchgej", model.metricSpecifications().get(0).name());
        Assertions.assertEquals("podmailzydehojwy", model.metricSpecifications().get(0).unit());
    }

    @org.junit.jupiter.api.Test
    public void testSerialize() throws Exception {
        AvailableOperationDisplayPropertyServiceSpecificationMetricsList model =
            new AvailableOperationDisplayPropertyServiceSpecificationMetricsList()
                .withMetricSpecifications(
                    Arrays
                        .asList(
                            new AvailableOperationDisplayPropertyServiceSpecificationMetricsItem()
                                .withAggregationType(AggregationType.AVERAGE)
                                .withDisplayDescription("czwlokjyem")
                                .withDisplayName("kvnipjoxz")
                                .withName("nchgej")
                                .withUnit("podmailzydehojwy")));
        model =
            BinaryData
                .fromObject(model)
                .toObject(AvailableOperationDisplayPropertyServiceSpecificationMetricsList.class);
        Assertions.assertEquals(AggregationType.AVERAGE, model.metricSpecifications().get(0).aggregationType());
        Assertions.assertEquals("czwlokjyem", model.metricSpecifications().get(0).displayDescription());
        Assertions.assertEquals("kvnipjoxz", model.metricSpecifications().get(0).displayName());
        Assertions.assertEquals("nchgej", model.metricSpecifications().get(0).name());
        Assertions.assertEquals("podmailzydehojwy", model.metricSpecifications().get(0).unit());
    }
}