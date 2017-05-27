package kr.javacafe.stream;

import kr.javacafe.stream.dish.Dish;
import kr.javacafe.stream.dish.DishList;

import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

/**
 * Created by Chihwan on 2017. 5. 26..
 */
public class FilterTest {

    public static void main(String[] args) {
        predicateFilter();
        uniqueFilter();
        limitFilter();
        skipFilter();
    }

    private static void skipFilter() {
        List<Dish> dishes = DishList.getDishList().stream()
                .filter(d -> d.getCalories() > 300)
                .skip(2)
                .collect(Collectors.toList());

        System.out.println(dishes);
    }

    private static void limitFilter() {
        List<Dish> dishes = DishList.getDishList().stream()
                            .filter(d -> d.getCalories() > 300)
                            .limit(3)
                            .collect(Collectors.toList());

        System.out.println(dishes);
    }

    private static void uniqueFilter() {
        List<Integer> numbers = Arrays.asList(1, 2, 1, 3, 3, 2, 4);
        numbers.stream()
                .filter(i -> i % 2 == 0)
                .distinct()
                .forEach(System.out::println);
    }

    public static void predicateFilter() {
        List<Dish> vegetarianMenu =
                DishList.getDishList().stream()
                        .filter(Dish::isVegtarian)
                        .collect(Collectors.toList());

        System.out.println(vegetarianMenu);
    }
}
