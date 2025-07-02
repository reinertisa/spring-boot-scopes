package com.reinertisa.springbootscopes.prototype.repairservice;

import org.springframework.boot.CommandLineRunner;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.core.annotation.Order;

@Configuration
@Order(5)
public class RepairServiceConfig {

    @Bean(name = "repairService")
    CommandLineRunner commandLineRunner(RepairService1 repairService1, RepairService2 repairService2) {
        return args -> {
          repairService1.setLaptopConfiguration();
          repairService1.displayLaptopConfig();

          repairService2.setLaptopConfig();
          repairService2.displayLaptop();
        };
    }
}
