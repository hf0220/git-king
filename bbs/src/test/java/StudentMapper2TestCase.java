import com.hjl.entity.Student;
import com.hjl.mapper.StudentMapper2;
import com.hjl.util.SqlSessionFactoryUtil;
import org.apache.ibatis.session.SqlSession;
import org.junit.After;
import org.junit.Before;
import org.junit.Test;

import java.util.List;

public class StudentMapper2TestCase {

    private SqlSession sqlSession;
    private StudentMapper2 studentMapper2;

    @Before
    public void init() {
        // 自动提交事务
        sqlSession = SqlSessionFactoryUtil.getSqlSession(true);
        // 动态代理 动态生成
        studentMapper2 = sqlSession.getMapper(StudentMapper2.class);
    }
    @After
    public void destroy() {
        // 5.关闭sqlSession
        sqlSession.close();
    }

    @Test
    public void TestFindById () {
        Student student = studentMapper2.findById(1);
        System.out.println(student);
    }

    @Test
    public void TestFindByAll () {
        List<Student> studentList = studentMapper2.findByAll();
        for (Student stu : studentList) {
            System.out.println(stu);
        }
    }


}
