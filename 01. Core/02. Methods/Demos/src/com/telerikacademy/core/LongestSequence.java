package com.telerikacademy.core;

import java.io.ByteArrayInputStream;
import java.util.Scanner;

public class LongestSequence {

    private static void fakeInput() {
        String test = "3\n" +
                      "2\n" +
                      "2\n" +
                      "2";

        System.setIn(new ByteArrayInputStream(test.getBytes()));
    }

    public static void main(String[] args) {
        String[] numbers = readInput();
        int max = findLongestSequence(numbers);
        System.out.println(max);
    }

    public static int findLongestSequence(String[] numbers) {
        int max = 1, current = 1;

        for (int i = 0; i < numbers.length - 1; i++) {
            if (numbers[i].equals(numbers[i + 1])) {
                current++;
                max = Math.max(current, max);
            } else {
                current = 1;
            }
        }

        return max;
    }

    /**
     * This method reads a single integer N from the console
     * and then reads the next N integers. Returns an array of them.
     *
     * @return
     */
    public static String[] readInput() {
        Scanner scanner = new Scanner(System.in);
        int numberOfNumbers = Integer.parseInt(scanner.nextLine());
        String[] numbers = new String[numberOfNumbers];

        for (int i = 0; i < numberOfNumbers; i++) {
            numbers[i] = scanner.nextLine();
        }

        return numbers;
    }

}
