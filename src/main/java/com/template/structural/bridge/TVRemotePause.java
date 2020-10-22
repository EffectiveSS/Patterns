package com.template.structural.bridge;

public class TVRemotePause extends RemoteButton {

    public TVRemotePause(Remote device) {
        super(device);
    }

    @Override
    public void buttonFivePressed() {
        System.out.println("TV was paused");
    }

}
