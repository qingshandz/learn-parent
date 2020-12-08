package com.cn.coder.lab02mybatisannotation.user;

import com.cn.coder.lab02mybatisannotation.Lab02MybatisAnnotationApplication;
import com.cn.coder.lab02mybatisannotation.entity.UserEntity;
import com.cn.coder.lab02mybatisannotation.mapper.UserMapper;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.junit4.SpringRunner;

import java.util.Arrays;
import java.util.Date;
import java.util.List;
import java.util.UUID;

/**
 * @USER wh
 * @DATE 2020/12/8
 * @Description
 */
@RunWith(SpringRunner.class)
@SpringBootTest(classes = Lab02MybatisAnnotationApplication.class)
public class UserMapperTest {

    @Autowired
    private UserMapper userMapper;

    @Test
    public void testInsert() {
        UserEntity user = new UserEntity();
        user.setUsername(UUID.randomUUID().toString());
        user.setPassword("nicai");
        user.setCreateTime(new Date());
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

}
