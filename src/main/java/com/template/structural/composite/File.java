package com.template.structural.composite;

public abstract class File {
    private String name;
    protected String extension;

    public File(String name) {
        this.name = name;
    }

    public String getName() {
        return name;
    }

    public String getExtension() {
        return extension;
    }

    public void setName(String name) {
        this.name = name;
    }

    protected abstract void setExtension();
}
