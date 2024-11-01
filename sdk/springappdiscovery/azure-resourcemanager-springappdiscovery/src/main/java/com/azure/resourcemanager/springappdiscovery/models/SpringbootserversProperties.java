// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT License.
// Code generated by Microsoft (R) AutoRest Code Generator.

package com.azure.resourcemanager.springappdiscovery.models;

import com.azure.core.annotation.Fluent;
import com.azure.core.util.logging.ClientLogger;
import com.azure.json.JsonReader;
import com.azure.json.JsonSerializable;
import com.azure.json.JsonToken;
import com.azure.json.JsonWriter;
import java.io.IOException;
import java.util.List;

/**
 * The springbootservers resource definition.
 */
@Fluent
public final class SpringbootserversProperties implements JsonSerializable<SpringbootserversProperties> {
    /*
     * Target server port for remote login
     */
    private Integer port;

    /*
     * Server is the target server name or ip address to discover of SpringBootServer.
     */
    private String server;

    /*
     * The alternative FQDN or IP addresses to discover for this server
     */
    private List<String> fqdnAndIpAddressList;

    /*
     * The machine Id from ARM
     */
    private String machineArmId;

    /*
     * The total number of apps been discovered
     */
    private Integer totalApps;

    /*
     * The total number of spring boot apps been discovered
     */
    private Integer springBootApps;

    /*
     * The list of errors.
     */
    private List<Error> errors;

    /*
     * The resource provisioning state.
     */
    private ProvisioningState provisioningState;

    /**
     * Creates an instance of SpringbootserversProperties class.
     */
    public SpringbootserversProperties() {
    }

    /**
     * Get the port property: Target server port for remote login.
     * 
     * @return the port value.
     */
    public Integer port() {
        return this.port;
    }

    /**
     * Set the port property: Target server port for remote login.
     * 
     * @param port the port value to set.
     * @return the SpringbootserversProperties object itself.
     */
    public SpringbootserversProperties withPort(Integer port) {
        this.port = port;
        return this;
    }

    /**
     * Get the server property: Server is the target server name or ip address to discover of SpringBootServer.
     * 
     * @return the server value.
     */
    public String server() {
        return this.server;
    }

    /**
     * Set the server property: Server is the target server name or ip address to discover of SpringBootServer.
     * 
     * @param server the server value to set.
     * @return the SpringbootserversProperties object itself.
     */
    public SpringbootserversProperties withServer(String server) {
        this.server = server;
        return this;
    }

    /**
     * Get the fqdnAndIpAddressList property: The alternative FQDN or IP addresses to discover for this server.
     * 
     * @return the fqdnAndIpAddressList value.
     */
    public List<String> fqdnAndIpAddressList() {
        return this.fqdnAndIpAddressList;
    }

    /**
     * Set the fqdnAndIpAddressList property: The alternative FQDN or IP addresses to discover for this server.
     * 
     * @param fqdnAndIpAddressList the fqdnAndIpAddressList value to set.
     * @return the SpringbootserversProperties object itself.
     */
    public SpringbootserversProperties withFqdnAndIpAddressList(List<String> fqdnAndIpAddressList) {
        this.fqdnAndIpAddressList = fqdnAndIpAddressList;
        return this;
    }

    /**
     * Get the machineArmId property: The machine Id from ARM.
     * 
     * @return the machineArmId value.
     */
    public String machineArmId() {
        return this.machineArmId;
    }

    /**
     * Set the machineArmId property: The machine Id from ARM.
     * 
     * @param machineArmId the machineArmId value to set.
     * @return the SpringbootserversProperties object itself.
     */
    public SpringbootserversProperties withMachineArmId(String machineArmId) {
        this.machineArmId = machineArmId;
        return this;
    }

    /**
     * Get the totalApps property: The total number of apps been discovered.
     * 
     * @return the totalApps value.
     */
    public Integer totalApps() {
        return this.totalApps;
    }

    /**
     * Set the totalApps property: The total number of apps been discovered.
     * 
     * @param totalApps the totalApps value to set.
     * @return the SpringbootserversProperties object itself.
     */
    public SpringbootserversProperties withTotalApps(Integer totalApps) {
        this.totalApps = totalApps;
        return this;
    }

    /**
     * Get the springBootApps property: The total number of spring boot apps been discovered.
     * 
     * @return the springBootApps value.
     */
    public Integer springBootApps() {
        return this.springBootApps;
    }

    /**
     * Set the springBootApps property: The total number of spring boot apps been discovered.
     * 
     * @param springBootApps the springBootApps value to set.
     * @return the SpringbootserversProperties object itself.
     */
    public SpringbootserversProperties withSpringBootApps(Integer springBootApps) {
        this.springBootApps = springBootApps;
        return this;
    }

