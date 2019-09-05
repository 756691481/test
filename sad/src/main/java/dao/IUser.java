package dao;

import bean.User;
import org.apache.ibatis.annotations.Param;

import java.util.List;


public interface IUser {
    List<User> getUser();
    void updateUser(@Param("id") int id,@Param("name") String name, @Param("school") String school);
    void insertUser(@Param("name") String name,@Param("school")String school);
    void deleteUser(int id);
}
