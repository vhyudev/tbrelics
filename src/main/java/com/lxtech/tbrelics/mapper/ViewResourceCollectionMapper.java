package com.lxtech.tbrelics.mapper;

import com.lxtech.tbrelics.view.ViewResourceCollection;
import com.lxtech.tbrelics.vo.RelicandresourceAttribute;
import org.apache.ibatis.annotations.Param;
import org.apache.ibatis.annotations.Select;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public interface ViewResourceCollectionMapper {
    int insert(ViewResourceCollection record);

    int insertSelective(ViewResourceCollection record);

    @Select("select * from view_resource_collection where id=#{id}")
    ViewResourceCollection selectById(@Param("id")Long id);

    //无条件查询总条数
    @Select("select relicId from view_resource_collection where relicId!=1 group by relicId")
    List<Long> selectRelicBySql();

    //无条件分页
    @Select("select relicId from view_resource_collection where relicId!=1 group by relicId  limit #{start},#{end}")
    List<Long>  selectRelicBySqlConpaging(@Param("start")int start, @Param("end")int end);

    //有条件查询总条数
    List<Long> selectRelicBySqlSplicing(RelicandresourceAttribute relicandresourceAttribute);

    //有条件查询分页
    List<ViewResourceCollection> selectRelicByHaveSqlConpaging(RelicandresourceAttribute relicandresourceAttribute);

    @Select("select relicId from view_resource_collection where relicId!=1 and identifier=#{identifier} group by " +
            "relicId")
    List<ViewResourceCollection> selectRelicByIdentifier(@Param("identifier")String identifier);

    @Select("select relicId from view_resource_collection where relicId!=1 and identifier like CONCAT('%',#{identifier},'%') group " +
            "by relicId")
    List<ViewResourceCollection> selectRelicListByIdentifier(@Param("identifier")String identifier);

    /*===================以资源为主体========================*/
    //无条件
    @Select("select * from view_resource_collection where relicId!=1 group by relicId  limit #{start},#{end}")
    List<ViewResourceCollection> findAllPage(@Param("start")int start, @Param("end")int end);
    @Select("select count(*) from view_resource_collection where relicId!=1")
    int findAllCount();

    //有条件
    List<ViewResourceCollection> findBySqlPage(RelicandresourceAttribute relicandresourceAttribute);
    int findBySqlPageCount(RelicandresourceAttribute relicandresourceAttribute);

    //模糊搜索文物号
    @Select("select * from view_resource_collection where identifier like CONCAT('%',#{identifier},'%') " +
            "order by relicId  limit #{start},#{end}")
    List<ViewResourceCollection> findByLikePage(@Param("identifier")String identifier,
                                                @Param("start")int start,
                                                @Param("end")int end);
    @Select("select count(*) from view_resource_collection where identifier like CONCAT('%',#{identifier},'%')")
    int findByLikeCount(@Param("identifier")String identifier);
}