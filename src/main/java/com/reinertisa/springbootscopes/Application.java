package com.reinertisa.springbootscopes;

import com.reinertisa.springbootscopes.prototype.service1.ServiceA;
import com.reinertisa.springbootscopes.prototype.service1.ServiceB;
import com.reinertisa.springbootscopes.prototype.service2.RepairService1;
import com.reinertisa.springbootscopes.prototype.service2.RepairService2;
import com.reinertisa.springbootscopes.singleton.alien.Alien1;
import com.reinertisa.springbootscopes.singleton.alien.Alien2;
import com.reinertisa.springbootscopes.singleton.alien.Laptop;
import com.reinertisa.springbootscopes.singleton.animal.AnimalShelter1;
import com.reinertisa.springbootscopes.singleton.animal.AnimalShelter2;
import com.reinertisa.springbootscopes.singleton.email.AlertService;
import com.reinertisa.springbootscopes.singleton.email.NotificationService;
import com.reinertisa.springbootscopes.singleton.email.TestingService;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.Bean;

@SpringBootApplication
public class Application {

    public static void main(String[] args) {
        SpringApplication.run(Application.class, args);
    }

    @Bean
    CommandLineRunner commandLineRunner(NotificationService notificationService,
                                        AlertService alertService,
                                        TestingService testingService,
                                        ServiceA serviceA,
                                        ServiceB serviceB,
                                        AnimalShelter1 shelter1,
                                        AnimalShelter2 shelter2,
                                        RepairService1 repairService1,
                                        RepairService2 repairService2,
                                        Alien1 alien,
                                        Laptop laptop,
                                        Alien2 alien2
                                        ) {
        return args -> {
            notificationService.notifyUser();
            alertService.sendAlert();
            testingService.sendAllNotifications();
            serviceA.usePrototypeBean();
            serviceB.usePrototypeBean();
            shelter1.sendEmail("isa", "sade", "hi");
            shelter2.sendEmail("kristi", "sade", "hello");

            repairService1.displayLaptopConfig();
            repairService1.setLaptopConfiguration();
            repairService1.displayLaptopConfig();

            repairService2.displayLaptop();
            repairService2.setLaptopConfig();
            repairService2.displayLaptop();

            laptop.setId(10L);
            laptop.setBrand("Toshiba");
            alien.setLaptop(laptop);
            alien.show();

            laptop.setId(29L);
            laptop.setBrand("Sony");
            alien.show();

            // laptop bean has mutable state so alien2 will print alien1 changes.
            // this could end up with cross-contaminated state, especially bad in
            // multithreaded environments like web apps,
            // so go with prototype scope or make alien stateless.
            alien2.show();

        };
    }

}
