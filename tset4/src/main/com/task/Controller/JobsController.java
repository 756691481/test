package task.Controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import task.Entity.JobsUser;
import task.Service.JobsService;

import java.util.List;

@Controller
public class JobsController {
    @Autowired
    JobsService jobsService;
    @RequestMapping(value = "/job",method = RequestMethod.GET)
    public String show(Model model){
        List<JobsUser> jobsUserList=jobsService.getListJob();
        model.addAttribute("jobsUserList",jobsUserList);
        return "job";
    }
}
