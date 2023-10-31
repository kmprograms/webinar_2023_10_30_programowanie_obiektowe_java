package com.app.obiektowosc_7_l.wrong;

public class Penguin extends Bird {
    @Override
    public void makeNoise() {
        System.out.println("PING PING");
    }

    @Override
    public void fly() {
        throw new UnsupportedOperationException("Can't fly!");
    }
}
