package java8.lambda;

import java.util.Arrays;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;

/**
 * @Auther DRevelation
 * @Date 2019-06-12 9:56
 * @Desc
 */
public class Lambda_01 {
    public static void main(String[] args) {
        List<String> names1 = Arrays.asList("peter", "anna", "mike", "xenia");
        List<String> names2 = Arrays.asList("peter", "anna", "mike", "xenia");

        Collections.sort(names1, new Comparator<String>() {
            @Override
            public int compare(String o1, String o2) {
                return o1.compareTo(o2);
            }
        });

        System.out.println(names1);

        //极简的lambda表达式
        names2.sort(String::compareTo);
        System.out.println(names2);

    }
}
