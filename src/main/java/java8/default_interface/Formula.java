package java8.default_interface;

/**
 * @Auther DRevelation
 * @Date 2019-06-12 9:51
 * @Desc
 */
public interface Formula {

    double calculate(int a);

    default double sqrt(int a) {
        return Math.sqrt(a);
    }
}
