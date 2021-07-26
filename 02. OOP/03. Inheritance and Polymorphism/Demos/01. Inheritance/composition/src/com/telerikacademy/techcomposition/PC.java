package com.telerikacademy.techcomposition;

public class PC {

    private final CPU cpu;
    private final String model;
    private Keyboard keyboard;

    public PC(String model, Keyboard keyboard) {
        CPU cpu = new CPU(5, this);
        this.keyboard = keyboard;
        this.model = model;
        this.cpu = cpu;
    }

    public PC(String model) {
        CPU cpu = new CPU(7, this, "Server");
        this.model = model;
        this.cpu = cpu;
    }

    public void printInfo(){
        System.out.printf("PC %s has a CPU with following params:%n" +
                        "GHz:%.0f %n" +
                        "Width: %.0f %n" +
                        "Length: %.0f %n" +
                        "Speciality: %s %n"
                , model, cpu.getGHz(), cpu.getWidth(), cpu.getLength(), cpu.getSpeciality());
    }
}


