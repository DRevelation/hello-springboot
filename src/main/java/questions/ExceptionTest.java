package questions;

/**
 * @Auther DRevelation
 * @Date 2019-08-02 9:25
 * @Desc
 */
public class ExceptionTest {
    public static void main(String[] args) {
        try {
            int a = 10 / 0;
            System.out.println("---try---a=" + a);
        } catch (Exception e) {
            System.out.println(e.getMessage());
            System.out.println("---catch---");
        }
        System.out.println("---out---");
    }
}
