// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT License.
// Code generated by Microsoft (R) AutoRest Code Generator.

package com.azure.resourcemanager.datalakeanalytics.generated;

import com.azure.core.util.BinaryData;
import com.azure.resourcemanager.datalakeanalytics.models.OperationMetaLogSpecification;
import com.azure.resourcemanager.datalakeanalytics.models.OperationMetaMetricSpecification;
import com.azure.resourcemanager.datalakeanalytics.models.OperationMetaServiceSpecification;
import java.util.Arrays;
import org.junit.jupiter.api.Assertions;

public final class OperationMetaServiceSpecificationTests {
    @org.junit.jupiter.api.Test
    public void testDeserialize() throws Exception {
        OperationMetaServiceSpecification model =
            BinaryData
                .fromString(
                    "{\"metricSpecifications\":[{\"name\":\"wncwzzhxgktrmg\",\"displayDescription\":\"napkteoellw\",\"displayName\":\"fdygpfqbuaceopz\",\"unit\":\"rhhuaopppcqeqx\",\"aggregationType\":\"z\",\"availabilities\":[]},{\"name\":\"xcto\",\"displayDescription\":\"bkdmo\",\"displayName\":\"postmgrcfbunrm\",\"unit\":\"jhhkxbp\",\"aggregationType\":\"ymjhxxjyngudivkr\",\"availabilities\":[]}],\"logSpecifications\":[{\"name\":\"zvszj\",\"displayName\":\"uvjfdxxive\",\"blobDuration\":\"t\"},{\"name\":\"aqtdoqmcbx\",\"displayName\":\"vxysl\",\"blobDuration\":\"hsfxoblytkb\"},{\"name\":\"pe\",\"displayName\":\"wfbkrvrns\",\"blobDuration\":\"hqjohxcrsbfova\"}]}")
                .toObject(OperationMetaServiceSpecification.class);
        Assertions.assertEquals("wncwzzhxgktrmg", model.metricSpecifications().get(0).name());
        Assertions.assertEquals("napkteoellw", model.metricSpecifications().get(0).displayDescription());
        Assertions.assertEquals("fdygpfqbuaceopz", model.metricSpecifications().get(0).displayName());
        Assertions.assertEquals("rhhuaopppcqeqx", model.metricSpecifications().get(0).unit());
        Assertions.assertEquals("z", model.metricSpecifications().get(0).aggregationType());
        Assertions.assertEquals("zvszj", model.logSpecifications().get(0).name());
        Assertions.assertEquals("uvjfdxxive", model.logSpecifications().get(0).displayName());
        Assertions.assertEquals("t", model.logSpecifications().get(0).blobDuration());
    }

    @org.junit.jupiter.api.Test
    public void testSerialize() throws Exception {
        OperationMetaServiceSpecification model =
            new OperationMetaServiceSpecification()
                .withMetricSpecifications(
                    Arrays
                        .asList(
                            new OperationMetaMetricSpecification()
                                .withName("wncwzzhxgktrmg")
                                .withDisplayDescription("napkteoellw")
                                .withDisplayName("fdygpfqbuaceopz")
                                .withUnit("rhhuaopppcqeqx")
                                .withAggregationType("z")
                                .withAvailabilities(Arrays.asList()),
                            new OperationMetaMetricSpecification()
                                .withName("xcto")
                                .withDisplayDescription("bkdmo")
                                .withDisplayName("postmgrcfbunrm")
                                .withUnit("jhhkxbp")
                                .withAggregationType("ymjhxxjyngudivkr")
                                .withAvailabilities(Arrays.asList())))
                .withLogSpecifications(
                    Arrays
                        .asList(
                            new OperationMetaLogSpecification()
                                .withName("zvszj")
                                .withDisplayName("uvjfdxxive")
                                .withBlobDuration("t"),
                            new OperationMetaLogSpecification()
                                .withName("aqtdoqmcbx")
                                .withDisplayName("vxysl")
                                .withBlobDuration("hsfxoblytkb"),
                            new OperationMetaLogSpecification()
                                .withName("pe")
                                .withDisplayName("wfbkrvrns")
                                .withBlobDuration("hqjohxcrsbfova")));
        model = BinaryData.fromObject(model).toObject(OperationMetaServiceSpecification.class);
        Assertions.assertEquals("wncwzzhxgktrmg", model.metricSpecifications().get(0).name());
        Assertions.assertEquals("napkteoellw", model.metricSpecifications().get(0).displayDescription());
        Assertions.assertEquals("fdygpfqbuaceopz", model.metricSpecifications().get(0).displayName());
        Assertions.assertEquals("rhhuaopppcqeqx", model.metricSpecifications().get(0).unit());
        Assertions.assertEquals("z", model.metricSpecifications().get(0).aggregationType());
        Assertions.assertEquals("zvszj", model.logSpecifications().get(0).name());
        Assertions.assertEquals("uvjfdxxive", model.logSpecifications().get(0).displayName());
        Assertions.assertEquals("t", model.logSpecifications().get(0).blobDuration());
    }
}