package DataStructures;

import java.util.LinkedList;
import java.util.Queue;

public class TheQueue {
    public static void main(String[] args) {
        Queue<Person> supermarket = new LinkedList<>();

        supermarket.add(new Person("Art", 30));
        supermarket.add(new Person("Nik", 25));
        supermarket.add(new Person("Tom", 20));

        System.out.println(supermarket.peek());
        System.out.println(supermarket.poll());
        System.out.println(supermarket.size());
        System.out.println(supermarket.peek());
    }

    static record Person(String name, int age) {}
}
