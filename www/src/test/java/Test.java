import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;

public class Test {
    public static void main(String[] args) throws Exception {
        Connection con = DriverManager.getConnection("jdbc:mysql://localhost:3306/baoming?serverTimezone=UTC&characterEncoding=utf8", "root", "12345");
        String sql = "select * from bm where id = ?";
        PreparedStatement go = con.prepareStatement(sql);
        go.setString(1, "2");
        ResultSet rs = go.executeQuery();
        while (rs.next()) {
            System.out.println(rs.getInt(1) + " " + rs.getString(2));
        }
    }
}

