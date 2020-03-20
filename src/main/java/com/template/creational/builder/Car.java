package com.template.creational.builder;

public class Car {
    private String name;
    private int wheels;
    private int maxSpeed;
    private long cost;

    private Car (Builder builder) {
        this.name = builder.name;
        this.wheels = builder.wheels;
        this.maxSpeed = builder.maxSpeed;
        this.cost = builder.cost;
    }

    public String getName() {
        return name;
    }

    public int getWheels() {
        return wheels;
    }

    public int getMaxSpeed() {
        return maxSpeed;
    }

    public long getCost() {
        return cost;
    }

    static class Builder {
        private String name;
        private int wheels = 4;
        private int maxSpeed = 150;
        private long cost;

        public Builder(String name, long cost) {
            this.name = name;
            this.cost = cost;
        }

        public Builder setWheels(int wheels) {
            this.wheels = wheels;
            return this;
        }

        public Builder setMaxSpeed(int maxSpeed) {
            this.maxSpeed = maxSpeed;
            return this;
        }

        public Car build() {
            return new Car(this);
        }
    }
}
