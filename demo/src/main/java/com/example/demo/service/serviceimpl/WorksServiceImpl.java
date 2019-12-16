package com.example.demo.service.serviceimpl;

import com.example.demo.mapper.WorksUserMapper;
import com.example.demo.entity.WorksUser;
import com.example.demo.entity.WorksUserExample;
import com.example.demo.service.WorksService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class WorksServiceImpl implements WorksService {
    @Autowired
    public WorksUserMapper mapper;

    @Override
    public List<WorksUser> selectByExample(WorksUserExample example) {
        List<WorksUser> selectByExample = mapper.selectByExample(example);
        return selectByExample;
    }}
