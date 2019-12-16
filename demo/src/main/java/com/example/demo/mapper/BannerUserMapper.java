package com.example.demo.mapper;

import com.example.demo.entity.BannerUser;
import com.example.demo.entity.BannerUserExample;
import java.util.List;

public interface BannerUserMapper {
    int deleteByPrimaryKey(Integer bannerId);

    int insert(BannerUser record);

    int insertSelective(BannerUser record);

    List<BannerUser> selectByExample(BannerUserExample example);

    BannerUser selectByPrimaryKey(Integer bannerId);

    int updateByPrimaryKeySelective(BannerUser record);

    int updateByPrimaryKey(BannerUser record);
}