package com.reinertisa.springbootscopes.singleton.email;

import org.springframework.stereotype.Service;

@Service
public class TestingService {

    private final NotificationService notificationService;
    private final AlertService alertService;

    public TestingService(NotificationService notificationService, AlertService alertService) {
        this.notificationService = notificationService;
        this.alertService = alertService;
    }

    public void sendAllNotifications() {
        notificationService.notifyUser();
        alertService.sendAlert();
    }
}
