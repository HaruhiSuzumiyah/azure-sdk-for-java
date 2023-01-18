// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT License.
// Code generated by Microsoft (R) AutoRest Code Generator.

package com.azure.resourcemanager.devtestlabs.generated;

import com.azure.core.util.BinaryData;
import com.azure.resourcemanager.devtestlabs.models.ArtifactInstallProperties;
import com.azure.resourcemanager.devtestlabs.models.ArtifactParameterProperties;
import java.time.OffsetDateTime;
import java.util.Arrays;
import org.junit.jupiter.api.Assertions;

public final class ArtifactInstallPropertiesTests {
    @org.junit.jupiter.api.Test
    public void testDeserialize() throws Exception {
        ArtifactInstallProperties model =
            BinaryData
                .fromString(
                    "{\"artifactId\":\"vk\",\"artifactTitle\":\"pqvujzraehtwdwrf\",\"parameters\":[{\"name\":\"byrcdlbhshfwp\",\"value\":\"cstwity\"}],\"status\":\"evxccedcp\",\"deploymentStatusMessage\":\"dyodnwzxltj\",\"vmExtensionStatusMessage\":\"nhltiugcxn\",\"installTime\":\"2021-08-23T04:40:03Z\"}")
                .toObject(ArtifactInstallProperties.class);
        Assertions.assertEquals("vk", model.artifactId());
        Assertions.assertEquals("pqvujzraehtwdwrf", model.artifactTitle());
        Assertions.assertEquals("byrcdlbhshfwp", model.parameters().get(0).name());
        Assertions.assertEquals("cstwity", model.parameters().get(0).value());
        Assertions.assertEquals("evxccedcp", model.status());
        Assertions.assertEquals("dyodnwzxltj", model.deploymentStatusMessage());
        Assertions.assertEquals("nhltiugcxn", model.vmExtensionStatusMessage());
        Assertions.assertEquals(OffsetDateTime.parse("2021-08-23T04:40:03Z"), model.installTime());
    }

    @org.junit.jupiter.api.Test
    public void testSerialize() throws Exception {
        ArtifactInstallProperties model =
            new ArtifactInstallProperties()
                .withArtifactId("vk")
                .withArtifactTitle("pqvujzraehtwdwrf")
                .withParameters(
                    Arrays.asList(new ArtifactParameterProperties().withName("byrcdlbhshfwp").withValue("cstwity")))
                .withStatus("evxccedcp")
                .withDeploymentStatusMessage("dyodnwzxltj")
                .withVmExtensionStatusMessage("nhltiugcxn")
                .withInstallTime(OffsetDateTime.parse("2021-08-23T04:40:03Z"));
        model = BinaryData.fromObject(model).toObject(ArtifactInstallProperties.class);
        Assertions.assertEquals("vk", model.artifactId());
        Assertions.assertEquals("pqvujzraehtwdwrf", model.artifactTitle());
        Assertions.assertEquals("byrcdlbhshfwp", model.parameters().get(0).name());
        Assertions.assertEquals("cstwity", model.parameters().get(0).value());
        Assertions.assertEquals("evxccedcp", model.status());
        Assertions.assertEquals("dyodnwzxltj", model.deploymentStatusMessage());
        Assertions.assertEquals("nhltiugcxn", model.vmExtensionStatusMessage());
        Assertions.assertEquals(OffsetDateTime.parse("2021-08-23T04:40:03Z"), model.installTime());
    }
}