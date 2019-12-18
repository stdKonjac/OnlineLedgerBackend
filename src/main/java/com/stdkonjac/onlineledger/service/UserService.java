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
            Integer id,
            String username,
            String password) {
        return userDao.selectUser(id, username, password);
    }

    public List<User> selectAllUser() {
        return userDao.selectAllUser();
    }

    public void insertUser(
            Integer id,
            String username,
            String password) {
        userDao.insertUser(id, username, password);
    }

    public void deleteUser(
            Integer id,
            String username,
            String password) {
        userDao.deleteUser(id, username, password);
    }

    public void updateUser(
            Integer id,
            String username,
            String password) {
        userDao.updateUser(id, username, password);
    }

    public List<User> executeSelect(String sql) {
        return userDao.executeSelect(sql);
    }

    public void executeInsert(String sql) {
        userDao.executeInsert(sql);
    }

    public void executeDelete(String sql) {
        userDao.executeDelete(sql);
    }

    public void executeUpdate(String sql) {
        userDao.executeUpdate(sql);
    }
}
