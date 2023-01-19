// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT License.
// Code generated by Microsoft (R) AutoRest Code Generator.

package com.azure.resourcemanager.mixedreality.generated;

import com.azure.core.util.BinaryData;
import com.azure.resourcemanager.mixedreality.models.LogSpecification;
import com.azure.resourcemanager.mixedreality.models.MetricSpecification;
import com.azure.resourcemanager.mixedreality.models.OperationProperties;
import com.azure.resourcemanager.mixedreality.models.ServiceSpecification;
import java.util.Arrays;
import org.junit.jupiter.api.Assertions;

public final class OperationPropertiesTests {
    @org.junit.jupiter.api.Test
    public void testDeserialize() throws Exception {
        OperationProperties model =
            BinaryData
                .fromString(
                    "{\"serviceSpecification\":{\"logSpecifications\":[{\"name\":\"dbihanufhfcbj\",\"displayName\":\"a\",\"blobDuration\":\"th\"},{\"name\":\"hab\",\"displayName\":\"pikxwczbyscnpqxu\",\"blobDuration\":\"vyq\"},{\"name\":\"wby\",\"displayName\":\"k\",\"blobDuration\":\"dumjgrtfwvuk\"}],\"metricSpecifications\":[{\"name\":\"dcc\",\"displayName\":\"h\",\"displayDescription\":\"cnyejhkryhtnapcz\",\"unit\":\"okjye\",\"aggregationType\":\"kvnipjoxz\",\"supportedAggregationTypes\":[],\"supportedTimeGrainTypes\":[],\"enableRegionalMdmAccount\":true,\"sourceMdmAccount\":\"jspodmailzyde\",\"sourceMdmNamespace\":\"jwyahuxinpmqnja\",\"metricFilterPattern\":\"ixjsprozvcputeg\",\"fillGapWithZero\":true,\"category\":\"fdatsc\",\"internalMetricName\":\"vpjhulsuuv\",\"dimensions\":[],\"lockedAggregationType\":\"ozkrwfndiodjpslw\"},{\"name\":\"dpvwryoqpsoaccta\",\"displayName\":\"kljla\",\"displayDescription\":\"cr\",\"unit\":\"fdfdosygexpa\",\"aggregationType\":\"akhmsbzjhcrz\",\"supportedAggregationTypes\":[],\"supportedTimeGrainTypes\":[],\"enableRegionalMdmAccount\":true,\"sourceMdmAccount\":\"xaolth\",\"sourceMdmNamespace\":\"rgqjbpfzfsinzg\",\"metricFilterPattern\":\"cjrwzoxxjtfellu\",\"fillGapWithZero\":true,\"category\":\"tonpe\",\"internalMetricName\":\"pjkjlxofpdv\",\"dimensions\":[],\"lockedAggregationType\":\"xxypininmay\"},{\"name\":\"ybb\",\"displayName\":\"odepoogin\",\"displayDescription\":\"amiheognarxz\",\"unit\":\"heotusiv\",\"aggregationType\":\"v\",\"supportedAggregationTypes\":[],\"supportedTimeGrainTypes\":[],\"enableRegionalMdmAccount\":false,\"sourceMdmAccount\":\"nhungbw\",\"sourceMdmNamespace\":\"rnfygxgispem\",\"metricFilterPattern\":\"zfkufubljofx\",\"fillGapWithZero\":true,\"category\":\"jaeq\",\"internalMetricName\":\"qjbasvms\",\"dimensions\":[],\"lockedAggregationType\":\"ulngsntn\"}]}}")
                .toObject(OperationProperties.class);
        Assertions.assertEquals("dbihanufhfcbj", model.serviceSpecification().logSpecifications().get(0).name());
        Assertions.assertEquals("a", model.serviceSpecification().logSpecifications().get(0).displayName());
        Assertions.assertEquals("th", model.serviceSpecification().logSpecifications().get(0).blobDuration());
        Assertions.assertEquals("dcc", model.serviceSpecification().metricSpecifications().get(0).name());
        Assertions.assertEquals("h", model.serviceSpecification().metricSpecifications().get(0).displayName());
        Assertions
            .assertEquals(
                "cnyejhkryhtnapcz", model.serviceSpecification().metricSpecifications().get(0).displayDescription());
        Assertions.assertEquals("okjye", model.serviceSpecification().metricSpecifications().get(0).unit());
        Assertions
            .assertEquals("kvnipjoxz", model.serviceSpecification().metricSpecifications().get(0).aggregationType());
        Assertions
            .assertEquals(true, model.serviceSpecification().metricSpecifications().get(0).enableRegionalMdmAccount());
        Assertions
            .assertEquals(
                "jspodmailzyde", model.serviceSpecification().metricSpecifications().get(0).sourceMdmAccount());
        Assertions
            .assertEquals(
                "jwyahuxinpmqnja", model.serviceSpecification().metricSpecifications().get(0).sourceMdmNamespace());
        Assertions
            .assertEquals(
                "ixjsprozvcputeg", model.serviceSpecification().metricSpecifications().get(0).metricFilterPattern());
        Assertions.assertEquals(true, model.serviceSpecification().metricSpecifications().get(0).fillGapWithZero());
        Assertions.assertEquals("fdatsc", model.serviceSpecification().metricSpecifications().get(0).category());
        Assertions
            .assertEquals(
                "vpjhulsuuv", model.serviceSpecification().metricSpecifications().get(0).internalMetricName());
        Assertions
            .assertEquals(
                "ozkrwfndiodjpslw", model.serviceSpecification().metricSpecifications().get(0).lockedAggregationType());
    }

