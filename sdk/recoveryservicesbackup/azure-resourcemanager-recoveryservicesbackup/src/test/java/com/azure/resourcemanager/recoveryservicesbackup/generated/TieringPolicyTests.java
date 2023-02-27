// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT License.
// Code generated by Microsoft (R) AutoRest Code Generator.

package com.azure.resourcemanager.recoveryservicesbackup.generated;

import com.azure.core.util.BinaryData;
import com.azure.resourcemanager.recoveryservicesbackup.models.RetentionDurationType;
import com.azure.resourcemanager.recoveryservicesbackup.models.TieringMode;
import com.azure.resourcemanager.recoveryservicesbackup.models.TieringPolicy;
import org.junit.jupiter.api.Assertions;

public final class TieringPolicyTests {
    @org.junit.jupiter.api.Test
    public void testDeserialize() throws Exception {
        TieringPolicy model =
            BinaryData
                .fromString("{\"tieringMode\":\"Invalid\",\"duration\":1122494487,\"durationType\":\"Invalid\"}")
                .toObject(TieringPolicy.class);
        Assertions.assertEquals(TieringMode.INVALID, model.tieringMode());
        Assertions.assertEquals(1122494487, model.duration());
        Assertions.assertEquals(RetentionDurationType.INVALID, model.durationType());
    }

    @org.junit.jupiter.api.Test
    public void testSerialize() throws Exception {
        TieringPolicy model =
            new TieringPolicy()
                .withTieringMode(TieringMode.INVALID)
                .withDuration(1122494487)
                .withDurationType(RetentionDurationType.INVALID);
        model = BinaryData.fromObject(model).toObject(TieringPolicy.class);
        Assertions.assertEquals(TieringMode.INVALID, model.tieringMode());
        Assertions.assertEquals(1122494487, model.duration());
        Assertions.assertEquals(RetentionDurationType.INVALID, model.durationType());
    }
}