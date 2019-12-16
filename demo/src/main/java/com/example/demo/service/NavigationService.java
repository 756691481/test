package com.example.demo.service;

import com.example.demo.entity.NavigationUser;
import com.example.demo.entity.NavigationUserExample;

import java.util.List;

public interface NavigationService {
    List<NavigationUser> selectByExample(NavigationUserExample example);
}
