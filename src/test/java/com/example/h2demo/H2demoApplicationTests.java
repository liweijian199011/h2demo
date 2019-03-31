package com.example.h2demo;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.junit4.SpringRunner;

import java.util.concurrent.ArrayBlockingQueue;
import java.util.concurrent.ThreadPoolExecutor;
import java.util.concurrent.TimeUnit;

@RunWith(SpringRunner.class)
@SpringBootTest
public class H2demoApplicationTests {

	@Test
	public void contextLoads() {
	}

	@Test
    public void threadPool() {
        ThreadPoolExecutor executor
                = new ThreadPoolExecutor(1, 3, 0, TimeUnit.SECONDS, new ArrayBlockingQueue<Runnable>(1));
        for (int i = 0; i < 4; i++) {
            executor.execute(() -> {
                System.out.println(Thread.currentThread().getName());
            });
        }
	}
}
