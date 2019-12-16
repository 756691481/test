package com.example.demo.service;

import com.example.demo.entity.CommentUser;
import com.example.demo.entity.CommentUserExample;

import java.util.List;

public interface CommentService {
    List<CommentUser> selectByExample(CommentUserExample example);
}
