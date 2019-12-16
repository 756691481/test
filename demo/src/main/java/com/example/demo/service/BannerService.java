package com.example.demo.service;

import com.example.demo.entity.BannerUser;
import com.example.demo.entity.BannerUserExample;

import java.util.List;

public interface BannerService {
    List<BannerUser> selectByExample(BannerUserExample example);
}
