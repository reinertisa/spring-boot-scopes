package com.reinertisa.springbootscopes.prototype.service1;

import org.springframework.boot.CommandLineRunner;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.core.annotation.Order;

@Configuration
@Order(1)
public class ServiceConfig1 {

    @Bean("serviceConfigRunner")
    public CommandLineRunner run(ServiceA serviceA, ServiceB serviceB) {
        return args -> {
            serviceA.usePrototypeBean();
            serviceB.usePrototypeBean();
        };
    }
}
