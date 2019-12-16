package com.example.demo.service.serviceimpl;

import com.example.demo.entity.NavigationUser;
import com.example.demo.entity.NavigationUserExample;
import com.example.demo.mapper.NavigationUserMapper;
import com.example.demo.service.NavigationService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class NavigationServiceImpl implements NavigationService {
    @Autowired
    NavigationUserMapper mapper;
    @Override
     public List<NavigationUser>  selectByExample(NavigationUserExample example){
        List<NavigationUser> selectByExample=mapper.selectByExample(example);
        return selectByExample;
    }



}
