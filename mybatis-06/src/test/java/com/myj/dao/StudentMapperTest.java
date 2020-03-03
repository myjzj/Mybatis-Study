package com.myj.dao;

import com.myj.pojo.Student;
import com.myj.utils.MybatisUtils;
import org.apache.ibatis.session.SqlSession;
import org.junit.Test;

import java.util.List;

public class StudentMapperTest {

    @Test
    public void test(){
        SqlSession sqlSession = MybatisUtils.getSqlSession();

        StudentMapper mapper = sqlSession.getMapper(StudentMapper.class);
        List<Student> student = mapper.getStudent();

        for (Student s : student) {
            System.out.println(s);
        }
        sqlSession.close();
    }
    @Test
    public void test2(){
        SqlSession sqlSession = MybatisUtils.getSqlSession();

        StudentMapper mapper = sqlSession.getMapper(StudentMapper.class);
        List<Student> student2 = mapper.getStudent2();
        for (Student student : student2) {
            System.out.println(student);
        }

        sqlSession.close();
    }
}
