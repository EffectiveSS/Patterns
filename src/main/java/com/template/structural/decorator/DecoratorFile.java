package com.template.structural.decorator;

public abstract class DecoratorFile implements File {

    protected File file;

    public DecoratorFile(File file) {
        this.file = file;
    }

    public abstract void read();

}
