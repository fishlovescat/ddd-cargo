package com.deepoove.cargo.infrastructure.rpc.salessystem;

import com.deepoove.cargo.infrastructure.rpc.salessystem.dataobject.UserDO;
import org.springframework.stereotype.Component;

@Component
public class RemoteServiceTranslator {

    public UserDO toUserDO(Object obj) {
        return new UserDO();
    }
}
