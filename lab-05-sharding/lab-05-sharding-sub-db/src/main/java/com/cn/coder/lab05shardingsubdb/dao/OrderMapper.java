package com.cn.coder.lab05shardingsubdb.dao;

import com.cn.coder.lab05shardingsubdb.entity.OrderEntity;
import org.apache.ibatis.annotations.Mapper;
import org.apache.ibatis.annotations.Param;

import java.util.List;

/**
 * @USER wh
 * @DATE 2020/9/14
 * @Description
 */
@Mapper
public interface OrderMapper {

    List<OrderEntity> findByCondition(OrderEntity orderEntity);

    int insertBatch(List<OrderEntity> list);

    List<OrderEntity> findByPage(@Param("startIndex") int startIndex, @Param("pageSize")int pageSize);
}
