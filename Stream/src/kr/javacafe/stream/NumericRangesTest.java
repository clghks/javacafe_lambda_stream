package kr.javacafe.stream;

import java.util.stream.IntStream;

/**
 * Created by Chihwan on 2017. 5. 26..
 */
public class NumericRangesTest {

    public static void main(String[] args) {
        intStreamRange(100);
        intStreamRangeClosed(100);
    }

    public static void intStreamRange(int count) {
        IntStream.range(1, count).forEach(System.out::println);
    }

    public static void intStreamRangeClosed(int count) {
        IntStream.rangeClosed(1, count).forEach(System.out::println);
    }

}
