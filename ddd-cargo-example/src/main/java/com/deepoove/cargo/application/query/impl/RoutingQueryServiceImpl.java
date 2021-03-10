package com.deepoove.cargo.application.query.impl;

import com.deepoove.cargo.application.query.RoutingQueryService;
import com.deepoove.cargo.application.query.assembler.CarrierMovementDTOAssembler;
import com.deepoove.cargo.application.query.dto.CarrierMovementDTO;
import com.deepoove.cargo.infrastructure.db.dataobject.CarrierMovementDO;
import com.deepoove.cargo.infrastructure.db.dataobject.LocationDO;
import com.deepoove.cargo.infrastructure.db.mapper.CarrierMovementMapper;
import com.deepoove.cargo.infrastructure.db.mapper.LocationMapper;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.stream.Collectors;

@Service
public class RoutingQueryServiceImpl implements RoutingQueryService {

    @Autowired
    private CarrierMovementMapper carrierMovementMapper;

    @Autowired
    private LocationMapper locationMapper;

    @Autowired
    private CarrierMovementDTOAssembler assembler;

    @Override
    public List<CarrierMovementDTO> queryCarriers() {
        List<CarrierMovementDO> carrierMovementDOs = carrierMovementMapper.selectAll();
        return carrierMovementDOs.stream().map(assembler).collect(Collectors.toList());
    }

    @Override
    public List<LocationDO> queryLocations() {
        return locationMapper.selectAll();
    }
}
