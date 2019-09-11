package java8.default_interface;

/**
 * @Auther DRevelation
 * @Date 2019-06-12 9:53
 * @Desc
 */
public class Main {
    public static void main(String[] args) {
        Formula formula = new Formula() {
            @Override
            public double calculate(int a) {
                return sqrt(a * 100);
            }
        };

        formula.calculate(100);
        formula.sqrt(16);
    }
}
