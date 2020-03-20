package com.template.structural.composite;

public class DOCX extends File {

    public DOCX(String name) {
        super(name);
        setExtension();
    }

    @Override
    protected void setExtension() {
        extension = ".docx";
    }
    
}
