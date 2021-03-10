package com.deepoove.cargo;

import com.google.common.eventbus.EventBus;
import org.mybatis.spring.annotation.MapperScan;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.Bean;

@SpringBootApplication
// @EnableCaching
// @ComponentScan(basePackages= {"com.deepoove.cargo"})
@MapperScan("com.deepoove.cargo.infrastructure.db.mapper")
public class CargoApplication {

    @Bean
    public EventBus configEvent() {
        return new EventBus();
    }

    public static void main(String[] args) {
        SpringApplication.run(CargoApplication.class, args);
    }
}
