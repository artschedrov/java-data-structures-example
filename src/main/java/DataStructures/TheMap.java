package DataStructures;

import java.util.HashMap;
import java.util.Map;

public class TheMap {
    public static void main(String[] args) {
        Map<Integer, Person> map = new HashMap<>();

        map.put(1, new Person("Tim"));
        map.put(2, new Person("Nik"));
        map.put(3, new Person("Art"));

        System.out.println(map);
        System.out.println(map.size());
    }

    record Person(String name){}
}
