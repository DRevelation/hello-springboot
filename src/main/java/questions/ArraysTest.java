package questions;

import java.util.Arrays;
import java.util.List;

/**
 * @Auther DRevelation
 * @Date 2019-07-26 15:41
 * @Desc
 */
public class ArraysTest {
    public static void main(String[] args) {
        List myList = Arrays.asList(1, 2, 3);
        System.out.println(myList.getClass());

        //Arrays.asList() 方法返回的并不是 java.util.ArrayList ，而是 java.util.Arrays 的一个内部类,
        //这个内部类并没有实现集合的修改方法或者说并没有重写这些方法。
//        myList.add(4);
//        myList.remove(1);
//        myList.clear();
    }
}
