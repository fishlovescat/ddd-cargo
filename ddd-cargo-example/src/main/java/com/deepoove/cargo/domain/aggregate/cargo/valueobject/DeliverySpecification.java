package com.deepoove.cargo.domain.aggregate.cargo.valueobject;

import lombok.Data;

@Data
public class DeliverySpecification {

    private String originLocationCode;

    private String destinationLocationCode;

    public DeliverySpecification(String originLocationCode, String destinationLocationCode) {
        this.originLocationCode = originLocationCode;
        this.destinationLocationCode = destinationLocationCode;
    }
}
