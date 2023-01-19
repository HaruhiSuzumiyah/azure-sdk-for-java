// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT License.
// Code generated by Microsoft (R) AutoRest Code Generator.

package com.azure.resourcemanager.storagepool.generated;

import com.azure.core.util.BinaryData;
import com.azure.resourcemanager.storagepool.models.Acl;
import com.azure.resourcemanager.storagepool.models.IscsiLun;
import com.azure.resourcemanager.storagepool.models.IscsiTargetAclMode;
import com.azure.resourcemanager.storagepool.models.IscsiTargetCreate;
import java.util.Arrays;
import org.junit.jupiter.api.Assertions;

public final class IscsiTargetCreateTests {
    @org.junit.jupiter.api.Test
    public void testDeserialize() throws Exception {
        IscsiTargetCreate model =
            BinaryData
                .fromString(
                    "{\"properties\":{\"aclMode\":\"Static\",\"targetIqn\":\"jriplrbpbewtghf\",\"staticAcls\":[{\"initiatorIqn\":\"c\",\"mappedLuns\":[]},{\"initiatorIqn\":\"wxzvlvqhjkb\",\"mappedLuns\":[]},{\"initiatorIqn\":\"gibtnm\",\"mappedLuns\":[]}],\"luns\":[{\"name\":\"bwwaloa\",\"managedDiskAzureResourceId\":\"qcgw\",\"lun\":1999029226},{\"name\":\"j\",\"managedDiskAzureResourceId\":\"zg\",\"lun\":598094792},{\"name\":\"mhtxongmtsavjcb\",\"managedDiskAzureResourceId\":\"wxqpsrknftguvri\",\"lun\":346256186}]},\"managedBy\":\"wmdyvxqtay\",\"managedByExtended\":[\"wroyqbexrmcq\"],\"id\":\"bycnojvkn\",\"name\":\"e\",\"type\":\"qsgzvahapj\"}")
                .toObject(IscsiTargetCreate.class);
        Assertions.assertEquals("wmdyvxqtay", model.managedBy());
        Assertions.assertEquals("wroyqbexrmcq", model.managedByExtended().get(0));
        Assertions.assertEquals(IscsiTargetAclMode.STATIC, model.aclMode());
        Assertions.assertEquals("jriplrbpbewtghf", model.targetIqn());
        Assertions.assertEquals("c", model.staticAcls().get(0).initiatorIqn());
        Assertions.assertEquals("bwwaloa", model.luns().get(0).name());
        Assertions.assertEquals("qcgw", model.luns().get(0).managedDiskAzureResourceId());
    }

    @org.junit.jupiter.api.Test
    public void testSerialize() throws Exception {
        IscsiTargetCreate model =
            new IscsiTargetCreate()
                .withManagedBy("wmdyvxqtay")
                .withManagedByExtended(Arrays.asList("wroyqbexrmcq"))
                .withAclMode(IscsiTargetAclMode.STATIC)
                .withTargetIqn("jriplrbpbewtghf")
                .withStaticAcls(
                    Arrays
                        .asList(
                            new Acl().withInitiatorIqn("c").withMappedLuns(Arrays.asList()),
                            new Acl().withInitiatorIqn("wxzvlvqhjkb").withMappedLuns(Arrays.asList()),
                            new Acl().withInitiatorIqn("gibtnm").withMappedLuns(Arrays.asList())))
                .withLuns(
                    Arrays
                        .asList(
                            new IscsiLun().withName("bwwaloa").withManagedDiskAzureResourceId("qcgw"),
                            new IscsiLun().withName("j").withManagedDiskAzureResourceId("zg"),
                            new IscsiLun()
                                .withName("mhtxongmtsavjcb")
                                .withManagedDiskAzureResourceId("wxqpsrknftguvri")));
        model = BinaryData.fromObject(model).toObject(IscsiTargetCreate.class);
        Assertions.assertEquals("wmdyvxqtay", model.managedBy());
        Assertions.assertEquals("wroyqbexrmcq", model.managedByExtended().get(0));
        Assertions.assertEquals(IscsiTargetAclMode.STATIC, model.aclMode());
        Assertions.assertEquals("jriplrbpbewtghf", model.targetIqn());
        Assertions.assertEquals("c", model.staticAcls().get(0).initiatorIqn());
        Assertions.assertEquals("bwwaloa", model.luns().get(0).name());
        Assertions.assertEquals("qcgw", model.luns().get(0).managedDiskAzureResourceId());
    }
}