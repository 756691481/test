package task.Service.ServiceImpl;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import task.Dao.StudentMapper;
import task.Entity.StudentUser;
import task.Service.StudentService;

import java.util.List;

@Service("StudentService")
public class StudentServiceImpl implements StudentService {
    @Autowired
    StudentMapper studentMapper;
    @Override
    public List<StudentUser> getListStudent(){
        return studentMapper.getListStudent();
    }
}
