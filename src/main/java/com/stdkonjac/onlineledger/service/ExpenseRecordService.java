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
            Integer id,
            Integer uid,
            Date date,
            String category,
            String type,
            Double expense,
            Integer prepay,
            String remark,
            String ledgerBook) {
        return expenseRecordDao.selectExpenseRecord(
                id, uid, date, category, type, expense, prepay, remark, ledgerBook);
    }

    public List<ExpenseRecord> selectAllExpenseRecord() {
        return expenseRecordDao.selectAllExpenseRecord();
    }

    public void insertExpenseRecord(
            Integer id,
            Integer uid,
            Date date,
            String category,
            String type,
            Double expense,
            Integer prepay,
            String remark,
            String ledgerBook) {
        expenseRecordDao.insertExpenseRecord(
                id, uid, date, category, type, expense, prepay, remark, ledgerBook);
    }

    public void deleteExpenseRecord(
            Integer id,
            Integer uid,
            Date date,
            String category,
            String type,
            Double expense,
            Integer prepay,
            String remark,
            String ledgerBook) {
        expenseRecordDao.deleteExpenseRecord(
                id, uid, date, category, type, expense, prepay, remark, ledgerBook);
    }

    public void updateExpenseRecord(
            Integer id,
            Integer uid,
            Date date,
            String category,
            String type,
            Double expense,
            Integer prepay,
            String remark,
            String ledgerBook) {
        expenseRecordDao.updateExpenseRecord(
                id, uid, date, category, type, expense, prepay, remark, ledgerBook);
    }

}
