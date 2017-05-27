package kr.javacafe.stream;

import kr.javacafe.stream.dish.Dish;
import kr.javacafe.stream.dish.DishList;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;
import java.util.stream.Collectors;

import static java.util.Comparator.comparing;

/**
 * Created by Chihwan on 2017. 5. 26..
 */
public class StreamTest {

    public static void main(String[] args) {
//        java7Style();
        java8Style();

//        List<String> threeHighCaloricDishNames =
//                DishList.getDishList().stream()
//                        .filter(d -> d.getCalories() > 300)
//                        .map(Dish::getName)
//                        .limit(3)
//                        .collect(Collectors.toList());
//
//        System.out.println(threeHighCaloricDishNames);
    }

    public static void java8Style() {
        List<String> lowCaloricDishesName =
                DishList.getDishList().stream()
                        .filter(d -> d.getCalories() < 400)
                        .sorted(comparing(Dish::getCalories))
                        .map(Dish::getName)
                        .collect(Collectors.toList());

        System.out.println(lowCaloricDishesName);
    }

    public static void java7Style() {
        List<Dish> lowCaloricDishes = new ArrayList<>();
        for (Dish d : DishList.getDishList()) {
            if (d.getCalories() < 400) {
                lowCaloricDishes.add(d);
            }
        }

        Collections.sort(lowCaloricDishes, new Comparator<Dish>() {
            @Override
            public int compare(Dish o1, Dish o2) {
                return Integer.compare(o1.getCalories(), o2.getCalories());
            }
        });

        List<String> lowCaloricDishesName = new ArrayList<>();
        for (Dish d : lowCaloricDishes) {
            lowCaloricDishesName.add(d.getName());
        }

        System.out.println(lowCaloricDishesName);
    }

}

