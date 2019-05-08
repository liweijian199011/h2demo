package com.example.h2demo.jucutil;

import java.util.concurrent.CountDownLatch;

/**
 * Description
 * <p>
 * </p>
 * DATE 2019/4/27.
 *
 * @author liweijian.
 */
public class CountDownLatchTest {

    private static CountDownLatch latch = new CountDownLatch(2);

    public static void main(String[] args) throws Exception {
        new Thread(() -> {
            System.out.println("thread1 start");
            try {
                Thread.sleep(1000);
            } catch (Exception ex) {
                ex.printStackTrace();
            } finally {
                latch.countDown();
            }
        }, "thread1").start();

        new Thread(() -> {
            System.out.println("Thread2 start");

            try {
                Thread.sleep(1000);
            } catch (Exception ex) {
                ex.printStackTrace();
            } finally {
                latch.countDown();
            }
        }).start();

        System.out.println("wait all child thread over");

        latch.await();

        System.out.println("all child thread over!");
    }
}
