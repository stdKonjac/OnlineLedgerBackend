package com.stdkonjac.onlineledger.service;

import com.stdkonjac.onlineledger.dao.ExpenseRecordDao;
import com.stdkonjac.onlineledger.entity.ExpenseRecord;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.Date;
import java.util.List;

@Service
public class ExpenseRecordService {
    @Autowired
    private ExpenseRecordDao expenseRecordDao;

    public List<ExpenseRecord> selectExpenseRecord(
            Integer uid,
            Date date,
            String category,
            String type,
            Double expense,
            Integer prepay) {
        return expenseRecordDao.selectExpenseRecord(
                uid, date, category, type, expense, prepay);
    }

    public List<ExpenseRecord> selectAllExpenseRecord() {
        return expenseRecordDao.selectAllExpenseRecord();
    }

    public void insertExpenseRecord(
            Integer uid,
            Date date,
            String category,
            String type,
            Double expense,
            Integer prepay) {
        expenseRecordDao.insertExpenseRecord(
                uid, date, category, type, expense, prepay);
    }

    public void deleteExpenseRecord(
            Integer uid,
            Date date,
            String category,
            String type,
            Double expense,
            Integer prepay) {
        expenseRecordDao.deleteExpenseRecord(
                uid, date, category, type, expense, prepay);
    }

    public void updateExpenseRecord(
            Integer uid,
            Date date,
            String category,
            String type,
            Double expense,
            Integer prepay) {
        expenseRecordDao.updateExpenseRecord(
                uid, date, category, type, expense, prepay);
    }

}
