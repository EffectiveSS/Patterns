package com.template.structural.bridge;

public abstract class Remote {
    private final int minRange = 0;
    private final int maxRange = 100;

    protected int state;
    protected int maxSetting;
    protected int volume;

    public abstract void buttonOnePressed();
    public abstract void buttonTwoPressed();

    public void deviceFeedback() {
        if (state > maxSetting || state < 0) {
            System.out.println("On " + state);
        }
    }

    public void buttonThreePressed() {
        if (volume + 1 <= maxRange) {
            volume++;
        }
        printVolume();
    }

    public void buttonFourPressed() {
        if (volume - 1 >= minRange) {
            volume--;
        }
        printVolume();
    }

    private void printVolume() {
        System.out.println("Volume " + volume);
    }
}
