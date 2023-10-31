package com.app.obiektowosc_4_tda;

public class Person4 {
    private final String name;
    private final int age;

    public Person4(String name, int age) {
        this.name = name;
        this.age = age;
    }

    public int getAge() {
        return age;
    }

    public boolean isAdult() {
        return age >= 18;
    }
}
