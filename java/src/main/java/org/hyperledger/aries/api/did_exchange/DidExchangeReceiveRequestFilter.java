/*
  Copyright (c) 2020 Robert Bosch GmbH. All Rights Reserved.

  SPDX-License-Identifier: Apache-2.0
 */
package org.hyperledger.aries.api.did_exchange;

import lombok.Builder;
import lombok.Data;
import org.hyperledger.aries.api.AcaPyRequestFilter;

@Data @Builder
public class DidExchangeReceiveRequestFilter implements AcaPyRequestFilter {
    /** Alias for connection */
    private String alias;

    /** Auto-accept connection (defaults to configuration */
    private Boolean autoAccept;

    /** Identifier for active mediation record to be used */
    private String mediationId;

    /** My URL endpoint */
    private String myEndpoint;
}
