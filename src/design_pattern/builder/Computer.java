package design_pattern.builder;

import java.sql.Connection;

public class Computer {
    private String CPU;
    private String RAM;
    private String storage;
    private String graphicsCard;
    private boolean isGamingPC;

    private Computer(Builder builder) {
        CPU = builder.CPU;
        RAM = builder.RAM;
        storage = builder.storage;
        graphicsCard = builder.graphicsCard;
        isGamingPC = builder.isGamingPC;
    }
    public static class Builder{
        private String CPU;
        private String RAM;
        private String storage;
        private String graphicsCard;
        private boolean isGamingPC;

        public Builder setCpu(String CPU) {
            this.CPU = CPU;
            return this;
        }

        public Builder setRam(String RAM) {
            this.RAM = RAM;
            return this;
        }

        public Builder setStorage(String storage) {
            this.storage = storage;
            return this;
        }
        public Builder setGraphicsCard(String graphicsCard) {
            this.graphicsCard = graphicsCard;
            return this;
        }
        public Builder setGamingPC(boolean  isGamingPC) {
            this.isGamingPC = isGamingPC;
            return this;
        }

        public Computer build(){
            return new Computer(this);
        }
    }
}
