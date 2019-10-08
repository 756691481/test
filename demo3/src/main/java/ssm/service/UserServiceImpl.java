package ssm.service;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import ssm.dao.Dao;
import ssm.user.User;


import java.util.List;
@Service("UserService")
public class UserServiceImpl implements UserService {
    @Autowired
    public Dao dao;
    @Override
    public List<User> findAllUser(){
        List<User> findAllUser = dao.findAllUser();
        return findAllUser;
    }

}