package com.template.behavioral.mediator;

import java.util.HashSet;
import java.util.LinkedHashSet;
import java.util.Set;
import java.util.TreeSet;

public class Sender implements Mediator {

    private final Set<Colleague> colleagues;

    public Sender() {
        colleagues = new LinkedHashSet<>();
    }

    public boolean addColleague(Colleague colleague) {
        return colleagues.add(colleague);
    }

    @Override
    public void sendMessageTo(Colleague colleague, String message) {
        colleagues.stream()
                .filter(person -> person != colleague)
                .forEach(person -> person.addMessage(message));
    }

    public Set<Colleague> getColleagues() {
        return colleagues;
    }

}
