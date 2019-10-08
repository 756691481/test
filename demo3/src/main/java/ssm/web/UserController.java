package ssm.web;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.servlet.ModelAndView;
import ssm.user.User;
import ssm.service.UserServiceImpl;

import java.util.List;

@Controller
public class UserController {
    @Autowired(required=true)
    private UserServiceImpl userService;

    @RequestMapping(value = "/users")
    public ModelAndView getList(){
//        页面的名字
        ModelAndView mv = new ModelAndView("list");
//        获取数据
        List<User> list =userService.findAllUser();
        mv.addObject("user",list);
        return mv;
    }

}
