package com.cn.coder.lab02mybatisplus.mapper;

import com.baomidou.mybatisplus.core.conditions.query.QueryWrapper;
import com.baomidou.mybatisplus.core.mapper.BaseMapper;
import com.baomidou.mybatisplus.core.metadata.IPage;
import com.cn.coder.lab02mybatisplus.entity.UserEntity;
import org.apache.ibatis.annotations.Param;
import org.springframework.stereotype.Repository;

import java.util.Collection;
import java.util.Date;
import java.util.List;

/**
 * @USER wh
 * @DATE 2020/12/8
 * @Description
 */
@Repository
public interface UserMapper extends BaseMapper<UserEntity> {

    default UserEntity selectByUsername(@Param("username") String username) {
        return selectOne(new QueryWrapper<UserEntity>().eq("username", username));
    }

    List<UserEntity> selectByIds(@Param("ids") Collection<Integer> ids);

    default IPage<UserEntity> selectPageByCreateTime(IPage<UserEntity> page, @Param("createTime") Date createTime) {
        return selectPage(page,
                new QueryWrapper<UserEntity>().gt("create_time", createTime));
    }

}
