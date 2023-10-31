package com.app.obiektowosc_2_niemutowalnosc;

public class Person2 {
    private final String name;
    private final int age;

    public Person2(String name, int age) {
        this.name = name;
        this.age = age;
    }

    public Person2 withName(String newName) {
        return new Person2(newName, age);
    }
}
