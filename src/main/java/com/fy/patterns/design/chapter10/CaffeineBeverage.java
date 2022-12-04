package com.fy.patterns.design.chapter10;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

/**
 * 咖啡因饮料
 */
public abstract class CaffeineBeverage {

    /**
     * 准备一份饮料的模板方法，定义了步骤
     */
    public final void prepareRecipe() {
        boilWater();
        brew();
        pourInCup();
        if (needCondiments()) {
            addCondiments();
        }
    }

    private void boilWater() {
        System.out.println("将水煮沸");
    }

    /**
     * 冲泡
     */
    protected abstract void brew();

    private void pourInCup() {
        System.out.println("倒杯子里儿");
    }

    /**
     * 加点儿料
     */
    protected abstract void addCondiments();

    /**
     * 钩子方法，来控制是否加料儿
     */
    protected boolean needCondiments() {
        String answer = askFor();

        return "y".equals(answer);
    }

    /**
     * 询问顾客加料的需求
     */
    private String askFor() {
        System.out.println("加点儿啥吗？ y/n");

        String answer;
        try (BufferedReader reader = new BufferedReader(new InputStreamReader(System.in))) {
            answer = reader.readLine();
        } catch (IOException e) {
            throw new RuntimeException(e);
        }

        return answer;
    }
}
