package com.reinertisa.springbootscopes.singleton.alien2;

import org.springframework.boot.CommandLineRunner;
import org.springframework.core.annotation.Order;
import org.springframework.stereotype.Component;

@Component
@Order(7)
public class AppAlien2Runner implements CommandLineRunner {
    private final Alien3 alien3;

    public AppAlien2Runner(Alien3 alien3) {
        this.alien3 = alien3;
    }
    @Override
    public void run(String... args) throws Exception {
        alien3.showLaptops();
    }
}
