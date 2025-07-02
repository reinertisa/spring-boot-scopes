package com.reinertisa.springbootscopes.singleton.human;

import org.springframework.boot.CommandLineRunner;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.core.annotation.Order;


@Configuration
@Order(7)
public class HumanConfig {

    @Bean(name = "tablet1")
    public Tablet tablet1() {
        return new Tablet(1L, "Dell", "Thinkpad");
    }

    @Bean(name = "tablet2")
    public Tablet tablet2() {
        return new Tablet(2L, "IBM", "Lenovo");
    }

    @Bean(name = "tablet3")
    public Tablet tablet3() {
        return new Tablet(2L, "Toshiba", "XXL");
    }

    @Bean
    CommandLineRunner commandLineRunner(Human human) {
        return args -> {
            human.showTablets();
        };
    }
}
