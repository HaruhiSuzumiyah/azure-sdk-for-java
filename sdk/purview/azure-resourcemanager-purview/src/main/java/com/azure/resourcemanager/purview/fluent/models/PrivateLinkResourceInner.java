// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT License.
// Code generated by Microsoft (R) AutoRest Code Generator.

package com.azure.resourcemanager.purview.fluent.models;

import com.azure.core.annotation.Immutable;
import com.azure.json.JsonReader;
import com.azure.json.JsonSerializable;
import com.azure.json.JsonToken;
import com.azure.json.JsonWriter;
import com.azure.resourcemanager.purview.models.PrivateLinkResourceProperties;
import java.io.IOException;

/**
 * A privately linkable resource.
 */
@Immutable
public final class PrivateLinkResourceInner implements JsonSerializable<PrivateLinkResourceInner> {
    /*
     * The private link resource identifier.
     */
    private String id;

    /*
     * The private link resource name.
     */
    private String name;

    /*
     * The private link resource properties.
     */
    private PrivateLinkResourceProperties properties;

    /*
     * The private link resource type.
     */
    private String type;

    /**
     * Creates an instance of PrivateLinkResourceInner class.
     */
    public PrivateLinkResourceInner() {
    }

    /**
     * Get the id property: The private link resource identifier.
     * 
     * @return the id value.
     */
    public String id() {
        return this.id;
    }

    /**
     * Get the name property: The private link resource name.
     * 
     * @return the name value.
     */
    public String name() {
        return this.name;
    }

    /**
     * Get the properties property: The private link resource properties.
     * 
     * @return the properties value.
     */
    public PrivateLinkResourceProperties properties() {
        return this.properties;
    }

    /**
     * Get the type property: The private link resource type.
     * 
     * @return the type value.
     */
    public String type() {
        return this.type;
    }

    /**
     * Validates the instance.
     * 
     * @throws IllegalArgumentException thrown if the instance is not valid.
     */
    public void validate() {
        if (properties() != null) {
            properties().validate();
        }
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public JsonWriter toJson(JsonWriter jsonWriter) throws IOException {
        jsonWriter.writeStartObject();
        return jsonWriter.writeEndObject();
    }

    /**
     * Reads an instance of PrivateLinkResourceInner from the JsonReader.
     * 
     * @param jsonReader The JsonReader being read.
     * @return An instance of PrivateLinkResourceInner if the JsonReader was pointing to an instance of it, or null if
     * it was pointing to JSON null.
     * @throws IOException If an error occurs while reading the PrivateLinkResourceInner.
     */
    public static PrivateLinkResourceInner fromJson(JsonReader jsonReader) throws IOException {
        return jsonReader.readObject(reader -> {
            PrivateLinkResourceInner deserializedPrivateLinkResourceInner = new PrivateLinkResourceInner();
            while (reader.nextToken() != JsonToken.END_OBJECT) {
                String fieldName = reader.getFieldName();
                reader.nextToken();

                if ("id".equals(fieldName)) {
                    deserializedPrivateLinkResourceInner.id = reader.getString();
                } else if ("name".equals(fieldName)) {
                    deserializedPrivateLinkResourceInner.name = reader.getString();
                } else if ("properties".equals(fieldName)) {
                    deserializedPrivateLinkResourceInner.properties = PrivateLinkResourceProperties.fromJson(reader);
                } else if ("type".equals(fieldName)) {
                    deserializedPrivateLinkResourceInner.type = reader.getString();
                } else {
                    reader.skipChildren();
                }
            }

            return deserializedPrivateLinkResourceInner;
        });
    }
}
