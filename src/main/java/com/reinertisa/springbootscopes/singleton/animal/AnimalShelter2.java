package com.reinertisa.springbootscopes.singleton.animal;

import org.springframework.stereotype.Service;

@Service
public class AnimalShelter2 {

    private final EmailSender emailSender;

    public AnimalShelter2(EmailSender emailSender) {
        this.emailSender = emailSender;
    }

    public void sendEmail(String to, String from, String body) {
        emailSender.sendEmail(to, from, body);
    }
}
