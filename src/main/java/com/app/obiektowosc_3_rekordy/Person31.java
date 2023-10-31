package com.app.obiektowosc_3_rekordy;

import java.util.Objects;

public class Person31 {
    private final String name;
    private final int age;

    public Person31(String name, int age) {
        this.name = name;
        this.age = age;
    }

    public String getName() {
        return name;
    }

    public int getAge() {
        return age;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;

        Person31 person31 = (Person31) o;

        if (age != person31.age) return false;
        return Objects.equals(name, person31.name);
    }

    @Override
    public int hashCode() {
        int result = name != null ? name.hashCode() : 0;
        result = 31 * result + age;
        return result;
    }

    @Override
    public String toString() {
        return "Person31{" +
                "name='" + name + '\'' +
                ", age=" + age +
                '}';
    }
}
