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
        CountDownLatch countDownLatch = new CountDownLatch(count);

        for (int i = 0; i < count; i++) {
            new Thread() {
                @Override
                public void run() {
                    System.out.println(System.currentTimeMillis() + ":" + Singleton2.getInstance());
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