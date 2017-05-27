package kr.javacafe.stream;

import kr.javacafe.stream.dish.Dish;
import kr.javacafe.stream.dish.DishList;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.stream.Stream;

import static java.util.stream.Collectors.toList;

/**
 * Created by Chihwan on 2017. 5. 26..
 */
public class StreamCollectionTest {

    public static void main(String[] args) {
//        openStream();

        System.out.println("for-each : " + foreach());
        System.out.println("streamLoop : " + streamLoop());
    }

    public static void openStream() {
        List<String> title = Arrays.asList("Java8", "In", "Action");
        Stream<String> stream = title.stream();
        stream.forEach(System.out::println);
        stream.forEach(System.out::println);
    }

    public static List<String> foreach() {
        List<String> names = new ArrayList<>();
        for (Dish d : DishList.getDishList()) {
            names.add(d.getName());
        }
        return names;
    }

    public static List<String> streamLoop() {
        List<String> names = DishList.getDishList()
                                .stream()
                                .map(Dish::getName)
                                .collect(toList());
        return names;
    }

}

