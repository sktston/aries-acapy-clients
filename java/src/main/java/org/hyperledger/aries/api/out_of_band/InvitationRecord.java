/*
  Copyright (c) 2020 Robert Bosch GmbH. All Rights Reserved.

  SPDX-License-Identifier: Apache-2.0
 */
package org.hyperledger.aries.api.out_of_band;

import lombok.Data;
import lombok.NoArgsConstructor;

@Data @NoArgsConstructor
public class InvitationRecord {
    private String createdAt;
    private String inviMsgId;
    private Object invitation;
    private String invitationId;
    private String invitationUrl;
    private String state;
    private Boolean trace;
    private String updatedAt;
}
