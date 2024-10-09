package com.fy.patterns.design.builder;

/**
 * 建造指挥者
 *
 * @author FangYuan
 * @since 2024-10-09 17:29:45
 */
public class Director {

    private final ComputerProduct.Builder builder;

    public Director(ComputerProduct.Builder builder) {
        this.builder = builder;
    }

    public ComputerProduct highPerformancePC() {
        return builder.cpu("High-end Gaming CPU").ram("16GB Gaming RAM")
                .storage("1TB SSD").graphicsCard("High-end Gaming Graphics Card").build();
    }

    public ComputerProduct lowPerformancePC() {
         return builder.cpu("Low-end Gaming CPU").ram("4GB Gaming RAM")
                 .storage("16GB SSD").graphicsCard("Low-end Gaming Graphics Card").build();
    }

}
