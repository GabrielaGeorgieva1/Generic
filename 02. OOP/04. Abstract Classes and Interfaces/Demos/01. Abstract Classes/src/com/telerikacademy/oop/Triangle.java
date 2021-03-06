package com.telerikacademy.oop;

import com.telerikacademy.oop.enums.Color;

public class Triangle extends Shape {
    private final double base;
    private final double height;

    public Triangle(Color color, double base, double height) {
        super(color);
        this.base = base;
        this.height = height;
    }

    public double getBase() {
        return base;
    }

    public double getHeight() {
        return height;
    }

    @Override
    protected double getArea() {
        return base * height / 2;
    }

    //todo implement methods - use circle as a template
    @Override
    protected String getShapeName() {
        return null;
    }

    @Override
    protected String additionalInfo() {
        return null;
    }

    public void displayInfo() {
        System.out.println("test");
    }
}
