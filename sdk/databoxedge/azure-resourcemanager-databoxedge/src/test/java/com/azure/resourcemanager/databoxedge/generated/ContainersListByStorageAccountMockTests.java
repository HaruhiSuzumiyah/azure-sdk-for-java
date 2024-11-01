// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT License.
// Code generated by Microsoft (R) AutoRest Code Generator.

package com.azure.resourcemanager.databoxedge.generated;

import com.azure.core.credential.AccessToken;
import com.azure.core.http.HttpClient;
import com.azure.core.http.rest.PagedIterable;
import com.azure.core.management.AzureEnvironment;
import com.azure.core.management.profile.AzureProfile;
import com.azure.core.test.http.MockHttpResponse;
import com.azure.resourcemanager.databoxedge.DataBoxEdgeManager;
import com.azure.resourcemanager.databoxedge.models.AzureContainerDataFormat;
import com.azure.resourcemanager.databoxedge.models.Container;
import java.nio.charset.StandardCharsets;
import java.time.OffsetDateTime;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;
import reactor.core.publisher.Mono;

public final class ContainersListByStorageAccountMockTests {
    @Test
    public void testListByStorageAccount() throws Exception {
        String responseStr
            = "{\"value\":[{\"properties\":{\"containerStatus\":\"Unknown\",\"dataFormat\":\"BlockBlob\",\"refreshDetails\":{\"inProgressRefreshJobId\":\"pmyyefrpmpdnqq\",\"lastCompletedRefreshJobTimeInUTC\":\"2021-04-07T23:14:44Z\",\"errorManifestFile\":\"ao\",\"lastJob\":\"mmbnpqfrtql\"},\"createdDateTime\":\"2021-08-01T20:31:37Z\"},\"id\":\"egnitg\",\"name\":\"kxlzyqdrfeg\",\"type\":\"ealzxwhcansymoyq\"}]}";

        HttpClient httpClient
            = response -> Mono.just(new MockHttpResponse(response, 200, responseStr.getBytes(StandardCharsets.UTF_8)));
        DataBoxEdgeManager manager = DataBoxEdgeManager.configure()
            .withHttpClient(httpClient)
            .authenticate(tokenRequestContext -> Mono.just(new AccessToken("this_is_a_token", OffsetDateTime.MAX)),
                new AzureProfile("", "", AzureEnvironment.AZURE));

        PagedIterable<Container> response = manager.containers()
            .listByStorageAccount("oyzunbixxr", "ikvcpwp", "clrcivtsox", com.azure.core.util.Context.NONE);

        Assertions.assertEquals(AzureContainerDataFormat.BLOCK_BLOB, response.iterator().next().dataFormat());
    }
}
