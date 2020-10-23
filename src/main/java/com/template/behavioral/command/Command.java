package com.template.behavioral.command;

import java.util.ArrayList;
import java.util.List;

public class Command {

    private final List<Activity> commands;

    public Command() {
        commands = new ArrayList<>();
    }

    public void addCommand(Activity activity) {
        commands.add(activity);
    }

    public void executeCommand() {
        commands.forEach(Activity::work);
    }

}
