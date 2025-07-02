package com.reinertisa.springbootscopes.prototype.service;


import org.springframework.context.ApplicationContext;
import org.springframework.stereotype.Service;

@Service
public class ServiceA {
    private final ApplicationContext applicationContext;

    public ServiceA(ApplicationContext context) {
        this.applicationContext = context;
    }

    public void usePrototypeBean() {
        MyPrototypeBean bean = applicationContext.getBean(MyPrototypeBean.class);
        bean.doSomething();
    }
}
