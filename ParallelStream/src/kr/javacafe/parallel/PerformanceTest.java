package kr.javacafe.parallel;

import java.util.function.Function;

/**
 * Created by Chihwan on 2017. 5. 26..
 */
public class PerformanceTest {

    public static void main(String[] args) {
        System.out.println("Sequential sum done in : " + measureSumPerformance(SumTest::rangedSum, 10_000_000) + " msecs");
        System.out.println("Iterative sum done in : " + measureSumPerformance(SumTest::iterativeSum, 10_000_000) + " msecs");
        System.out.println("Parallel sum done in : " + measureSumPerformance(SumTest::parallelRangedSum, 10_000_000) + " msecs");
        System.out.println("SideEffect parallel sum done in : " + measureSumPerformance(Accumulator::sideEffectParalleSum, 10_000_000) + " msecs");
    }

    public static long measureSumPerformance(Function<Long, Long> adder, long n) {
        long fastest = Long.MAX_VALUE;
        for (int i = 0; i < 10; i++) {
            long start = System.nanoTime();
            long sum = adder.apply(n);
            long duration = (System.nanoTime() - start) / 1_000_000;

            System.out.println("Result : " + sum);
            if (duration < fastest) {
                fastest = duration;
            }
        }

        return fastest;
    }

}

