package com.reinertisa.springbootscopes.singleton.human;

import org.springframework.boot.CommandLineRunner;
import org.springframework.core.annotation.Order;
import org.springframework.stereotype.Component;

@Component
@Order(6)
public class AppHumanRunner implements CommandLineRunner {
    private final Human human;

    public AppHumanRunner(Human human) {
        this.human = human;
    }
    @Override
    public void run(String... args) throws Exception {
        human.showTablets();
    }
}
