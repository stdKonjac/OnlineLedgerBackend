package com.stdkonjac.onlineledger.service;

import com.stdkonjac.onlineledger.dao.UserDao;
import com.stdkonjac.onlineledger.entity.User;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class UserService {
    @Autowired
    private UserDao userDao;

    public List<User> selectUser(
            int id,
            String username,
            String password) {
        return userDao.selectUser(id, username, password);
    }

    public List<User> selectAllUser() {
        return userDao.selectAllUser();
    }

    public void insertUser(
            int id,
            String username,
            String password) {
        userDao.insertUser(id, username, password);
    }

    public void deleteUser(
            int id,
            String username,
            String password) {
        userDao.deleteUser(id, username, password);
    }

    public void updateUser(
            int id,
            String username,
            String password) {
        userDao.updateUser(id, username, password);
    }
}
