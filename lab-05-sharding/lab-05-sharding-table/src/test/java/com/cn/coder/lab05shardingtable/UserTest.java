package com.cn.coder.lab05shardingtable;

import com.cn.coder.lab05shardingtable.entity.UserEntity;
import com.cn.coder.lab05shardingtable.service.UserService;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.junit4.SpringRunner;

import java.util.ArrayList;
import java.util.List;

/**
 * @USER wh
 * @DATE 2021/1/21
 * @Description
 */
@RunWith(SpringRunner.class)
@SpringBootTest(classes = Lab05ShardingTableApplication.class)
public class UserTest {
    @Autowired
    private UserService userService;

    @Test
    public void insertBatch(){
        List<UserEntity> list = new ArrayList<>();
        UserEntity entity = new UserEntity();
        entity.setPassword("111");
        entity.setRealName("测试1");
        entity.setUserName("ceshi1");
        list.add(entity);
        UserEntity entity2 = new UserEntity();
        entity2.setPassword("222");
        entity2.setRealName("测试2");
        entity2.setUserName("ceshi2");
        list.add(entity2);
        UserEntity entity3 = new UserEntity();
        entity3.setPassword("333");
        entity3.setRealName("测试3");
        entity3.setUserName("ceshi3");
        list.add(entity3);
        UserEntity entity4 = new UserEntity();
        entity4.setPassword("444");
        entity4.setRealName("测试4");
        entity4.setUserName("ceshi4");
        list.add(entity4);
        UserEntity entity5 = new UserEntity();
        entity5.setPassword("555");
        entity5.setRealName("测试5");
        entity5.setUserName("ceshi5");
        list.add(entity5);
        userService.insertBatch(list);
    }

    @Test
    public void findList(){
        List<UserEntity> list = userService.findByCondition(new UserEntity());
        list.forEach(userEntity -> {
            System.out.println(userEntity.getUserName());
        });
    }
}
