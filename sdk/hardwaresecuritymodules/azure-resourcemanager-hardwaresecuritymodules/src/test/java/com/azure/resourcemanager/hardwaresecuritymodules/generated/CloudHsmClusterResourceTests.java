// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT License.
// Code generated by Microsoft (R) AutoRest Code Generator.

package com.azure.resourcemanager.hardwaresecuritymodules.generated;

import com.azure.core.util.BinaryData;
import com.azure.resourcemanager.hardwaresecuritymodules.models.CloudHsmClusterResource;
import com.azure.resourcemanager.hardwaresecuritymodules.models.CloudHsmClusterSku;
import com.azure.resourcemanager.hardwaresecuritymodules.models.CloudHsmClusterSkuFamily;
import com.azure.resourcemanager.hardwaresecuritymodules.models.CloudHsmClusterSkuName;
import com.azure.resourcemanager.hardwaresecuritymodules.models.ManagedServiceIdentity;
import com.azure.resourcemanager.hardwaresecuritymodules.models.ManagedServiceIdentityType;
import com.azure.resourcemanager.hardwaresecuritymodules.models.UserAssignedIdentity;
import java.util.HashMap;
import java.util.Map;
import org.junit.jupiter.api.Assertions;

public final class CloudHsmClusterResourceTests {
    @org.junit.jupiter.api.Test
    public void testDeserialize() throws Exception {
        CloudHsmClusterResource model = BinaryData.fromString(
            "{\"sku\":{\"family\":\"B\",\"name\":\"Standard_B1\",\"capacity\":1582483628},\"identity\":{\"principalId\":\"4f11dac8-4e71-4dfa-8105-0418cf952ab0\",\"tenantId\":\"504b0a0e-e882-470c-af93-4df9963e3260\",\"type\":\"UserAssigned\",\"userAssignedIdentities\":{\"fufsrpymzi\":{\"principalId\":\"954a955c-60ba-4652-9255-32e3cb90af1f\",\"clientId\":\"0408a470-595b-4c6c-9ee4-3de317eb444e\"}}},\"location\":\"sezcxtb\",\"tags\":{\"newmdwzjeiachbo\":\"fycc\",\"eeh\":\"sflnrosfqp\"},\"id\":\"zvypyqrimzinp\",\"name\":\"swjdkirso\",\"type\":\"dqxhcrmnohjtckwh\"}")
            .toObject(CloudHsmClusterResource.class);
        Assertions.assertEquals("sezcxtb", model.location());
        Assertions.assertEquals("fycc", model.tags().get("newmdwzjeiachbo"));
        Assertions.assertEquals(CloudHsmClusterSkuFamily.B, model.sku().family());
        Assertions.assertEquals(CloudHsmClusterSkuName.STANDARD_B1, model.sku().name());
        Assertions.assertEquals(1582483628, model.sku().capacity());
        Assertions.assertEquals(ManagedServiceIdentityType.USER_ASSIGNED, model.identity().type());
    }

    @org.junit.jupiter.api.Test
    public void testSerialize() throws Exception {
        CloudHsmClusterResource model = new CloudHsmClusterResource().withLocation("sezcxtb")
            .withTags(mapOf("newmdwzjeiachbo", "fycc", "eeh", "sflnrosfqp"))
            .withSku(new CloudHsmClusterSku().withFamily(CloudHsmClusterSkuFamily.B)
                .withName(CloudHsmClusterSkuName.STANDARD_B1)
                .withCapacity(1582483628))
            .withIdentity(new ManagedServiceIdentity().withType(ManagedServiceIdentityType.USER_ASSIGNED)
                .withUserAssignedIdentities(mapOf("fufsrpymzi", new UserAssignedIdentity())));
        model = BinaryData.fromObject(model).toObject(CloudHsmClusterResource.class);
        Assertions.assertEquals("sezcxtb", model.location());
        Assertions.assertEquals("fycc", model.tags().get("newmdwzjeiachbo"));
        Assertions.assertEquals(CloudHsmClusterSkuFamily.B, model.sku().family());
        Assertions.assertEquals(CloudHsmClusterSkuName.STANDARD_B1, model.sku().name());
        Assertions.assertEquals(1582483628, model.sku().capacity());
        Assertions.assertEquals(ManagedServiceIdentityType.USER_ASSIGNED, model.identity().type());
    }

    // Use "Map.of" if available
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
