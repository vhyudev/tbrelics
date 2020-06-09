package com.lxtech.tbrelics.mapper;

import com.lxtech.tbrelics.view.ViewApplicationResource;
import com.lxtech.tbrelics.view.ViewApplicationResourceExample;
import java.util.List;
import org.apache.ibatis.annotations.Param;
import org.apache.ibatis.annotations.Select;
import org.springframework.stereotype.Repository;

@Repository
public interface ViewApplicationResourceMapper {
    int countByExample(ViewApplicationResourceExample example);

    int deleteByExample(ViewApplicationResourceExample example);

    int insert(ViewApplicationResource record);

    int insertSelective(ViewApplicationResource record);

    @Select("select * from view_application_resource where userId=#{userId}")
    List<ViewApplicationResource> selectByViewAppRes(@Param("userId") long userId);

    List<ViewApplicationResource> selectByExample(ViewApplicationResourceExample example);

    int updateByExampleSelective(@Param("record") ViewApplicationResource record, @Param("example") ViewApplicationResourceExample example);

    int updateByExample(@Param("record") ViewApplicationResource record, @Param("example") ViewApplicationResourceExample example);
}