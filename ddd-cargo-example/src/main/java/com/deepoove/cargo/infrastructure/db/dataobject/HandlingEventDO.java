package com.deepoove.cargo.infrastructure.db.dataobject;

import lombok.Data;

import java.util.Date;

@Data
public class HandlingEventDO {

    private String id;

    private String cargoId;

    /**
     * 0:receiver 1:load 2:unload 3:end
     */
    private Integer eventType;

    private Date datetime;

    private String scheduleId;
}
