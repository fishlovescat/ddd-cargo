package com.deepoove.cargo.application.query;

import com.deepoove.cargo.application.query.dto.CargoDTO;
import com.deepoove.cargo.application.query.qry.CargoFindbyCustomerQry;

import java.util.List;

public interface CargoQueryService {

    List<CargoDTO> queryCargos();

    List<CargoDTO> queryCargos(CargoFindbyCustomerQry qry);

    CargoDTO getCargo(String cargoId);
}
