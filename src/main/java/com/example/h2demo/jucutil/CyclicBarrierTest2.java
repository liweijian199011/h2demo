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
public class CyclicBarrierTest2 {

    private static CyclicBarrier cyclicBarrier = new CyclicBarrier(2);

    public static void main(String[] args) {
        ExecutorService executorService = Executors.newFixedThreadPool(2);

        executorService.submit(() -> {
            try {
                System.out.println(Thread.currentThread() + " step1 over");
                cyclicBarrier.await();

                System.out.println(Thread.currentThread() + " step2 over");
                cyclicBarrier.await();

                System.out.println(Thread.currentThread() + " step3 over");
                cyclicBarrier.await();
            } catch (Exception ex) {
                ex.printStackTrace();
            }
        });

        executorService.submit(() -> {
            try {
                System.out.println(Thread.currentThread() + " step1 over");
                cyclicBarrier.await();

                System.out.println(Thread.currentThread() + " step2 over");
                cyclicBarrier.await();

                System.out.println(Thread.currentThread() + " step3 over");
                cyclicBarrier.await();
            } catch (Exception ex) {
                ex.printStackTrace();
            }
        });

        executorService.shutdown();
    }
}
