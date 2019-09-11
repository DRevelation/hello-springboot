package base;

/**
 * @Auther DRevelation
 * @Date 2019-09-06 9:45
 * @Desc https://github.com/CyC2018/CS-Notes/blob/master/notes/Java%20%E5%9F%BA%E7%A1%80.md
 */
public class Base01 {
    public static void main(String[] args) {
        //1.包装类型
        //装箱 调用了Integer.valueOf(2)
        Integer x = 2;
        //拆箱 调用了x.intValue();
        int y = x;

        //2.缓存池
        Integer a1 = new Integer(12);
        Integer a2 = new Integer(12);
        System.out.println(a1 == a2);
        Integer b1 = Integer.valueOf(12);
        Integer b2 = Integer.valueOf(12);
        System.out.println(b1 == b2);

        //String Pool String s = "aaa"会自动放入Pool中
        String s1 = new String("aaa");
        String s2 = new String("aaa");
        System.out.println(s1 == s2);
        String s3 = s1.intern();
        String s4 = s1.intern();
        System.out.println(s3 == s4);

    }
}


interface int01 {
    void func1();

    default void func2() {
        System.out.println("func2");
    }
}