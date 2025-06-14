package com.reinertisa.springbootscopes.prototype.service1;

import org.springframework.context.annotation.Scope;
import org.springframework.stereotype.Component;

@Component
@Scope("prototype")
public class MyPrototypeBean {
    public void doSomething() {
        System.out.println("New instance:" + this);
    }
}
