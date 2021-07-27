package com.telerikacademy.oop;

import com.telerikacademy.oop.enums.Color;

public class Rectangle extends Shape {
    private final double width;
    private final double height;

    public Rectangle(Color color, double width, double height) {
        super(color);
        this.width = width;
        this.height = height;
    }

    public double getWidth() {
        return width;
    }

    public double getHeight() {
        return height;
    }

    @Override
    protected double getArea() {
        return width * height;
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
}
