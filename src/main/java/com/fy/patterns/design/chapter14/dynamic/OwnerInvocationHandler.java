package com.fy.patterns.design.chapter14.dynamic;

import java.lang.reflect.InvocationHandler;
import java.lang.reflect.Method;

public class OwnerInvocationHandler implements InvocationHandler {

    /**
     * 被代理的对象
     */
    private PersonBean person;

    public OwnerInvocationHandler(PersonBean personBean) {
        this.person = personBean;
    }

    @Override
    public Object invoke(Object proxy, Method method, Object[] args) throws Throwable {
        try {
            if (method.getName().equals("setGrade")) {
                throw new IllegalAccessException("禁止操作");
            } else {
                return method.invoke(person, args);
            }
        } catch (Exception e) {
            e.printStackTrace();
        }

        return null;
    }
}
