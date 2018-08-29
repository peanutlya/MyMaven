package dao;

import entity.User;
import org.apache.ibatis.annotations.Param;
import org.apache.ibatis.annotations.Select;

import java.util.List;

public interface UserDao {
    List<User> showAllUser();

    int updateById(User user);

    User findUserById(Long id);

    int testTwoArg(@Param("aa") int a, @Param("bb") int b);

    @Select({
            "select * from t_user"
    })
    List<User> annoShow();

    @Select({
            "select #{a}+#{b}"
    })
    int anno2(@Param("a")int a,@Param("b") int b);

}
