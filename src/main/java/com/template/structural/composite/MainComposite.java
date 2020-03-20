package com.template.structural.composite;

public class MainComposite {
    public static void main(String[] args) {
        FileFolder folder1 = new FileFolder("folder1");
        folder1.addFile(new DOCX("docx1"));
        folder1.addFile(new DOCX("docx1"));
        FileFolder folder2 = new FileFolder("folder2");
        folder2.addFile(new DOCX("docx3"));
        new PDF("pdf1");
    }
}
