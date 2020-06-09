package com.lxtech.tbrelics.mapper;

import com.lxtech.tbrelics.domain.LResource;
import com.lxtech.tbrelics.vo.RelicandresourceAttribute;
import org.apache.ibatis.annotations.Param;
import org.apache.ibatis.annotations.Select;
import org.springframework.stereotype.Repository;

import java.util.List;
@Repository
public interface LResourceMapper {
    int deleteByPrimaryKey(Long id);

    int insert(LResource record);

    int insertSelective(LResource record);

    LResource selectByPrimaryKey(Long id);

    int updateByPrimaryKeySelective(LResource record);

    int updateByPrimaryKey(LResource record);

    @Select("select * from l_resource where relicId=#{relicId} and smalladdr!='' and bigaddr!='' ")
    List<LResource> selectResourcesByrelicId(@Param("relicId") long relicId);

    List<LResource> selectResouceBySql(RelicandresourceAttribute relicandresourceAttribute);

    @Select("select format from l_resource where format !='' group by format")
    List<String> selectImgFormat();

    @Select("select resolutionRatioFlag from l_resource where resolutionRatioFlag !='' " +
            "group by resolutionRatioFlag order by resolutionRatioFlag")
    List<String> selectImgResolutionRatioFlag();

    @Select("select imgSizeFlag from l_resource where imgSizeFlag !='' " +
            "group by imgSizeFlag order by imgSizeFlag")
    List<String> selectImgSizeFlag();

    @Select("select addresss from l_resource where imgComparison=#{imgComparison}")
    List<String> selectAddresss(@Param("imgComparison") String imgComparison);
}