package com.deepoove.cargo.infrastructure.db.converter;

import com.deepoove.cargo.domain.aggregate.cargo.Cargo;
import com.deepoove.cargo.domain.aggregate.cargo.valueobject.DeliverySpecification;
import com.deepoove.cargo.infrastructure.db.dataobject.CargoDO;

public class CargoConverter implements Converter<Cargo, CargoDO> {

    @Override
    public CargoDO serialize(Cargo cargo) {
        CargoDO target = new CargoDO();
        target.setId(cargo.id());
        target.setSenderPhone(cargo.sender());
        target.setDescription(cargo.description());
        DeliverySpecification delivery = cargo.delivery();
        target.setDestinationLocationCode(delivery.getDestinationLocationCode());
        target.setOriginLocationCode(delivery.getOriginLocationCode());
        return target;
    }

    @Override
    public Cargo deserialize(CargoDO cargo) {
        Cargo target = Cargo.newCargo(cargo.getId(), cargo.getSenderPhone(), cargo.getDescription(),
                new DeliverySpecification(cargo.getOriginLocationCode(),
                        cargo.getDestinationLocationCode()));
        return target;
    }
}
