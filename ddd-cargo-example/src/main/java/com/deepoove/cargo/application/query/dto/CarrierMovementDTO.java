package com.deepoove.cargo.application.query.dto;

import lombok.Data;

@Data
public class CarrierMovementDTO {

    private String scheduleId;

    private String fromLocationId;

    private String fromLocationName;

    private String toLocationId;

    private String toLocationName;

    private String startTime;

    private String arriveTime;
}
