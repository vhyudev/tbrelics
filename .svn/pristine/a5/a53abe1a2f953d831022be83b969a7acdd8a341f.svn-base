package com.lxtech.tbrelics.mapper;

import com.lxtech.tbrelics.domain.LApplication;
import com.lxtech.tbrelics.domain.LCollection;
import com.lxtech.tbrelics.domain.LCollectionExample;
import java.util.List;

import org.apache.ibatis.annotations.Insert;
import org.apache.ibatis.annotations.Options;
import org.apache.ibatis.annotations.Param;
import org.apache.ibatis.annotations.Select;
import org.springframework.stereotype.Repository;

@Repository
public interface LCollectionMapper {
    int countByExample(LCollectionExample example);

    int deleteByExample(LCollectionExample example);

    int deleteByPrimaryKey(Long id);

    int insert(LCollection record);

    int insertSelective(LCollection record);

    List<LCollection> selectByExample(LCollectionExample example);

    LCollection selectByPrimaryKey(Long id);

    int updateByExampleSelective(@Param("record") LCollection record, @Param("example") LCollectionExample example);

    int updateByExample(@Param("record") LCollection record, @Param("example") LCollectionExample example);

    int updateByPrimaryKeySelective(LCollection record);

    int updateByPrimaryKey(LCollection record);

    //@Select("select period from l_collection where period !='' group by period")
    List<String> selectRelicsAge();

    @Select("select workType from l_collection where workType !='' group by workType")
    List<String> selectRelicsType();

    @Select("select level from l_collection where level !='' group by level "+
            "order by " +
            "case `level` " +
            "when '一级' then 1 when '二级' then 2 " +
            "when '三级' then 3 when '一般' then 4 " +
            "when '未定级' then 5 " +
            "end asc" )
    List<String> selectRelicsLevel();

    @Select("select id from l_collection where identifier = #{identifier}")
    List<Long> selectRelicsId(@Param("identifier")String identifier);

    //新增实体返回主键
    @Insert("INSERT INTO l_collection(identifier) VALUES" +
            "(#{identifier})")
    //增加这个注解插入记录后会返回自增长的id
    @Options(useGeneratedKeys = true, keyProperty = "id", keyColumn = "id")
    int insertCollection(LCollection record);

    @Select("select * from l_collection where identifier=#{identifier} limit #{start},#{end}")
    List<LCollection> selectByIdentifier(@Param("identifier")String identifier,@Param("start")int start, @Param("end")int end);
    @Select("select count(*) from l_collection where identifier=#{identifier}")
    int selectCountByIdentifier(@Param("identifier")String identifier);

    @Select("select rc.relicId AS id,rc.identifierType,rc.identifier,rc.title,rc.period,rc.materials,rc.`level` " +
            "FROM view_resource_collection rc WHERE rc.identifier LIKE CONCAT('%',#{identifier},'%') " +
            "UNION SELECT c.id,c.identifierType,c.identifier,c.title,c.period,c.materials,c.`level` "+
            "FROM l_collection c,view_resource_collection rc WHERE c.identifier LIKE CONCAT('%',#{identifier},'%') " +
            "AND c.id!=rc.relicId limit #{start},#{end}")
    List<LCollection> selectListByIdentifier(@Param("identifier")String identifier,@Param("start")int start, @Param("end")int end);
    @Select("select count(*) from l_collection where identifier like CONCAT('%',#{identifier},'%')")
    int selecListCounttByIdentifier(@Param("identifier")String identifier);


    @Select("select identifier from l_collection where level ='一级' or level='二级'")
    List<String> selectRelicsIDByLevel();


    @Select("SELECT count(*) FROM view_resource_collection WHERE level= #{level}")
    int  selectResourceCountByLevel(@Param("level")String level);

    @Select("SELECT addresss FROM view_resource_collection WHERE level= #{level} ORDER BY id limit #{start},#{end} ")
    List<String> selectResourcesAddress(@Param("start") int start,@Param("end") int end,@Param("level")String level);

}