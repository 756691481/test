package dao.spring;
import bean.User;
import org.apache.ibatis.annotations.Param;
import org.springframework.jdbc.core.BeanPropertyRowMapper;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.jdbc.core.RowMapper;

import java.util.List;

public class UserDao {

    private JdbcTemplate jdbcTemplate;//利用applicationContext.xml让它初始化，不用每个类都出现jdbcTemplate= new JdbcTemplate(xx)这些玩意！

    /*查询整张表的数据*/
    public List<User> findAllUser() {
        String sql = "select * from bm";
        RowMapper<User> rowMapper = new BeanPropertyRowMapper<User>(User.class);
        return this.jdbcTemplate.query(sql, rowMapper);
    }


    /*修改字段*/
    public void updateUser(@Param("id") int id,@Param("name") String name) {
        String sql = "update bm set name=? where id=?";
        jdbcTemplate.update(sql,name,id);
    }
    public JdbcTemplate getJdbcTemplate() {
        return jdbcTemplate;
    }

    public void setJdbcTemplate(JdbcTemplate jdbcTemplate) {
        this.jdbcTemplate = jdbcTemplate;
    }





    public void deleteUser(int id){
        String sql="delete from bm where id=?";
        jdbcTemplate.update(sql,id);
    }

    public void insertUser(@Param("name") String name, @Param("school") String school) {
   String sql="insert into bm (name,school) values (?,?)";
        jdbcTemplate.update(sql,name,school);
    }

}











