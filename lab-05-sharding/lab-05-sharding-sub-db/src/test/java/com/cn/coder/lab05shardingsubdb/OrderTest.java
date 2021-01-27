package com.cn.coder.lab05shardingsubdb;

import com.cn.coder.lab05shardingsubdb.service.OrderService;
import com.cn.coder.lab05shardingsubdb.entity.OrderEntity;
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
@SpringBootTest(classes = Lab05ShardingSubDbApplication.class)
public class OrderTest {
    @Autowired
    private OrderService orderService;

    @Test
    public void insertBatch(){
        List<OrderEntity> list = new ArrayList<>();
        OrderEntity entity = new OrderEntity();
        entity.setUserId((long)(Math.random()*10000));
        entity.setProductName("测试产品1");
        entity.setPrice("1");
        list.add(entity);
        OrderEntity entity2 = new OrderEntity();
        entity2.setUserId((long)(Math.random()*10000));
        entity2.setProductName("测试产品2");
        entity2.setPrice("2");
        list.add(entity2);
        OrderEntity entity3 = new OrderEntity();
        entity3.setUserId((long)(Math.random()*10000));
        entity3.setProductName("测试产品3");
        entity3.setPrice("3");
        list.add(entity3);
        OrderEntity entity4 = new OrderEntity();
        entity4.setUserId((long)(Math.random()*10000));
        entity4.setProductName("测试产品4");
        entity4.setPrice("4");
        list.add(entity4);
        OrderEntity entity5 = new OrderEntity();
        entity5.setUserId((long)(Math.random()*10000));
        entity5.setProductName("测试产品5");
        entity5.setPrice("5");
        list.add(entity5);
        orderService.insertBatch(list);
    }

    @Test
    public void findList(){
        List<OrderEntity> list = orderService.findByCondition(new OrderEntity());
        list.forEach(orderEntity -> {
            System.out.println(orderEntity.getId());
        });
    }

    @Test
    public void findByPage(){
        List<OrderEntity> list = orderService.findByPage(3,4);
        list.forEach(orderEntity -> {
            System.out.println(orderEntity.getId());
        });
    }
}
