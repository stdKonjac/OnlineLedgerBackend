package com.stdkonjac.onlineledger.service;

import com.stdkonjac.onlineledger.dao.RecordDao;
import com.stdkonjac.onlineledger.entity.Record;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.Date;
import java.util.List;

@Service
public class RecordService {
    @Autowired
    private RecordDao recordDao;

    public List<Record> selectRecord(
            Integer uid,
            Date date,
            String category,
            String type,
            Double cost) {
        return recordDao.selectRecord(uid, date, category, type, cost);
    }

    public List<Record> selectAllRecord() {
        return recordDao.selectAllRecord();
    }

    public void insertRecord(
            Integer uid,
            Date date,
            String category,
            String type,
            Double cost) {
        recordDao.insertRecord(uid, date, category, type, cost);
    }

    public void deleteRecord(
            Integer uid,
            Date date,
            String category,
            String type,
            Double cost) {
        recordDao.deleteRecord(uid, date, category, type, cost);
    }

    public void updateRecord(
            Integer uid,
            Date date,
            String category,
            String type,
            Double cost) {
        recordDao.updateRecord(uid, date, category, type, cost);
    }

    public List<Record> executeSelect(String sql) {
        return recordDao.executeSelect(sql);
    }

    public void executeInsert(String sql) {
        recordDao.executeInsert(sql);
    }

    public void executeDelete(String sql) {
        recordDao.executeDelete(sql);
    }

    public void executeUpdate(String sql) {
        recordDao.executeUpdate(sql);
    }
}
