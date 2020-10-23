package com.template.behavioral.command;

public class MainCommand {

    public static void main(String[] args) {
        Command command = new Command();
        Activity firstActivity = new Run();
        Activity secondActivity = new Sleep();

        command.addCommand(firstActivity);
        command.addCommand(secondActivity);
        command.executeCommand();
    }

}
