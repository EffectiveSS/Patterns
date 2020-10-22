package com.template.structural.adapter;

public class Socket {

    public Volt getVolt() {
        return new Volt(120);
    }

}