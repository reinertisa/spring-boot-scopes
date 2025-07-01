package com.reinertisa.springbootscopes.prototype.user;

import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.Configuration;

import java.util.Arrays;
import java.util.List;

@Configuration
public class MyPhoneConfig {

    private final ApplicationContext context;

    public MyPhoneConfig(ApplicationContext context) {
        this.context = context;
    }

    public void assignLaptopsToStudent(User user) {
        Phone phone1 = context.getBean(Phone.class);
        phone1.setBrand("Apple");
        phone1.setModel("IPhone 15");

        Phone phone2 = context.getBean(Phone.class);
        phone2.setBrand("Google");
        phone2.setModel("Pixel - 8");

        List<Phone> phones = Arrays.asList(phone1, phone2);

        user.setPhones(phones);
    }

}
