package com.app.obiektowosc_1_inicjowanie_obiektow;

public class Person1 {
    private String name;
    private int age;

    public Person1(String name, int age) {
        this.name = name;
        this.age = age;
    }

    public static Person1 withValidation(String name, int age) {
        if (name == null || name.length() < 4) {
            throw new IllegalArgumentException("Name is not correct");
        }

        return new Person1(name, age);
    }

    public static Person1 of(String personStr) {
        var items = personStr.split(" ");
        return new Person1(items[0], Integer.parseInt(items[1]));
    }
}
