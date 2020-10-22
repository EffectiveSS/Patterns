package com.template.structural.adapter;

public class Adapter implements IAdapter {

    private final Socket socket = new Socket();

    @Override
    public Volt get120Volt() {
        return socket.getVolt();
    }

    @Override
    public Volt get12Volt() {
        return convertVolt(socket.getVolt(),10);
    }

    @Override
    public Volt get3Volt() {
        return convertVolt(socket.getVolt(),40);
    }

    private Volt convertVolt(Volt volt, int n) {
        return new Volt(volt.getVolts() / n);
    }

}
