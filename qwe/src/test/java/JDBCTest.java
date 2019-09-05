import com.sun.scenario.effect.impl.sw.java.JSWBlend_SRC_OUTPeer;
import org.junit.Test;
import org.omg.CORBA.PUBLIC_MEMBER;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.SQLException;
public class JDBCTest {
    @Test
    public void JDBC() {
        Connection con;
        String driver = "com.mysql.cj.jdbc.Driver";
        String url = "jdbc:mysql://localhost:3306/baoming?serverTimezone=UTC&characterEncoding=utf8";
        String user = "root";
        String password = "12345";
        try {
            Class.forName(driver);
            con = DriverManager.getConnection(url, user, password);
            String sql = "delete from bm ";
            PreparedStatement ps = con.prepareStatement(sql);
            int rs = ps.executeUpdate();
            System.out.println(rs);
        } catch (ClassNotFoundException e) {
            // TODO Auto-generated catch block
            e.printStackTrace();
        } catch (SQLException e) {
            // TODO Auto-generated catch block
            e.printStackTrace();
        }
    }
}
