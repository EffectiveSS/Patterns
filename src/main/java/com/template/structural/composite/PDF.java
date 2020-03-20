package com.template.structural.composite;

public class PDF extends File {

    public PDF(String name) {
        super(name);
        setExtension();
    }

    @Override
    protected void setExtension() {
        extension = ".pdf";
    }

}
