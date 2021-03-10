package com.deepoove.cargo.infrastructure.db.dataobject;

import lombok.Data;

@Data
public class CargoDO {

    private String id;

    private String senderPhone;

    private String description;

    private String originLocationCode;

    private String destinationLocationCode;
}
