// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT License.
// Code generated by Microsoft (R) AutoRest Code Generator.

package com.azure.resourcemanager.datamigration.generated;

/** Samples for Tasks Get. */
public final class TasksGetSamples {
    /*
     * x-ms-original-file: specification/datamigration/resource-manager/Microsoft.DataMigration/stable/2018-04-19/examples/Tasks_Get.json
     */
    /**
     * Sample code: Tasks_Get.
     *
     * @param manager Entry point to DataMigrationManager.
     */
    public static void tasksGet(com.azure.resourcemanager.datamigration.DataMigrationManager manager) {
        manager
            .tasks()
            .getWithResponse(
                "DmsSdkRg", "DmsSdkService", "DmsSdkProject", "DmsSdkTask", null, com.azure.core.util.Context.NONE);
    }
}