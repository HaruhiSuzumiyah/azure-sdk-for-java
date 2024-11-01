// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT License.
// Code generated by Microsoft (R) AutoRest Code Generator.

package com.azure.resourcemanager.securityinsights.generated;

import com.azure.core.credential.AccessToken;
import com.azure.core.http.HttpClient;
import com.azure.core.management.AzureEnvironment;
import com.azure.core.management.profile.AzureProfile;
import com.azure.core.test.http.MockHttpResponse;
import com.azure.resourcemanager.securityinsights.SecurityInsightsManager;
import com.azure.resourcemanager.securityinsights.models.Incident;
import com.azure.resourcemanager.securityinsights.models.IncidentClassification;
import com.azure.resourcemanager.securityinsights.models.IncidentClassificationReason;
import com.azure.resourcemanager.securityinsights.models.IncidentSeverity;
import com.azure.resourcemanager.securityinsights.models.IncidentStatus;
import com.azure.resourcemanager.securityinsights.models.OwnerType;
import java.nio.charset.StandardCharsets;
import java.time.OffsetDateTime;
import java.util.UUID;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;
import reactor.core.publisher.Mono;

public final class IncidentsGetWithResponseMockTests {
    @Test
    public void testGetWithResponse() throws Exception {
        String responseStr
            = "{\"properties\":{\"additionalData\":{\"alertsCount\":1546001188,\"bookmarksCount\":917424507,\"commentsCount\":431751287,\"alertProductNames\":[\"upaylcvwb\",\"mf\",\"lrymfjxlpiy\",\"qnpfydrfb\"],\"providerIncidentUrl\":\"nyxbyxmk\",\"tactics\":[\"Collection\",\"Collection\",\"Collection\",\"DefenseEvasion\"],\"techniques\":[\"ll\"]},\"classification\":\"TruePositive\",\"classificationComment\":\"ygjq\",\"classificationReason\":\"SuspiciousButExpected\",\"createdTimeUtc\":\"2021-06-12T05:29:36Z\",\"description\":\"gm\",\"firstActivityTimeUtc\":\"2021-06-16T20:30:44Z\",\"incidentUrl\":\"iwxzfvvz\",\"incidentNumber\":401037917,\"labels\":[{\"labelName\":\"ufjnbxwb\",\"labelType\":\"AutoAssigned\"}],\"providerName\":\"kinh\",\"providerIncidentId\":\"hg\",\"lastActivityTimeUtc\":\"2021-12-01T20:47:24Z\",\"lastModifiedTimeUtc\":\"2021-03-08T02:37:28Z\",\"owner\":{\"email\":\"uyv\",\"assignedTo\":\"wpzrdwcgl\",\"objectId\":\"fdbd3c01-a209-483d-81d8-2ba8dd928cf2\",\"userPrincipalName\":\"gcandxfhhhtes\",\"ownerType\":\"Group\"},\"relatedAnalyticRuleIds\":[\"nnckkpljdshv\",\"fkdxccyijjimhi\",\"zrqnjxm\"],\"severity\":\"Medium\",\"status\":\"Active\",\"teamInformation\":{\"teamId\":\"ydw\",\"primaryChannelUrl\":\"gruhhqldrdymn\",\"teamCreationTimeUtc\":\"2021-09-24T06:06:44Z\",\"name\":\"exqwqnghxnimvy\",\"description\":\"rxgunnqgy\"},\"title\":\"uqtnylquevqmvy\"},\"etag\":\"gmmue\",\"id\":\"nznwgsqufmjx\",\"name\":\"yoseqcazisvbr\",\"type\":\"gcyjpgawepk\"}";

        HttpClient httpClient
            = response -> Mono.just(new MockHttpResponse(response, 200, responseStr.getBytes(StandardCharsets.UTF_8)));
        SecurityInsightsManager manager = SecurityInsightsManager.configure()
            .withHttpClient(httpClient)
            .authenticate(tokenRequestContext -> Mono.just(new AccessToken("this_is_a_token", OffsetDateTime.MAX)),
                new AzureProfile("", "", AzureEnvironment.AZURE));

        Incident response = manager.incidents()
            .getWithResponse("qup", "kjr", "fwkyluobdxw", com.azure.core.util.Context.NONE)
            .getValue();

        Assertions.assertEquals("gmmue", response.etag());
        Assertions.assertEquals(IncidentClassification.TRUE_POSITIVE, response.classification());
        Assertions.assertEquals("ygjq", response.classificationComment());
        Assertions.assertEquals(IncidentClassificationReason.SUSPICIOUS_BUT_EXPECTED, response.classificationReason());
        Assertions.assertEquals("gm", response.description());
        Assertions.assertEquals(OffsetDateTime.parse("2021-06-16T20:30:44Z"), response.firstActivityTimeUtc());
        Assertions.assertEquals("ufjnbxwb", response.labels().get(0).labelName());
        Assertions.assertEquals("kinh", response.providerName());
        Assertions.assertEquals("hg", response.providerIncidentId());
        Assertions.assertEquals(OffsetDateTime.parse("2021-12-01T20:47:24Z"), response.lastActivityTimeUtc());
        Assertions.assertEquals("uyv", response.owner().email());
        Assertions.assertEquals("wpzrdwcgl", response.owner().assignedTo());
        Assertions.assertEquals(UUID.fromString("fdbd3c01-a209-483d-81d8-2ba8dd928cf2"), response.owner().objectId());
        Assertions.assertEquals("gcandxfhhhtes", response.owner().userPrincipalName());
        Assertions.assertEquals(OwnerType.GROUP, response.owner().ownerType());
        Assertions.assertEquals(IncidentSeverity.MEDIUM, response.severity());
        Assertions.assertEquals(IncidentStatus.ACTIVE, response.status());
        Assertions.assertEquals("uqtnylquevqmvy", response.title());
    }
}
