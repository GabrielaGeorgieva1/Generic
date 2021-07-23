package com.telerikacademy.oop;

import com.telerikacademy.oop.enums.Color;

public class Circle extends Shape {
    private final double radius;

    public Circle(Color color, double radius) {
        super(color);
        this.radius = radius;
    }

    public double getRadius() {
        return radius;
    }

    @Override
    protected double getArea() {
        return Math.PI * radius * radius;
    }
}
