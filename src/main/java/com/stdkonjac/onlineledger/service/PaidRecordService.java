package com.stdkonjac.onlineledger.service;

import com.stdkonjac.onlineledger.dao.PaidRecordDao;
import com.stdkonjac.onlineledger.entity.PaidRecord;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.Date;
import java.util.List;

@Service
public class PaidRecordService {
    @Autowired
    private PaidRecordDao paidRecordDao;

    public List<PaidRecord> selectPaidRecord(
            Integer id,
            Integer uid,
            Double value,
            Date date,
            String remark,
            Integer expenseRecordId) {
        return paidRecordDao.selectPaidRecord(
                id, uid, value, date, remark, expenseRecordId);
    }

    public List<PaidRecord> selectAllPaidRecord() {
        return paidRecordDao.selectAllPaidRecord();
    }

    public void insertPaidRecord(
            Integer id,
            Integer uid,
            Double value,
            Date date,
            String remark,
            Integer expenseRecordId) {
        paidRecordDao.insertPaidRecord(
                id, uid, value, date, remark, expenseRecordId);
    }

    public void deletePaidRecord(
            Integer id,
            Integer uid,
            Double value,
            Date date,
            String remark,
            Integer expenseRecordId) {
        paidRecordDao.deletePaidRecord(
                id, uid, value, date, remark, expenseRecordId);
    }

    public void updatePaidRecord(
            Integer id,
            Integer uid,
            Double value,
            Date date,
            String remark,
            Integer expenseRecordId) {
        paidRecordDao.updatePaidRecord(
                id, uid, value, date, remark, expenseRecordId);
    }

    public void deletePaidRecordByExpenseRecordId(
            Integer expenseRecordId) {
        if (expenseRecordId != null) {
            paidRecordDao.deletePaidRecordByExpenseRecordId(expenseRecordId);
        }
    }

}
