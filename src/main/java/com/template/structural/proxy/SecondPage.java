package com.template.structural.proxy;

public class SecondPage implements MainPage {
    @Override
    public void showInfo() {
        System.out.println("Info about second page");
    }
}
