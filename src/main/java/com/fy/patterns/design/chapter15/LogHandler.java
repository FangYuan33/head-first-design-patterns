package com.fy.patterns.design.chapter15;

public class LogHandler extends AbstractHandler {
    public Object handler(String param) throws Throwable {
        String in = param + " 处理入参日志";

        String out = (String) this.doChainProcess(in);

        return out + " 处理出参日志";
    }
}
