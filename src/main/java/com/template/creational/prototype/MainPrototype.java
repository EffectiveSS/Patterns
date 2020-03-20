package com.template.creational.prototype;

public class MainPrototype {
    public static void main(String[] args) {
        Robot robot1 = new Robot("Volly", 10);
        Robot robot2 = robot1.copy();
        robot2.setStrong(100);
        System.out.println(robot1.getName() + "\t" + robot1.getStrong());
        System.out.println(robot2.getName() + "\t" + robot2.getStrong());
    }
}
