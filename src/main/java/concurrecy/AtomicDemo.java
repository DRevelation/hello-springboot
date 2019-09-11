package concurrecy;

import java.util.concurrent.atomic.AtomicIntegerArray;

/**
 * @Auther DRevelation
 * @Date 2019-09-02 14:32
 * @Desc
 */
public class AtomicDemo {

    private static int[] value = new int[]{1, 2, 3};
    private static AtomicIntegerArray integerArray = new AtomicIntegerArray(value);

    public static void main(String[] args) {
        //对数组中索引为1的位置加5
        int result = integerArray.addAndGet(1, 5);
        System.out.println(integerArray.get(1));
        System.out.println(value[1]);
    }
}
