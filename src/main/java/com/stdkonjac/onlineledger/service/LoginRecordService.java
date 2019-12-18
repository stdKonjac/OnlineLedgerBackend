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
            String IP,
            Integer uid,
            String username,
            Date date) {
        return loginRecordDao.selectLoginRecord(IP, uid, username, date);
    }

    public List<LoginRecord> selectAllLoginRecord() {
        return loginRecordDao.selectAllLoginRecord();
    }

    public void insertLoginRecord(
            String IP,
            Integer uid,
            String username,
            Date date) {
        loginRecordDao.insertLoginRecord(IP, uid, username, date);
    }

    public void deleteLoginRecord(
            String IP,
            Integer uid,
            String username,
            Date date) {
        loginRecordDao.deleteLoginRecord(IP, uid, username, date);
    }

    public void updateLoginRecord(
            String IP,
            Integer uid,
            String username,
            Date date) {
        loginRecordDao.updateLoginRecord(IP, uid, username, date);
    }

    public List<LoginRecord> executeSelect(String sql) {
        return loginRecordDao.executeSelect(sql);
    }

    public void executeInsert(String sql) {
        loginRecordDao.executeInsert(sql);
    }

    public void executeDelete(String sql) {
        loginRecordDao.executeDelete(sql);
    }

    public void executeUpdate(String sql) {
        loginRecordDao.executeUpdate(sql);
    }
}