    @org.junit.jupiter.api.Test
    public void testSerialize() throws Exception {
        OperationProperties model =
            new OperationProperties()
                .withServiceSpecification(
                    new ServiceSpecification()
                        .withLogSpecifications(
                            Arrays
                                .asList(
                                    new LogSpecification()
                                        .withName("dbihanufhfcbj")
                                        .withDisplayName("a")
                                        .withBlobDuration("th"),
                                    new LogSpecification()
                                        .withName("hab")
                                        .withDisplayName("pikxwczbyscnpqxu")
                                        .withBlobDuration("vyq"),
                                    new LogSpecification()
                                        .withName("wby")
                                        .withDisplayName("k")
                                        .withBlobDuration("dumjgrtfwvuk")))
                        .withMetricSpecifications(
                            Arrays
                                .asList(
                                    new MetricSpecification()
                                        .withName("dcc")
                                        .withDisplayName("h")
                                        .withDisplayDescription("cnyejhkryhtnapcz")
                                        .withUnit("okjye")
                                        .withAggregationType("kvnipjoxz")
                                        .withSupportedAggregationTypes(Arrays.asList())
                                        .withSupportedTimeGrainTypes(Arrays.asList())
                                        .withEnableRegionalMdmAccount(true)
                                        .withSourceMdmAccount("jspodmailzyde")
                                        .withSourceMdmNamespace("jwyahuxinpmqnja")
                                        .withMetricFilterPattern("ixjsprozvcputeg")
                                        .withFillGapWithZero(true)
                                        .withCategory("fdatsc")
                                        .withInternalMetricName("vpjhulsuuv")
                                        .withDimensions(Arrays.asList())
                                        .withLockedAggregationType("ozkrwfndiodjpslw"),
                                    new MetricSpecification()
                                        .withName("dpvwryoqpsoaccta")
                                        .withDisplayName("kljla")
                                        .withDisplayDescription("cr")
                                        .withUnit("fdfdosygexpa")
                                        .withAggregationType("akhmsbzjhcrz")
                                        .withSupportedAggregationTypes(Arrays.asList())
                                        .withSupportedTimeGrainTypes(Arrays.asList())
                                        .withEnableRegionalMdmAccount(true)
                                        .withSourceMdmAccount("xaolth")
                                        .withSourceMdmNamespace("rgqjbpfzfsinzg")
                                        .withMetricFilterPattern("cjrwzoxxjtfellu")
                                        .withFillGapWithZero(true)
                                        .withCategory("tonpe")
                                        .withInternalMetricName("pjkjlxofpdv")
                                        .withDimensions(Arrays.asList())
                                        .withLockedAggregationType("xxypininmay"),
                                    new MetricSpecification()
                                        .withName("ybb")
                                        .withDisplayName("odepoogin")
                                        .withDisplayDescription("amiheognarxz")
                                        .withUnit("heotusiv")
                                        .withAggregationType("v")
                                        .withSupportedAggregationTypes(Arrays.asList())
                                        .withSupportedTimeGrainTypes(Arrays.asList())
                                        .withEnableRegionalMdmAccount(false)
                                        .withSourceMdmAccount("nhungbw")
                                        .withSourceMdmNamespace("rnfygxgispem")
                                        .withMetricFilterPattern("zfkufubljofx")
                                        .withFillGapWithZero(true)
                                        .withCategory("jaeq")
                                        .withInternalMetricName("qjbasvms")
                                        .withDimensions(Arrays.asList())
                                        .withLockedAggregationType("ulngsntn"))));
        model = BinaryData.fromObject(model).toObject(OperationProperties.class);
        Assertions.assertEquals("dbihanufhfcbj", model.serviceSpecification().logSpecifications().get(0).name());
        Assertions.assertEquals("a", model.serviceSpecification().logSpecifications().get(0).displayName());
        Assertions.assertEquals("th", model.serviceSpecification().logSpecifications().get(0).blobDuration());
        Assertions.assertEquals("dcc", model.serviceSpecification().metricSpecifications().get(0).name());
        Assertions.assertEquals("h", model.serviceSpecification().metricSpecifications().get(0).displayName());
        Assertions
            .assertEquals(
                "cnyejhkryhtnapcz", model.serviceSpecification().metricSpecifications().get(0).displayDescription());
        Assertions.assertEquals("okjye", model.serviceSpecification().metricSpecifications().get(0).unit());
        Assertions
            .assertEquals("kvnipjoxz", model.serviceSpecification().metricSpecifications().get(0).aggregationType());
        Assertions
            .assertEquals(true, model.serviceSpecification().metricSpecifications().get(0).enableRegionalMdmAccount());
        Assertions
            .assertEquals(
                "jspodmailzyde", model.serviceSpecification().metricSpecifications().get(0).sourceMdmAccount());
        Assertions
            .assertEquals(
                "jwyahuxinpmqnja", model.serviceSpecification().metricSpecifications().get(0).sourceMdmNamespace());
        Assertions
            .assertEquals(
                "ixjsprozvcputeg", model.serviceSpecification().metricSpecifications().get(0).metricFilterPattern());
        Assertions.assertEquals(true, model.serviceSpecification().metricSpecifications().get(0).fillGapWithZero());
        Assertions.assertEquals("fdatsc", model.serviceSpecification().metricSpecifications().get(0).category());
        Assertions
            .assertEquals(
                "vpjhulsuuv", model.serviceSpecification().metricSpecifications().get(0).internalMetricName());
        Assertions
            .assertEquals(
                "ozkrwfndiodjpslw", model.serviceSpecification().metricSpecifications().get(0).lockedAggregationType());
    }
}