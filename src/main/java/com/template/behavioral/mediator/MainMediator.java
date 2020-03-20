package com.template.behavioral.mediator;

import java.util.List;

public class MainMediator {
    public static void main(String[] args) {
        Colleague colleague1 = new Colleague();
        Colleague colleague2 = new Colleague();
        Colleague colleague3 = new Colleague();
        Colleague colleague4 = new Colleague();
        Colleague colleague5 = new Colleague();

        colleague3.setSendMessage("hello");

        Sender sender = new Sender();
        sender.addColleague(colleague1);
        sender.addColleague(colleague2);
        sender.addColleague(colleague3);
        sender.addColleague(colleague4);
        sender.addColleague(colleague5);

        sender.sendMessageTo(colleague3, colleague3.getSendMessage());

        List<Colleague> list = sender.getColleagues();

        list.forEach(person -> System.out.println(person.getReceiveMessages()));
    }
}
