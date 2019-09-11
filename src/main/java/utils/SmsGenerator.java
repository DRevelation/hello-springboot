package utils;

import java.util.Random;

/**
 * @Auther DRevelation
 * @Date 2019-09-10 14:40
 * @Desc
 */
public class SmsGenerator {
    public static void main(String[] args) {
        String str = "0123456789";
        StringBuilder sb = new StringBuilder(4);
        for (int i=0; i < 4; i++) {
            char ch = str.charAt(new Random().nextInt(str.length()));
            sb.append(ch);
        }
        System.out.println("尊敬的用户，您的验证码为" + sb + "，有效期1小时");
    }
}
