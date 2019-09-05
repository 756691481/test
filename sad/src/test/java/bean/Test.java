package bean;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.SQLException;
public class Test {
    public static void main(String[] args) throws SQLException {
        Connection con;
        String url = "jdbc:mysql://localhost:3306/baoming?serverTimezone=UTC&characterEncoding=utf8&rewriteBatchedStatements=true";
        String user = "root";
        String password = "12345";
        con = DriverManager.getConnection(url, user, password);
        Connection connection= DriverManager.getConnection(url, user, password);

        connection.setAutoCommit(false);
        PreparedStatement statement=connection.prepareStatement("insert into bm (name) values (?)");
        System.out.println("开始插入数据");
        Long startTime = System.currentTimeMillis();
        for (int i = 0; i <1000000 ; i++) {
            statement.setString(1,"呵呵");
            statement.addBatch();
            }
        statement.executeBatch();
        connection.commit();
        connection.setAutoCommit(true);
        connection.close();
        Long endTime = System.currentTimeMillis();
        System.out.println("插入完毕,用时：" + (endTime - startTime));
    }}