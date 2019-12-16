package com.example.demo.service;

import com.example.demo.entity.WorksUser;
import com.example.demo.entity.WorksUserExample;

import java.util.List;

public interface WorksService {
List<WorksUser> selectByExample(WorksUserExample example);
}
