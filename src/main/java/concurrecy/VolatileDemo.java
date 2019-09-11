package concurrecy;

/**
 * @Auther DRevelation
 * @Date 2019-08-29 14:35
 * @Desc
 */
public class VolatileDemo {

    private static volatile boolean isOver = false;

    public static void main(String[] args) {
        Thread thread = new Thread(new Runnable() {
            @Override
            public void run() {
                System.out.println("thread");
                while (!isOver);
            }
        });
        thread.start();
        System.out.println("main 1");
        try {
            Thread.sleep(500);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
        isOver = true;
        System.out.println("main 2");
    }
}
