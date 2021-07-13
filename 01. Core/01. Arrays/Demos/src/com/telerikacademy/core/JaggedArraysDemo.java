package com.telerikacademy.core;

import java.util.Scanner;

public class JaggedArraysDemo {

    public static void main(String[] args) {
        // initialize jagged array with values
        // 1 2 3
        // 4 5
        // 6 7 8 9
        int[][] jaggedArray1 = {
                {1, 2, 3},
                {4, 5},
                {6, 7, 8, 9}
        };

        // подмяна:
        jaggedArray1[0] = new int[]{6, 3, 2, 1};

        // indices:    0  1
        int[] array = {4, 5};
        System.out.println(array[0]); // 4
        System.out.println(array[1]); // 5
        // добавяне:
        array[2] = 10;

        // initialize jagged array from the console where rows count is on first line and each row is entered on a new line on the console e.g.
        // 3
        // 1 2 3
        // 4 5
        // 6 7 8 9
        System.out.println("Enter matrix size and then each row on a new line:");
        Scanner scanner = new Scanner(System.in);
        String line = scanner.nextLine();
        int rows = Integer.parseInt(line);
        int[][] jaggedArray2 = new int[rows][]; // {{1, 2, 3}, {4, 5}, {}}
        for (int i = 0; i < rows; i++) {
            line = scanner.nextLine();
            String[] strArr = line.split(" ");
            jaggedArray2[i] = new int[strArr.length];
            for (int j = 0; j < strArr.length; j++) {
                jaggedArray2[i][j] = Integer.parseInt(strArr[j]);
            }
        }

        // jaggedArray2 = {
        //   {1, 2, 3},
        //   {4, 5},
        //   {6, 7, 8, 9}
        // };
        // print jagged array on the console
        for (int row = 0; row < jaggedArray2.length; row++) {
            for (int col = 0; col < jaggedArray2[row].length; col++) {
                System.out.printf("%d ", jaggedArray2[row][col]);
            }
            System.out.println();
        }
    }

}
