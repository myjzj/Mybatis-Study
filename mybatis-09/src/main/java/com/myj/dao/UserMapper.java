package com.myj.dao;

import com.myj.pojo.User;
import org.apache.ibatis.annotations.Param;

public interface UserMapper {

    User queryUserById(@Param("id") int id);
}
