package com.template.behavioral.mediator;

public class MainMediator {

    public static void main(String[] args) {
        Colleague colleague1 = new Colleague();
        Colleague colleague2 = new Colleague();
        Colleague colleague3 = new Colleague();
        Colleague colleague4 = new Colleague();
        Colleague colleague5 = new Colleague();

        colleague2.setSendMessage("hello");

        Sender sender = new Sender();
        sender.addColleague(colleague1);
        sender.addColleague(colleague2);
        sender.addColleague(colleague3);
        sender.addColleague(colleague4);
        sender.addColleague(colleague5);

        sender.sendMessageTo(colleague2, colleague2.getSendMessage());

        sender.getColleagues().forEach(person -> System.out.println(person.getReceiveMessages()));
    }

}
