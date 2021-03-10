package com.deepoove.cargo.domain.aggregate.carriermovement;

import lombok.Data;

import java.util.Date;

@Data
public class CarrierMovement {

    private String scheduleId;

    private String fromLocationId;

    private String toLocationId;

    private Date startTime;

    private Date arriveTime;
}
