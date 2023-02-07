// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT License.
// Code generated by Microsoft (R) AutoRest Code Generator.

package com.azure.resourcemanager.providerhub.fluent;

import com.azure.core.http.HttpPipeline;
import java.time.Duration;

/** The interface for ProviderHub class. */
public interface ProviderHub {
    /**
     * Gets The ID of the target subscription.
     *
     * @return the subscriptionId value.
     */
    String getSubscriptionId();

    /**
     * Gets server parameter.
     *
     * @return the endpoint value.
     */
    String getEndpoint();

    /**
     * Gets Api Version.
     *
     * @return the apiVersion value.
     */
    String getApiVersion();

    /**
     * Gets The HTTP pipeline to send requests through.
     *
     * @return the httpPipeline value.
     */
    HttpPipeline getHttpPipeline();

    /**
     * Gets The default poll interval for long-running operation.
     *
     * @return the defaultPollInterval value.
     */
    Duration getDefaultPollInterval();

    /**
     * Gets the CustomRolloutsClient object to access its operations.
     *
     * @return the CustomRolloutsClient object.
     */
    CustomRolloutsClient getCustomRollouts();

    /**
     * Gets the DefaultRolloutsClient object to access its operations.
     *
     * @return the DefaultRolloutsClient object.
     */
    DefaultRolloutsClient getDefaultRollouts();

    /**
     * Gets the ResourceProvidersClient object to access its operations.
     *
     * @return the ResourceProvidersClient object.
     */
    ResourceProvidersClient getResourceProviders();

    /**
     * Gets the NotificationRegistrationsClient object to access its operations.
     *
     * @return the NotificationRegistrationsClient object.
     */
    NotificationRegistrationsClient getNotificationRegistrations();

    /**
     * Gets the OperationsClient object to access its operations.
     *
     * @return the OperationsClient object.
     */
    OperationsClient getOperations();

    /**
     * Gets the ProviderRegistrationsClient object to access its operations.
     *
     * @return the ProviderRegistrationsClient object.
     */
    ProviderRegistrationsClient getProviderRegistrations();

    /**
     * Gets the ResourceTypeRegistrationsClient object to access its operations.
     *
     * @return the ResourceTypeRegistrationsClient object.
     */
    ResourceTypeRegistrationsClient getResourceTypeRegistrations();

    /**
     * Gets the SkusClient object to access its operations.
     *
     * @return the SkusClient object.
     */
    SkusClient getSkus();
}