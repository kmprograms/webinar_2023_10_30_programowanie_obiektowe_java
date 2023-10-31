package com.app.obiektowosc_7_l.right;

public class Sparrow extends Bird implements Flyable {
    @Override
    public void makeNoise() {
        System.out.println("SPARR");
    }

    @Override
    public void fly() {
        System.out.println("SPRARROW FLIES!");
    }
}
