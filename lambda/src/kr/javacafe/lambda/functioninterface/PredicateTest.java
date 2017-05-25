package kr.javacafe.lambda.functioninterface;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.function.Predicate;

/**
 * Created by Chihwan on 2017. 4. 27..
 */
public class PredicateTest {

    public static void main(String args[]) {
        List<String> listOfStrings = Arrays.asList("", "Hello", " ", "World", "!!", "");

        Predicate<String> nonEmptyStringPredicate = (String s) -> !s.isEmpty();
        List<String> noneEmpty = filter(listOfStrings, nonEmptyStringPredicate);
        System.out.println(noneEmpty);
    }

    public static <T> List<T> filter(List<T> list, Predicate<T> p) {
        List<T> results = new ArrayList<>();
        for (T s : list) {
            if (p.test(s)) {
                results.add(s);
            }
        }

        return results;
    }

}


