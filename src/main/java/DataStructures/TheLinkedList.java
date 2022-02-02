package DataStructures;

import java.util.LinkedList;
import java.util.ListIterator;

public class TheLinkedList {
    public static void main(String[] args) {
        LinkedList<Person> people = new LinkedList<>();
        people.add(new Person("Art", 30));
        people.add(new Person("Nik", 25));
        people.add(new Person("Tom", 20));

        ListIterator<Person> peopleIterator = people.listIterator();

        while(peopleIterator.hasNext()) {
            System.out.println(peopleIterator.next());
        }

        System.out.println();

        while (peopleIterator.hasPrevious()) {
            System.out.println(peopleIterator.previous());
        }
    }

    static record Person(String name, int age) {}
}
