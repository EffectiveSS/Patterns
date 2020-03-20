package com.template.creational.prototype;

public class Robot implements Prototype {
    private String name;
    private Integer strong;

    public Robot(String name, int strong) {
        this.name = name;
        this.strong = strong;
    }

    public void setName(String name) {
        this.name = name;
    }

    public void setStrong(Integer strong) {
        this.strong = strong;
    }

    public String getName() {
        return name;
    }

    public Integer getStrong() {
        return strong;
    }

    @Override
    public Robot copy() {
        return new Robot(this.name, this.strong);
    }
}
