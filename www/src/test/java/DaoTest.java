import org.apache.ibatis.io.Resources;
import org.apache.ibatis.session.SqlSession;
import org.apache.ibatis.session.SqlSessionFactory;
import org.apache.ibatis.session.SqlSessionFactoryBuilder;
import org.junit.Test;
import java.io.IOException;
import java.io.InputStream;

public class DaoTest {
    @Test
    public void selectById() throws IOException {
        String resource = "Conf.xml";
        InputStream is = Resources.getResourceAsStream(resource);
        SqlSessionFactory sessionFactory = new SqlSessionFactoryBuilder().build(is);
        sessionFactory.getConfiguration().addMapper(Dao.class);
        SqlSession session = sessionFactory.openSession();
        Dao dao = session.getMapper(Dao.class);
        User user = dao.selectById(1);
        System.out.println(user);
    }
@Test
    public void updateById() throws IOException {
    String resource = "Conf.xml";
    InputStream is = Resources.getResourceAsStream(resource);
    SqlSessionFactory sessionFactory = new SqlSessionFactoryBuilder().build(is);
    sessionFactory.getConfiguration().addMapper(Dao.class);
    SqlSession session = sessionFactory.openSession();
    Dao dao = session.getMapper(Dao.class);
 dao.updateById(3,"666","777");
    session.commit();
   session.close();
}
@Test
    public void deleteById()throws IOException {
    String resource = "Conf.xml";
    InputStream is = Resources.getResourceAsStream(resource);
    SqlSessionFactory sessionFactory = new SqlSessionFactoryBuilder().build(is);
    sessionFactory.getConfiguration().addMapper(Dao.class);
    SqlSession session = sessionFactory.openSession();
    Dao dao = session.getMapper(Dao.class);
    dao.deleteById(1);
    session.commit();
    session.close();
}
@Test
    public void insertUser()throws IOException {
    String resource = "Conf.xml";
    InputStream is = Resources.getResourceAsStream(resource);
    SqlSessionFactory sessionFactory = new SqlSessionFactoryBuilder().build(is);
    sessionFactory.getConfiguration().addMapper(Dao.class);
    SqlSession session = sessionFactory.openSession();
    Dao dao = session.getMapper(Dao.class);
    dao.insertUser("444","3123");
    session.commit();
    session.close();
}
}
