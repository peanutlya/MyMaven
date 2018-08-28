package control;

import dao.UserDao;
import entity.User;
import org.apache.ibatis.session.SqlSession;
import utils.MyBatisUtil;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;
import java.util.List;

@WebServlet(name = "TestServlet",urlPatterns = "/TestServlet")
public class TestServlet extends HttpServlet {
    protected void doPost(HttpServletRequest request, HttpServletResponse response) throws IOException {
        request.setCharacterEncoding("utf-8");
        String op = request.getParameter("op");
        if("test".equals(op)){
            doTest(request,response);
        }
    }

    private void doTest(HttpServletRequest request, HttpServletResponse response) throws IOException {
        //request.setCharacterEncoding("utf-8");
        String name = request.getParameter("name");
        System.out.println(name);
        SqlSession sqlSession = MyBatisUtil.getSqlSession();
        UserDao mapper = sqlSession.getMapper(UserDao.class);
        List<User> userList = mapper.showAllUser();
        response.setContentType("text/html;charset=utf-8");
        response.getWriter().write(userList.toString());
    }

    protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
        doPost(request,response);
    }
}
