package kr.javacafe.stream;

import kr.javacafe.stream.dish.Dish;
import kr.javacafe.stream.dish.DishList;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.Optional;

/**
 * Created by Chihwan on 2017. 5. 27..
 */
public class FindTest {

    public static void main(String[] args) {
        findAnyTest();
        findFirstTest();
    }

    private static void findFirstTest() {
        List<Integer> someNumbers = Arrays.asList(1, 2, 3, 4, 5);
        someNumbers.stream()
                .filter(x -> x % 3 == 0)
                .findFirst()
                .ifPresent(System.out::println);
    }

    private static void findAnyTest() {
        Optional<Dish> dish = DishList.getDishList().stream()
                .filter(Dish::isVegtarian)
                .findAny();

        if (dish.isPresent()) {
            System.out.println("채식 메뉴 있음.");
        } else {
            System.out.println("채식 메뉴 없음.");
        }
    }
}
