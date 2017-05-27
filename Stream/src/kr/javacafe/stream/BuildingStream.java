package kr.javacafe.stream;

import java.util.Arrays;
import java.util.stream.Stream;

/**
 * Created by Chihwan on 2017. 5. 27..
 */
public class BuildingStream {
    public static void main(String[] args) {
        Stream<String> stream = Stream.of("Java 8", "Lambda", "In", "Action");
        stream.map(String::toUpperCase).forEach(System.out::println);


        int[] numbers = {2, 3, 5, 7, 11, 13};
        int sum = Arrays.stream(numbers).sum();
        System.out.println("Number Sum : " + sum);


        Stream.iterate(0, n -> n + 2)
                .limit(10)
                .forEach(System.out::println);

        Stream.generate(Math::random)
                .limit(5)
                .forEach(System.out::println);
    }
}
