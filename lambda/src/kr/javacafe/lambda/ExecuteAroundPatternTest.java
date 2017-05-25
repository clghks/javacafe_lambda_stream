package kr.javacafe.lambda;

import java.io.*;

/**
 * Created by Chihwan on 2017. 5. 25..
 */
public class ExecuteAroundPatternTest {

    public static void main(String args[]) throws IOException {
        System.out.println(processFile(b -> b.readLine()));
//        System.out.println(processFile(b -> b.readLine() + b.readLine()));
    }

    public static String processFile(BufferedReaderProcessor processor) throws IOException {
        try (BufferedReader bufferedReader = new BufferedReader(new FileReader("data.txt"))) {
            return processor.process(bufferedReader);
        }
    }

    // 파일에서 한 행을 읽는 코드
//    public static String processFile() throws IOException {
//        try (BufferedReader bufferedReader = new BufferedReader(new FileReader("data.txt"))) {
//            return bufferedReader.readLine();
//        }
//    }
}

