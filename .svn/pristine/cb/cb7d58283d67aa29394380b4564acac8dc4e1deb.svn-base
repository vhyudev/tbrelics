package com.lxtech.tbrelics.mapper;

import com.lxtech.tbrelics.domain.LUserResource;
import com.lxtech.tbrelics.domain.LUserResourceExample;
import java.util.List;
import org.apache.ibatis.annotations.Param;
import org.apache.ibatis.annotations.Select;
import org.springframework.stereotype.Repository;

@Repository
public interface LUserResourceMapper {
    int countByExample(LUserResourceExample example);

    int deleteByExample(LUserResourceExample example);

    int deleteByPrimaryKey(Long urid);

    int insert(LUserResource record);

    int insertSelective(LUserResource record);

    List<LUserResource> selectByExample(LUserResourceExample example);

    LUserResource selectByPrimaryKey(Long urid);

    int updateByExampleSelective(@Param("record") LUserResource record, @Param("example") LUserResourceExample example);

    int updateByExample(@Param("record") LUserResource record, @Param("example") LUserResourceExample example);

    int updateByPrimaryKeySelective(LUserResource record);

    int updateByPrimaryKey(LUserResource record);

    @Select("select urid from l_user_resource where userid=#{userid} and resid=#{resid} ")
    Long selectDRId(@Param("userid") long userid, @Param("resid") long resid);


    @Select("select resid from l_user_resource where userid=#{userid} ORDER BY urid DESC ")
    List<Long> selectResourcesId(@Param("userid") long userid);
}