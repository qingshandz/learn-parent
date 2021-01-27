package com.cn.coder.lab05shardingsubdb.service.impl;

import com.cn.coder.lab05shardingsubdb.dao.OrderMapper;
import com.cn.coder.lab05shardingsubdb.entity.OrderEntity;
import com.cn.coder.lab05shardingsubdb.service.OrderService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import java.util.List;

/**
 * @USER wh
 * @DATE 2020/9/14
 * @Description
 */
@Service
public class OrderServiceImpl implements OrderService {
    @Autowired
    private OrderMapper orderMapper;

    @Override
    public List<OrderEntity> findByCondition(OrderEntity orderEntity) {
        return orderMapper.findByCondition(orderEntity);
    }

    @Override
    @Transactional
    public int insertBatch(List<OrderEntity> list) {
        return orderMapper.insertBatch(list);
    }

    @Override
    public List<OrderEntity> findByPage(int pageNum, int pageSize) {
        return orderMapper.findByPage((pageNum-1)*pageSize,pageSize);
    }
}
