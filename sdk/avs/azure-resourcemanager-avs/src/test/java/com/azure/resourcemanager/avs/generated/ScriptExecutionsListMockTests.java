// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT License.
// Code generated by Microsoft (R) AutoRest Code Generator.

package com.azure.resourcemanager.avs.generated;

import com.azure.core.credential.AccessToken;
import com.azure.core.http.HttpClient;
import com.azure.core.http.HttpHeaders;
import com.azure.core.http.HttpRequest;
import com.azure.core.http.HttpResponse;
import com.azure.core.http.rest.PagedIterable;
import com.azure.core.management.AzureEnvironment;
import com.azure.core.management.profile.AzureProfile;
import com.azure.resourcemanager.avs.AvsManager;
import com.azure.resourcemanager.avs.models.ScriptExecution;
import java.nio.ByteBuffer;
import java.nio.charset.StandardCharsets;
import java.time.OffsetDateTime;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;
import org.mockito.ArgumentCaptor;
import org.mockito.Mockito;
import reactor.core.publisher.Flux;
import reactor.core.publisher.Mono;

public final class ScriptExecutionsListMockTests {
    @Test
    public void testList() throws Exception {
        HttpClient httpClient = Mockito.mock(HttpClient.class);
        HttpResponse httpResponse = Mockito.mock(HttpResponse.class);
        ArgumentCaptor<HttpRequest> httpRequest = ArgumentCaptor.forClass(HttpRequest.class);

        String responseStr =
            "{\"value\":[{\"properties\":{\"scriptCmdletId\":\"rrxxgewpktvq\",\"parameters\":[],\"hiddenParameters\":[],\"failureReason\":\"zoyhlfbcgwg\",\"timeout\":\"loxoebqin\",\"retention\":\"pnwjfujq\",\"submittedAt\":\"2020-12-29T10:58:54Z\",\"startedAt\":\"2021-08-20T11:44:12Z\",\"finishedAt\":\"2021-07-05T19:18:32Z\",\"provisioningState\":\"Cancelling\",\"output\":[\"ofoiy\",\"w\"],\"namedOutputs\":{\"uogphuartvtiuky\":\"datalkmkkholvdndvi\",\"nxhkxjqi\":\"datafchnmnah\"},\"information\":[\"weooxffifhxwrs\",\"ewmozqvbu\",\"qmamhsycxhxzga\"],\"warnings\":[\"abo\",\"dvmfqhppub\",\"w\"],\"errors\":[\"dfgkmtdh\",\"rngbtcjuahokqtob\",\"auxofshfph\",\"pnulaiywzej\"]},\"id\":\"whslwkoj\",\"name\":\"llndnpd\",\"type\":\"rpqaf\"}]}";

        Mockito.when(httpResponse.getStatusCode()).thenReturn(200);
        Mockito.when(httpResponse.getHeaders()).thenReturn(new HttpHeaders());
        Mockito
            .when(httpResponse.getBody())
            .thenReturn(Flux.just(ByteBuffer.wrap(responseStr.getBytes(StandardCharsets.UTF_8))));
        Mockito
            .when(httpResponse.getBodyAsByteArray())
            .thenReturn(Mono.just(responseStr.getBytes(StandardCharsets.UTF_8)));
        Mockito
            .when(httpClient.send(httpRequest.capture(), Mockito.any()))
            .thenReturn(
                Mono
                    .defer(
                        () -> {
                            Mockito.when(httpResponse.getRequest()).thenReturn(httpRequest.getValue());
                            return Mono.just(httpResponse);
                        }));

        AvsManager manager =
            AvsManager
                .configure()
                .withHttpClient(httpClient)
                .authenticate(
                    tokenRequestContext -> Mono.just(new AccessToken("this_is_a_token", OffsetDateTime.MAX)),
                    new AzureProfile("", "", AzureEnvironment.AZURE));

        PagedIterable<ScriptExecution> response =
            manager.scriptExecutions().list("xgjiuqh", "btozipqwje", com.azure.core.util.Context.NONE);

        Assertions.assertEquals("rrxxgewpktvq", response.iterator().next().scriptCmdletId());
        Assertions.assertEquals("zoyhlfbcgwg", response.iterator().next().failureReason());
        Assertions.assertEquals("loxoebqin", response.iterator().next().timeout());
        Assertions.assertEquals("pnwjfujq", response.iterator().next().retention());
        Assertions.assertEquals("ofoiy", response.iterator().next().output().get(0));
    }
}