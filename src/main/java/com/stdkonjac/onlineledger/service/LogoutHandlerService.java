package com.stdkonjac.onlineledger.service;

import com.stdkonjac.onlineledger.dao.LogoutRecordDao;
import com.stdkonjac.onlineledger.dao.UserDao;
import com.stdkonjac.onlineledger.entity.User;
import com.stdkonjac.onlineledger.util.ParseUtil;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.sql.Timestamp;
import java.util.Date;
import java.util.List;

@Service
public class LogoutHandlerService {
    @Autowired
    private UserDao userDao;
    @Autowired
    private LogoutRecordDao logoutRecordDao;

    public User verifyUser(Integer uid, Integer cookieUid) {
        if (!uid.equals(cookieUid)) {
            return null;
        }
        List<User> userList = userDao.selectUser(uid, null, null);
        if (userList.size() != 1) { //系统错误或用户不存在
            return null;
        } else {
            return userList.get(0);
        }
    }

    public void recordLogoutAction(String ip, User user) {
        Timestamp logoutTime = ParseUtil.date2Timestamp(new Date());
        Integer id = null;
        Integer uid = user.getId();
        String username = user.getUsername();
        logoutRecordDao.insertLogoutRecord(
                id, ip, uid, username, logoutTime);
    }
}
