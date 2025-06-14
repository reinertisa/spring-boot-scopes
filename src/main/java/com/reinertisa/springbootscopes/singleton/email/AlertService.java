package com.reinertisa.springbootscopes.singleton.email;

import org.springframework.stereotype.Service;

@Service
public class AlertService {
    private final EmailSender emailSender;

    public AlertService(EmailSender emailSender) {
        this.emailSender = emailSender;
    }

    public void sendAlert() {
        emailSender.send("admin@example.com", "System alert triggered");
    }
}
