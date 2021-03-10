package com.deepoove.cargo.application.query.dto;

import lombok.Data;

@Data
public class CargoDTO {

    private String id;

    private String senderPhone;

    private String description;

    private String originLocationName;

    private String destinationLocationCode;

    private String destinationLocationName;
}
