package com.template.structural.proxy;

public class VirusProxy implements MainPage {
    private SecondPage secondPage;

    public VirusProxy() {
        this.secondPage = new SecondPage();
    }

    @Override
    public void showInfo() {
        System.out.println("add");
        secondPage.showInfo();
        System.out.println("Your data has been stolen");
    }
}
