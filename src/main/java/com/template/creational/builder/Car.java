package com.template.creational.builder;

public class Car {

    private String name;
    private Integer wheels;
    private Integer maxSpeed;
    private Long cost;

    public Car() {

    }

    public Car(String name, Integer wheels, Integer maxSpeed, Long cost) {
        this.name = name;
        this.wheels = wheels;
        this.maxSpeed = maxSpeed;
        this.cost = cost;
    }

    public static CarBuilder builder() {
        return new CarBuilder();
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

    public void setName(String name) {
        this.name = name;
    }

    public void setWheels(Integer wheels) {
        this.wheels = wheels;
    }

    public void setMaxSpeed(Integer maxSpeed) {
        this.maxSpeed = maxSpeed;
    }

    public void setCost(Long cost) {
        this.cost = cost;
    }

    @Override
    public String toString() {
        return "Name: " + this.name + ", Wheels: " + this.wheels +
                ", Max speed: " + this.maxSpeed + ", Cost: " + this.cost;
    }

    public static class CarBuilder {

        private String name;
        private Integer wheels;
        private Integer maxSpeed;
        private Long cost;

        private CarBuilder() {}

        public CarBuilder name(String name) {
            this.name = name;
            return this;
        }

        public CarBuilder wheels(Integer wheels) {
            this.wheels = wheels;
            return this;
        }

        public CarBuilder maxSpeed(Integer maxSpeed) {
            this.maxSpeed = maxSpeed;
            return this;
        }

        public CarBuilder cost(Long cost) {
            this.cost = cost;
            return this;
        }

        public Car build() {
            return new Car(this.name, this.wheels, this.maxSpeed, this.cost);
        }
    }
}
