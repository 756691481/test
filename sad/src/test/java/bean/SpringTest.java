package bean;
import dao.spring.UserDao;
import org.junit.Test;
import org.springframework.context.ApplicationContext;
import org.springframework.context.ConfigurableApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;
import java.util.List;

public class SpringTest{
    @Test
    public void findAllUser(){
        ApplicationContext applicationContext = new ClassPathXmlApplicationContext(
                "spring.xml");
        UserDao userDao = (UserDao) applicationContext.getBean("userDao");
        List<User> user_list;
        user_list = userDao.findAllUser();
        for (User user : user_list) {
            System.out.println(user);
        }
        ((ConfigurableApplicationContext) applicationContext).close();// 关闭Spring避免警告
    }
@Test
    public void deleteUser(){
    ApplicationContext applicationContext = new ClassPathXmlApplicationContext("spring.xml");
    UserDao userDao = (UserDao) applicationContext.getBean("userDao");
    userDao.deleteUser(1);
    ((ConfigurableApplicationContext) applicationContext).close();
    }
    @Test
    public void insertUser(){
        ApplicationContext applicationContext = new ClassPathXmlApplicationContext("spring.xml");
        UserDao userDao = (UserDao) applicationContext.getBean("userDao");
        userDao.insertUser("333","4444");
        ((ConfigurableApplicationContext) applicationContext).close();
    }
@Test
    public void updateUser(){
    ApplicationContext applicationContext = new ClassPathXmlApplicationContext("spring.xml");
    UserDao userDao = (UserDao) applicationContext.getBean("userDao");
    userDao.updateUser(2,"31113");

    ((ConfigurableApplicationContext) applicationContext).close();

    }
}














