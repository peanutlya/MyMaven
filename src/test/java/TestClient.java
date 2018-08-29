import dao.UserDao;
import entity.User;
import org.apache.ibatis.annotations.Mapper;
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
    @Test
    public void testFindUserById(){
        UserDao mapper=(UserDao)MyBatisUtil.getMapper(UserDao.class);
        User user = mapper.findUserById(1L);
        System.out.println(user.toString());
    }
    @Test
    public void testUpdate(){
        UserDao mapper =(UserDao) MyBatisUtil.getMapper(UserDao.class);
        User user=new User();
        user.setId(1L);
        user.setUsername("lya");
        System.out.println(user.toString());
        mapper.updateById(user);
        System.out.println(mapper.findUserById(1L).toString());
    }
    @Test
    public void testTwoArg(){
        UserDao mapper=(UserDao) MyBatisUtil.getMapper(UserDao.class);
        int i = mapper.testTwoArg(2, 3);
        System.out.println(i);

    }
    @Test
    public void testFlect(){
        UserDao mapper =(UserDao) MyBatisUtil.getMapper(UserDao.class);
        System.out.println(mapper.showAllUser().toString());
    }
    @Test
    public void testAnno(){
        UserDao mapper=(UserDao)MyBatisUtil.getMapper(UserDao.class);
        System.out.println(mapper.annoShow().toString());
    }
    @Test
    public void testAnno2(){
         UserDao mapper=(UserDao) MyBatisUtil.getMapper(UserDao.class);
        int i = mapper.anno2(2, 6);
        System.out.println(i);
    }
    @Test
    public void test3(){
       try(SqlSession sqlSession=MyBatisUtil.getSqlSession()){
           UserDao mapper=(UserDao)MyBatisUtil.getMapper(UserDao.class);

       }
    }
}
