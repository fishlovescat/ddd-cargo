package com.deepoove.cargo.domain.aggregate.handlingevent;

import lombok.Getter;
import lombok.experimental.Accessors;

import java.util.Date;
import java.util.UUID;

@Getter
@Accessors(fluent = true)
public class HandlingEvent {

    private final String id;

    private final String cargoId;

    private final Date datetime;

    private final EventTypeEnum eventType;

    private String scheduleId;

    private HandlingEvent(String id, String cargoId, Date time, EventTypeEnum eventType) {
        this.id = id;
        this.cargoId = cargoId;
        this.eventType = eventType;
        this.datetime = time;
    }

    public static HandlingEvent newHandlingEvent(String cargoId, Date time, EventTypeEnum eventType,
                                                 String scheduleId) {
        return newHandlingEvent(UUID.randomUUID().toString(), cargoId, time, eventType, scheduleId);
    }

    public static HandlingEvent newHandlingEvent(String id, String cargoId, Date time,
                                                 EventTypeEnum eventType, String scheduleId) {
        HandlingEvent handlingEvent = new HandlingEvent(id, cargoId, time, eventType);
        handlingEvent.scheduleId = scheduleId;
        return handlingEvent;
    }

    public boolean canModifyCargo() {
        return eventType == EventTypeEnum.RECEIVE;
    }

    public Date datetime() {
        return datetime;
    }

    public String cargoId() {
        return cargoId;
    }

    public String id() {
        return id;
    }

    public EventTypeEnum eventType() {
        return eventType;
    }

    public String scheduleId() {
        return scheduleId;
    }
}
