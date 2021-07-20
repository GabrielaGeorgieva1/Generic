package com.telerikacademy.oop;

public class Main {
    public static void main(String[] args) {
        Person person1 = new Person();
        person1.setName("John");
        person1.sayName();
        // Hi, my name is John.

        Person person2 = new Person("Jill", -10);
        person2.sayName();
        // Hi, my name is Jill.
    }
}
