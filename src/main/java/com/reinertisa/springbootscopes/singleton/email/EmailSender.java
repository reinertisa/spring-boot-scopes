package com.reinertisa.springbootscopes.singleton.email;

import org.springframework.stereotype.Service;

@Service("sender2")
public class EmailSender {
    public void send(String to, String message) {
        System.out.println("Sending email to " + to + ": " + message);
    }
}
