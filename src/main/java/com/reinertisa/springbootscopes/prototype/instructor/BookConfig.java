package com.reinertisa.springbootscopes.prototype.instructor;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

@Configuration
public class BookConfig {

    @Bean
    Book book1() {
        return new Book("Tolstoy", "War and Peace");
    }

    @Bean
    Book book2() {
        return new Book("Kafka", "Transformation");
    }

    @Bean
    Book book3() {
        return new Book("Umberto Eco", "Red Monday");
    }
}
