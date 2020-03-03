package com.myj.dao;

import com.myj.pojo.User;
import com.myj.utils.MybatisUtils;
import org.apache.ibatis.session.SqlSession;
import org.junit.Test;

import java.util.List;

public class UserMapperTest {
    @Test
    public void test(){
//        获取sqlsession对象
        SqlSession sqlSession = MybatisUtils.getSqlSession();

//        方式一 ：getmapper（）
        UserMapper userMapper = sqlSession.getMapper(UserMapper.class);
        List<User> userList = userMapper.getUserList();

//        方式二：selectlist（）
//        List<User> userList = sqlSession.selectList("com.myj.dao.UserDao.getUserList");

        for (User user : userList) {
            System.out.println(user);
        }

        sqlSession.close();
    }

    @Test
    public void getUserById(){
        SqlSession sqlSession = MybatisUtils.getSqlSession();

        UserMapper mapper = sqlSession.getMapper(UserMapper.class);

        User user = mapper.getUserById(1);
        System.out.println(user);


        sqlSession.close();
    }

//    增删改查需要提交事务
    @Test
    public void addUser(){
        SqlSession sqlSession = MybatisUtils.getSqlSession();

        UserMapper mapper = sqlSession.getMapper(UserMapper.class);

        int res =mapper.addUser(new User(4,"麻子","44897146"));
        if (res >0){
            System.out.println("插入成功!!!");
        }

        //提交事务
        sqlSession.commit();

        sqlSession.close();
    }

    @Test
    public void updateUser(){

        SqlSession sqlSession = MybatisUtils.getSqlSession();

        UserMapper mapper = sqlSession.getMapper(UserMapper.class);
        mapper.updateUser(new User(4,"呵呵","123456"));

        sqlSession.commit();
        sqlSession.close();
    }

    @Test
    public void deleteUser(){
        SqlSession sqlSession = MybatisUtils.getSqlSession();

        UserMapper mapper = sqlSession.getMapper(UserMapper.class);
        mapper.deleteUser(4);

        sqlSession.commit();
        sqlSession.close();
    }
}
