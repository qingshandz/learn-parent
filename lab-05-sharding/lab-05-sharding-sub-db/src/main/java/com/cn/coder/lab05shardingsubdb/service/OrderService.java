package com.cn.coder.lab05shardingsubdb.service;


import com.cn.coder.lab05shardingsubdb.entity.OrderEntity;

import java.util.List;

/**
 * @USER wh
 * @DATE 2020/9/14
 * @Description
 */
public interface OrderService {

    List<OrderEntity> findByCondition(OrderEntity orderEntity);

    int insertBatch(List<OrderEntity> list);

    List<OrderEntity> findByPage(int pageNum,int pageSize);
}
