package com.telerikacademy.core;

import java.util.Arrays;
import java.util.Scanner;

public class ArraysDemo {
    public static void main(String[] args) {
        // initialize array with 5 elements (all equal to 0) {0, 0, 0, 0, 0}
        int[] array1 = new int[5];

        // initialize array with 5 elements and values {1, 2, 3, 4, 5}
        int[] array2 = {1, 2, 3, 4, 5};

        // initialize array with 5 elements and values {0, 2, 4, 6, 8}
        int[] array3 = new int[5];
        for (int i = 0; i < 5; i++) {
            array3[i] = i * 2;
        }

        // initialize array from the console where size and each element is entered on a new line on the console e.g.
        // 5
        // 1
        // 2
        // 3
        // 4
        // 5
        System.out.println("Enter array size and then each element on a new line:");
        Scanner scanner = new Scanner(System.in);
        String line = scanner.nextLine();
        int size = Integer.parseInt(line);
        int[] array4 = new int[size];
        for (int i = 0; i < size; i++) {
            line = scanner.nextLine();
            array4[i] = Integer.parseInt(line);
        }

        // initialize array from the console where all elements are entered on a single line e.g.
        // 1 2 3 4 5
        System.out.println("Enter array on a single line using space for delimiter:");
        line = scanner.nextLine();
        String[] strArray = line.split(" "); // ["1", "2", "3", "4", "5"]
        int[] array5 = new int[strArray.length];
        for (int i = 0; i < strArray.length; i++) {
            array5[i] = Integer.parseInt(strArray[i]);
        }
        // array5 = [1, 2, 3, 4, 5]

        // print array on the console
        for (int i = 0; i < array5.length; i++) {
            System.out.printf("%d ", array5[i]);
        }
        System.out.println();

        //print array on the console
        System.out.println(Arrays.toString(array5));

        System.out.println("Hello");
        System.out.println("Todor");
        // Hello
        // Todor

        System.out.print("Hello");
        System.out.print("Todor");
        // HelloTodor

        String name = "Todor";
        System.out.printf("Hello %s %d %f %.2f %n", name, 25, 2.5000, 2.5000);
        // Hello Todor 25 2.5000 2.50

        int[] array = new int[2]; // int = 0, {0, 0}
        boolean[] booleans = new boolean[2]; // boolean = false {false, false}
        System.out.println(array[array.length - 1]);
    }
}
