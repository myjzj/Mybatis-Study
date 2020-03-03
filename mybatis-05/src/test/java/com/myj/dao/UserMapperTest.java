package com.myj.dao;

import com.myj.pojo.User;
import com.myj.utils.MybatisUtils;
import org.apache.ibatis.session.SqlSession;
import org.junit.Test;

import java.util.List;

public class UserMapperTest {

    @Test
    public void test(){

        SqlSession sqlSession = MybatisUtils.getSqlSession();
        //底层主要运用反射
        UserMapper mapper = sqlSession.getMapper(UserMapper.class);
//        List<User> userList = mapper.getUser();
//
//        for (User user : userList) {
//            System.out.println(user);
//        }

//        User userById = mapper.getUserById(1);
//        System.out.println(userById);

//        mapper.addUser(new User(5,"Hello","154646498"));
//        mapper.updateUser(new User(5,"myj","12164564"));
        mapper.deleteUser(5);
        sqlSession.close();
    }
}

