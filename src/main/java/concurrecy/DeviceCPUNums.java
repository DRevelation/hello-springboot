package concurrecy;

/**
 * @Auther DRevelation
 * @Date 2019-09-02 10:50
 * @Desc
 */
public class DeviceCPUNums {
    public static void main(String[] args) {
        int nums = Runtime.getRuntime().availableProcessors();
        System.out.println(nums);
    }
}
