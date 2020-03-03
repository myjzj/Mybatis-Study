package com.myj.dao;

import com.myj.pojo.Teacher;
import com.myj.utils.MybatisUtils;
import org.apache.ibatis.session.SqlSession;
import org.junit.Test;

public class TeacherMapperTest {

    @Test
    public void test(){
        SqlSession sqlSession = MybatisUtils.getSqlSession();

        TeacherMapper mapper = sqlSession.getMapper(TeacherMapper.class);
        Teacher teacher = mapper.getTeacher(1);

        System.out.println(teacher);

        sqlSession.close();
    }
}
