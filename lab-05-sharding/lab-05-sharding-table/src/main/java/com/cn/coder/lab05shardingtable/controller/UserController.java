package com.cn.coder.lab05shardingtable.controller;

import com.cn.coder.lab05shardingtable.entity.UserEntity;
import com.cn.coder.lab05shardingtable.service.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

/**
 * @USER wh
 * @DATE 2020/9/14
 * @Description
 */

@RestController
@RequestMapping("/user")
public class UserController {

    @Autowired
    private UserService userService;

    @GetMapping("/findByCondition")
    public List<UserEntity> findByCondition(UserEntity userEntity){
        return userService.findByCondition(userEntity);
    }
}
