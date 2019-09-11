package utils;

import java.util.regex.Pattern;

/**
 * @Auther DRevelation
 * @Date 2019-06-18 11:25
 * @Desc
 */
public class SqlInjection {
    /**
     * 正则表达式
     **/
    private static String reg = "([^\\w\\s]+)";

    //\\b  表示 限定单词边界 比如 select 不通过 1select则是可以的
    private static Pattern sqlPattern = Pattern.compile(reg, Pattern.CASE_INSENSITIVE);

    public static boolean isValid(String str) {
        if (sqlPattern.matcher(str).find()) {
            System.out.println(("未能通过过滤器：str=" + str));
            return false;
        }
        return true;
    }
}
