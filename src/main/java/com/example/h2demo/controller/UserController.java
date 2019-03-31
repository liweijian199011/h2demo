package com.example.h2demo.controller;

//import com.dianping.cat.Cat;
//import com.dianping.cat.message.Event;
//import com.dianping.cat.message.Transaction;
import com.example.h2demo.entity.User;
import com.example.h2demo.service.UserService;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.ArrayList;
import java.util.List;

/**
 * Description
 * <p>
 *     用户接口
 * </p>
 * Date: 2017/7/26
 *
 * @author: 李伟健
 */
@RestController
@RequestMapping("/user")
public class UserController {

    private final Logger logger = LoggerFactory.getLogger(UserController.class);

    @Autowired
    private UserService userService;

//    @GetMapping("/list")
//    public ResponseEntity<?> listUser(UserPo userPo) {
//        String pageName = "http://aaa";
//        String serverIp = "127.0.0.1";
//        double amount = 0;
//        Transaction t = Cat.newTransaction("URL", pageName);
//        List<User> userList = new ArrayList<>(20);
//        try {
//            Cat.logEvent("URL.Server", serverIp, Event.SUCCESS, "ip=" + serverIp + "&...");
//            Cat.logMetricForCount("pageCount");
//            Cat.logMetricForSum("PayAmount", amount);
//
//            userList = userService.listUser(userPo);
//
//            t.setStatus(Event.SUCCESS);
//        } catch (Exception e) {
//            t.setStatus(e);
//        } finally {
//            t.complete();
//        }
//        logger.info("开始查询用户信息, 查询条件：{}", userPo);
//        return new ResponseEntity<>(userList,
//                HttpStatus.OK);
//    }

    @PostMapping("/add")
    public ResponseEntity<?> addUser(@RequestBody User user) {
        logger.info("开始新增用户信息：{}", user);
        Integer result = 0;
        try {
            result = userService.addUser(user);
        } catch (RuntimeException ex) {
            throw new RuntimeException(ex.getMessage());
        }
        return new ResponseEntity<>(result, HttpStatus.CREATED);
    }
}