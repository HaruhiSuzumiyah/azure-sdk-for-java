// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT License.
// Code generated by Microsoft (R) AutoRest Code Generator.

package com.azure.resourcemanager.datalakestore.generated;

import com.azure.core.util.BinaryData;
import com.azure.resourcemanager.datalakestore.fluent.models.VirtualNetworkRuleInner;
import org.junit.jupiter.api.Assertions;

public final class VirtualNetworkRuleInnerTests {
    @org.junit.jupiter.api.Test
    public void testDeserialize() throws Exception {
        VirtualNetworkRuleInner model = BinaryData.fromString(
            "{\"properties\":{\"subnetId\":\"mgxsab\"},\"name\":\"qduujitcjczdz\",\"type\":\"ndhkrw\",\"id\":\"appd\"}")
            .toObject(VirtualNetworkRuleInner.class);
        Assertions.assertEquals("appd", model.id());
    }

    @org.junit.jupiter.api.Test
    public void testSerialize() throws Exception {
        VirtualNetworkRuleInner model = new VirtualNetworkRuleInner().withId("appd");
        model = BinaryData.fromObject(model).toObject(VirtualNetworkRuleInner.class);
        Assertions.assertEquals("appd", model.id());
    }
}
