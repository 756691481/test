package com.example.demo.service.serviceimpl;

import com.example.demo.entity.CommentUser;
import com.example.demo.entity.CommentUserExample;
import com.example.demo.mapper.CommentUserMapper;
import com.example.demo.service.CommentService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
@Service
public class CommentServiceImpl implements CommentService {
    @Autowired
    CommentUserMapper mapper;
    public List<CommentUser> selectByExample(CommentUserExample example){
        List<CommentUser> selectByExample=mapper.selectByExample(example);
        return selectByExample;
    }
}
