package com.lxtech.tbrelics.mapper;

import com.lxtech.tbrelics.domain.LCollection;
import com.lxtech.tbrelics.vo.RelicandresourceAttribute;
import org.apache.ibatis.annotations.Param;
import org.apache.ibatis.annotations.Select;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public interface ViewCollectionCountMapper {

    @Select("SELECT id,identifierType,identifier,title,period,date,workType," +
            "materials,`level`,source FROM view_collection_count " +
            "WHERE identifier LIKE CONCAT('%',#{identifier},'%') " +
            "limit #{start},#{end}")
    List<LCollection> findIdentifierLike(@Param("identifier") String identifier,
                                         @Param("start") int start,
                                         @Param("end") int end);

    @Select("SELECT count(*) FROM view_collection_count WHERE identifier LIKE CONCAT('%',#{identifier},'%')")
    int findIdentifierLikeCount(@Param("identifier") String identifier);

    @Select("SELECT id,identifierType,identifier,title,period,date,workType," +
            "materials,`level`,source FROM view_collection_count " +
            "WHERE title LIKE CONCAT('%',#{title},'%') " +
            "limit #{start},#{end}")
    List<LCollection> findNameLike(@Param("title") String title,
                                         @Param("start") int start,
                                         @Param("end") int end);

    @Select("SELECT count(*) FROM view_collection_count WHERE title LIKE CONCAT('%',#{title},'%')")
    int findNameLikeCount(@Param("title") String title);

    @Select("SELECT id,identifierType,identifier,title,period,date,workType," +
            "materials,`level`,source FROM view_collection_count " +
            "WHERE id!=1 limit #{start},#{end}")
    List<LCollection> findAllByPage(@Param("start") int start, @Param("end") int end);
    @Select("SELECT count(*) FROM view_collection_count WHERE id!=1")
    int findAllByPageCount();

    List<Long> findSearchByPage(RelicandresourceAttribute relicandresourceAttribute);
    int findSearchByPageCount(RelicandresourceAttribute relicandresourceAttribute);

}
