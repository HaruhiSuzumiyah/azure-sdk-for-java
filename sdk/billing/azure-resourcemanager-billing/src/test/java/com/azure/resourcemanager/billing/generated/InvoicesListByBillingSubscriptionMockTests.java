// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT License.
// Code generated by Microsoft (R) AutoRest Code Generator.

package com.azure.resourcemanager.billing.generated;

import com.azure.core.credential.AccessToken;
import com.azure.core.http.HttpClient;
import com.azure.core.http.HttpHeaders;
import com.azure.core.http.HttpRequest;
import com.azure.core.http.HttpResponse;
import com.azure.core.http.rest.PagedIterable;
import com.azure.core.management.AzureEnvironment;
import com.azure.core.management.profile.AzureProfile;
import com.azure.resourcemanager.billing.BillingManager;
import com.azure.resourcemanager.billing.models.Invoice;
import java.nio.ByteBuffer;
import java.nio.charset.StandardCharsets;
import java.time.OffsetDateTime;
import org.junit.jupiter.api.Test;
import org.mockito.ArgumentCaptor;
import org.mockito.Mockito;
import reactor.core.publisher.Flux;
import reactor.core.publisher.Mono;

public final class InvoicesListByBillingSubscriptionMockTests {
    @Test
    public void testListByBillingSubscription() throws Exception {
        HttpClient httpClient = Mockito.mock(HttpClient.class);
        HttpResponse httpResponse = Mockito.mock(HttpResponse.class);
        ArgumentCaptor<HttpRequest> httpRequest = ArgumentCaptor.forClass(HttpRequest.class);

        String responseStr =
            "{\"value\":[{\"properties\":{\"dueDate\":\"2021-11-02T12:37:58Z\",\"invoiceDate\":\"2021-06-07T05:32:23Z\",\"status\":\"OverDue\",\"amountDue\":{\"currency\":\"eakxcptsoqfyi\",\"value\":5.842119},\"azurePrepaymentApplied\":{\"currency\":\"hkrttzrazis\",\"value\":36.422657},\"billedAmount\":{\"currency\":\"emv\",\"value\":71.442566},\"creditAmount\":{\"currency\":\"ohmn\",\"value\":47.251976},\"freeAzureCreditApplied\":{\"currency\":\"ojklin\",\"value\":55.43031},\"subTotal\":{\"currency\":\"ysprq\",\"value\":92.47625},\"taxAmount\":{\"currency\":\"ojpslsvjgpliufi\",\"value\":76.19769},\"totalAmount\":{\"currency\":\"qvapcohhoucq\",\"value\":7.474506},\"invoicePeriodStartDate\":\"2021-09-24T10:14:03Z\",\"invoicePeriodEndDate\":\"2021-03-15T00:35:26Z\",\"invoiceType\":\"AzureService\",\"isMonthlyInvoice\":true,\"billingProfileId\":\"gdzbenr\",\"billingProfileDisplayName\":\"cawetzqddt\",\"purchaseOrderNumber\":\"fljhznamtua\",\"documents\":[],\"payments\":[],\"rebillDetails\":{},\"documentType\":\"Invoice\",\"billedDocumentId\":\"tjzmi\",\"creditForDocumentId\":\"gbgatzuuvbxn\",\"subscriptionId\":\"ebwgga\"},\"id\":\"ttzlswvajqfutlx\",\"name\":\"oqza\",\"type\":\"unwqr\"}]}";

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

        BillingManager manager =
            BillingManager
                .configure()
                .withHttpClient(httpClient)
                .authenticate(
                    tokenRequestContext -> Mono.just(new AccessToken("this_is_a_token", OffsetDateTime.MAX)),
                    new AzureProfile("", "", AzureEnvironment.AZURE));

        PagedIterable<Invoice> response =
            manager.invoices().listByBillingSubscription("ohdbvqvwzkj", "pwbeonr", com.azure.core.util.Context.NONE);
    }
}