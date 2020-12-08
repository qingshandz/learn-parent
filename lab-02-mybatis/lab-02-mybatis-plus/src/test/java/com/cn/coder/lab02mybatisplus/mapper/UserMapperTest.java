package com.cn.coder.lab02mybatisplus.mapper;

import com.baomidou.mybatisplus.core.metadata.IPage;
import com.baomidou.mybatisplus.extension.plugins.pagination.Page;
import com.cn.coder.lab02mybatisplus.Lab02MybatisPlusApplication;
import com.cn.coder.lab02mybatisplus.entity.UserEntity;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.junit4.SpringRunner;

import java.util.*;

/**
 * @USER wh
 * @DATE 2020/12/8
 * @Description
 */
@RunWith(SpringRunner.class)
@SpringBootTest(classes = Lab02MybatisPlusApplication.class)
public class UserMapperTest {

    @Autowired
    private UserMapper userMapper;

    @Test
    public void testInsert() {
        UserEntity user = new UserEntity();
        user.setUsername(UUID.randomUUID().toString());
        user.setPassword("nicai");
        user.setCreateTime(new Date());
        user.setDeleted(0); // 一般情况下，是否删除，可以全局枚举下。
        userMapper.insert(user);
    }

    @Test
    public void testUpdateById() {
        UserEntity updateUser = new UserEntity();
        updateUser.setId(1);
        updateUser.setPassword("wobucai");
        userMapper.updateById(updateUser);
    }

    @Test
    public void testDeleteById() {
        userMapper.deleteById(2);
    }

    @Test
    public void testSelectById() {
        userMapper.selectById(1);
    }

    @Test
    public void testSelectByUsername() {
        userMapper.selectByUsername("yunai");
    }

    @Test
    public void testSelectByIds() {
        List<UserEntity> users = userMapper.selectByIds(Arrays.asList(1, 3));
        System.out.println("users：" + users.size());
    }

    @Test
    public void testSelectPageByCreateTime() {
        IPage<UserEntity> page = new Page<>(1, 10);
        Date createTime = new Date(2018 - 1990, Calendar.FEBRUARY, 24); // 临时 Demo ，实际不建议这么写
        page = userMapper.selectPageByCreateTime(page, createTime);
        System.out.println("users：" + page.getRecords().size());
    }
}
