package concurrecy;

/**
 * @Auther DRevelation
 * @Date 2019-08-29 9:39
 * @Desc
 */
public class JoinDemo {
    public static void main(String[] args) {
        Thread preThread = Thread.currentThread();
        for (int i = 0; i < 10; i++) {
            Thread curThread = new JoinThread(preThread);
            curThread.start();
            preThread = curThread;
        }
    }

    static class JoinThread extends Thread {

        private Thread thread;

        public JoinThread(Thread thread) {
            this.thread = thread;
        }

        @Override
        public void run() {
            try {
                thread.join();
                System.out.println(thread.getName() + " terminated.");
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
        }
    }
}
