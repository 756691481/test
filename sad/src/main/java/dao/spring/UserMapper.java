    package dao.spring;
    import java.sql.ResultSet;
    import java.sql.SQLException;

    import bean.User;
            import org.springframework.jdbc.core.RowMapper;

     public class UserMapper implements RowMapper<User> {

        @Override
        public User mapRow(ResultSet rs, int rownum) throws SQLException {
            User user = new User();
            user.setId(rs.getInt("id"));
            user.setName(rs.getString("name"));
            user.setSchool(rs.getString("school"));
            return user;
        }
    }