package kr.javacafe.stream;

import kr.javacafe.stream.dish.Dish;
import kr.javacafe.stream.dish.DishList;

import java.util.Arrays;
import java.util.List;

import static java.util.stream.Collectors.toList;

/**
 * Created by Chihwan on 2017. 5. 27..
 */
public class MapTest {

    public static void main(String[] args) {
//        stringMap();
//        integerMap();
//        uniqueCharacters();
        uniqueCharactersFlatMap();
    }

    private static void uniqueCharacters() {
        List<String> words = Arrays.asList("Hello", "World");
        words.stream()
                .map(w -> w.split(""))
                .distinct()
                .forEach(System.out::println);
    }

    private static void uniqueCharactersFlatMap() {
        List<String> words = Arrays.asList("Hello", "World");
        List<String> uniqueCharacters = words.stream()
                .map(w -> w.split(""))
                .flatMap(Arrays::stream)
                .distinct()
                .collect(toList());

        System.out.println(uniqueCharacters);
    }

//    private static void integerMap() {
//        List<String> words = Arrays.asList("Java8", "In", "Action");
//        List<Integer> wordLengths = words.stream()
//                                        .map(String::length)
//                                        .collect(toList());
//
//        System.out.println(wordLengths);
//    }

    private static void integerMap() {
        List<Integer> dishNameLength = DishList.getDishList().stream()
                .map(Dish::getName)
                .map(String::length)
                .collect(toList());

        System.out.println(dishNameLength);
    }


    private static void stringMap() {
        List<String> dishNames = DishList.getDishList().stream()
                                    .map(Dish::getName)
                                    .collect(toList());

        System.out.println(dishNames);
    }

}
