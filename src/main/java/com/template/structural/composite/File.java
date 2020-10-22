package com.template.structural.composite;

public class File extends FileFolder {

    public File(String name) {
        super(name);
    }

    @Override
    void read() {
        System.out.println("File content " + getName());
    }

}
