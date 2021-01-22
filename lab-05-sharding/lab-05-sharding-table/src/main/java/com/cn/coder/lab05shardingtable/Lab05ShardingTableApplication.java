package com.cn.coder.lab05shardingtable;

import org.mybatis.spring.annotation.MapperScan;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@MapperScan("com.cn.coder.lab05shardingtable.dao")
@SpringBootApplication
public class Lab05ShardingTableApplication {

    public static void main(String[] args) {
        SpringApplication.run(Lab05ShardingTableApplication.class, args);
    }

}
