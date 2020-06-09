package com.lxtech.tbrelics.mapper;

import com.lxtech.tbrelics.domain.LUser;
import org.apache.ibatis.annotations.Param;
import org.apache.ibatis.annotations.Select;
import org.springframework.stereotype.Repository;

@Repository
public interface LUserMapper {
    int deleteByPrimaryKey(Long uid);

    int insert(LUser record);

    int insertSelective(LUser record);

    LUser selectByPrimaryKey(Long uid);

    int updateByPrimaryKeySelective(LUser record);

    int updateByPrimaryKey(LUser record);

    @Select("select * from l_user where username=#{username} and password=#{password} ")
    LUser selectByUsernameAndPassword(@Param("username") String username, @Param("password") String password);
}