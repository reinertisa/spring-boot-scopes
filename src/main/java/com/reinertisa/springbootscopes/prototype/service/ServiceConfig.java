package com.reinertisa.springbootscopes.prototype.service;

import org.springframework.boot.CommandLineRunner;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.core.annotation.Order;

@Configuration
@Order(4)
public class ServiceConfig {

    @Bean("serviceConfigRunner")
    public CommandLineRunner run(ServiceA serviceA, ServiceB serviceB) {
        return args -> {
            serviceA.usePrototypeBean();
            serviceB.usePrototypeBean();
        };
    }
}
