package com.telerikacademy.oop;

public class Person {
    private String name;
    private int age;

    public Person() {
        this("No name", 18);
    }

    public Person(String name, int age) {
        setName(name);
        setAge(age);
    }

    public void sayName() {
        System.out.printf("Hi, my name is %s.%n", name);
    }

    public void setName(String name) {
        if (name.length() < 3 || name.length() > 50) {
            throw new IllegalArgumentException();
        }
        this.name = name;
    }

    public void setAge(int age) {
        if (age <= 0) {
            throw new IllegalArgumentException();
        }
        this.age = age;
    }
}
