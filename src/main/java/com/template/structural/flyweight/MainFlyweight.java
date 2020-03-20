package com.template.structural.flyweight;

public class MainFlyweight {
    public static void main(String[] args) {
        FlyweightName fwn = FlyweightName.getFlyweightName();
        File file1 = File.getFile("file");
        File file2 = File.getFile("file");

        System.out.println(file1 == file2);
    }
}
