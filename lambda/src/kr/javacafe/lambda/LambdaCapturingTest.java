package kr.javacafe.lambda;

/**
 * Created by Chihwan on 2017. 5. 27..
 */
public class LambdaCapturingTest {

    public static void main(String[] args) {
        int portNumber = 1337;

        Runnable runnable = () -> System.out.println(portNumber);
        runnable.run();
    }
}

