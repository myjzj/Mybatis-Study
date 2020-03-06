import com.myj.dao.UserMapper;
import com.myj.pojo.User;
import com.myj.utils.MybatisUtils;
import org.apache.ibatis.session.SqlSession;
import org.junit.Test;

public class MyTest {


    @Test
    public void queryUserById(){
        SqlSession sqlSession1 = MybatisUtils.getSqlSession();
        SqlSession sqlSession2 = MybatisUtils.getSqlSession();

        UserMapper mapper1 = sqlSession1.getMapper(UserMapper.class);
        UserMapper mapper2 = sqlSession2.getMapper(UserMapper.class);

        User user = mapper1.queryUserById(1);
        System.out.println(user);
            sqlSession1.close();
//        sqlSession.clearCache();//手动清理缓存

        User user2 = mapper2.queryUserById(1);
        System.out.println(user2);


        sqlSession2.close();
    }
}
