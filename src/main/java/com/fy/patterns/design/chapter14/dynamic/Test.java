package com.fy.patterns.design.chapter14.dynamic;

import java.lang.reflect.Proxy;

public class Test {
    public static void main(String[] args) {
        PersonBean personBean = new PersonBeanImpl();

        PersonBean proxy = getProxy(personBean);

        proxy.setName("小王");
        System.out.println(proxy.getName());
        proxy.setGrade(1);
    }

    private static PersonBean getProxy(PersonBean personBean) {
        return (PersonBean) Proxy.newProxyInstance(personBean.getClass().getClassLoader(),
                personBean.getClass().getInterfaces(), new OwnerInvocationHandler(personBean));
    }
}
