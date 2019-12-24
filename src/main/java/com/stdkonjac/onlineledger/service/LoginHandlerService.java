package com.stdkonjac.onlineledger.service;

import com.stdkonjac.onlineledger.dao.LoginRecordDao;
import com.stdkonjac.onlineledger.dao.UserDao;
import com.stdkonjac.onlineledger.entity.User;
import com.stdkonjac.onlineledger.util.ParseUtil;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.sql.Timestamp;
import java.util.Date;
import java.util.List;

@Service
public class LoginHandlerService {
    @Autowired
    private UserDao userDao;
    @Autowired
    private LoginRecordDao loginRecordDao;

    public User verifyUser(String username, String password) {
        List<User> userList = userDao.selectUser(null, username, null);
        if (userList.size() != 1) { //系统错误
            return null;
        } else {
            User user = userList.get(0);
            if (password.equals(user.getPassword())) {  //密码正确，返回uid
                return user;
            } else {  //密码错误
                return null;
            }
        }
    }

    public void recordLoginAction(String ip, User user) {
        Timestamp loginTime = ParseUtil.date2Timestamp(new Date());
        Integer id = user.getId();
        Integer uid = user.getId();
        String username = user.getUsername();
        loginRecordDao.insertLoginRecord(
                id, ip, uid, username, loginTime);
    }
}
