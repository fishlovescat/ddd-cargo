package com.deepoove.cargo.shared;

public interface MQProducer {

    void send(Object message);
}
