package com.template.behavioral.mediator;

import java.util.ArrayList;
import java.util.List;

public class Sender implements Mediator {
    private List<Colleague> colleagues;

    public Sender() {
        colleagues = new ArrayList<>();
    }

    public void addColleague(Colleague colleague) {
        if (colleagues.stream().noneMatch(person -> person == colleague)) {
            colleagues.add(colleague);
        }
    }

    @Override
    public void sendMessageTo(Colleague colleague, String message) {
        colleague.falseState();
        colleagues.stream()
                .filter(person -> person != colleague)
                .forEach(person -> {
                    person.trueState();
                    person.addMessage(message);
                });
    }

    public List<Colleague> getColleagues() {
        return colleagues;
    }
}
