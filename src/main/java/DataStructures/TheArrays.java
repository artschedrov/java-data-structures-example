package DataStructures;

import java.util.Arrays;

/**
 * В коллекции Java хранятся только ссылки/указатели.
 * Исключение составляют только примитивы.
 */
public class TheArrays {
    public static void main(String[] args) {
        String[] colors = new String[5];
        colors[0] = "purple";
        colors[1] = "blue";

        System.out.println(Arrays.toString(colors));

        int[] numbers = {100, 200};
        int[] numbers2 = new int[2];

        System.out.println(Arrays.toString(numbers));

        for (int i = 0; i < colors.length; i++) {
            System.out.println(colors[i]);
        }

//        for (String color : colors) {
//            System.out.println(color);
//        }

        //Arrays.stream(colors).forEach(System.out::println);
    }
}
