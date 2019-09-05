import java.sql.*;

public class asd {

    public static void main(String[] args) {
        //声明Connection对象
        Connection con;
        //驱动程序名
        String driver = "com.mysql.cj.jdbc.Driver";
        //URL指向要访问的数据库名mydata
        String url = "jdbc:mysql://localhost:3306/baoming?serverTimezone=UTC&characterEncoding=utf8";
        //MySQL配置时的用户名
        String user = "root";
        //MySQL配置时的密码
        String password = "12345";
        //遍历查询结果集
        //加载驱动程序
        try {
            Class.forName(driver);
            //1.getConnection()方法，连接MySQL数据库！！
            con = DriverManager.getConnection(url,user,password);
            String sql="delete from bm where name='金石开'";
            PreparedStatement ps=con.prepareStatement(sql);
              int rs=ps.executeUpdate();
//            while(`rs`.next()){
//                System.out.println(rs.getString(2));
//
//            }
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