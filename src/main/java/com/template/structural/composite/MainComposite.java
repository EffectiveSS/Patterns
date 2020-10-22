package com.template.structural.composite;

public class MainComposite {

    public static void main(String[] args) {
        File text1 = new File("text1.txt");
        File text2 = new File("text2.txt");
        File text3 = new File("text3.txt");

        Folder folder1 = new Folder("folder1");
        Folder folder2 = new Folder("folder2");

        Folder folder = new Folder("main_folder");

        folder1.add(text1);
        folder1.add(text2);

        folder2.add(text3);

        folder.add(folder1);
        folder.add(folder2);

        folder.read();
    }

}
