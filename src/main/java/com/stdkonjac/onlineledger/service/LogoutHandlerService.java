package com.stdkonjac.onlineledger.service;

import com.stdkonjac.onlineledger.dao.UserDao;
import com.stdkonjac.onlineledger.entity.User;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class LogoutHandlerService {
    @Autowired
    private UserDao userDao;

    public Integer verifyUser(Integer uid) {
        List<User> userList = userDao.selectUser(uid, null, null);
        if (userList.size() != 1) { //系统错误或用户不存在
            return -1;
        } else {
            return uid;
        }
    }
}
