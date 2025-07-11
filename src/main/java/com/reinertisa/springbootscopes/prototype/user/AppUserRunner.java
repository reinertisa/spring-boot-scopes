package com.reinertisa.springbootscopes.prototype.user;

import org.springframework.boot.CommandLineRunner;
import org.springframework.core.annotation.Order;
import org.springframework.stereotype.Component;

@Component
@Order(1)
public class AppUserRunner implements CommandLineRunner {
    private final User user;
    private final MyPhoneConfig myPhoneConfig;

    public AppUserRunner(User user, MyPhoneConfig myPhoneConfig) {
        this.user = user;
        this.myPhoneConfig = myPhoneConfig;
    }
    @Override
    public void run(String... args) throws Exception {
        myPhoneConfig.assignLaptopsToStudent(user);
        user.showPhones();
    }
}
