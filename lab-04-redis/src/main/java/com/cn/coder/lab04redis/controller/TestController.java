package com.cn.coder.lab04redis.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.redis.core.RedisTemplate;
import org.springframework.web.bind.annotation.*;

import java.util.HashMap;
import java.util.Map;
import java.util.concurrent.TimeUnit;

/**
 * @USER wh
 * @DATE 2021/1/5
 * @Description
 */
@RestController
@RequestMapping("/test")
public class TestController {
    @Autowired
    public RedisTemplate<String,String> redisTemplate;

    @GetMapping("/redisTest")
    public Map<String,Object> redisTest(){
        redisTemplate.opsForValue().set("myKey", "myValue",100, TimeUnit.SECONDS);
        String myKey = redisTemplate.opsForValue().get("myKey");
        System.out.println(myKey);
        Map<String,Object> resultMap = new HashMap<String,Object>();
        resultMap.put("myKey",myKey);
        return resultMap;
    }
}
