package kr.javacafe.lambda.interfacedefault;

import kr.javacafe.lambda.apple.Apple;

import java.util.ArrayList;
import java.util.List;
import java.util.function.Predicate;

/**
 * Created by Chihwan on 2017. 5. 26..
 */
public class PredicateDefaultTest {

    private static List<Apple> inventory;

    public static void main(String args[]) {
        inventory = new ArrayList<>();
        inventory.add(new Apple(80, "green"));
        inventory.add(new Apple(155, "green"));
        inventory.add(new Apple(120, "red"));
        inventory.add(new Apple(170, "red"));

        Predicate<Apple> redApple = (Apple apple) -> apple.getColor().equals("red");
        System.out.println(filterApples(inventory, redApple));

        Predicate<Apple> notRedApple = redApple.negate();
        System.out.println(filterApples(inventory, notRedApple));

        Predicate<Apple> redAndHeavyApple = redApple.and(a -> a.getWeight() > 150);
        System.out.println(filterApples(inventory, redAndHeavyApple));

        Predicate<Apple> redOrHeavyApple = redApple.or(a -> a.getWeight() > 150);
        System.out.println(filterApples(inventory, redOrHeavyApple));

        Predicate<Apple> redAndHeavyAppleOrGreen = redApple
                                                    .and(a -> a.getWeight() > 150)
                                                    .or(a -> a.getColor().equals("green"));
        System.out.println(filterApples(inventory, redAndHeavyAppleOrGreen));
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
