package com.telerikacademy;


import com.telerikacademy.techcomposition.Keyboard;
import com.telerikacademy.techcomposition.Mobile;
import com.telerikacademy.techcomposition.PC;
import com.telerikacademy.techcomposition.Satellite;

public class Main {

    public static void main(String[] args) {

        Keyboard keyboard = new Keyboard();
        Satellite orbitalOne = new Satellite("OrbitalOne");
        Mobile samsung = new Mobile("Samsung");
        PC server = new PC("Server");
        PC gaming = new PC("Gaming", keyboard);

        System.out.println();
        orbitalOne.printInfo();
        System.out.println();
        samsung.printInfo();
        System.out.println();
        gaming.printInfo();
        System.out.println();
        server.printInfo();
    }
}
