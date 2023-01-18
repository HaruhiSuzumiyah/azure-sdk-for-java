// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT License.
// Code generated by Microsoft (R) AutoRest Code Generator.

package com.azure.resourcemanager.datalakestore.generated;

import com.azure.core.util.BinaryData;
import com.azure.resourcemanager.datalakestore.fluent.models.DataLakeStoreAccountInner;
import java.util.HashMap;
import java.util.Map;
import org.junit.jupiter.api.Assertions;

public final class DataLakeStoreAccountInnerTests {
    @org.junit.jupiter.api.Test
    public void testDeserialize() throws Exception {
        DataLakeStoreAccountInner model =
            BinaryData
                .fromString(
                    "{\"identity\":{\"principalId\":\"37857678-f579-4835-a368-353bc59a1bde\",\"tenantId\":\"fec7ee2b-60b8-4f65-9101-b5d7dbfaa25d\"},\"properties\":{\"defaultGroup\":\"rljdouskcqv\",\"encryptionConfig\":{\"type\":\"UserManaged\"},\"encryptionState\":\"Disabled\",\"encryptionProvisioningState\":\"Creating\",\"firewallRules\":[{\"name\":\"xbnjbiksq\",\"type\":\"lssai\",\"id\":\"p\"},{\"name\":\"zlljfmppeebvm\",\"type\":\"sabkyqduujitcjcz\",\"id\":\"evndh\"}],\"virtualNetworkRules\":[{\"name\":\"appd\",\"type\":\"dkvwrwjfe\",\"id\":\"nhutjeltmrldhugj\"},{\"name\":\"atqxho\",\"type\":\"geablgphuticndvk\",\"id\":\"zwyiftyhxhur\"},{\"name\":\"tyxolniwpwc\",\"type\":\"jfkgiawxk\",\"id\":\"ypl\"}],\"firewallState\":\"Enabled\",\"firewallAllowAzureIps\":\"Enabled\",\"trustedIdProviders\":[{\"name\":\"nddhsgcbacph\",\"type\":\"koty\",\"id\":\"gou\"},{\"name\":\"dlikwyqkgfgibma\",\"type\":\"akeqs\",\"id\":\"yb\"},{\"name\":\"e\",\"type\":\"ytb\",\"id\":\"qfou\"},{\"name\":\"mnkzsmod\",\"type\":\"lougpbkw\",\"id\":\"utduqktapspwgcu\"}],\"trustedIdProviderState\":\"Disabled\",\"newTier\":\"Consumption\",\"currentTier\":\"Commitment_1TB\",\"accountId\":\"b388aac0-af6a-4c0d-aab8-aac2e6d2fe18\",\"provisioningState\":\"Suspending\",\"state\":\"Active\",\"creationTime\":\"2021-07-16T10:53:41Z\",\"lastModifiedTime\":\"2021-03-10T22:17:50Z\",\"endpoint\":\"bbjfddgmbmbexp\"},\"location\":\"bhtqqrolfpfpsa\",\"tags\":{\"gjyjgzjaoyfhrtxi\":\"qux\",\"rkujy\":\"n\"},\"id\":\"vlejuvfqa\",\"name\":\"rlyxwjkcprbnw\",\"type\":\"xgjvtbv\"}")
                .toObject(DataLakeStoreAccountInner.class);
        Assertions.assertEquals("bhtqqrolfpfpsa", model.location());
        Assertions.assertEquals("qux", model.tags().get("gjyjgzjaoyfhrtxi"));
    }

    @org.junit.jupiter.api.Test
    public void testSerialize() throws Exception {
        DataLakeStoreAccountInner model =
            new DataLakeStoreAccountInner()
                .withLocation("bhtqqrolfpfpsa")
                .withTags(mapOf("gjyjgzjaoyfhrtxi", "qux", "rkujy", "n"));
        model = BinaryData.fromObject(model).toObject(DataLakeStoreAccountInner.class);
        Assertions.assertEquals("bhtqqrolfpfpsa", model.location());
        Assertions.assertEquals("qux", model.tags().get("gjyjgzjaoyfhrtxi"));
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