// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT License.
// Code generated by Microsoft (R) AutoRest Code Generator.

package com.azure.resourcemanager.synapse.generated;

import com.azure.core.util.BinaryData;
import com.azure.resourcemanager.synapse.fluent.models.EventHubConnectionProperties;
import com.azure.resourcemanager.synapse.models.Compression;
import com.azure.resourcemanager.synapse.models.EventHubDataFormat;
import java.util.Arrays;
import org.junit.jupiter.api.Assertions;

public final class EventHubConnectionPropertiesTests {
    @org.junit.jupiter.api.Test
    public void testDeserialize() throws Exception {
        EventHubConnectionProperties model =
            BinaryData
                .fromString(
                    "{\"eventHubResourceId\":\"gmnhjevd\",\"consumerGroup\":\"znfaj\",\"tableName\":\"kskmqozzkivyhjrl\",\"mappingRuleName\":\"zji\",\"dataFormat\":\"TSVE\",\"eventSystemProperties\":[\"ef\",\"wabs\",\"lronqqlmg\",\"lqxsjxtelex\"],\"compression\":\"None\",\"provisioningState\":\"Succeeded\",\"managedIdentityResourceId\":\"zoolzqoca\"}")
                .toObject(EventHubConnectionProperties.class);
        Assertions.assertEquals("gmnhjevd", model.eventHubResourceId());
        Assertions.assertEquals("znfaj", model.consumerGroup());
        Assertions.assertEquals("kskmqozzkivyhjrl", model.tableName());
        Assertions.assertEquals("zji", model.mappingRuleName());
        Assertions.assertEquals(EventHubDataFormat.TSVE, model.dataFormat());
        Assertions.assertEquals("ef", model.eventSystemProperties().get(0));
        Assertions.assertEquals(Compression.NONE, model.compression());
        Assertions.assertEquals("zoolzqoca", model.managedIdentityResourceId());
    }

    @org.junit.jupiter.api.Test
    public void testSerialize() throws Exception {
        EventHubConnectionProperties model =
            new EventHubConnectionProperties()
                .withEventHubResourceId("gmnhjevd")
                .withConsumerGroup("znfaj")
                .withTableName("kskmqozzkivyhjrl")
                .withMappingRuleName("zji")
                .withDataFormat(EventHubDataFormat.TSVE)
                .withEventSystemProperties(Arrays.asList("ef", "wabs", "lronqqlmg", "lqxsjxtelex"))
                .withCompression(Compression.NONE)
                .withManagedIdentityResourceId("zoolzqoca");
        model = BinaryData.fromObject(model).toObject(EventHubConnectionProperties.class);
        Assertions.assertEquals("gmnhjevd", model.eventHubResourceId());
        Assertions.assertEquals("znfaj", model.consumerGroup());
        Assertions.assertEquals("kskmqozzkivyhjrl", model.tableName());
        Assertions.assertEquals("zji", model.mappingRuleName());
        Assertions.assertEquals(EventHubDataFormat.TSVE, model.dataFormat());
        Assertions.assertEquals("ef", model.eventSystemProperties().get(0));
        Assertions.assertEquals(Compression.NONE, model.compression());
        Assertions.assertEquals("zoolzqoca", model.managedIdentityResourceId());
    }
}