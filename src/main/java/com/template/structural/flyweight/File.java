package com.template.structural.flyweight;

public class File {
    private String name;

    public File(String name) {
        this.name = name;
    }

    public static File getFile(String name) {
        return FlyweightName.getFlyweightName().isName(name);
    }
}
