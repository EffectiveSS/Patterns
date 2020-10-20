package com.template.creational.prototype;

/**
 * Shallow copy
 */
public class Robot1 implements Prototype {

    private String name;
    private Integer strong;

    public Robot1(String name, int strong) {
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
    public Robot1 copy() {
        return new Robot1(this.name, this.strong);
    }

}
