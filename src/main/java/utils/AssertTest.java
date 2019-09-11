package utils;

/**
 * @Auther DRevelation
 * @Date 2019-08-30 10:33
 * @Desc
 */
public class AssertTest {
    public static void main(String[] args) {
        String str = "abc";
        //开启断言-ea，会执行，true继续，false抛出AssertionError异常
        assert str.equals("bcd");
        System.out.println(str);
    }
}
