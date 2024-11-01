// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT License.
// Code generated by Microsoft (R) AutoRest Code Generator.

package com.azure.resourcemanager.storageimportexport.generated;

/**
 * Samples for Jobs GetByResourceGroup.
 */
public final class JobsGetByResourceGroupSamples {
    /*
     * x-ms-original-file:
     * specification/storageimportexport/resource-manager/Microsoft.ImportExport/preview/2021-01-01/examples/
     * GetExportJob.json
     */
    /**
     * Sample code: Get export job.
     * 
     * @param manager Entry point to StorageImportExportManager.
     */
    public static void getExportJob(com.azure.resourcemanager.storageimportexport.StorageImportExportManager manager) {
        manager.jobs().getByResourceGroupWithResponse("myResourceGroup", "myJob", com.azure.core.util.Context.NONE);
    }

    /*
     * x-ms-original-file:
     * specification/storageimportexport/resource-manager/Microsoft.ImportExport/preview/2021-01-01/examples/GetJob.json
     */
    /**
     * Sample code: Get import job.
     * 
     * @param manager Entry point to StorageImportExportManager.
     */
    public static void getImportJob(com.azure.resourcemanager.storageimportexport.StorageImportExportManager manager) {
        manager.jobs().getByResourceGroupWithResponse("myResourceGroup", "myJob", com.azure.core.util.Context.NONE);
    }
}
