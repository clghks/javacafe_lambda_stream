package kr.javacafe.stream;

import kr.javacafe.stream.dish.Dish;
import kr.javacafe.stream.dish.DishList;

/**
 * Created by Chihwan on 2017. 5. 26..
 */
public class MatchingTest {

    public static void main(String[] args) {
        anyMatchTest();
        allMatchTest();
        noneMatchTest();
    }

    public static void anyMatchTest() {
        if (DishList.getDishList().stream().anyMatch(Dish::isVegtarian)) {
            System.out.println("채식 메뉴가 존재 합니다.");
        } else {
            System.out.println("채식 메뉴가 없습니다.");
        }
    }

    private static void allMatchTest() {
        if (DishList.getDishList().stream().allMatch(d -> d.getCalories() < 1000)) {
            System.out.println("모든 메뉴가 1000 칼로리 이하입니다.");
        } else {
            System.out.println("모든 메뉴가 1000 칼로리 이하가 아닙니다.");
        }
    }

    private static void noneMatchTest() {
        if (DishList.getDishList().stream().noneMatch(d -> d.getCalories() >= 10000)) {
            System.out.println("모든 메뉴가 1000 칼로리 이상이 아닙니다.");
        } else {
            System.out.println("모든 메뉴가 1000 칼로리 이상입니다.");
        }
    }

}


