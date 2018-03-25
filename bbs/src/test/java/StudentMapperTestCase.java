import com.hjl.entity.Student;
import com.hjl.mapper.StudentMapper;
import com.hjl.util.SqlSessionFactoryUtil;
import org.apache.ibatis.session.SqlSession;
import org.junit.After;
import org.junit.Before;
import org.junit.Test;

public class StudentMapperTestCase {
    private SqlSession sqlSession;
    private StudentMapper studentMapper;

    @Before
    public void init() {
        // 自动提交事务
        sqlSession = SqlSessionFactoryUtil.getSqlSession(true);
        // 动态代理 动态生成
        studentMapper = sqlSession.getMapper(StudentMapper.class);
    }
    @After
    public void destroy() {
        // 5.关闭sqlSession
        sqlSession.close();
    }

    @Test
    public void TestFindById () {
        Student student = studentMapper.findById(1);
        System.out.println(student);
    }




}
