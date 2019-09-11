package utils;

import com.alibaba.fastjson.JSON;
import com.alibaba.fastjson.JSONObject;

import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.Calendar;
import java.util.Date;
import java.util.List;

/**
 * @Auther DRevelation
 * @Date 2019-06-18 11:35
 * @Desc
 */
public class Main {
    public static void main(String[] args) {
        String s = "@p551154063262";
        System.out.println(SqlInjection.isValid(s));

        //当前时间 前一个小时
        SimpleDateFormat format = new SimpleDateFormat("yyyy-MM-dd HH:mm:ss");
        Calendar cal = Calendar.getInstance();
        String start_update = format.format(cal.getTime());
        cal.set(Calendar.HOUR_OF_DAY, cal.get(Calendar.HOUR_OF_DAY)-1);
        String end_update = format.format(cal.getTime());

        System.out.println(format.format(new Date()));
        System.out.println(0/10);

        System.out.println(s.length());
        System.out.println(s.substring(0, 14));

        List list = new ArrayList();
        list.add("aa");
        list.add("bb\\n");
        list.add("cc");
        System.out.println(list);

        System.out.println(JSON.toJSONString(list));
        System.out.println(JSON.parseArray(JSON.toJSONString(list)));

        String a = "ab";
        String b = "ab";
        String aa = new String("ab");
        String ab = new String("ab");
        System.out.println(a == b);
        System.out.println(aa == ab);

        System.out.println(f(10));
        System.out.println(f(2));
    }

    public static int f(int value) {
        try {
            return value * value;
        } finally {
            if (value == 2) {
                return 0;
            }
        }
    }
}
