package com.cn.coder.lab05shardingtable.service.impl;

import com.cn.coder.lab05shardingtable.dao.UserMapper;
import com.cn.coder.lab05shardingtable.entity.UserEntity;
import com.cn.coder.lab05shardingtable.service.UserService;
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
public class UserServiceImpl implements UserService {
    @Autowired
    private UserMapper userMapper;

    @Override
    public List<UserEntity> findByCondition(UserEntity userEntity) {
        return userMapper.findByCondition(userEntity);
    }

    @Override
    @Transactional
    public int insertBatch(List<UserEntity> list) {
        return userMapper.insertBatch(list);
    }
}
