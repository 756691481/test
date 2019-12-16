package com.example.demo.mapper;

import com.example.demo.entity.CommentUser;
import com.example.demo.entity.CommentUserExample;
import java.util.List;

public interface CommentUserMapper {
    int deleteByPrimaryKey(Integer id);

    int insert(CommentUser record);

    int insertSelective(CommentUser record);

    List<CommentUser> selectByExample(CommentUserExample example);

    CommentUser selectByPrimaryKey(Integer id);

    int updateByPrimaryKeySelective(CommentUser record);

    int updateByPrimaryKey(CommentUser record);
}