package com.ed.mapper;

import com.ed.pojo.Achievement;

public interface AchievementMapper {
    int deleteByPrimaryKey(Integer achievementId);

    int insert(Achievement record);

    int insertSelective(Achievement record);

    Achievement selectByPrimaryKey(Integer achievementId);

    int updateByPrimaryKeySelective(Achievement record);

    int updateByPrimaryKey(Achievement record);
}