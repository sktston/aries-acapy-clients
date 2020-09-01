/**
 * Copyright (c) 2020 Robert Bosch GmbH. All Rights Reserved.
 *
 * SPDX-License-Identifier: Apache-2.0
 */
package org.hyperledger.aries.api.wallet;

import javax.annotation.Nullable;

import org.hyperledger.aries.api.ledger.EndpointType;

import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;
import lombok.NonNull;

@Data @NoArgsConstructor @AllArgsConstructor @Builder
public class SetDidEndpointRequest {
    /**
     *  Endpoint type to set (default 'Endpoint'); affects only public DIDs.
     */
    @Nullable private EndpointType endpointType;

    @NonNull private String did;

    /**
     * Endpoint to set (omit to delete)
     */
    @Nullable private String endpoint;
}
