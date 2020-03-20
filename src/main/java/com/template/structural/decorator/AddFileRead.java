package com.template.structural.decorator;

public class AddFileRead extends DecoratorFile {

    public AddFileRead(File file) {
        super(file);
    }

    @Override
    public void read() {
        file.read();
        System.out.println("save");
    }

}
