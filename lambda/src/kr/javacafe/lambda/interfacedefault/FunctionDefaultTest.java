package kr.javacafe.lambda.interfacedefault;

import java.util.function.Function;

/**
 * Created by Chihwan on 2017. 5. 26..
 */
public class FunctionDefaultTest {

    public static void main(String[] args) {
        Function<Integer, Integer> f = x -> x + 1;
        Function<Integer, Integer> g = x -> x * 2;

        // g(f(x))
        Function<Integer, Integer> h1 = f.andThen(g);
        System.out.println("g(f(x)) : " + h1.apply(1));

        // f(g(x))
        Function<Integer, Integer> h2 = f.compose(g);
        System.out.println("f(g(x)) : " + h2.apply(1));
    }

}


