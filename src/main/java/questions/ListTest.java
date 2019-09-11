package questions;

import java.util.ArrayList;
import java.util.List;

/**
 * @Auther DRevelation
 * @Date 2019-08-19 10:08
 * @Desc
 */
public class ListTest {
    public static void main(String[] args) {

        List list1 = new ArrayList();
        List list2 = new ArrayList();
        List list3 = new ArrayList();
        list1.add(new User("a", 11));
        list1.add(new User("b", 22));
        list1.add(new User("c", 33));

        list2.add(new User("d", 44));
        list3.add(new User("c", 33));

        list1.addAll(list2);
        list1.removeAll(list3);
        System.out.println(list1);

        StringBuilder sb = new StringBuilder();
        System.out.printf(sb.toString());
    }
}
