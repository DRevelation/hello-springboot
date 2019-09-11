package questions;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

/**
 * @Auther DRevelation
 * @Date 2019-07-26 15:51
 * @Desc
 */
public class ForEachTest {
    public static void main(String[] args) {
        List<String> list = new ArrayList<>();
        list.add("2");
        list.add("2");
//        Iterator<String> it = list.iterator();
//        while (it.hasNext()) {
//            String item = it.next();
//            if (!item.equals("3")) {
//                it.remove();
//            }
//            System.out.println(list);
//        }

        for (String item : list) {
            if ("1".equals(item)) {
                list.remove(item);
            }
        }
        System.out.println(list);
    }
}
