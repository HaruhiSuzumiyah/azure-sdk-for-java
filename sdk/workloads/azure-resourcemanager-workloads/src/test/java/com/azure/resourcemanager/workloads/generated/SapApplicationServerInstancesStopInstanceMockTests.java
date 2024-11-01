// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT License.
// Code generated by Microsoft (R) AutoRest Code Generator.

package com.azure.resourcemanager.workloads.generated;

import com.azure.core.credential.AccessToken;
import com.azure.core.http.HttpClient;
import com.azure.core.http.HttpHeaders;
import com.azure.core.http.HttpRequest;
import com.azure.core.http.HttpResponse;
import com.azure.core.management.AzureEnvironment;
import com.azure.core.management.profile.AzureProfile;
import com.azure.resourcemanager.workloads.WorkloadsManager;
import com.azure.resourcemanager.workloads.models.OperationStatusResult;
import com.azure.resourcemanager.workloads.models.StopRequest;
import java.nio.ByteBuffer;
import java.nio.charset.StandardCharsets;
import java.time.OffsetDateTime;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;
import org.mockito.ArgumentCaptor;
import org.mockito.Mockito;
import reactor.core.publisher.Flux;
import reactor.core.publisher.Mono;

public final class SapApplicationServerInstancesStopInstanceMockTests {
    @Test
    public void testStopInstance() throws Exception {
        HttpClient httpClient = Mockito.mock(HttpClient.class);
        HttpResponse httpResponse = Mockito.mock(HttpResponse.class);
        ArgumentCaptor<HttpRequest> httpRequest = ArgumentCaptor.forClass(HttpRequest.class);

        String responseStr
            = "{\"id\":\"embnkbw\",\"name\":\"vxkdivqihebwtswb\",\"status\":\"uwfmduragegizvc\",\"percentComplete\":48.271984,\"startTime\":\"2021-05-13T02:33:35Z\",\"endTime\":\"2021-06-18T15:42:06Z\",\"operations\":[{\"id\":\"ggbqi\",\"name\":\"xkbsazgakgac\",\"status\":\"rcmjdmspofapvuh\",\"percentComplete\":69.69709,\"startTime\":\"2021-10-23T00:02:47Z\",\"endTime\":\"2021-02-25T11:36:52Z\",\"operations\":[]},{\"id\":\"zjedmstkvnlv\",\"name\":\"c\",\"status\":\"iiznktwfan\",\"percentComplete\":4.799801,\"startTime\":\"2021-10-26T06:08:35Z\",\"endTime\":\"2021-05-05T18:43:08Z\",\"operations\":[]},{\"id\":\"stbz\",\"name\":\"iwbuqny\",\"status\":\"phzfylsgcrp\",\"percentComplete\":77.76872,\"startTime\":\"2021-03-23T07:29:02Z\",\"endTime\":\"2021-03-13T23:33:34Z\",\"operations\":[]}]}";

        Mockito.when(httpResponse.getStatusCode()).thenReturn(200);
        Mockito.when(httpResponse.getHeaders()).thenReturn(new HttpHeaders());
        Mockito.when(httpResponse.getBody())
            .thenReturn(Flux.just(ByteBuffer.wrap(responseStr.getBytes(StandardCharsets.UTF_8))));
        Mockito.when(httpResponse.getBodyAsByteArray())
            .thenReturn(Mono.just(responseStr.getBytes(StandardCharsets.UTF_8)));
        Mockito.when(httpClient.send(httpRequest.capture(), Mockito.any())).thenReturn(Mono.defer(() -> {
            Mockito.when(httpResponse.getRequest()).thenReturn(httpRequest.getValue());
            return Mono.just(httpResponse);
        }));

        WorkloadsManager manager = WorkloadsManager.configure()
            .withHttpClient(httpClient)
            .authenticate(tokenRequestContext -> Mono.just(new AccessToken("this_is_a_token", OffsetDateTime.MAX)),
                new AzureProfile("", "", AzureEnvironment.AZURE));

        OperationStatusResult response = manager.sapApplicationServerInstances()
            .stopInstance("iiqbi", "htmwwinh", "hfqpofv",
                new StopRequest().withSoftStopTimeoutSeconds(3058208759647015148L), com.azure.core.util.Context.NONE);

        Assertions.assertEquals("embnkbw", response.id());
        Assertions.assertEquals("vxkdivqihebwtswb", response.name());
        Assertions.assertEquals("uwfmduragegizvc", response.status());
        Assertions.assertEquals(48.271984F, response.percentComplete());
        Assertions.assertEquals(OffsetDateTime.parse("2021-05-13T02:33:35Z"), response.startTime());
        Assertions.assertEquals(OffsetDateTime.parse("2021-06-18T15:42:06Z"), response.endTime());
        Assertions.assertEquals("ggbqi", response.operations().get(0).id());
        Assertions.assertEquals("xkbsazgakgac", response.operations().get(0).name());
        Assertions.assertEquals("rcmjdmspofapvuh", response.operations().get(0).status());
        Assertions.assertEquals(69.69709F, response.operations().get(0).percentComplete());
        Assertions.assertEquals(OffsetDateTime.parse("2021-10-23T00:02:47Z"), response.operations().get(0).startTime());
        Assertions.assertEquals(OffsetDateTime.parse("2021-02-25T11:36:52Z"), response.operations().get(0).endTime());
    }
}
