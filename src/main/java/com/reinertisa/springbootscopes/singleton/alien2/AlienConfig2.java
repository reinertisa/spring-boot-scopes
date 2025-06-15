package com.reinertisa.springbootscopes.singleton.alien2;

import org.springframework.boot.CommandLineRunner;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.core.annotation.Order;


@Configuration
@Order(6)
public class AlienConfig2 {

    @Bean
    public Laptop2 laptop2() {
        return new Laptop2(1L, "Dell", "Thinkpad");
    }

    @Bean
    public Laptop2 laptop3() {
        return new Laptop2(2L, "IBM", "Lenovo");
    }

    @Bean
    public Laptop2 laptop4() {
        return new Laptop2(2L, "Toshiba", "XXL");
    }

    @Bean("alien6")
    CommandLineRunner commandLineRunner(Alien3 alien3) {
        return args -> {
            alien3.showLaptops();
        };
    }
}
