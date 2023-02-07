// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT License.
// Code generated by Microsoft (R) AutoRest Code Generator.

package com.azure.resourcemanager.workloads.fluent;

import com.azure.core.annotation.ReturnType;
import com.azure.core.annotation.ServiceMethod;
import com.azure.core.http.rest.Response;
import com.azure.core.util.Context;
import com.azure.resourcemanager.workloads.fluent.models.SapLandscapeMonitorInner;
import com.azure.resourcemanager.workloads.fluent.models.SapLandscapeMonitorListResultInner;

/** An instance of this class provides access to all the operations defined in SapLandscapeMonitorsClient. */
public interface SapLandscapeMonitorsClient {
    /**
     * Gets configuration values for Single Pane Of Glass for SAP monitor.
     *
     * <p>Gets configuration values for Single Pane Of Glass for SAP monitor for the specified subscription, resource
     * group, and resource name.
     *
     * @param resourceGroupName The name of the resource group. The name is case insensitive.
     * @param monitorName Name of the SAP monitor resource.
     * @param context The context to associate with this operation.
     * @throws IllegalArgumentException thrown if parameters fail the validation.
     * @throws com.azure.core.management.exception.ManagementException thrown if the request is rejected by server.
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent.
     * @return configuration values for Single Pane Of Glass for SAP monitor for the specified subscription, resource
     *     group, and resource name along with {@link Response}.
     */
    @ServiceMethod(returns = ReturnType.SINGLE)
    Response<SapLandscapeMonitorInner> getWithResponse(String resourceGroupName, String monitorName, Context context);

    /**
     * Gets configuration values for Single Pane Of Glass for SAP monitor.
     *
     * <p>Gets configuration values for Single Pane Of Glass for SAP monitor for the specified subscription, resource
     * group, and resource name.
     *
     * @param resourceGroupName The name of the resource group. The name is case insensitive.
     * @param monitorName Name of the SAP monitor resource.
     * @throws IllegalArgumentException thrown if parameters fail the validation.
     * @throws com.azure.core.management.exception.ManagementException thrown if the request is rejected by server.
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent.
     * @return configuration values for Single Pane Of Glass for SAP monitor for the specified subscription, resource
     *     group, and resource name.
     */
    @ServiceMethod(returns = ReturnType.SINGLE)
    SapLandscapeMonitorInner get(String resourceGroupName, String monitorName);

    /**
     * Creates a SAP Landscape Monitor Dashboard.
     *
     * <p>Creates a SAP Landscape Monitor Dashboard for the specified subscription, resource group, and resource name.
     *
     * @param resourceGroupName The name of the resource group. The name is case insensitive.
     * @param monitorName Name of the SAP monitor resource.
     * @param sapLandscapeMonitorParameter Request body representing a configuration for Sap Landscape Monitor
     *     Dashboard.
     * @param context The context to associate with this operation.
     * @throws IllegalArgumentException thrown if parameters fail the validation.
     * @throws com.azure.core.management.exception.ManagementException thrown if the request is rejected by server.
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent.
     * @return configuration associated with SAP Landscape Monitor Dashboard along with {@link Response}.
     */
    @ServiceMethod(returns = ReturnType.SINGLE)
    Response<SapLandscapeMonitorInner> createWithResponse(
        String resourceGroupName,
        String monitorName,
        SapLandscapeMonitorInner sapLandscapeMonitorParameter,
        Context context);

    /**
     * Creates a SAP Landscape Monitor Dashboard.
     *
     * <p>Creates a SAP Landscape Monitor Dashboard for the specified subscription, resource group, and resource name.
     *
     * @param resourceGroupName The name of the resource group. The name is case insensitive.
     * @param monitorName Name of the SAP monitor resource.
     * @param sapLandscapeMonitorParameter Request body representing a configuration for Sap Landscape Monitor
     *     Dashboard.
     * @throws IllegalArgumentException thrown if parameters fail the validation.
     * @throws com.azure.core.management.exception.ManagementException thrown if the request is rejected by server.
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent.
     * @return configuration associated with SAP Landscape Monitor Dashboard.
     */
    @ServiceMethod(returns = ReturnType.SINGLE)
    SapLandscapeMonitorInner create(
        String resourceGroupName, String monitorName, SapLandscapeMonitorInner sapLandscapeMonitorParameter);

    /**
     * Deletes a SAP Landscape Monitor Dashboard.
     *
     * <p>Deletes a SAP Landscape Monitor Dashboard with the specified subscription, resource group, and SAP monitor
     * name.
     *
     * @param resourceGroupName The name of the resource group. The name is case insensitive.
     * @param monitorName Name of the SAP monitor resource.
     * @param context The context to associate with this operation.
     * @throws IllegalArgumentException thrown if parameters fail the validation.
     * @throws com.azure.core.management.exception.ManagementException thrown if the request is rejected by server.
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent.
     * @return the {@link Response}.
     */
    @ServiceMethod(returns = ReturnType.SINGLE)
    Response<Void> deleteWithResponse(String resourceGroupName, String monitorName, Context context);

