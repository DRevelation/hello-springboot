package concurrecy;

/**
 * @Auther DRevelation
 * @Date 2019-08-28 17:01
 * @Desc
 */
public class InterruptDemo {
    public static void main(String[] args) {

        final Thread sleepThread = new Thread() {
            @Override
            public void run() {
                try {
                    Thread.sleep(1000);
                } catch (InterruptedException e) {
                    e.printStackTrace();
                }
                super.run();
            }
        };

        Thread busyThread = new Thread() {
            @Override
            public void run() {
                while (true);
            }
        };

        sleepThread.start();
        busyThread.start();
        sleepThread.interrupt();
        busyThread.interrupt();
        while (sleepThread.isInterrupted());
        System.out.println("sleepThread isInterrupted: " + sleepThread.isInterrupted());
        System.out.println("busyThread isInterrupted: " + busyThread.isInterrupted());
    }
}
