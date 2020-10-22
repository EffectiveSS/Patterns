package com.template.structural.bridge;

public class MainBridge {

    public static void main(String[] args) {
        Remote tv = new TVDevice(5, 500);

        RemoteButton rb1 = new TVRemotePause(tv);
        RemoteButton rb2 = new TVRemoteMute(tv);

        rb1.buttonFivePressed();
        rb2.buttonFivePressed();
    }

}