    /**
     * Deletes a SAP Landscape Monitor Dashboard.
     *
     * <p>Deletes a SAP Landscape Monitor Dashboard with the specified subscription, resource group, and SAP monitor
     * name.
     *
     * @param resourceGroupName The name of the resource group. The name is case insensitive.
     * @param monitorName Name of the SAP monitor resource.
     * @throws IllegalArgumentException thrown if parameters fail the validation.
     * @throws com.azure.core.management.exception.ManagementException thrown if the request is rejected by server.
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent.
     */
    @ServiceMethod(returns = ReturnType.SINGLE)
    void delete(String resourceGroupName, String monitorName);

    /**
     * Patches the SAP Landscape Monitor Dashboard.
     *
     * <p>Patches the SAP Landscape Monitor Dashboard for the specified subscription, resource group, and SAP monitor
     * name.
     *
     * @param resourceGroupName The name of the resource group. The name is case insensitive.
     * @param monitorName Name of the SAP monitor resource.
     * @param sapLandscapeMonitorParameter Request body representing a configuration for Sap Landscape Monitor
     *     Dashboard.
     * @param context The context to associate with this operation.
     * @throws IllegalArgumentException thrown if parameters fail the validation.
     * @throws com.azure.core.management.exception.ManagementException thrown if the request is rejected by server.
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent.
     * @return configuration associated with SAP Landscape Monitor Dashboard along with {@link Response}.
     */
    @ServiceMethod(returns = ReturnType.SINGLE)
    Response<SapLandscapeMonitorInner> updateWithResponse(
        String resourceGroupName,
        String monitorName,
        SapLandscapeMonitorInner sapLandscapeMonitorParameter,
        Context context);

    /**
     * Patches the SAP Landscape Monitor Dashboard.
     *
     * <p>Patches the SAP Landscape Monitor Dashboard for the specified subscription, resource group, and SAP monitor
     * name.
     *
     * @param resourceGroupName The name of the resource group. The name is case insensitive.
     * @param monitorName Name of the SAP monitor resource.
     * @param sapLandscapeMonitorParameter Request body representing a configuration for Sap Landscape Monitor
     *     Dashboard.
     * @throws IllegalArgumentException thrown if parameters fail the validation.
     * @throws com.azure.core.management.exception.ManagementException thrown if the request is rejected by server.
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent.
     * @return configuration associated with SAP Landscape Monitor Dashboard.
     */
    @ServiceMethod(returns = ReturnType.SINGLE)
    SapLandscapeMonitorInner update(
        String resourceGroupName, String monitorName, SapLandscapeMonitorInner sapLandscapeMonitorParameter);

    /**
     * Gets configuration values for Single Pane Of Glass for SAP monitor.
     *
     * <p>Gets configuration values for Single Pane Of Glass for SAP monitor for the specified subscription, resource
     * group, and resource name.
     *
     * @param resourceGroupName The name of the resource group. The name is case insensitive.
     * @param monitorName Name of the SAP monitor resource.
     * @param context The context to associate with this operation.
     * @throws IllegalArgumentException thrown if parameters fail the validation.
     * @throws com.azure.core.management.exception.ManagementException thrown if the request is rejected by server.
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent.
     * @return configuration values for Single Pane Of Glass for SAP monitor for the specified subscription, resource
     *     group, and resource name along with {@link Response}.
     */
    @ServiceMethod(returns = ReturnType.SINGLE)
    Response<SapLandscapeMonitorListResultInner> listWithResponse(
        String resourceGroupName, String monitorName, Context context);

    /**
     * Gets configuration values for Single Pane Of Glass for SAP monitor.
     *
     * <p>Gets configuration values for Single Pane Of Glass for SAP monitor for the specified subscription, resource
     * group, and resource name.
     *
     * @param resourceGroupName The name of the resource group. The name is case insensitive.
     * @param monitorName Name of the SAP monitor resource.
     * @throws IllegalArgumentException thrown if parameters fail the validation.
     * @throws com.azure.core.management.exception.ManagementException thrown if the request is rejected by server.
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent.
     * @return configuration values for Single Pane Of Glass for SAP monitor for the specified subscription, resource
     *     group, and resource name.
     */
    @ServiceMethod(returns = ReturnType.SINGLE)
    SapLandscapeMonitorListResultInner list(String resourceGroupName, String monitorName);
}