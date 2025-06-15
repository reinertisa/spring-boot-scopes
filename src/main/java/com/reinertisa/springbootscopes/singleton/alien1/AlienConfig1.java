package com.reinertisa.springbootscopes.singleton.alien1;

import org.springframework.boot.CommandLineRunner;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.core.annotation.Order;

@Configuration
@Order(5)
public class AlienConfig1 {

    @Bean
    CommandLineRunner run(Alien1 alien1, Alien2 alien2, Laptop laptop) {
        return args -> {
            laptop.setId(10L);
            laptop.setBrand("Toshiba");
            alien1.show();

            laptop.setId(29L);
            laptop.setBrand("Sony");
            alien1.show();

            // laptop bean has mutable state so alien2 will print alien1 changes.
            // this could end up with cross-contaminated state, especially bad in
            // multithreaded environments like web apps,
            // so go with prototype scope or make alien stateless.
            alien2.show();
        };
    }
}
