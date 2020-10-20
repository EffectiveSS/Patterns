package com.template.creational.prototype;

import org.openjdk.jol.vm.VM;

import java.math.BigInteger;

public class MainPrototype {

    public static void main(String[] args) {

        Robot robot1 = new Robot("Volly", 10);
        Robot robot2 = robot1.copy();
        System.out.println("Address: @" + Long.toHexString(VM.current().addressOf(robot1)) + " " + robot1.toString());
        System.out.println("Address: @" + Long.toHexString(VM.current().addressOf(robot2)) + " " + robot2.toString());

    }

}
