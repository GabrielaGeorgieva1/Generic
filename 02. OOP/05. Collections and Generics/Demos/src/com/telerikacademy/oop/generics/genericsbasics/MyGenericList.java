package com.telerikacademy.oop.generics.genericsbasics;

public interface MyGenericList<E> extends Iterable<E> {

    void add(E element);

    E get(int index);
}
