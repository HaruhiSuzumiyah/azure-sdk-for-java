// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT License.
// Code generated by Microsoft (R) AutoRest Code Generator.

package com.azure.resourcemanager.workloads.generated;

import com.azure.core.util.BinaryData;
import com.azure.resourcemanager.workloads.models.NetworkInterfaceResourceNames;
import com.azure.resourcemanager.workloads.models.SingleServerFullResourceNames;
import com.azure.resourcemanager.workloads.models.VirtualMachineResourceNames;
import java.util.Arrays;
import java.util.HashMap;
import java.util.Map;
import org.junit.jupiter.api.Assertions;

public final class SingleServerFullResourceNamesTests {
    @org.junit.jupiter.api.Test
    public void testDeserialize() throws Exception {
        SingleServerFullResourceNames model =
            BinaryData
                .fromString(
                    "{\"namingPatternType\":\"FullResourceName\",\"virtualMachine\":{\"vmName\":\"cf\",\"hostName\":\"cqdpfuv\",\"networkInterfaces\":[{\"networkInterfaceName\":\"jjcanvxbvtv\"},{\"networkInterfaceName\":\"utncorm\"}],\"osDiskName\":\"xqtvcofu\",\"dataDiskNames\":{\"n\":[\"kgjubgdknnqvsazn\"],\"mkycgra\":[\"rudsg\",\"a\"]}}}")
                .toObject(SingleServerFullResourceNames.class);
        Assertions.assertEquals("cf", model.virtualMachine().vmName());
        Assertions.assertEquals("cqdpfuv", model.virtualMachine().hostname());
        Assertions
            .assertEquals("jjcanvxbvtv", model.virtualMachine().networkInterfaces().get(0).networkInterfaceName());
        Assertions.assertEquals("xqtvcofu", model.virtualMachine().osDiskName());
        Assertions.assertEquals("kgjubgdknnqvsazn", model.virtualMachine().dataDiskNames().get("n").get(0));
    }

    @org.junit.jupiter.api.Test
    public void testSerialize() throws Exception {
        SingleServerFullResourceNames model =
            new SingleServerFullResourceNames()
                .withVirtualMachine(
                    new VirtualMachineResourceNames()
                        .withVmName("cf")
                        .withHostname("cqdpfuv")
                        .withNetworkInterfaces(
                            Arrays
                                .asList(
                                    new NetworkInterfaceResourceNames().withNetworkInterfaceName("jjcanvxbvtv"),
                                    new NetworkInterfaceResourceNames().withNetworkInterfaceName("utncorm")))
                        .withOsDiskName("xqtvcofu")
                        .withDataDiskNames(
                            mapOf("n", Arrays.asList("kgjubgdknnqvsazn"), "mkycgra", Arrays.asList("rudsg", "a"))));
        model = BinaryData.fromObject(model).toObject(SingleServerFullResourceNames.class);
        Assertions.assertEquals("cf", model.virtualMachine().vmName());
        Assertions.assertEquals("cqdpfuv", model.virtualMachine().hostname());
        Assertions
            .assertEquals("jjcanvxbvtv", model.virtualMachine().networkInterfaces().get(0).networkInterfaceName());
        Assertions.assertEquals("xqtvcofu", model.virtualMachine().osDiskName());
        Assertions.assertEquals("kgjubgdknnqvsazn", model.virtualMachine().dataDiskNames().get("n").get(0));
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