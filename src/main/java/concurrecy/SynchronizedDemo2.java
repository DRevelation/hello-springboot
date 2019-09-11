package concurrecy;

import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;

/**
 * @Auther DRevelation
 * @Date 2019-08-29 11:21
 * @Desc
 */
public class SynchronizedDemo2 {

    public void fun1() {
        synchronized (this) {
            for (int i = 0; i < 10; i++) {
                try {
                    Thread.sleep(500);
                } catch (InterruptedException e) {
                    e.printStackTrace();
                }
                System.out.println(i);
            }
        }
    }

    public static void main(String[] args) {
        SynchronizedDemo2 s1 = new SynchronizedDemo2();
        ExecutorService service = Executors.newCachedThreadPool();
        service.execute(() -> s1.fun1());
        service.execute(s1::fun1);
    }
}
