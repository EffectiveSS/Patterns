package com.template.structural.flyweight;

public class File {

    private final String name;

    public File(String name) {
        this.name = name;
    }

    public static File getFile(String name) {
        return FlyweightName.fwn.isName(name);
    }

}
