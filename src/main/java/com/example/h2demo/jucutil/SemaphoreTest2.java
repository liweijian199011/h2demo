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
public class SemaphoreTest2 {
    private static Semaphore semaphore = new Semaphore(2);

    public static void main(String[] args) throws Exception {
        ExecutorService executorService = Executors.newFixedThreadPool(2);

        executorService.submit(() -> {
            try {
                System.out.println(Thread.currentThread() + " taskA over");
                semaphore.release();
            } catch (Exception ex) {
                ex.printStackTrace();
            }
        });

        executorService.submit(() -> {
            try {
                System.out.println(Thread.currentThread() + " taskA over");
                semaphore.release();
            } catch (Exception ex) {
                ex.printStackTrace();
            }
        });

        semaphore.acquire(2);

        executorService.submit(() -> {
            try {
                System.out.println(Thread.currentThread() + " taskB over");
                semaphore.release();
            } catch (Exception ex) {
                ex.printStackTrace();
            }
        });

        executorService.submit(() -> {
            try {
                System.out.println(Thread.currentThread() + " taskB over");
                semaphore.release();
            } catch (Exception ex) {
                ex.printStackTrace();
            }
        });

        semaphore.acquire(2);

        executorService.shutdown();
    }
}
