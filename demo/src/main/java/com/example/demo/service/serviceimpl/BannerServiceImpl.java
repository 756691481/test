package com.example.demo.service.serviceimpl;

import com.example.demo.entity.BannerUser;
import com.example.demo.entity.BannerUserExample;
import com.example.demo.mapper.BannerUserMapper;
import com.example.demo.service.BannerService;
import com.example.demo.tool.Timer;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
@Service
public class BannerServiceImpl implements BannerService {
    @Autowired
    BannerUserMapper mapper;
    public List<BannerUser> selectByExample(BannerUserExample example){
        List<BannerUser> selectByExample=mapper.selectByExample(example);
        return selectByExample;
    }

}
