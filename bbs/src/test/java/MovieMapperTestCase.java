import com.hjl.entity.Movie;
import com.hjl.mapper.MovieMapper;
import com.hjl.mapper.StudentMapper;
import com.hjl.util.SqlSessionFactoryUtil;
import org.apache.ibatis.annotations.Param;
import org.apache.ibatis.session.SqlSession;
import org.junit.After;
import org.junit.Before;
import org.junit.Test;

import java.util.List;

public class MovieMapperTestCase {

    private SqlSession sqlSession;
    private MovieMapper movieMapper;

    @Before
    public void init() {
        // 自动提交事务
        sqlSession = SqlSessionFactoryUtil.getSqlSession(true);
        // 动态代理 动态生成
        movieMapper = sqlSession.getMapper(MovieMapper.class);
    }
    @After
    public void destroy() {
        // 5.关闭sqlSession
        sqlSession.close();
    }

    @Test
    public void testFindList() {

        List<Movie> movieList = movieMapper.findList(null);
        for (Movie movie : movieList) {
            System.out.println(movie);
        }
    }

    @Test
    public void testFindByParams() {

    }




}
