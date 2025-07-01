package com.reinertisa.springbootscopes.prototype.service2;

import org.springframework.boot.CommandLineRunner;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.core.annotation.Order;

@Configuration
@Order(200)
public class ServiceConfig2 {

    @Bean(name = "service-2")
    CommandLineRunner commandLineRunner(RepairService1 repairService1, RepairService2 repairService2) {
        return args -> {
          repairService1.setLaptopConfiguration();
          repairService1.displayLaptopConfig();

          repairService2.setLaptopConfig();
          repairService2.displayLaptop();
        };
    }
}
