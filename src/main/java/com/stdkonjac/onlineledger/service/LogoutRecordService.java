package com.stdkonjac.onlineledger.service;

import com.stdkonjac.onlineledger.dao.LogoutRecordDao;
import com.stdkonjac.onlineledger.entity.LogoutRecord;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.sql.Timestamp;
import java.util.Date;
import java.util.List;

@Service
public class LogoutRecordService {
    @Autowired
    private LogoutRecordDao logoutRecordDao;

    public List<LogoutRecord> selectLogoutRecord(
            String ip,
            Integer uid,
            String username,
            Timestamp logoutTime) {
        return logoutRecordDao.selectLogoutRecord(ip, uid, username, logoutTime);
    }

    public List<LogoutRecord> selectAllLogoutRecord() {
        return logoutRecordDao.selectAllLogoutRecord();
    }

    public void insertLogoutRecord(
            String ip,
            Integer uid,
            String username,
            Timestamp logoutTime) {
        logoutRecordDao.insertLogoutRecord(ip, uid, username, logoutTime);
    }

    public void deleteLogoutRecord(
            String ip,
            Integer uid,
            String username,
            Timestamp logoutTime) {
        logoutRecordDao.deleteLogoutRecord(ip, uid, username, logoutTime);
    }

    public void updateLogoutRecord(
            String ip,
            Integer uid,
            String username,
            Timestamp logoutTime) {
        logoutRecordDao.updateLogoutRecord(ip, uid, username, logoutTime);
    }

}
