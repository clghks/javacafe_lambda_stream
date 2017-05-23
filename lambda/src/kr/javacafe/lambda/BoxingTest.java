package kr.javacafe.lambda;

import java.util.ArrayList;
import java.util.List;
import java.util.function.IntPredicate;
import java.util.function.Predicate;

/**
 * Created by Chihwan on 2017. 4. 28..
 */
public class BoxingTest {

    public static void main(String args[]) {
        // int가 Integer로 변환 됨 (변환 비용 소모)
        List<Integer> list = new ArrayList<>();
        for (int i=0; i<400; i++){
            list.add(i);
        }

        // 박싱
        Predicate<Integer> oddNumber = (Integer i) -> i % 2 == 1;
        System.out.println(oddNumber.test(1000));

        // 박싱 없음
        IntPredicate evenNumber = (int i) -> i % 2 == 0;
        System.out.println(evenNumber.test(1000));
    }

}
