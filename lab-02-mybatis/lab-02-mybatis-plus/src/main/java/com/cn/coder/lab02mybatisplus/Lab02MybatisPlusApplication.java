package com.cn.coder.lab02mybatisplus;

import org.mybatis.spring.annotation.MapperScan;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
@MapperScan("com.cn.coder.lab02mybatisplus.mapper")
public class Lab02MybatisPlusApplication {

    public static void main(String[] args) {
        SpringApplication.run(Lab02MybatisPlusApplication.class, args);
    }

}
