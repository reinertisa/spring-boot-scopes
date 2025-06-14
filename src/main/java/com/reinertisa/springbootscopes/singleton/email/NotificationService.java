package com.reinertisa.springbootscopes.singleton.email;

import org.springframework.stereotype.Service;

@Service
public class NotificationService {
    private final EmailSender emailSender;

    public NotificationService(EmailSender emailSender) {
        this.emailSender = emailSender;
    }

    public void notifyUser() {
        emailSender.send("test@example.com", "You have a new notification.");
    }
}