    /**
     * Get the errors property: The list of errors.
     * 
     * @return the errors value.
     */
    public List<Error> errors() {
        return this.errors;
    }

    /**
     * Set the errors property: The list of errors.
     * 
     * @param errors the errors value to set.
     * @return the SpringbootserversProperties object itself.
     */
    public SpringbootserversProperties withErrors(List<Error> errors) {
        this.errors = errors;
        return this;
    }

    /**
     * Get the provisioningState property: The resource provisioning state.
     * 
     * @return the provisioningState value.
     */
    public ProvisioningState provisioningState() {
        return this.provisioningState;
    }

    /**
     * Set the provisioningState property: The resource provisioning state.
     * 
     * @param provisioningState the provisioningState value to set.
     * @return the SpringbootserversProperties object itself.
     */
    public SpringbootserversProperties withProvisioningState(ProvisioningState provisioningState) {
        this.provisioningState = provisioningState;
        return this;
    }

    /**
     * Validates the instance.
     * 
     * @throws IllegalArgumentException thrown if the instance is not valid.
     */
    public void validate() {
        if (server() == null) {
            throw LOGGER.atError()
                .log(new IllegalArgumentException(
                    "Missing required property server in model SpringbootserversProperties"));
        }
        if (errors() != null) {
            errors().forEach(e -> e.validate());
        }
    }

    private static final ClientLogger LOGGER = new ClientLogger(SpringbootserversProperties.class);

    /**
     * {@inheritDoc}
     */
    @Override
    public JsonWriter toJson(JsonWriter jsonWriter) throws IOException {
        jsonWriter.writeStartObject();
        jsonWriter.writeStringField("server", this.server);
        jsonWriter.writeNumberField("port", this.port);
        jsonWriter.writeArrayField("fqdnAndIpAddressList", this.fqdnAndIpAddressList,
            (writer, element) -> writer.writeString(element));
        jsonWriter.writeStringField("machineArmId", this.machineArmId);
        jsonWriter.writeNumberField("totalApps", this.totalApps);
        jsonWriter.writeNumberField("springBootApps", this.springBootApps);
        jsonWriter.writeArrayField("errors", this.errors, (writer, element) -> writer.writeJson(element));
        jsonWriter.writeStringField("provisioningState",
            this.provisioningState == null ? null : this.provisioningState.toString());
        return jsonWriter.writeEndObject();
    }

    /**
     * Reads an instance of SpringbootserversProperties from the JsonReader.
     * 
     * @param jsonReader The JsonReader being read.
     * @return An instance of SpringbootserversProperties if the JsonReader was pointing to an instance of it, or null
     * if it was pointing to JSON null.
     * @throws IllegalStateException If the deserialized JSON object was missing any required properties.
     * @throws IOException If an error occurs while reading the SpringbootserversProperties.
     */
    public static SpringbootserversProperties fromJson(JsonReader jsonReader) throws IOException {
        return jsonReader.readObject(reader -> {
            SpringbootserversProperties deserializedSpringbootserversProperties = new SpringbootserversProperties();
            while (reader.nextToken() != JsonToken.END_OBJECT) {
                String fieldName = reader.getFieldName();
                reader.nextToken();

                if ("server".equals(fieldName)) {
                    deserializedSpringbootserversProperties.server = reader.getString();
                } else if ("port".equals(fieldName)) {
                    deserializedSpringbootserversProperties.port = reader.getNullable(JsonReader::getInt);
                } else if ("fqdnAndIpAddressList".equals(fieldName)) {
                    List<String> fqdnAndIpAddressList = reader.readArray(reader1 -> reader1.getString());
                    deserializedSpringbootserversProperties.fqdnAndIpAddressList = fqdnAndIpAddressList;
                } else if ("machineArmId".equals(fieldName)) {
                    deserializedSpringbootserversProperties.machineArmId = reader.getString();
                } else if ("totalApps".equals(fieldName)) {
                    deserializedSpringbootserversProperties.totalApps = reader.getNullable(JsonReader::getInt);
                } else if ("springBootApps".equals(fieldName)) {
                    deserializedSpringbootserversProperties.springBootApps = reader.getNullable(JsonReader::getInt);
                } else if ("errors".equals(fieldName)) {
                    List<Error> errors = reader.readArray(reader1 -> Error.fromJson(reader1));
                    deserializedSpringbootserversProperties.errors = errors;
                } else if ("provisioningState".equals(fieldName)) {
                    deserializedSpringbootserversProperties.provisioningState
                        = ProvisioningState.fromString(reader.getString());
                } else {
                    reader.skipChildren();
                }
            }

            return deserializedSpringbootserversProperties;
        });
    }
}
