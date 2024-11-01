// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT License.
// Code generated by Microsoft (R) AutoRest Code Generator.

package com.azure.resourcemanager.mediaservices.generated;

import com.azure.core.credential.AccessToken;
import com.azure.core.http.HttpClient;
import com.azure.core.management.AzureEnvironment;
import com.azure.core.management.profile.AzureProfile;
import com.azure.core.test.http.MockHttpResponse;
import com.azure.resourcemanager.mediaservices.MediaServicesManager;
import com.azure.resourcemanager.mediaservices.models.LiveOutput;
import java.nio.charset.StandardCharsets;
import java.time.Duration;
import java.time.OffsetDateTime;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;
import reactor.core.publisher.Mono;

public final class LiveOutputsOperationLocationWithResponseMockTests {
    @Test
    public void testOperationLocationWithResponse() throws Exception {
        String responseStr
            = "{\"properties\":{\"description\":\"pinbmhwbjijkgqxn\",\"assetName\":\"mbk\",\"archiveWindowLength\":\"PT110H2M14S\",\"rewindWindowLength\":\"PT107H20M33S\",\"manifestName\":\"ujvaannggi\",\"hls\":{\"fragmentsPerTsSegment\":1407431837},\"outputSnapTime\":6496641583745652890,\"created\":\"2021-08-09T20:30:36Z\",\"lastModified\":\"2021-08-03T08:44:53Z\",\"provisioningState\":\"ekaum\",\"resourceState\":\"Running\"},\"id\":\"bzmqkratbn\",\"name\":\"wbjsidbirkf\",\"type\":\"kso\"}";

        HttpClient httpClient
            = response -> Mono.just(new MockHttpResponse(response, 200, responseStr.getBytes(StandardCharsets.UTF_8)));
        MediaServicesManager manager = MediaServicesManager.configure()
            .withHttpClient(httpClient)
            .authenticate(tokenRequestContext -> Mono.just(new AccessToken("this_is_a_token", OffsetDateTime.MAX)),
                new AzureProfile("", "", AzureEnvironment.AZURE));

        LiveOutput response = manager.liveOutputs()
            .operationLocationWithResponse("alsygao", "njpnnbmj", "sibjgs", "jxxahmrnad", "yqegx",
                com.azure.core.util.Context.NONE)
            .getValue();

        Assertions.assertEquals("pinbmhwbjijkgqxn", response.description());
        Assertions.assertEquals("mbk", response.assetName());
        Assertions.assertEquals(Duration.parse("PT110H2M14S"), response.archiveWindowLength());
        Assertions.assertEquals(Duration.parse("PT107H20M33S"), response.rewindWindowLength());
        Assertions.assertEquals("ujvaannggi", response.manifestName());
        Assertions.assertEquals(1407431837, response.hls().fragmentsPerTsSegment());
        Assertions.assertEquals(6496641583745652890L, response.outputSnapTime());
    }
}
