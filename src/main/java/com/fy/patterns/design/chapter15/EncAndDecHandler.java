package com.fy.patterns.design.chapter15;

public class EncAndDecHandler extends AbstractHandler {
    public Object handler(String param) throws Throwable {
        String dec = param + " 解密";

        String o = (String) this.doChainProcess(dec);

        return o + " 加密";
    }
}
