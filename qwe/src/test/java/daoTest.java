import org.apache.ibatis.io.Resources;
import org.apache.ibatis.session.SqlSession;
import org.apache.ibatis.session.SqlSessionFactory;
import org.apache.ibatis.session.SqlSessionFactoryBuilder;
import org.junit.Before;
import org.junit.Test;
import sun.awt.geom.AreaOp;

import java.io.IOException;
import java.io.InputStream;
import java.util.List;

public class daoTest {
    private SqlSessionFactory sqlSessionFactory;
    @Before
    public void init() throws IOException {
        //创建sqlSessionFactory
        //MyBatis配置文件
        String resource = "conf.xml";
        //得到配置文件流
        InputStream inputStream = Resources.getResourceAsStream(resource);
        //创建会话工厂，传入MyBatis的配置信息
        sqlSessionFactory = new SqlSessionFactoryBuilder().build(inputStream);
    }
    @Test
    public void findUserById() throws Exception{
        //获取sqlSession对象
        SqlSession sqlSession = sqlSessionFactory.openSession();
        //创建UserMapper对象，MyBatis自动生成mapper代理
            dao dao = sqlSession.getMapper(dao.class);
        //调用userMapper的方法
        Bm user = dao.findUserById(1);
        //关闭资源
        sqlSession.close();
        //打印客户信息
        System.out.println(user);
    }
    @Test
    public void insertUser()throws Exception {
        SqlSession sqlSession = sqlSessionFactory.openSession();
        dao dao = sqlSession.getMapper(dao.class);
        dao.insertUser("1221344","1324235");
        sqlSession.commit();
        sqlSession.close();
    }
    @Test
    public void updateUser()throws Exception{
        SqlSession sqlSession = sqlSessionFactory.openSession();
        dao dao = (dao) sqlSession.getMapper(dao.class);
        dao.updateUser(1,"123","45666");
        sqlSession.commit();
        sqlSession.close();
    }
@Test
    public void deleteUser()throws Exception{
        SqlSession sqlSession = sqlSessionFactory.openSession();
        dao dao = (dao) sqlSession.getMapper(dao.class);
   dao.deleteUser(2);
         sqlSession.commit();
        sqlSession.close();
    }
@Test
public  void selByIUP()throws Exception{
    SqlSession sqlSession = sqlSessionFactory.openSession();
    dao dao=sqlSession.getMapper(dao.class);
  List<Bm> list=dao.selByIUP("444",null);
    for (Bm bm:list){
System.out.println(bm);
}
    sqlSession.close();
}
}
