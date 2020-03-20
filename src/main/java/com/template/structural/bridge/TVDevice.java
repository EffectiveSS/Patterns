package com.template.structural.bridge;

public class TVDevice extends Remote {

    public TVDevice(int stateDevice, int maxSettings) {
        this.state = stateDevice;
        this.maxSetting = maxSettings;
    }

    @Override
    public void buttonOnePressed() {
        if (state + 1 <= maxSetting) {
            state++;
            System.out.println("Channel up");
        }
    }

    @Override
    public void buttonTwoPressed() {
        if (state - 1 >= 0) {
            state--;
            System.out.println("Channel down");
        }
    }
}
