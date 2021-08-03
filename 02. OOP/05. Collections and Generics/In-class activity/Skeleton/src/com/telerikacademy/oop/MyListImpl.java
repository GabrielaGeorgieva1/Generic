package com.telerikacademy.oop;

import java.util.Iterator;
import java.util.StringJoiner;

public class MyListImpl<T> implements MyList<T> {

    private static final int Default_Length = 4;

    private T[] array;
    private int size;
    private int length_of_array;


    public MyListImpl() {
        array = (T[]) new Object[Default_Length];
        this.size = 0;
        this.length_of_array = Default_Length;
    }

    public MyListImpl(int length_of_array) {
        this.length_of_array = length_of_array;
        array = (T[]) new Object[length_of_array];
        this.size = 0;
    }

    @Override
    public int size() {
        return size;
    }

    @Override
    public int capacity() {
        return length_of_array;
    }

    @Override
    public void add(T element) {
        if (size < length_of_array) {
            array[size] = element;
            size++;
        } else {
            T[] secondArray = (T[]) new Object[length_of_array * 2];
            for (int i = 0; i < size; i++) {
                secondArray[i] = array[i];
            }
            secondArray[size] = element;
            this.length_of_array = length_of_array * 2;
            this.array = secondArray;
            size++;
        }
    }


    @Override
    public T get(int index) {
        return array[index];
    }

    @Override
    public int indexOf(T element) {
        int index = -1;
        for (int i = 0; i < size; i++) {
            if(array[i].equals(element)){
                index = i;
                break;
            }
        }
        return index;
    }

    @Override
    public int lastIndexOf(T element) {
        int index = -1;
        for (int i = size - 1; i >= 0; i--) {
            if(array[i].equals(element)){
                 index = i;
                 break;
            }
        }
        return index;
    }

    @Override
    public boolean contains(T element) {
        for (int i = 0; i < size; i++) {
            if (array[i].equals(element)) {
                return true;
            }
        }
        return false;
    }

    @Override
    public void removeAt(int index) {
        if(index > size){
            throw new ArrayIndexOutOfBoundsException("Index out of bounds");
        }
        T[] thereArray = (T[]) new Object[length_of_array - 1];
        int posicion = 0;
        for (int i = 0; i < thereArray.length; i++) {
            if(i == index){
                continue;
            }else {
                array[i] = thereArray[posicion];
                posicion++;
            }
        }
        array = thereArray;
        size--;
    }

    @Override
    public boolean remove(T element) {
         int index = 0;
         boolean isValid = false;
        for (int i = 0; i < size; i++) {
            if (array[i].equals(element)) {
                isValid = true;
                index = i;
                break;
            }

        }

            T[] thereArray = (T[]) new Object[length_of_array - 1];
            for (int i = 0; i < thereArray .length; i++) {
                if (i == index || i > index){
                    thereArray[i] = array[i + 1];
                }else {
                    thereArray[i] = array[i];
                }
        }
            this.array = thereArray;
        size--;
        return isValid;
    }

    @Override
    public void clear() {
        T[] newArray = (T[]) new Object[length_of_array - 1];
        this.array = newArray;
        size = 0;
    }

    @Override
    public void swap(int from, int to) {
        T changeElement = array[from];
        array[from] = array[to];
        array[to] = changeElement;



    }
    public String toString() {
        StringJoiner sj = new StringJoiner(",", "[", "]");
        for (int i = 0; i < size; i++) {
            sj.add(array[i].toString());
        }
        return sj.toString();
    }

    @Override
    public void print() {
            System.out.println(this);
    }

    @Override
    public Iterator<T> iterator() {
        return new MyArrayListIterator();
    }

    private class MyArrayListIterator implements Iterator<T> {
        int currentIndex;

        MyArrayListIterator() {
            currentIndex = 0;
        }

        @Override
        public boolean hasNext() {
            return currentIndex < size;
        }

        @Override
        public T next() {
            T result = array[currentIndex];
            currentIndex++;
            return result;
        }
    }
}

