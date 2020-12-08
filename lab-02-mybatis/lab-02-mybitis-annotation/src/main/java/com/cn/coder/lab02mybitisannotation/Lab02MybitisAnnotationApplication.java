package com.cn.coder.lab02mybitisannotation;

import org.mybatis.spring.annotation.MapperScan;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
@MapperScan("com.cn.coder.lab02mybitisannotation.mapper")
public class Lab02MybitisAnnotationApplication {

    public static void main(String[] args) {
        SpringApplication.run(Lab02MybitisAnnotationApplication.class, args);
    }

}
