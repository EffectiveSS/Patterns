package com.template.structural.adapter;

public class MainAdapter {

    public static void main(String[] args) {
        Adapter adapter = new Adapter();

        System.out.println(adapter.get3Volt().getVolts());
        System.out.println(adapter.get12Volt().getVolts());
        System.out.println(adapter.get120Volt().getVolts());
    }

}
