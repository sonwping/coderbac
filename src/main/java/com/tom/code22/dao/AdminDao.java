package com.tom.code22.dao;

import com.tom.coderbac.bean.User;
import org.apache.ibatis.annotations.Mapper;

//@Mapper
public interface AdminDao {
    public User selectall();
}
