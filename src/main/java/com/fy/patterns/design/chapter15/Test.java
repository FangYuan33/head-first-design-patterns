package com.fy.patterns.design.chapter15;

public class Test {
    public static void main(String[] args) throws Throwable {
        EncAndDecHandler encAndDecHandler = new EncAndDecHandler();
        LogHandler logHandler = new LogHandler();
        ExceptionHandler exceptionHandler = new ExceptionHandler();

        // 封装责任链
        encAndDecHandler.setNextHandler(logHandler).setNextHandler(exceptionHandler);

        // 开始执行！
        System.out.println(encAndDecHandler.handler("入参"));
    }
}
