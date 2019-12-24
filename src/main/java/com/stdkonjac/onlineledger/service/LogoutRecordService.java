package com.stdkonjac.onlineledger.service;

import com.stdkonjac.onlineledger.dao.LogoutRecordDao;
import com.stdkonjac.onlineledger.entity.LogoutRecord;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.sql.Timestamp;
import java.util.List;

@Service
public class LogoutRecordService {
    @Autowired
    private LogoutRecordDao logoutRecordDao;

    public List<LogoutRecord> selectLogoutRecord(
            Integer id,
            String ip,
            Integer uid,
            String username,
            Timestamp logoutTime) {
        return logoutRecordDao.selectLogoutRecord(
                id, ip, uid, username, logoutTime);
    }

    public List<LogoutRecord> selectAllLogoutRecord() {
        return logoutRecordDao.selectAllLogoutRecord();
    }

    public void insertLogoutRecord(
            Integer id,
            String ip,
            Integer uid,
            String username,
            Timestamp logoutTime) {
        logoutRecordDao.insertLogoutRecord(
                id, ip, uid, username, logoutTime);
    }

    public void deleteLogoutRecord(
            Integer id,
            String ip,
            Integer uid,
            String username,
            Timestamp logoutTime) {
        logoutRecordDao.deleteLogoutRecord(
                id, ip, uid, username, logoutTime);
    }

    public void updateLogoutRecord(
            Integer id,
            String ip,
            Integer uid,
            String username,
            Timestamp logoutTime) {
        logoutRecordDao.updateLogoutRecord(
                id, ip, uid, username, logoutTime);
    }

}
