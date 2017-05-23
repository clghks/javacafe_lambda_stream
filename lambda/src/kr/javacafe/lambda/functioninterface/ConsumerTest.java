package kr.javacafe.lambda.functioninterface;

import java.util.Arrays;
import java.util.List;
import java.util.function.Consumer;

/**
 * Created by Chihwan on 2017. 4. 28..
 */
public class ConsumerTest {

    public static void main(String args[]) {
        forEach(Arrays.asList(1, 2, 3, 4, 5), (Integer i) -> System.out.println(i));
    }

    public static <T> void forEach(List<T> list, Consumer<T> c) {
        for (T i : list) {
            c.accept(i);
        }
    }
}
