package ssm.service;

import ssm.user.User;

import java.util.List;

public interface UserService {
    List<User> findAllUser();
}