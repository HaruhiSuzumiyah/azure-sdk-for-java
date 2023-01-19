// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT License.
// Code generated by Microsoft (R) AutoRest Code Generator.

package com.azure.resourcemanager.vmwarecloudsimple.generated;

/** Samples for VirtualNetworks List. */
public final class VirtualNetworksListSamples {
    /*
     * x-ms-original-file: specification/vmwarecloudsimple/resource-manager/Microsoft.VMwareCloudSimple/stable/2019-04-01/examples/ListVirtualNetworks.json
     */
    /**
     * Sample code: ListVirtualNetworks.
     *
     * @param manager Entry point to VMwareCloudSimpleManager.
     */
    public static void listVirtualNetworks(
        com.azure.resourcemanager.vmwarecloudsimple.VMwareCloudSimpleManager manager) {
        manager
            .virtualNetworks()
            .list(
                "westus2",
                "myPrivateCloud",
                "/subscriptions/{subscription-id}/providers/Microsoft.VMwareCloudSimple/locations/westus2/privateClouds/myPrivateCloud/resourcePools/resgroup-26",
                com.azure.core.util.Context.NONE);
    }
}