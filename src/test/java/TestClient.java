import dao.UserDao;
import entity.User;
import org.apache.ibatis.session.SqlSession;
import org.junit.Test;
import utils.MyBatisUtil;

import java.util.List;

public class TestClient {
    @Test
    public void testShowAllUser(){
        SqlSession sqlSession = MyBatisUtil.getSqlSession();
        UserDao mapper = sqlSession.getMapper(UserDao.class);
        List<User> users = mapper.showAllUser();
        System.out.println(users.toString());
    }
    @Test
    public void testVim(){
        SqlSession sqlSession = MyBatisUtil.getSqlSession();
        UserDao mapper = sqlSession.getMapper(UserDao.class);
        List<User> users = mapper.showAllUser();
        System.out.println(users.toString());
    }
}
