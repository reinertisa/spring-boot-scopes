package com.reinertisa.springbootscopes.singleton.email;

import org.springframework.boot.CommandLineRunner;
import org.springframework.core.annotation.Order;
import org.springframework.stereotype.Component;

@Component
@Order(3333)
public class AppEmailRunner implements CommandLineRunner {

    private final AlertService alertService;
    private final NotificationService notificationService;
    private final TestingService testingService;

    public AppEmailRunner(AlertService alertService, NotificationService notificationService,
                          TestingService testingService) {
        this.alertService = alertService;
        this.notificationService = notificationService;
        this.testingService = testingService;
    }

    @Override
    public void run(String... args) throws Exception {

        alertService.sendAlert();
        notificationService.notifyUser();
        testingService.sendAllNotifications();
    }
}
