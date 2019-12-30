package task.Dao;


import org.apache.ibatis.annotations.Mapper;
import task.Entity.StudentUser;

import java.util.List;


public interface StudentMapper {
 List<StudentUser> getListStudent();
}
