import com.hjl.entity.Account;
import org.apache.ibatis.io.Resources;
import org.apache.ibatis.session.SqlSession;
import org.apache.ibatis.session.SqlSessionFactory;
import org.apache.ibatis.session.SqlSessionFactoryBuilder;
import org.junit.Test;

import java.io.Reader;

public class AccountMapperTestCase {

    @Test
    public void testFindById() throws Exception {

        // 1.加载配置文件
        Reader reader = Resources.getResourceAsReader("mybatis-config.xml");
        // 2.创建SqlSessionFactory
        SqlSessionFactoryBuilder sqlSessionFactoryBuilder = new SqlSessionFactoryBuilder();
        SqlSessionFactory sqlSessionFactory = sqlSessionFactoryBuilder.build(reader);
        // 3.创建SqlSession
        SqlSession sqlSession = sqlSessionFactory.openSession();
        // 4.操作数据库
        // UserMapper.xml 的namespace + id
        Account account = sqlSession.selectOne("com.hjl.mapper.AccountMapper.findById",1);
        System.out.println(account);
        // 5.关闭sqlSession
        sqlSession.close();
    }

    @Test
    public void testFindAll() throws Exception {


    }

    @Test
    public void testUpdate() throws Exception {


    }

    @Test
    public void testInsert() throws Exception {


    }

    @Test
    public void testDelete() throws Exception {


    }

}
