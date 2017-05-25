package kr.javacafe.lambda;

import kr.javacafe.lambda.apple.Apple;

import java.util.ArrayList;
import java.util.Comparator;
import java.util.List;

/**
 * Created by Chihwan on 2017. 5. 26..
 */
public class MethodReferencesTest {
    private static List<Apple> inventory;

    public static void main(String args[]) {
        inventory = new ArrayList<>();
        inventory.add(new Apple(80, "green"));
        inventory.add(new Apple(170, "red"));
        inventory.add(new Apple(120, "red"));
        inventory.add(new Apple(155, "green"));

//        inventory.sort((Apple a1, Apple a2) -> a1.getWeight().compareTo(a2.getWeight()));
//        inventory.sort(Comparator.comparing(apple -> apple.getWeight()));

        inventory.sort(Comparator.comparing(Apple::getWeight));
    }
}
