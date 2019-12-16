package com.example.demo.mapper;

import com.example.demo.entity.NavigationUser;
import com.example.demo.entity.NavigationUserExample;
import java.util.List;

public interface NavigationUserMapper {
    int deleteByPrimaryKey(Integer id);

    int insert(NavigationUser record);

    int insertSelective(NavigationUser record);

    List<NavigationUser> selectByExample(NavigationUserExample example);

    NavigationUser selectByPrimaryKey(Integer id);

    int updateByPrimaryKeySelective(NavigationUser record);

    int updateByPrimaryKey(NavigationUser record);
}