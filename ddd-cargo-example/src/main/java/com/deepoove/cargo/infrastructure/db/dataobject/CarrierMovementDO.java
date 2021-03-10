package com.deepoove.cargo.infrastructure.db.dataobject;

import lombok.Data;

import java.util.Date;

@Data
public class CarrierMovementDO {

    private String scheduleId;

    private String fromLocationId;

    private String toLocationId;

    private Date startTime;

    private Date arriveTime;
}
