import org.apache.ibatis.annotations.Param;

public interface dao{

    public void insertUser(@Param("name")String name, @Param("qq")String qq) throws Exception;
    public Bm findUserById(int id) throws Exception;
    public void updateUser(@Param("id")int id,@Param("name")String name,@Param("qq")String qq) throws Exception;
    public int deleteUser(int id) throws Exception;

}