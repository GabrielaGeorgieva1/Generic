package com.telerikacademy.oop.generics.genericsandwildcards;

import java.util.LinkedList;

public class GenericVsWildcards {

    // Both mergeWithGenerics and mergeWithWildcard are correct but mergeWithWildcard is more readable.

    public static <T1, T2 extends T1> void mergeWithGenerics(LinkedList<T1> destination, LinkedList<T2> source) {
        // merge source into destination
    }

    public static <T> void mergeWithWildcard(LinkedList<T> destination, LinkedList<? extends T> source) {
        // merge source element into destination
    }

}
