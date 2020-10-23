package com.template.behavioral.mediator;

import java.util.ArrayList;
import java.util.List;

public class Colleague {

    private final List<String> receiveMessages;
    private String sendMessage;

    public Colleague() {
        receiveMessages = new ArrayList<>();
    }

    public void addMessage(String message) {
        receiveMessages.add(message);
    }

    public String getSendMessage() {
        return sendMessage;
    }

    public List<String> getReceiveMessages() {
        return receiveMessages;
    }

    public void setSendMessage(String sendMessage) {
        this.sendMessage = sendMessage;
    }

}
