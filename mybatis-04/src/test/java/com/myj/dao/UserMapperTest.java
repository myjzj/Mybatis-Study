package com.myj.dao;

import com.myj.pojo.User;
import com.myj.utils.MybatisUtils;
import org.apache.ibatis.session.RowBounds;
import org.apache.ibatis.session.SqlSession;
import org.apache.log4j.Logger;
import org.junit.Test;

import java.lang.ref.SoftReference;
import java.util.HashMap;
import java.util.List;

public class UserMapperTest {

    static Logger logger = Logger.getLogger(UserMapperTest.class);

    @Test
    public void getUserRowBounds(){
        SqlSession sqlSession = MybatisUtils.getSqlSession();

        RowBounds rowBounds = new RowBounds(1, 2);

        List<User> userList = sqlSession.selectList("com.myj.dao.UserMapper.getUserRowBounds",null,rowBounds);
        for (User user : userList) {
            System.out.println(user);
        }

        sqlSession.close();
    }
    @Test
    public void limitTest(){
        SqlSession sqlSession = MybatisUtils.getSqlSession();
        UserMapper mapper = sqlSession.getMapper(UserMapper.class);

        HashMap<String, Integer> map = new HashMap<String, Integer>();
        map.put("startIndex",0);
        map.put("pageSize",3);

        List<User> userList = mapper.getUserByLimit(map);
        for (User user : userList) {
            System.out.println(user);
        }

        sqlSession.close();
    }

    @Test
    public void test(){
        SqlSession sqlSession = MybatisUtils.getSqlSession();

        UserMapper userMapper = sqlSession.getMapper(UserMapper.class);
        User user = userMapper.getUserById(1);

        System.out.println(user);

        sqlSession.close();
    }
    @Test
    public void testLog4j(){
        logger.info("info:进入了testLog4j");
        logger.debug("debug:进入了testLog4j");
        logger.error("error:进入了testLog4j");
    }
}
