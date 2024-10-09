package com.fy.patterns.design.builder;

/**
 * 电脑商品
 *
 * @author FangYuan
 * @since 2024-10-09 17:20:38
 */
public class ComputerProduct {

    private String cpu;

    private String ram;

    private String storage;

    private String graphicsCard;

    @Override
    public String toString() {
        return "ComputerProduct{" +
                "cpu='" + cpu + '\'' +
                ", ram='" + ram + '\'' +
                ", storage='" + storage + '\'' +
                ", graphicsCard='" + graphicsCard + '\'' +
                ", sn=" + this.hashCode() +
                '}';
    }

    public static class Builder {

        private final ComputerProduct computerProduct = new ComputerProduct();

        public Builder cpu(String cpu) {
            computerProduct.cpu = cpu;
            return this;
        }

        public Builder ram(String ram) {
            computerProduct.ram = ram;
            return this;
        }

        public Builder storage(String storage) {
            computerProduct.storage = storage;
            return this;
        }

        public Builder graphicsCard(String graphicsCard) {
            computerProduct.graphicsCard = graphicsCard;
            return this;
        }

        public ComputerProduct build() {
            check();
            return computerProduct;
        }

        private void check() {
            if (computerProduct.cpu == null || computerProduct.cpu.isEmpty()) {
                throw new IllegalArgumentException("cpu should not be null");
            }
            if (computerProduct.ram == null || computerProduct.ram.isEmpty()) {
                throw new IllegalArgumentException("ram should not be null");
            }
            if (computerProduct.storage == null || computerProduct.storage.isEmpty()) {
                throw new IllegalArgumentException("storage should not be null");
            }
            if (computerProduct.graphicsCard == null || computerProduct.graphicsCard.isEmpty()) {
                throw new IllegalArgumentException("graphicsCard should not be null");
            }
        }
    }
}
