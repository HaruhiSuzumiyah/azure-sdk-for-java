// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT License.
// Code generated by Microsoft (R) AutoRest Code Generator.

package com.azure.resourcemanager.azurestack.models;

import com.azure.core.annotation.Fluent;
import com.azure.json.JsonReader;
import com.azure.json.JsonSerializable;
import com.azure.json.JsonToken;
import com.azure.json.JsonWriter;
import java.io.IOException;

/**
 * Cloud specific manifest JSON properties.
 */
@Fluent
public final class CloudManifestFileProperties implements JsonSerializable<CloudManifestFileProperties> {
    /*
     * Cloud specific manifest data.
     */
    private CloudManifestFileDeploymentData deploymentData;

    /*
     * Signature of the cloud specific manifest data.
     */
    private String signature;

    /**
     * Creates an instance of CloudManifestFileProperties class.
     */
    public CloudManifestFileProperties() {
    }

    /**
     * Get the deploymentData property: Cloud specific manifest data.
     * 
     * @return the deploymentData value.
     */
    public CloudManifestFileDeploymentData deploymentData() {
        return this.deploymentData;
    }

    /**
     * Set the deploymentData property: Cloud specific manifest data.
     * 
     * @param deploymentData the deploymentData value to set.
     * @return the CloudManifestFileProperties object itself.
     */
    public CloudManifestFileProperties withDeploymentData(CloudManifestFileDeploymentData deploymentData) {
        this.deploymentData = deploymentData;
        return this;
    }

    /**
     * Get the signature property: Signature of the cloud specific manifest data.
     * 
     * @return the signature value.
     */
    public String signature() {
        return this.signature;
    }

    /**
     * Set the signature property: Signature of the cloud specific manifest data.
     * 
     * @param signature the signature value to set.
     * @return the CloudManifestFileProperties object itself.
     */
    public CloudManifestFileProperties withSignature(String signature) {
        this.signature = signature;
        return this;
    }

    /**
     * Validates the instance.
     * 
     * @throws IllegalArgumentException thrown if the instance is not valid.
     */
    public void validate() {
        if (deploymentData() != null) {
            deploymentData().validate();
        }
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public JsonWriter toJson(JsonWriter jsonWriter) throws IOException {
        jsonWriter.writeStartObject();
        jsonWriter.writeJsonField("deploymentData", this.deploymentData);
        jsonWriter.writeStringField("signature", this.signature);
        return jsonWriter.writeEndObject();
    }

    /**
     * Reads an instance of CloudManifestFileProperties from the JsonReader.
     * 
     * @param jsonReader The JsonReader being read.
     * @return An instance of CloudManifestFileProperties if the JsonReader was pointing to an instance of it, or null
     * if it was pointing to JSON null.
     * @throws IOException If an error occurs while reading the CloudManifestFileProperties.
     */
    public static CloudManifestFileProperties fromJson(JsonReader jsonReader) throws IOException {
        return jsonReader.readObject(reader -> {
            CloudManifestFileProperties deserializedCloudManifestFileProperties = new CloudManifestFileProperties();
            while (reader.nextToken() != JsonToken.END_OBJECT) {
                String fieldName = reader.getFieldName();
                reader.nextToken();

                if ("deploymentData".equals(fieldName)) {
                    deserializedCloudManifestFileProperties.deploymentData
                        = CloudManifestFileDeploymentData.fromJson(reader);
                } else if ("signature".equals(fieldName)) {
                    deserializedCloudManifestFileProperties.signature = reader.getString();
                } else {
                    reader.skipChildren();
                }
            }

            return deserializedCloudManifestFileProperties;
        });
    }
}
