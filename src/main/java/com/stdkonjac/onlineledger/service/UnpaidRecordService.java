package com.stdkonjac.onlineledger.service;

import com.stdkonjac.onlineledger.dao.UnpaidRecordDao;
import com.stdkonjac.onlineledger.entity.UnpaidRecord;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import javax.servlet.http.PushBuilder;
import java.util.Date;
import java.util.List;

@Service
public class UnpaidRecordService {
    @Autowired
    private UnpaidRecordDao unpaidRecordDao;

    public List<UnpaidRecord> selectUnpaidRecord(
            Integer id,
            Integer uid,
            Double value,
            Date date,
            String remark,
            Integer expenseRecordId) {
        return unpaidRecordDao.selectUnpaidRecord(
                id, uid, value, date, remark, expenseRecordId);
    }

    public List<UnpaidRecord> selectAllUnpaidRecord() {
        return unpaidRecordDao.selectAllUnpaidRecord();
    }

    public void insertUnpaidRecord(
            Integer id,
            Integer uid,
            Double value,
            Date date,
            String remark,
            Integer expenseRecordId) {
        unpaidRecordDao.insertUnpaidRecord(
                id, uid, value, date, remark, expenseRecordId);
    }

    public void deleteUnpaidRecord(
            Integer id,
            Integer uid,
            Double value,
            Date date,
            String remark,
            Integer expenseRecordId) {
        unpaidRecordDao.deleteUnpaidRecord(
                id, uid, value, date, remark, expenseRecordId);
    }

    public void updateUnpaidRecord(
            Integer id,
            Integer uid,
            Double value,
            Date date,
            String remark,
            Integer expenseRecordId) {
        unpaidRecordDao.updateUnpaidRecord(
                id, uid, value, date, remark, expenseRecordId);
    }

    public void deleteUnpaidRecordByExpenseRecordId(
            Integer expenseRecordId) {
        if (expenseRecordId != null) {
            unpaidRecordDao.deleteUnpaidRecordByExpenseRecordId(expenseRecordId);
        }
    }
}
