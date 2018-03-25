import com.hjl.entity.Account;
import com.hjl.mapper.AccountMapper;
import com.hjl.mapper.StudentMapper;
import com.hjl.util.SqlSessionFactoryUtil;
import org.apache.ibatis.io.Resources;
import org.apache.ibatis.session.SqlSession;
import org.apache.ibatis.session.SqlSessionFactory;
import org.apache.ibatis.session.SqlSessionFactoryBuilder;
import org.junit.After;
import org.junit.Before;
import org.junit.Test;

import java.io.Reader;
import java.util.List;

public class AccountMapperTestCase {

    private SqlSession sqlSession;
    private AccountMapper accountMapper;

    @Before
    public void init() {
        // 自动提交事务
        sqlSession = SqlSessionFactoryUtil.getSqlSession(true);
        // 动态代理 动态生成
        accountMapper = sqlSession.getMapper(AccountMapper.class);
    }

    @After
    public void destroy() {
        // 5.关闭sqlSession
        sqlSession.close();
    }

    @Test
    public void testFindAll() {
        List<Account> accountList = accountMapper.findAll();
        for (Account account : accountList) {
            System.out.println(account);
        }
    }

    @Test
    public void testFindById() {
        Account account = accountMapper.findById(2);
        System.out.println(account);
    }

    @Test
    public void testUpdate() {
//        Account account = accountMapper.findById(2);
//        account.setTel("123");
//       accountMapper.update(account);
//        System.out.println(num);

    }

    @Test
    public void testInsert() {


    }

    @Test
    public void testDelete() {


    }

}
