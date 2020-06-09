package com.lxtech.tbrelics.mapper;

import com.lxtech.tbrelics.view.ViewShopcart;
import com.lxtech.tbrelics.view.ViewShopcartExample;
import java.util.List;
import org.apache.ibatis.annotations.Param;
import org.apache.ibatis.annotations.Select;
import org.springframework.stereotype.Repository;

@Repository
public interface ViewShopcartMapper {
    int countByExample(ViewShopcartExample example);

    int deleteByExample(ViewShopcartExample example);

    int insert(ViewShopcart record);

    int insertSelective(ViewShopcart record);

    List<ViewShopcart> selectByExample(ViewShopcartExample example);

    @Select("select * from view_shopcart where userid=#{userid} order by relicId")
    List<ViewShopcart> selectByViewShop(@Param("userid") long userid);

    int updateByExampleSelective(@Param("record") ViewShopcart record, @Param("example") ViewShopcartExample example);

    int updateByExample(@Param("record") ViewShopcart record, @Param("example") ViewShopcartExample example);

    @Select("select relicId from view_shopcart where userid=#{userid} and relicId !='' group by relicId")
    List<Long> selectRelicId();
}