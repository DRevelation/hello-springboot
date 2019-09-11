package questions;

/**
 * @Auther DRevelation
 * @Date 2019-07-29 10:25
 * @Desc
 */
public class StringTest {
    public static void main(String[] args) {
        StringBuilder sb = new StringBuilder();
        for (int i = 0; i < 1; i++) {
            sb.append(i).append(",");
        }
        System.out.println(sb);
        System.out.println(sb.substring(0, sb.length()-1));
        System.out.println(sb);
    }
}
