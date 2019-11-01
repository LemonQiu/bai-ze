package com.kunlun.baize.bound;

import org.mybatis.spring.annotation.MapperScan;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.transaction.annotation.EnableTransactionManagement;

@SpringBootApplication
@EnableTransactionManagement
@ComponentScan(basePackages = {"com.kunlun.baize.bound", "com.kunlun.baize.api", "com.kunlun.baize.common",
        "com.kunlun.baize.dao", "com.kunlun.baize.sdk", "com.kunlun.baize.service", "com.kunlun.baize.web"})
@MapperScan("com.kunlun.baize.mapper")
public class Application {

    public static void main(String[] args) {
        SpringApplication.run(Application.class, args);
    }

}
