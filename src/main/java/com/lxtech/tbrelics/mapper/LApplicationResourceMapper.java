package com.lxtech.tbrelics.mapper;

import com.lxtech.tbrelics.domain.LApplicationResource;
import com.lxtech.tbrelics.domain.LApplicationResourceExample;
import java.util.List;
import org.apache.ibatis.annotations.Param;
import org.apache.ibatis.annotations.Select;
import org.springframework.stereotype.Repository;

@Repository
public interface LApplicationResourceMapper {
    int countByExample(LApplicationResourceExample example);

    int deleteByExample(LApplicationResourceExample example);

    int deleteByPrimaryKey(Long id);

    int insert(LApplicationResource record);

    int insertSelective(LApplicationResource record);

    List<LApplicationResource> selectByExample(LApplicationResourceExample example);

    LApplicationResource selectByPrimaryKey(Long id);

    int updateByExampleSelective(@Param("record") LApplicationResource record, @Param("example") LApplicationResourceExample example);

    int updateByExample(@Param("record") LApplicationResource record, @Param("example") LApplicationResourceExample example);

    int updateByPrimaryKeySelective(LApplicationResource record);

    int updateByPrimaryKey(LApplicationResource record);


    @Select("select resourceId from l_application_resource where applicationId = #{applicationId}")
    List<Long> selectResourceID(@Param("applicationId") long applicationId);

    @Select("select id from l_application_resource where applicationId = #{applicationId}")
    List<Long> selectARID(@Param("applicationId") long applicationId);

}