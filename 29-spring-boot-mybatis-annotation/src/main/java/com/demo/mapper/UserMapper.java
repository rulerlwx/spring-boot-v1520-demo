package com.demo.mapper;

import com.demo.pojo.User;
import org.apache.ibatis.annotations.Mapper;
import org.apache.ibatis.annotations.Select;

import java.util.List;

/**
 * Created by lwx on 2019/5/9.
 */
@Mapper
public interface UserMapper {
    @Select("select id,name,age from user")
    List<User> listUsers();
}
