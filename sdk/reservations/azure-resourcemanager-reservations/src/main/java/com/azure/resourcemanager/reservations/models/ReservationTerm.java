// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT License.
// Code generated by Microsoft (R) AutoRest Code Generator.

package com.azure.resourcemanager.reservations.models;

import com.azure.core.util.ExpandableStringEnum;
import com.fasterxml.jackson.annotation.JsonCreator;
import java.util.Collection;

/** Represent the term of reservation. */
public final class ReservationTerm extends ExpandableStringEnum<ReservationTerm> {
    /** Static value P1Y for ReservationTerm. */
    public static final ReservationTerm P1Y = fromString("P1Y");

    /** Static value P3Y for ReservationTerm. */
    public static final ReservationTerm P3Y = fromString("P3Y");

    /** Static value P5Y for ReservationTerm. */
    public static final ReservationTerm P5Y = fromString("P5Y");

    /**
     * Creates a new instance of ReservationTerm value.
     *
     * @deprecated Use the {@link #fromString(String)} factory method.
     */
    @Deprecated
    public ReservationTerm() {
    }

    /**
     * Creates or finds a ReservationTerm from its string representation.
     *
     * @param name a name to look for.
     * @return the corresponding ReservationTerm.
     */
    @JsonCreator
    public static ReservationTerm fromString(String name) {
        return fromString(name, ReservationTerm.class);
    }

    /**
     * Gets known ReservationTerm values.
     *
     * @return known ReservationTerm values.
     */
    public static Collection<ReservationTerm> values() {
        return values(ReservationTerm.class);
    }
}