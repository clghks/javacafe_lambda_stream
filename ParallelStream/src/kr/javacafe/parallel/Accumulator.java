package kr.javacafe.parallel;

import java.util.stream.LongStream;

/**
 * Created by Chihwan on 2017. 5. 26..
 */
public class Accumulator {
    public long total = 0;

    public void add(long value) {
        total += value;
    }

    public static long sideEffectParalleSum(long n) {
        Accumulator accumulator = new Accumulator();
        LongStream.rangeClosed(1, n).parallel().forEach(accumulator::add);
        return accumulator.total;
    }
}


