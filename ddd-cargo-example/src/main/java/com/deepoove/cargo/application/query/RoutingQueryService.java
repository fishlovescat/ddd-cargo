package com.deepoove.cargo.application.query;

import com.deepoove.cargo.application.query.dto.CarrierMovementDTO;
import com.deepoove.cargo.infrastructure.db.dataobject.LocationDO;

import java.util.List;

public interface RoutingQueryService {

    List<CarrierMovementDTO> queryCarriers();

    List<LocationDO> queryLocations();
}
