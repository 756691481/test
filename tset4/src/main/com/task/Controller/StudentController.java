package task.Controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import task.Entity.StudentUser;
import task.Service.StudentService;

import java.util.List;

@Controller
public class StudentController {
    @Autowired
    StudentService studentService;
    @RequestMapping(value = "/student",method = RequestMethod.GET)
    public String show(Model model){
        List<StudentUser> studentUserList=studentService.getListStudent();
        model.addAttribute("studentUserList",studentUserList);
        return "student";
    }

}
