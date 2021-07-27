package com.telerikacademy.oop;

import com.telerikacademy.oop.enums.Color;

public abstract class Shape extends Object implements Colorable {
    private final Color color;

    public Shape(Color color) {
        this.color = color;
    }

    public Color getColor() {
        return color;
    }

    //all shapes must have area but Shape is too generic and we can't have any meaningful implementation here
    protected abstract double getArea();

    protected abstract String getShapeName();

    protected abstract String additionalInfo();

    @Override
    public String toString() {
        return String.format("%s with color: %s %s", getShapeName(), getColor(), additionalInfo());
    }
}
