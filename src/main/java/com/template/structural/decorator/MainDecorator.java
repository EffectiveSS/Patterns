package com.template.structural.decorator;

public class MainDecorator {

    public static void main(String[] args) {
        File file = new AddFileRead(new FileReader());
        file.read();
    }

}
