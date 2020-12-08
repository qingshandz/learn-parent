package com.cn.coder.lab02mybatisannotation.mapper;

import com.cn.coder.lab02mybatisannotation.entity.UserEntity;
import org.apache.ibatis.annotations.Param;
import org.springframework.stereotype.Repository;

import java.util.Collection;
import java.util.List;

/**
 * @USER wh
 * @DATE 2020/12/8
 * @Description
 */
@Repository //用于标记是数据访问 Bean 对象。在 MyBatis 的接口，实际非必须，只是为了避免在 Service 中，@Autowired 注入时无需报警。
public interface UserMapper {

    int insert(UserEntity user);

    int updateById(UserEntity user);

    int deleteById(@Param("id") Integer id); // 生产请使用标记删除，除非有点想不开，嘿嘿。

    UserEntity selectById(@Param("id") Integer id);

    UserEntity selectByUsername(@Param("username") String username);

    List<UserEntity> selectByIds(@Param("ids") Collection<Integer> ids);
}
