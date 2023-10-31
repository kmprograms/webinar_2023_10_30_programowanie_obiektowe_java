package com.app.obiektowosc_2_niemutowalnosc;

public class App2 {
    public static void main(String[] args) {
        var p = new Person2("ADAM", 10);
        var p2 = p.withName("EWA");
        System.out.println(p);
        System.out.println(p2);
    }
}
