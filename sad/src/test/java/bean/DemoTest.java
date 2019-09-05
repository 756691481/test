package bean;
import dao.IUser;
import dao.spring.UserMapper;
import org.junit.Test;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import java.util.List;


public class DemoTest {
    @Test
    public void getUser(){
        ApplicationContext context = new ClassPathXmlApplicationContext("spring-config.xml");
        IUser userMapper = (IUser) context.getBean("userMapper");
        List<User> user_list;
        user_list = userMapper.getUser();
        for (User user : user_list) {
            System.out.println(user);
        }
    }
@Test
    public void updateUser(){
    ApplicationContext context = new ClassPathXmlApplicationContext("spring-config.xml");
    IUser userMapper = (IUser)context.getBean("userMapper");
    userMapper.updateUser(1,"1232","1421321");
    }
    @Test
    public void deleteUser(){
        ApplicationContext context = new ClassPathXmlApplicationContext("spring-config.xml");
        IUser userMapper = (IUser)context.getBean("userMapper");
        userMapper.deleteUser(2);
    }
    @Test
    public void insertUser(){
        ApplicationContext context = new ClassPathXmlApplicationContext("spring-config.xml");
        IUser userMapper = (IUser)context.getBean("userMapper");
        userMapper.insertUser("123","13221");
    }}
