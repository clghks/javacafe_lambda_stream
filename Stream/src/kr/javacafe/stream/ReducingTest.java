package kr.javacafe.stream;

import kr.javacafe.stream.dish.DishList;

import java.util.Arrays;
import java.util.List;
import java.util.Optional;

/**
 * Created by Chihwan on 2017. 5. 26..
 */
public class ReducingTest {

    public static void main(String[] args) {
        List<Integer> numbers = Arrays.asList(1, 2, 3, 4, 5, 6);
        System.out.println("Number Count : " + numbers.stream().reduce(0, (a, b) -> a + b));
        System.out.println("Number Count Method Reference : " + numbers.stream().reduce(0, Integer::sum));

        Optional<Integer> sum1 = numbers.stream().reduce((a, b) -> a + b);
        System.out.println("Number Count Optional<Integer> : " + sum1.get());

        Optional<Integer> sum2 = numbers.stream().reduce(Integer::sum);
        System.out.println("Number Count Method Reference Optional<Integer> : " + sum2.get());

        System.out.println("Number Max Method Reference : " + numbers.stream().reduce(0, Integer::max));
        System.out.println("Number Min Method Reference : " + numbers.stream().reduce(0, Integer::min));
    }
}
