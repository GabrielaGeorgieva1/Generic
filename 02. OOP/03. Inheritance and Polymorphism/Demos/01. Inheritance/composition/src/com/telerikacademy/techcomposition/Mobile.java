package com.telerikacademy.techcomposition;

public class Mobile {

    private final CPU cpu;
    private final String model;

    public Mobile(String model) {
        CPU cpu = new CPU(2, this);
        this.model = model;
        this.cpu = cpu;
    }



    public void printInfo(){
        System.out.printf("Mobile %s has a CPU with following params:%n" +
                        "GHz:%.0f %n" +
                        "Width: %.0f %n" +
                        "Length: %.0f %n" +
                        "Speciality: %s %n"
                , model, cpu.getGHz(), cpu.getWidth(), cpu.getLength(), cpu.getSpeciality());
    }


}
