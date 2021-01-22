package com.cn.coder.lab05shardingtable.service;


import com.cn.coder.lab05shardingtable.entity.UserEntity;

import java.util.List;

/**
 * @USER wh
 * @DATE 2020/9/14
 * @Description
 */
public interface UserService {

    List<UserEntity> findByCondition(UserEntity userEntity);

    int insertBatch(List<UserEntity> list);
}
