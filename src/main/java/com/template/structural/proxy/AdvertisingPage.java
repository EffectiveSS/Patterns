package com.template.structural.proxy;

import java.util.Scanner;

public class AdvertisingPage implements MainPage {
    private final ContentPage secondPage;
    private final Scanner scanner = new Scanner(System.in);

    public AdvertisingPage() {
        this.secondPage = new ContentPage();
    }

    @Override
    public void loadPage() {
        do {
            System.out.println("Smartphone advertising");
            System.out.println("Write Close to continue: ");
        } while (!scanner.next().toLowerCase().equals("close"));

        System.out.println();

        secondPage.loadPage();
    }
}
