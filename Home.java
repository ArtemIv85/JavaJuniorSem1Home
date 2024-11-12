package Home;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class Home {
    public static void main(String[] args) {

        /*  Задение:  Напишите программу, которая использует Stream API
         для обработки списка чисел. Программа должна вывести на экран среднее значение всех четных чисел в списке.
         */
        /**
         * Среднее арифметическое методом Stream API
         */
        int[] arr = {1,2,7,6,5,2};  // Ответ  3,333333333333333
        List<Integer> list = new ArrayList<>(Arrays.asList(1,2,7,6,5,2));// Ответ  3,333333333333333


        /**
         * Вариант из массива
         */
        System.out.println(Arrays.stream(arr)
                .filter(value -> value%2==0).mapToDouble(Double::valueOf)
                .sum() / Arrays.stream(arr)
                .filter(value -> value%2==0)
                .count()
        );

        /**
         * Вариант из ArrayList
         */
        System.out.println(list.stream()
                .filter(integer -> integer % 2==0)
                .mapToDouble(Integer::intValue)
                .sum()
                /
                list.stream()
                        .filter(integer -> integer % 2==0)
                        .mapToInt(Integer::intValue)
                        .count()
        );


    }
}
