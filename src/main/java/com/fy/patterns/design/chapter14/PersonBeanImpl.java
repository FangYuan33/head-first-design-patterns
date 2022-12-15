package com.fy.patterns.design.chapter14;

public class PersonBeanImpl implements PersonBean {

    private String name;

    private Integer grade;

    @Override
    public void setName(String name) {
        this.name = name;
    }

    @Override
    public String getName() {
        return name;
    }

    /**
     * 在代理中我们设置该方法被保护，禁止操作
     */
    @Override
    public void setGrade(Integer grade) {
        this.grade = grade;
    }

    @Override
    public Integer getGrade() {
        return grade;
    }
}
