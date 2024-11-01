// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT License.
// Code generated by Microsoft (R) AutoRest Code Generator.

package com.azure.resourcemanager.batchai.models;

import com.azure.core.annotation.Fluent;
import com.azure.core.util.logging.ClientLogger;
import com.fasterxml.jackson.annotation.JsonIgnore;
import com.fasterxml.jackson.annotation.JsonProperty;

/** Azure Blob Storage Container mounting configuration. */
@Fluent
public final class AzureBlobFileSystemReference {
    @JsonIgnore
    private final ClientLogger logger = new ClientLogger(AzureBlobFileSystemReference.class);

    /*
     * Name of the Azure storage account.
     */
    @JsonProperty(value = "accountName", required = true)
    private String accountName;

    /*
     * Name of the Azure Blob Storage container to mount on the cluster.
     */
    @JsonProperty(value = "containerName", required = true)
    private String containerName;

    /*
     * Information about the Azure storage credentials.
     */
    @JsonProperty(value = "credentials", required = true)
    private AzureStorageCredentialsInfo credentials;

    /*
     * The relative path on the compute node where the Azure File container
     * will be mounted. Note that all cluster level containers will be mounted
     * under $AZ_BATCHAI_MOUNT_ROOT location and all job level containers will
     * be mounted under $AZ_BATCHAI_JOB_MOUNT_ROOT.
     */
    @JsonProperty(value = "relativeMountPath", required = true)
    private String relativeMountPath;

    /*
     * Mount options for mounting blobfuse file system.
     */
    @JsonProperty(value = "mountOptions")
    private String mountOptions;

    /**
     * Get the accountName property: Name of the Azure storage account.
     *
     * @return the accountName value.
     */
    public String accountName() {
        return this.accountName;
    }

    /**
     * Set the accountName property: Name of the Azure storage account.
     *
     * @param accountName the accountName value to set.
     * @return the AzureBlobFileSystemReference object itself.
     */
    public AzureBlobFileSystemReference withAccountName(String accountName) {
        this.accountName = accountName;
        return this;
    }

    /**
     * Get the containerName property: Name of the Azure Blob Storage container to mount on the cluster.
     *
     * @return the containerName value.
     */
    public String containerName() {
        return this.containerName;
    }

    /**
     * Set the containerName property: Name of the Azure Blob Storage container to mount on the cluster.
     *
     * @param containerName the containerName value to set.
     * @return the AzureBlobFileSystemReference object itself.
     */
    public AzureBlobFileSystemReference withContainerName(String containerName) {
        this.containerName = containerName;
        return this;
    }

    /**
     * Get the credentials property: Information about the Azure storage credentials.
     *
     * @return the credentials value.
     */
    public AzureStorageCredentialsInfo credentials() {
        return this.credentials;
    }

    /**
     * Set the credentials property: Information about the Azure storage credentials.
     *
     * @param credentials the credentials value to set.
     * @return the AzureBlobFileSystemReference object itself.
     */
    public AzureBlobFileSystemReference withCredentials(AzureStorageCredentialsInfo credentials) {
        this.credentials = credentials;
        return this;
    }

    /**
     * Get the relativeMountPath property: The relative path on the compute node where the Azure File container will be
     * mounted. Note that all cluster level containers will be mounted under $AZ_BATCHAI_MOUNT_ROOT location and all job
     * level containers will be mounted under $AZ_BATCHAI_JOB_MOUNT_ROOT.
     *
     * @return the relativeMountPath value.
     */
    public String relativeMountPath() {
        return this.relativeMountPath;
    }

    /**
     * Set the relativeMountPath property: The relative path on the compute node where the Azure File container will be
     * mounted. Note that all cluster level containers will be mounted under $AZ_BATCHAI_MOUNT_ROOT location and all job
     * level containers will be mounted under $AZ_BATCHAI_JOB_MOUNT_ROOT.
     *
     * @param relativeMountPath the relativeMountPath value to set.
     * @return the AzureBlobFileSystemReference object itself.
     */
    public AzureBlobFileSystemReference withRelativeMountPath(String relativeMountPath) {
        this.relativeMountPath = relativeMountPath;
        return this;
    }

    /**
     * Get the mountOptions property: Mount options for mounting blobfuse file system.
     *
     * @return the mountOptions value.
     */
    public String mountOptions() {
        return this.mountOptions;
    }

    /**
     * Set the mountOptions property: Mount options for mounting blobfuse file system.
     *
     * @param mountOptions the mountOptions value to set.
     * @return the AzureBlobFileSystemReference object itself.
     */
    public AzureBlobFileSystemReference withMountOptions(String mountOptions) {
        this.mountOptions = mountOptions;
        return this;
    }

    /**
     * Validates the instance.
     *
     * @throws IllegalArgumentException thrown if the instance is not valid.
     */
    public void validate() {
        if (accountName() == null) {
            throw logger.logExceptionAsError(new IllegalArgumentException(
                "Missing required property accountName in model AzureBlobFileSystemReference"));
        }
        if (containerName() == null) {
            throw logger.logExceptionAsError(new IllegalArgumentException(
                "Missing required property containerName in model AzureBlobFileSystemReference"));
        }
        if (credentials() == null) {
            throw logger.logExceptionAsError(new IllegalArgumentException(
                "Missing required property credentials in model AzureBlobFileSystemReference"));
        } else {
            credentials().validate();
        }
        if (relativeMountPath() == null) {
            throw logger.logExceptionAsError(new IllegalArgumentException(
                "Missing required property relativeMountPath in model AzureBlobFileSystemReference"));
        }
    }
}
