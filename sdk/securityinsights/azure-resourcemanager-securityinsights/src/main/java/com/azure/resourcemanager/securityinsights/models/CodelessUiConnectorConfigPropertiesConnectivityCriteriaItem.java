// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT License.
// Code generated by Microsoft (R) AutoRest Code Generator.

package com.azure.resourcemanager.securityinsights.models;

import com.azure.core.annotation.Fluent;
import com.azure.json.JsonReader;
import com.azure.json.JsonToken;
import com.azure.json.JsonWriter;
import java.io.IOException;
import java.util.List;

/**
 * The CodelessUiConnectorConfigPropertiesConnectivityCriteriaItem model.
 */
@Fluent
public final class CodelessUiConnectorConfigPropertiesConnectivityCriteriaItem extends ConnectivityCriteria {
    /**
     * Creates an instance of CodelessUiConnectorConfigPropertiesConnectivityCriteriaItem class.
     */
    public CodelessUiConnectorConfigPropertiesConnectivityCriteriaItem() {
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public CodelessUiConnectorConfigPropertiesConnectivityCriteriaItem withType(ConnectivityType type) {
        super.withType(type);
        return this;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public CodelessUiConnectorConfigPropertiesConnectivityCriteriaItem withValue(List<String> value) {
        super.withValue(value);
        return this;
    }

    /**
     * Validates the instance.
     * 
     * @throws IllegalArgumentException thrown if the instance is not valid.
     */
    @Override
    public void validate() {
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public JsonWriter toJson(JsonWriter jsonWriter) throws IOException {
        jsonWriter.writeStartObject();
        jsonWriter.writeStringField("type", type() == null ? null : type().toString());
        jsonWriter.writeArrayField("value", value(), (writer, element) -> writer.writeString(element));
        return jsonWriter.writeEndObject();
    }

    /**
     * Reads an instance of CodelessUiConnectorConfigPropertiesConnectivityCriteriaItem from the JsonReader.
     * 
     * @param jsonReader The JsonReader being read.
     * @return An instance of CodelessUiConnectorConfigPropertiesConnectivityCriteriaItem if the JsonReader was pointing
     * to an instance of it, or null if it was pointing to JSON null.
     * @throws IOException If an error occurs while reading the
     * CodelessUiConnectorConfigPropertiesConnectivityCriteriaItem.
     */
    public static CodelessUiConnectorConfigPropertiesConnectivityCriteriaItem fromJson(JsonReader jsonReader)
        throws IOException {
        return jsonReader.readObject(reader -> {
            CodelessUiConnectorConfigPropertiesConnectivityCriteriaItem deserializedCodelessUiConnectorConfigPropertiesConnectivityCriteriaItem
                = new CodelessUiConnectorConfigPropertiesConnectivityCriteriaItem();
            while (reader.nextToken() != JsonToken.END_OBJECT) {
                String fieldName = reader.getFieldName();
                reader.nextToken();

                if ("type".equals(fieldName)) {
                    deserializedCodelessUiConnectorConfigPropertiesConnectivityCriteriaItem
                        .withType(ConnectivityType.fromString(reader.getString()));
                } else if ("value".equals(fieldName)) {
                    List<String> value = reader.readArray(reader1 -> reader1.getString());
                    deserializedCodelessUiConnectorConfigPropertiesConnectivityCriteriaItem.withValue(value);
                } else {
                    reader.skipChildren();
                }
            }

            return deserializedCodelessUiConnectorConfigPropertiesConnectivityCriteriaItem;
        });
    }
}
