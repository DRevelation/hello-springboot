package concurrecy;

import java.util.concurrent.CountDownLatch;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;

/**
 * @Auther DRevelation
 * @Date 2019-09-09 15:26
 * @Desc CountDownLatch使end最后输出
 */
public class CountdownLatchExample {
    public static void main(String[] args) throws InterruptedException {
        final int totalThread = 10;
        CountDownLatch countDownLatch = new CountDownLatch(totalThread);
        ExecutorService executorService = Executors.newCachedThreadPool();
        for (int i = 0; i < totalThread; i++) {
            executorService.execute(
                new Runnable() {
                    @Override
                    public void run() {
                        System.out.print("run...");
                        countDownLatch.countDown();
                    }
                });
        }
        countDownLatch.await();
        System.out.println("end");
        executorService.shutdown();
    }
}
