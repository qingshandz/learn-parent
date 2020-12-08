package com.cn.coder.lab02mybatisannotation;

import org.mybatis.spring.annotation.MapperScan;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
@MapperScan("com.cn.coder.lab02mybatisannotation.mapper")
public class Lab02MybatisAnnotationApplication {

    public static void main(String[] args) {
        SpringApplication.run(Lab02MybatisAnnotationApplication.class, args);
    }

}
