package java8.stream;

import java.util.Arrays;
import java.util.List;
import java.util.stream.IntStream;
import java.util.stream.Stream;

/**
 * @Auther DRevelation
 * @Date 2019-08-05 10:39
 * @Desc
 */
public class Stream_01 {
    public static void main(String[] args) {
        // stream创建方式
        Stream stream = Stream.of("a", "b", "c");

        String[] strArray = new String[]{"a", "b", "c"};
        stream = Stream.of(strArray);
        stream = Arrays.stream(strArray);

        List<String> list = Arrays.asList(strArray);
        stream = list.stream();

        IntStream.of(new int[]{1, 2, 3}).forEach(System.out::println);
        IntStream.range(1, 3).forEach(System.out::println);
        IntStream.rangeClosed(1, 3).forEach(System.out::println);
    }
}
