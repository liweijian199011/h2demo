package com.example.h2demo.service.impl;

import com.example.h2demo.service.SchedulingService;
import org.springframework.scheduling.annotation.Async;
import org.springframework.scheduling.annotation.Scheduled;
import org.springframework.stereotype.Service;

/**
 * Description
 * <p>
 * </p>
 * DATE 2019/2/23.
 *
 * @author liweijian.
 */
@Service
@Async
public class SchedulingServiceImpl implements SchedulingService {

    private int count1 = 1;
    private int count2 = 1;

//    @Scheduled(initialDelay = 10000, fixedRate = 1000)
    @Override
    public void job1() {
        System.out.println("job1：" + Thread.currentThread().getName() + "执行第" + count1++ + "次");
    }
}
