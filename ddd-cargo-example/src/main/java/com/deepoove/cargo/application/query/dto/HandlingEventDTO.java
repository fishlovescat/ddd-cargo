package com.deepoove.cargo.application.query.dto;

import lombok.Data;

@Data
public class HandlingEventDTO {

    private String eventType;

    private String datetime;

    private CarrierMovementDTO carrierMovement;
}
