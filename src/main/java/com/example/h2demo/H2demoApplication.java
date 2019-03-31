package com.example.h2demo;

import org.mybatis.spring.annotation.MapperScan;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.scheduling.annotation.EnableAsync;
import org.springframework.scheduling.annotation.EnableScheduling;
import org.springframework.web.socket.config.annotation.EnableWebSocket;


@EnableScheduling
@EnableAsync
@MapperScan("com.example.h2demo.dao")
@SpringBootApplication
public class H2demoApplication {

	public static void main(String[] args) {
		SpringApplication.run(H2demoApplication.class, args);
	}
}