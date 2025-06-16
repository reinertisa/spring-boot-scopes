package com.reinertisa.springbootscopes.prototype.laptop2;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

@Configuration
public class Laptop3Config {

    @Bean
    Laptop3 laptop3_1() {
        return new Laptop3("A", "a");
    }

    @Bean
    Laptop3 laptop3_2() {
        return new Laptop3("B", "b");
    }

    @Bean
    Laptop3 laptop3_3() {
        return new Laptop3("C", "c");
    }
}
