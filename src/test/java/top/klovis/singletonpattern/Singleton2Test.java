package top.klovis.singletonpattern;

import org.junit.Test;

import java.util.concurrent.CountDownLatch;

import static org.junit.Assert.*;

/**
 * Created by klovis on 2018/7/10.
 */
public class Singleton2Test {

    @Test
    public void testGetInstance() throws Exception {
        int count = 100;
        // 发令枪
        CountDownLatch countDownLatch = new CountDownLatch(count);
        for (int i = 0; i < count; i++) {
            System.out.println("--create new thread--" + i);
            new Thread("thread:" + String.valueOf(i)) {
                @Override
                public void run() {
                    System.out.println(countDownLatch.getCount() + " " + System.currentTimeMillis() + ":" + Singleton2.getInstance());
                }
            }.start();
            countDownLatch.countDown();
        }

        try {
            countDownLatch.await();
        }
        catch (Exception e) {
            e.printStackTrace();
        }
    }
}