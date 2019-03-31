package com.example.h2demo.service.impl;

import com.example.h2demo.service.AsyncService;
import org.springframework.scheduling.annotation.Async;
import org.springframework.stereotype.Service;

import java.util.concurrent.TimeUnit;

/**
 * Description
 * <p>
 * </p>
 * DATE 2019/2/23.
 *
 * @author liweijian.
 */
@Async
@Service
public class AsyncServiceImpl implements AsyncService {


    @Override
    public void generateReport() {
        try {
            TimeUnit.SECONDS.sleep(5);
        } catch (Exception ex) {
            ex.printStackTrace();
        }
        System.out.println("生成报表: " + Thread.currentThread().getName());
    }

    @Override
    public void generateReport2() {
        try {
            TimeUnit.SECONDS.sleep(5);
        } catch (Exception ex) {
            ex.printStackTrace();
        }
        System.out.println("生成报表2: " + Thread.currentThread().getName());
    }
}
