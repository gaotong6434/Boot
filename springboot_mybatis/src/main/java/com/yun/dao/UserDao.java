package com.yun.dao;

import com.yun.domain.User;
import org.apache.ibatis.annotations.Mapper;

import java.util.List;

public interface UserDao {

    @Mapper
    public List<User> queryUserList();
}
