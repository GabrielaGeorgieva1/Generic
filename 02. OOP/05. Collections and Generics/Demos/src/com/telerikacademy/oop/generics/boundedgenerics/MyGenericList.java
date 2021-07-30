package com.telerikacademy.oop.generics.boundedgenerics;

public interface MyGenericList<E> extends Iterable<E> {

    void add(E element);

    E get(int index);
}
