package kr.javacafe.lambda;


import kr.javacafe.lambda.apple.Apple;

import java.util.ArrayList;
import java.util.List;
import java.util.function.Predicate;

/**
 * Created by Chihwan on 2017. 5. 11..
 */
public class LambdaTest {
    private static List<Apple> inventory;

    public static void main(String args[]) {
        inventory = new ArrayList<>();
        inventory.add(new Apple(80, "green"));
        inventory.add(new Apple(155, "green"));
        inventory.add(new Apple(120, "red"));
        inventory.add(new Apple(170, "red"));

//        System.out.println("Java 7 Style");
//        java7Style();

        System.out.println("Java 8 Style");
        java8Style();
    }

//    public static void java7Style() {
//        System.out.println(filterApplesByColor(inventory, "green"));
//        System.out.println(filterApplesByWeight(inventory, 150));
//        System.out.println(filterApples(inventory, "green", 150));
//    }
//
//    public static List<Apple> filterApplesByColor(List<Apple> inventory, String color) {
//        List<Apple> result = new ArrayList<>();
//        for (Apple apple : inventory) {
//            if (apple.getColor().equals(color)) {
//                result.add(apple);
//            }
//        }
//
//        return result;
//    }
//
//    public static List<Apple> filterApplesByWeight(List<Apple> inventory, int weight) {
//        List<Apple> result = new ArrayList<>();
//        for (Apple apple : inventory) {
//            if (apple.getWeight() > weight) {
//                result.add(apple);
//            }
//        }
//
//        return result;
//    }
//
//    public static List<Apple> filterApples(List<Apple> inventory, String color, int weight) {
//        List<Apple> result = new ArrayList<>();
//        for (Apple apple : inventory) {
//            if (apple.getWeight() > weight && apple.getColor().equals(color)) {
//                result.add(apple);
//            }
//        }
//
//        return result;
//    }

    public static void java8Style() {
        System.out.println(filterApples(inventory, (Apple apple) -> apple.getColor().equals("green")));
        System.out.println(filterApples(inventory, (Apple apple) -> apple.getWeight() > 150));
        System.out.println(filterApples(inventory, (Apple apple) -> apple.getColor().equals("green") && apple.getWeight() > 150));
    }

    public static List<Apple> filterApples(List<Apple> inventory, Predicate<Apple> predicate) {
        List<Apple> result = new ArrayList<>();
        for (Apple apple : inventory) {
            if (predicate.test(apple)) {
                result.add(apple);
            }
        }
        return result;
    }

}
