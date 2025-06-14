package com.reinertisa.springbootscopes.singleton.animal;

import org.springframework.stereotype.Service;

@Service("sender1")
public class EmailSender {

    public void sendEmail(String to, String from, String body) {
        System.out.println(to + " " + from + " " + body);
    }
}
