package kr.javacafe.lambda;

import java.io.BufferedReader;
import java.io.IOException;

/**
 * Created by Chihwan on 2017. 5. 25..
 */
@FunctionalInterface
public interface BufferedReaderProcessor {
    String process(BufferedReader b) throws IOException;
}


