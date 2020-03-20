package com.template.behavioral.mediator;

import java.util.List;
import java.util.ArrayList;

public class Colleague {
    private boolean state;
    private List<String> receiveMessages;
    private String sendMessage;

    public Colleague() {
        receiveMessages = new ArrayList<String>();
    }

    public boolean addMessage(String message) {
        if (state) {
            receiveMessages.add(message);
        }

        return state;
    }

    public void trueState() {
        state = true;
    }

    public void falseState() {
        state = false;
    }

    public boolean getState() {
        return state;
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
