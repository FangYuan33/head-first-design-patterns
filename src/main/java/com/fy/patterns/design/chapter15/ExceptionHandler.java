package com.fy.patterns.design.chapter15;

public class ExceptionHandler extends AbstractHandler {
    public Object handler(String param) throws Throwable {
        try {
            return this.doChainProcess(param + " 异常处理");
        } catch (Exception e) {
            e.printStackTrace();
        }

        return this.doChainProcess(param + " 异常处理");
    }
}
