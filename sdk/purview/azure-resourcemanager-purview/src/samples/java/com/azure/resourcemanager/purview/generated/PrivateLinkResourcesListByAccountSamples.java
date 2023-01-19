// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT License.
// Code generated by Microsoft (R) AutoRest Code Generator.

package com.azure.resourcemanager.purview.generated;

/** Samples for PrivateLinkResources ListByAccount. */
public final class PrivateLinkResourcesListByAccountSamples {
    /*
     * x-ms-original-file: specification/purview/resource-manager/Microsoft.Purview/stable/2021-07-01/examples/PrivateLinkResources_ListByAccount.json
     */
    /**
     * Sample code: PrivateLinkResources_ListByAccount.
     *
     * @param manager Entry point to PurviewManager.
     */
    public static void privateLinkResourcesListByAccount(com.azure.resourcemanager.purview.PurviewManager manager) {
        manager
            .privateLinkResources()
            .listByAccount("SampleResourceGroup", "account1", com.azure.core.util.Context.NONE);
    }
}