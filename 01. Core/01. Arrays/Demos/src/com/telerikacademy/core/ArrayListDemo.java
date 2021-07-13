package com.telerikacademy.core;

import java.util.ArrayList;
import java.util.Scanner;

public class ArrayListDemo {

    public static void main(String[] args) {
        // initialize empty array list (there are no elements at all)
        ArrayList<Integer> arrayList1 = new ArrayList<>();

        // add five elements in the array list
        arrayList1.add(1);
        arrayList1.add(2);
        arrayList1.add(3);
        arrayList1.add(4);
        arrayList1.add(5);

        System.out.println(arrayList1);
        System.out.println(arrayList1.size());

        System.out.println("Removing");
        arrayList1.remove(Integer.valueOf(3));

        System.out.println(arrayList1);
        System.out.println(arrayList1.size());

        // change element at index
        arrayList1.set(1, 20);

        // initialize array list with 5 elements and values {0, 2, 4, 6, 8}
        ArrayList<Integer> arrayList2 = new ArrayList<>();
        for (int i = 0; i < 5; i++) {
            arrayList2.add(i * 2);
        }

        // initialize array list from the console where all elements are entered on a single line e.g.
        // 1 2 3 4 5
        System.out.println("Enter array on a single line using space for delimiter:");
        Scanner scanner = new Scanner(System.in);
        String line = scanner.nextLine();
        String[] strArray = line.split(" ");
        ArrayList<Integer> arrayList3 = new ArrayList<>();
        for (int i = 0; i < strArray.length; i++) {
            arrayList3.add(Integer.parseInt(strArray[i]));
        }

        // print array on the console
        for (int i = 0; i < arrayList3.size(); i++) {
            System.out.printf("%d ", arrayList3.get(i));
        }
        System.out.println();

        //print array on the console
        System.out.println(arrayList3);

        System.out.println("Loops demo:");
        ArrayList<String> words = new ArrayList<>();

        words.add("Apple");
        words.add("Banana");
        words.add("Poison");
        words.add("Grapefruit");

        // will print Apple, Banana
        for (int i = 0; i < words.size(); i++) {
            if (words.get(i).equals("Poison")) {
                break;
            }
            System.out.println("Eating " + words.get(i));
        }

        // will print Apple, Banana, Grapefruit
        for (int i = 0; i < words.size(); i++) {
            if (words.get(i).equals("Poison")) {
                continue;
            }
            System.out.println("Eating " + words.get(i));
        }

        for (int i = words.size() - 1; i >= 0; i--) {
            System.out.println(words.get(i));
        }

        for (int i = 1; i < words.size(); i = i * 2) {
            System.out.println(words.get(i));
        }

        for (String word : words) {
            System.out.println(word);
        }

        String input = scanner.nextLine();

        while (!input.equals("end")) {
            words.add(input);
            input = scanner.nextLine();
        }

        System.out.println(words);

        while (true) {
            input = scanner.nextLine();
            if (input.equals("end")) {
                break;
            }
            words.add(input);
        }

        System.out.println(words);

    }

}
