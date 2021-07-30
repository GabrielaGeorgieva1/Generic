package com.telerikacademy.oop.generics.boundedgenerics;

public class Person {
    private final String name;
    private final int age;

    public Person(String name, int age) {
        this.name = name;
        this.age = age;
    }

    @Override
    public String toString() {
        return String.format("%s (%d years old)", name, age);
    }
}
