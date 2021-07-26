package com.telerikacademy.techcomposition;

public class CPU {

    private final double GHz;
    private final double width;
    private final double length;
    private final String speciality;

    //overloaded
    public CPU(double GHz, Mobile mobile) {
        this.GHz = GHz;
        // Create additional specifications for MOBILE.
        width = 10;
        length = 15;
        speciality = "Utilizing the ultra fast connection from 5G to communicate faster than ever before.";
    }

    public CPU(double GHz, PC pc) {
        this.GHz = GHz;
        // Create additional specifications for PC.
        width = 30;
        length = 30;
        speciality = "Gaming at max settings at max FPS always. Comes with a keyboard!";
    }

    public CPU(double GHz, Satellite satellite) {
        this.GHz = GHz;
        // Create additional specifications for Satellite.
        width = 45;
        length = 50;
        speciality = "Military-grade CPU for intelligence and reckon.";
    }

    public CPU(double GHz, PC pc, String server) {
        this.GHz = GHz;
        // Create additional specifications for Server.
        width = 45;
        length = 50;
        speciality = "High server capabilities CPU.";
    }


    public double getGHz() {
        return GHz;
    }

    public double getWidth() {
        return width;
    }

    public double getLength() {
        return length;
    }

    public String getSpeciality() {
        return speciality;
    }
}
