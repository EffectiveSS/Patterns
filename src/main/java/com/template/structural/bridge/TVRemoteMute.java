package com.template.structural.bridge;

public class TVRemoteMute extends RemoteButton {

    public TVRemoteMute(Remote device) {
        super(device);
    }

    @Override
    public void buttonFivePressed() {
        System.out.println("TV was muted");
    }
}
