package com.telerikacademy.oop.generics.boundedgenerics;

public class Main {

    public static void main(String[] args) {
        // Creating MyGenericList<Integer> is possible because MyGenericListImpl is implemented via generic types
        MyGenericList<Integer> numbers = new MyGenericListImpl<>();

        numbers.add(1);
        numbers.add(2);
        numbers.add(3);

        System.out.print("All numbers: ");
        printAll(numbers);

        // Creating MyGenericList<Person> is possible because MyGenericListImpl is implemented via generic types
        MyGenericList<Person> people = new MyGenericListImpl<>();

        people.add(new Person("Pesho", 45));
        people.add(new Person("Vladi", 34));
        people.add(new Person("Todor", 35));

        System.out.print("All people: ");
        printAll(people);
    }

    // The action of printing is the same for numbers and for people,
    // so we can use Generics to extract it to a method.
    // We create a bounded generic method that has to generic parameters - E and T.
    // T is something that extends Iterable<E>.
    // Since our MyGenericList interface follows that rule, we can pass it to printAll
    // and it doesn't matter what is the type of the elements in the list.
    public static <E, T extends Iterable<E>> void printAll(T list) {
        for (E item : list) {
            System.out.print(item + " ");
        }
        System.out.println();
    }
}
