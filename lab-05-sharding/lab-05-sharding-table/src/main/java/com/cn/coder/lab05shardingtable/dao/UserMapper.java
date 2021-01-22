package com.cn.coder.lab05shardingtable.dao;

import com.cn.coder.lab05shardingtable.entity.UserEntity;
import org.apache.ibatis.annotations.Mapper;

import java.util.List;

/**
 * @USER wh
 * @DATE 2020/9/14
 * @Description
 */
@Mapper
public interface UserMapper {

    List<UserEntity> findByCondition(UserEntity userEntity);

    int insertBatch(List<UserEntity> list);
}
