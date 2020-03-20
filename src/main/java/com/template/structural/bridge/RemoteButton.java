package com.template.structural.bridge;

public abstract class RemoteButton {
    private Remote remote;

    public RemoteButton(Remote remote) {
        this.remote = remote;
    }

    public void buttonOnePressed() {
        remote.buttonOnePressed();
    }

    public void buttonTwoPressed() {
        remote.buttonTwoPressed();
    }

    public void deviceFeedback() {
        remote.deviceFeedback();
    }

    public abstract void buttonFivePressed();
}
