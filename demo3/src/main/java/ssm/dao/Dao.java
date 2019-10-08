package ssm.dao;

import ssm.user.User;

import java.util.List;

public interface Dao {
    List<User> findAllUser();
}
