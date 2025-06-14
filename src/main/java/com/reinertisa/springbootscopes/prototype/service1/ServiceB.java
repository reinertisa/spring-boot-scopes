package com.reinertisa.springbootscopes.prototype.service1;

import org.springframework.beans.factory.ObjectProvider;
import org.springframework.stereotype.Service;

@Service
public class ServiceB {
    private final ObjectProvider<MyPrototypeBean> prototypeBeanProvider;

    public ServiceB(ObjectProvider<MyPrototypeBean> prototypeBeanProvider) {
        this.prototypeBeanProvider = prototypeBeanProvider;
    }

    public void usePrototypeBean() {
        MyPrototypeBean bean = prototypeBeanProvider.getObject();
        bean.doSomething();
    }
}
