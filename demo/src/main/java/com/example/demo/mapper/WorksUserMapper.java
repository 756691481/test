package com.example.demo.mapper;

import com.example.demo.entity.WorksUser;
import com.example.demo.entity.WorksUserExample;
import java.util.List;

public interface WorksUserMapper {
    int deleteByPrimaryKey(Integer id);

    int insert(WorksUser record);

    int insertSelective(WorksUser record);

    List<WorksUser> selectByExample(WorksUserExample example);

    WorksUser selectByPrimaryKey(Integer id);

    int updateByPrimaryKeySelective(WorksUser record);

    int updateByPrimaryKey(WorksUser record);
}