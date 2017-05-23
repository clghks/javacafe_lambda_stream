package kr.javacafe.lambda;

/**
 * Created by Chihwan on 2017. 4. 27..
 */
public class RunnableTest {

    public static void main(String args[]) {
//        System.out.println("Java 7 Style");
//        java7Style();

        System.out.println("Java 8 Style");
        java8Style();
    }

    public static void java8Style() {
        // 람다 사용
        Runnable runnable = () -> System.out.println("Hello World 1");

        process(runnable);
        // 직접 전달된 람다 사용
        process(() -> System.out.println("Hello World 2"));
    }

    public static void process(Runnable r) {
        r.run();
    }

    public static void java7Style() {
        // 클래스 사용
        RunnableTestClass runnable1 = new RunnableTestClass();

        // 익명 클래스 사용
        Runnable runnable2 = new Runnable() {
            @Override
            public void run() {
                System.out.println("Hello World Anonymous Class");
            }
        };

        process(runnable1);
        process(runnable2);
    }

    static class RunnableTestClass implements Runnable {
        @Override
        public void run() {
            System.out.println("Hello World Class");
        }
    }
}
