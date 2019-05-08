package com.example.h2demo.jucutil;

import java.util.concurrent.CyclicBarrier;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;

/**
 * Description
 * <p>
 * </p>
 * DATE 2019/4/28.
 *
 * @author liweijian.
 */
public class CyclicBarrierTest {
    private static CyclicBarrier cyclicBarrier = new CyclicBarrier(2, () -> {
       System.out.println(Thread.currentThread() + " task1 merge result");
    });

    public static void main(String[] args) throws InterruptedException {
        ExecutorService executorService = Executors.newFixedThreadPool(2);

        executorService.submit(() -> {
           try {
               System.out.println(Thread.currentThread() + " task1-1");
               System.out.println(Thread.currentThread() + " enter in barrier");
               cyclicBarrier.await();
               System.out.println(Thread.currentThread() + " enter out barrier");
           } catch (Exception ex) {
               ex.printStackTrace();
           }
        });

        executorService.submit(() -> {
           try {
               System.out.println(Thread.currentThread() + " task1-2");
               System.out.println(Thread.currentThread() + " enter in barrier");
               cyclicBarrier.await();
               System.out.println(Thread.currentThread() + " enter out barrier");
           } catch (Exception ex) {
               ex.printStackTrace();
           }
        });

        executorService.shutdown();
    }
}
