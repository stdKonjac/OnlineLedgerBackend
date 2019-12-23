package com.stdkonjac.onlineledger.service;

import com.stdkonjac.onlineledger.dao.LoginRecordDao;
import com.stdkonjac.onlineledger.entity.LoginRecord;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.Date;
import java.util.List;

@Service
public class LoginRecordService {
    @Autowired
    private LoginRecordDao loginRecordDao;

    public List<LoginRecord> selectLoginRecord(
            String ip,
            Integer uid,
            String username,
            Date loginTime) {
        return loginRecordDao.selectLoginRecord(ip, uid, username, loginTime);
    }

    public List<LoginRecord> selectAllLoginRecord() {
        return loginRecordDao.selectAllLoginRecord();
    }

    public void insertLoginRecord(
            String ip,
            Integer uid,
            String username,
            Date loginTime) {
        loginRecordDao.insertLoginRecord(ip, uid, username, loginTime);
    }

    public void deleteLoginRecord(
            String ip,
            Integer uid,
            String username,
            Date loginTime) {
        loginRecordDao.deleteLoginRecord(ip, uid, username, loginTime);
    }

    public void updateLoginRecord(
            String ip,
            Integer uid,
            String username,
            Date loginTime) {
        loginRecordDao.updateLoginRecord(ip, uid, username, loginTime);
    }

}
