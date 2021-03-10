package com.deepoove.cargo.application.command.cmd;

import lombok.Data;

@Data
public class CargoSenderUpdateCommand {

    private String cargoId;

    private String senderPhone;
}
