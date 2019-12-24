package com.stdkonjac.onlineledger.service;

import com.stdkonjac.onlineledger.dao.UserDao;
import com.stdkonjac.onlineledger.entity.User;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class RegisterHandlerService {
    @Autowired
    private UserDao userDao;

    public Integer verifyUser(String username) {
        if (username == null) {
            return 0;
        } else {
            List<User> userList = userDao.selectUser(null, username, null);
            if (userList.size() == 0) {
                return 1;
            } else {
                return 0;
            }
        }
    }

    public Integer registerUser(String username, String password) {
        if (username == null || password == null) {
            return 0;
        } else {
            userDao.insertUser(null, username, password);
            return 1;
        }
    }
}
