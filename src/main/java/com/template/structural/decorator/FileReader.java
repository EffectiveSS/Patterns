package com.template.structural.decorator;

public class FileReader implements File {

    @Override
    public void read() {
        System.out.println("read");
    }

}
