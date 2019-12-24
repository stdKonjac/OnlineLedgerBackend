package com.stdkonjac.onlineledger.service;

import com.stdkonjac.onlineledger.dao.LoginRecordDao;
import com.stdkonjac.onlineledger.entity.LoginRecord;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.sql.Timestamp;
import java.util.List;

@Service
public class LoginRecordService {
    @Autowired
    private LoginRecordDao loginRecordDao;

    public List<LoginRecord> selectLoginRecord(
            Integer id,
            String ip,
            Integer uid,
            String username,
            Timestamp loginTime) {
        return loginRecordDao.selectLoginRecord(
                id, ip, uid, username, loginTime);
    }

    public List<LoginRecord> selectAllLoginRecord() {
        return loginRecordDao.selectAllLoginRecord();
    }

    public void insertLoginRecord(
            Integer id,
            String ip,
            Integer uid,
            String username,
            Timestamp loginTime) {
        loginRecordDao.insertLoginRecord(
                id, ip, uid, username, loginTime);
    }

    public void deleteLoginRecord(
            Integer id,
            String ip,
            Integer uid,
            String username,
            Timestamp loginTime) {
        loginRecordDao.deleteLoginRecord(
                id, ip, uid, username, loginTime);
    }

    public void updateLoginRecord(
            Integer id,
            String ip,
            Integer uid,
            String username,
            Timestamp loginTime) {
        loginRecordDao.updateLoginRecord(
                id, ip, uid, username, loginTime);
    }

}
