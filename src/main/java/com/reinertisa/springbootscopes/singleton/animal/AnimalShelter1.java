package com.reinertisa.springbootscopes.singleton.animal;

import org.springframework.stereotype.Service;

@Service
public class AnimalShelter1 {

    private final EmailSender emailSender;

    public AnimalShelter1(EmailSender emailSender) {
        this.emailSender = emailSender;
    }

    public void sendEmail(String to, String from, String title) {
        emailSender.sendEmail(to, from, title);
    }
}
