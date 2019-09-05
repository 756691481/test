import org.apache.ibatis.annotations.*;

public interface Dao {
    @Delete("delete from bm where id=#{id}")
    @Results(value={
            @Result(column = "id",property = "id",id=true),
            @Result(column = "name",property = "name"),
            @Result(column = "school",property = "school")

    })
   public void deleteById(int id);
    @Select("select * from bm where id=#{id}")
    @Results(value={
            @Result(column = "id",property = "id",id=true),
            @Result(column = "name",property = "name"),
            @Result(column = "school",property = "school")

    })
   public User selectById(int id);
    @Update("update bm set name=#{name},school=#{school} where id=#{id}")
    @Results(value={
            @Result(column = "id",property = "id",id=true),
            @Result(column = "name",property = "name"),
            @Result(column = "school",property = "school")

    })
      public void updateById(@Param("id")int id,@Param("name")String name,@Param("school")String school);
    @Insert("insert into bm(name,school) values (#{name},#{school})")
    @Results(value={
            @Result(column = "id",property = "id",id=true),
            @Result(column = "name",property = "name"),
            @Result(column = "school",property = "school")

    })
    public void insertUser(@Param("name")String name,@Param("school")String school);
}
