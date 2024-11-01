// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT License.
// Code generated by Microsoft (R) AutoRest Code Generator.

package com.azure.resourcemanager.managednetworkfabric.generated;

import com.azure.core.util.BinaryData;
import com.azure.resourcemanager.managednetworkfabric.models.NetworkPacketBrokerPatch;
import java.util.HashMap;
import java.util.Map;
import org.junit.jupiter.api.Assertions;

public final class NetworkPacketBrokerPatchTests {
    @org.junit.jupiter.api.Test
    public void testDeserialize() throws Exception {
        NetworkPacketBrokerPatch model = BinaryData.fromString(
            "{\"tags\":{\"fubnsnstlpwqpj\":\"vknmpecqxgiqas\",\"ouweuiyx\":\"xjkhtupsv\",\"znfhkqytk\":\"wkztsmsfbevyl\",\"fcycrsvlo\":\"tadopgfzdg\"}}")
            .toObject(NetworkPacketBrokerPatch.class);
        Assertions.assertEquals("vknmpecqxgiqas", model.tags().get("fubnsnstlpwqpj"));
    }

    @org.junit.jupiter.api.Test
    public void testSerialize() throws Exception {
        NetworkPacketBrokerPatch model = new NetworkPacketBrokerPatch().withTags(mapOf("fubnsnstlpwqpj",
            "vknmpecqxgiqas", "ouweuiyx", "xjkhtupsv", "znfhkqytk", "wkztsmsfbevyl", "fcycrsvlo", "tadopgfzdg"));
        model = BinaryData.fromObject(model).toObject(NetworkPacketBrokerPatch.class);
        Assertions.assertEquals("vknmpecqxgiqas", model.tags().get("fubnsnstlpwqpj"));
    }

    @SuppressWarnings("unchecked")
    private static <T> Map<String, T> mapOf(Object... inputs) {
        Map<String, T> map = new HashMap<>();
        for (int i = 0; i < inputs.length; i += 2) {
            String key = (String) inputs[i];
            T value = (T) inputs[i + 1];
            map.put(key, value);
        }
        return map;
    }
}
