package com.deepoove.cargo.application.query.dto;

import lombok.Data;

import java.util.List;

@Data
public class CargoHandlingEventDTO {

    private CargoDTO cargo;

    private List<HandlingEventDTO> events;
}
