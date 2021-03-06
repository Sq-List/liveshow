package org.liveshow.dao;

import org.apache.ibatis.annotations.Param;
import org.liveshow.entity.CombinationEntity.RecommendModulePresent;
import org.liveshow.entity.CombinationEntity.RecommendModulAndInfo;
import org.liveshow.entity.Module;
import org.liveshow.entity.RecommendModule;
import org.liveshow.entity.RecommendModuleExample;
import org.liveshow.entity.Room;

import java.util.List;

public interface RecommendModuleMapper {
    int countByExample(RecommendModuleExample example);

    int deleteByExample(RecommendModuleExample example);

    int deleteByPrimaryKey(Integer id);

    int insert(RecommendModule record);

    int insertSelective(RecommendModule record);

    List<RecommendModule> selectByExample(RecommendModuleExample example);

    RecommendModule selectByPrimaryKey(Integer id);

    int updateByExampleSelective(@Param("record") RecommendModule record, @Param("example") RecommendModuleExample example);

    int updateByExample(@Param("record") RecommendModule record, @Param("example") RecommendModuleExample example);

    int updateByPrimaryKeySelective(RecommendModule record);

    int updateByPrimaryKey(RecommendModule record);

    /**
     * 查询现在推荐的模块
     * @return
     */
    List<RecommendModulePresent> selectModulePresent();

    /**
     * 判断该id的数据是否存在
     * @param id
     * @return
     */
    int confirmById(int id);

    /**
     * 更新推荐的模块
     * @param id
     * @param moduleId
     * @param recoTime
     * @return
     */
    int updateById(@Param("id") int id, @Param("moduleId") int moduleId, @Param("recoTime") int recoTime);

    /**
     * 确认该模块是否已经存在
     * @param moduleId
     * @return
     */
    int confirmModule(@Param("moduleId") int moduleId, @Param("type") Boolean type, @Param("id") int id);
    
    List<RecommendModulAndInfo> findRecoModule();
}