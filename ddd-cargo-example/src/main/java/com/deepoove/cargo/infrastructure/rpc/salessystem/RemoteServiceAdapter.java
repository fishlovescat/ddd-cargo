package com.deepoove.cargo.infrastructure.rpc.salessystem;

import com.deepoove.cargo.domain.aggregate.cargo.Cargo;
import com.deepoove.cargo.domain.aggregate.cargo.valueobject.EnterpriseSegment;
import com.deepoove.cargo.infrastructure.rpc.salessystem.dataobject.UserDO;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

@Component
public class RemoteServiceAdapter {

    @Autowired
    private RemoteServiceTranslator translator;

    // remoteService

    public UserDO getUser(String phone) {
        // remote service
        // translator
        return null;
    }

    public EnterpriseSegment deriveEnterpriseSegment(Cargo cargo) {
        // remote service
        // translator
        return EnterpriseSegment.FRUIT;
    }

    public boolean mayAccept(int cargoSize, Cargo cargo) {
        // remote service
        // translator
        return true;
    }
}
