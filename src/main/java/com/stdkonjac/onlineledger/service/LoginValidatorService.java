package com.stdkonjac.onlineledger.service;

import com.stdkonjac.onlineledger.dao.UserDao;
import com.stdkonjac.onlineledger.entity.User;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class LoginValidatorService {
    @Autowired
    private UserDao userDao;

    public Integer verifyUser(String username, String password) {
        List<User> userList = userDao.selectUser(null, username, null);
        if (userList.size() != 1) { //系统错误，一个用户名对应多个用户
            return -1;
        } else {
            User user = userList.get(0);
            if (password.equals(user.getPassword())) {  //密码正确，返回uid
                return user.getId();
            } else {  //密码错误，返回0
                return 0;
            }
        }
    }
}
