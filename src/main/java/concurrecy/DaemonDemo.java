package concurrecy;

/**
 * @Auther DRevelation
 * @Date 2019-08-29 10:03
 * @Desc
 */
public class DaemonDemo {
    public static void main(String[] args) {
        Thread daemon = new Thread(new Runnable() {
            @Override
            public void run() {
                while (true) {
                    try {
                        System.out.println("i am alive");
                        Thread.sleep(500);
                    } catch (InterruptedException e) {
                        e.printStackTrace();
                    } finally {
                        System.out.println("finally block");
                    }
                }
            }
        });
        daemon.setDaemon(true);
        daemon.start();

        //确保main线程结束前能给daemon分到时间片
        try {
            System.out.println("main thread exe");
            Thread.sleep(800);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
    }
}
