package kr.javacafe.parallel;

import java.util.stream.LongStream;

/**
 * Created by Chihwan on 2017. 5. 26..
 */
public class SumTest {

    public static void main(String[] args) {
        System.out.println("SequentialSum : " + sequentialSum(10_000_000));
        System.out.println("IterativeSum : " + iterativeSum(10_000_000));
        System.out.println("ParallelSum : " + parallelSum(10_000_000));
    }

    public static long sequentialSum(long n) {
        return LongStream.iterate(1L, i -> i + 1)
                .limit(n)
                .reduce(0L, Long::sum);
    }

    public static long parallelSum(long n) {
        return LongStream.iterate(1L, i -> i + 1)
                .parallel()
                .limit(n)
                .reduce(0L, Long::sum);
    }

    public static long iterativeSum(long n) {
        long result = 0;
        for (long i = 1L; i <= n; i++) {
            result +=i;
        }

        return result;
    }

    public static long rangedSum(long n) {
        return LongStream.rangeClosed(1, n)
                .reduce(0L, Long::sum);
    }

    public static long parallelRangedSum(long n) {
        return LongStream.rangeClosed(1, n)
                .parallel()
                .reduce(0L, Long::sum);
    }

}

