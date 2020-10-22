package com.template.structural.composite;

import java.util.HashSet;
import java.util.Set;

public abstract class FileFolder {

    private final String name;

    public FileFolder(String name) {
        this.name = name;
    }

    public String getName() {
        return name;
    }

    abstract void read();

}
