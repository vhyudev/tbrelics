package com.lxtech.tbrelics.mapper;

import com.lxtech.tbrelics.domain.LApplication;
import com.lxtech.tbrelics.domain.LApplicationExample;
import java.util.List;

import org.apache.ibatis.annotations.Insert;
import org.apache.ibatis.annotations.Options;
import org.apache.ibatis.annotations.Param;
import org.apache.ibatis.annotations.Select;
import org.springframework.stereotype.Repository;

@Repository
public interface LApplicationMapper {
    int countByExample(LApplicationExample example);

    int deleteByExample(LApplicationExample example);

    int deleteByPrimaryKey(Long id);

    int insert(LApplication record);

    int insertSelective(LApplication record);

    List<LApplication> selectByExample(LApplicationExample example);

    LApplication selectByPrimaryKey(Long id);

    int updateByExampleSelective(@Param("record") LApplication record, @Param("example") LApplicationExample example);

    int updateByExample(@Param("record") LApplication record, @Param("example") LApplicationExample example);

    int updateByPrimaryKeySelective(LApplication record);

    int updateByPrimaryKey(LApplication record);

    //新增实体返回主键
    @Insert("INSERT INTO l_application(appName,purpose,total,userId,applyTime,useTime,status) VALUES" +
            "(#{appname},#{purpose},#{total},#{userid},#{applytime},#{usetime},#{status})")
    //增加这个注解插入记录后会返回自增长的id
    @Options(useGeneratedKeys = true, keyProperty = "id", keyColumn = "id")
    int insertApplication(LApplication record);

    @Select("select * from l_application where userId = #{userId}")
    List<LApplication> selectApps(@Param("userId") long userId);
}