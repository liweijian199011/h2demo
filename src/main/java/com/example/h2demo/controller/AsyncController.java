package com.example.h2demo.controller;

import com.example.h2demo.service.AsyncService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

/**
 * Description
 * <p>
 * </p>
 * DATE 2019/2/23.
 *
 * @author liweijian.
 */
@RestController
public class AsyncController {

    @Autowired
    private AsyncService asyncService;

    @GetMapping("/async")
    public String asyncReport() {
        System.out.println("请求线程名称：" + Thread.currentThread().getName());
        asyncService.generateReport();
        asyncService.generateReport2();
        return "async";
    }
}
