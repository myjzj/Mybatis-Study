import com.myj.dao.TeacherMapper;
import com.myj.pojo.Teacher;
import com.myj.utils.MybatisUtils;
import org.apache.ibatis.session.SqlSession;
import org.junit.Test;

public class MyTest {

    @Test
    public void test(){
        SqlSession sqlSession = MybatisUtils.getSqlSession();
        TeacherMapper mapper = sqlSession.getMapper(TeacherMapper.class);
        Teacher teacher = mapper.getTeacher(1);

        System.out.println(teacher);

        sqlSession.close();
    }
    @Test
    public void test2(){
        SqlSession sqlSession = MybatisUtils.getSqlSession();
        TeacherMapper mapper = sqlSession.getMapper(TeacherMapper.class);
        Teacher teacher = mapper.getTeacher2(1);

        System.out.println(teacher);

        sqlSession.close();
    }
}
