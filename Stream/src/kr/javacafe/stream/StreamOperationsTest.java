package kr.javacafe.stream;

import kr.javacafe.stream.dish.Dish;
import kr.javacafe.stream.dish.DishList;

import java.util.List;
import java.util.stream.Collectors;

/**
 * Created by Chihwan on 2017. 5. 27..
 */
public class StreamOperationsTest {

    public static void main(String[] args) {
//        streamOperation();
        streamLog();
    }

    public static void streamLog() {
        List<String> names = DishList.getDishList().stream()
                .filter(d -> {
                    System.out.println("filter : " + d.getName());
                    return d.getCalories() > 300;
                })
                .map(d -> {
                    System.out.println("map : " + d.getName());
                    return d.getName();
                })
                .limit(3)
                .collect(Collectors.toList());

        System.out.println(names);
    }

    public static void streamOperation() {
        List<String> names = DishList.getDishList().stream()
                .filter(d -> d.getCalories() > 300)
                .map(Dish::getName)
                .limit(3)
                .collect(Collectors.toList());

        System.out.println(names);
    }

}

