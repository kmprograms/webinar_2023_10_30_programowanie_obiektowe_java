package com.app.obiektowosc_5_s.model;

/*
    W ponizszym przykładzie klasa Employee narusza zasadę SRP, ponieważ ma dwa różne powody do zmiany: zarządzanie
    pensją pracownika (calculateSalary) i zapisywanie pracownika do bazy danych (saveEmployee). Lepiej byłoby to podzielić
    na dwie oddzielne klasy, aby przestrzegać zasady SRP:
*/

public class Employee {
    private final int id;
    private final String name;
    private final int salary;

    public Employee(int id, String name, int salary) {
        this.id = id;
        this.name = name;
        this.salary = salary;
    }

    public Employee withSalary(int newSalary) {
        return new Employee(id, name, newSalary);
    }

    /*public int calculateSalary(int bonus) {
        return salary + bonus;
    }*/

    /*public void saveEmployee() {
        // save to db
    }*/
}
