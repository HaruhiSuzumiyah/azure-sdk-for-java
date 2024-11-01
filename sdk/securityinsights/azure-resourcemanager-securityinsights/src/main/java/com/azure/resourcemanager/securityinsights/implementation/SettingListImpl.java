// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT License.
// Code generated by Microsoft (R) AutoRest Code Generator.

package com.azure.resourcemanager.securityinsights.implementation;

import com.azure.resourcemanager.securityinsights.fluent.models.SettingListInner;
import com.azure.resourcemanager.securityinsights.fluent.models.SettingsInner;
import com.azure.resourcemanager.securityinsights.models.SettingList;
import com.azure.resourcemanager.securityinsights.models.Settings;
import java.util.Collections;
import java.util.List;
import java.util.stream.Collectors;

public final class SettingListImpl implements SettingList {
    private SettingListInner innerObject;

    private final com.azure.resourcemanager.securityinsights.SecurityInsightsManager serviceManager;

    SettingListImpl(SettingListInner innerObject,
        com.azure.resourcemanager.securityinsights.SecurityInsightsManager serviceManager) {
        this.innerObject = innerObject;
        this.serviceManager = serviceManager;
    }

    public List<Settings> value() {
        List<SettingsInner> inner = this.innerModel().value();
        if (inner != null) {
            return Collections.unmodifiableList(
                inner.stream().map(inner1 -> new SettingsImpl(inner1, this.manager())).collect(Collectors.toList()));
        } else {
            return Collections.emptyList();
        }
    }

    public SettingListInner innerModel() {
        return this.innerObject;
    }

    private com.azure.resourcemanager.securityinsights.SecurityInsightsManager manager() {
        return this.serviceManager;
    }
}
