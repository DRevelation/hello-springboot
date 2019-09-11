package java8.stream;

import java.util.Arrays;
import java.util.Collection;
import java.util.Collections;
import java.util.List;
import java.util.stream.Collectors;
import java.util.stream.Stream;

/**
 * @Auther DRevelation
 * @Date 2019-08-05 10:46
 * @Desc
 */
public class Stream_02 {
    public static void main(String[] args) {
        List<String> wordList = Arrays.asList("a", "b", "c");
        List<String> output = wordList.stream()
                .map(String::toUpperCase)
                .collect(Collectors.toList());
        System.out.println(output);

        List<Integer> nums = Arrays.asList(1, 2, 3, 4);
        List<Integer> squareNums = nums.stream()
                .map(n -> n * n)
                .collect(Collectors.toList());
        System.out.println(squareNums);

        Stream<List<Integer>> inputStream = Stream.of(
                Collections.singletonList(1),
                Arrays.asList(2, 3),
                Arrays.asList(4, 5, 6)
        );
//        Stream<Integer> outputStream = inputStream.
//                flatMap((childList) -> childList.stream());
        inputStream.flatMap(Collection::stream).forEach(System.out::println);

        Integer[] sixNums = {1, 2, 3, 4, 5, 6};
        Integer[] evens = Stream.of(sixNums).filter(n -> n % 2== 0).toArray(Integer[]::new);
        System.out.println(Arrays.toString(evens));
    }
}
