package com.example.h2demo.jucutil;

import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;
import java.util.concurrent.Semaphore;

/**
 * Description
 * <p>
 * </p>
 * DATE 2019/4/28.
 *
 * @author liweijian.
 */
public class SemaphoreTest {
    private static Semaphore semaphore = new Semaphore(0);

    public static void main(String[] args) throws Exception {
        ExecutorService executorService = Executors.newFixedThreadPool(2);

        executorService.submit(() -> {
           System.out.println(Thread.currentThread() + " over");
           semaphore.release();
        });

        executorService.submit(() -> {
           System.out.println(Thread.currentThread() + " over");
           semaphore.release();
        });

        semaphore.acquire(2);
        System.out.println("all child thread over!");

        executorService.shutdown();
    }
}
