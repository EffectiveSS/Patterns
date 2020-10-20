package com.template.creational.singleton;

import org.openjdk.jol.vm.VM;

public class MainSingleton {

    public static void main(String[] args) {
        LazySingleton s1 = LazySingleton.getSingleton();
        LazySingleton s2 = LazySingleton.getSingleton();

        System.out.println("Address: @" + Long.toHexString(VM.current().addressOf(s1)) + " " + s1.toString());
        System.out.println("Address: @" + Long.toHexString(VM.current().addressOf(s2)) + " " + s2.toString());

        s2.setName("New Singleton");

        System.out.println("Address: @" + Long.toHexString(VM.current().addressOf(s1)) + " " + s1.toString());
        System.out.println("Address: @" + Long.toHexString(VM.current().addressOf(s2)) + " " + s2.toString());
    }

}
