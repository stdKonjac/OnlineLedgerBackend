package com.stdkonjac.onlineledger.service;

import com.stdkonjac.onlineledger.dao.ExpenseRecordDao;
import com.stdkonjac.onlineledger.dao.PaidRecordDao;
import com.stdkonjac.onlineledger.dao.UnpaidRecordDao;
import com.stdkonjac.onlineledger.entity.ExpenseRecord;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.Date;
import java.util.List;

@Service
public class ExpenseRecordService {
    @Autowired
    private ExpenseRecordDao expenseRecordDao;
    @Autowired
    private PaidRecordDao paidRecordDao;
    @Autowired
    private UnpaidRecordDao unpaidRecordDao;

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

    public Integer syncInsert(
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
        Integer expenseRecordId = expenseRecordDao.getLastExpenseRecordId();
        List<ExpenseRecord> expenseRecordList = expenseRecordDao.selectExpenseRecord(
                expenseRecordId, null, null, null, null, null, null, null, null);
        ExpenseRecord record = expenseRecordList.get(0);
        uid = record.getUid();
        date = record.getDate();
        expense = record.getExpense();
        prepay = record.getPrepay();
        remark = record.getRemark();
        if (expenseRecordId == null) {
            return -1;
        } else if (prepay == null) {
            return 0;
        } else {
            if (prepay == 0) {
                paidRecordDao.insertPaidRecord(
                        null, uid, expense, date, remark, expenseRecordId);
            } else {
                unpaidRecordDao.insertUnpaidRecord(
                        null, uid, expense, date, remark, expenseRecordId);
            }
            return 1;
        }
    }

    public Integer syncDelete(
            Integer id,
            Integer uid,
            Date date,
            String category,
            String type,
            Double expense,
            Integer prepay,
            String remark,
            String ledgerBook) {
        List<ExpenseRecord> expenseRecordList = expenseRecordDao.selectExpenseRecord(
                id, null, null, null, null, null, null, null, null);
        ExpenseRecord record = expenseRecordList.get(0);
        id = record.getId();
        prepay = record.getPrepay();
        expenseRecordDao.deleteExpenseRecord(
                id, uid, date, category, type, expense, prepay, remark, ledgerBook);
        if (id == null) {
            return -1;
        } else if (prepay == null) {
            return 0;
        } else {
            if (prepay == 0) {
                paidRecordDao.deletePaidRecordByExpenseRecordId(
                        id);
            } else {
                unpaidRecordDao.deleteUnpaidRecordByExpenseRecordId(
                        id);
            }
            return 1;
        }
    }

    public Integer syncUpdate(
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
        List<ExpenseRecord> expenseRecordList = expenseRecordDao.selectExpenseRecord(
                id, null, null, null, null, null, null, null, null);
        ExpenseRecord record = expenseRecordList.get(0);
        id = record.getId();
        uid = record.getUid();
        date = record.getDate();
        expense = record.getExpense();
        prepay = record.getPrepay();
        remark = record.getRemark();
        if (id == null) {
            return -1;
        } else if (prepay == null) {
            return 0;
        } else {
            if (prepay == 0) {
                unpaidRecordDao.deleteUnpaidRecordByExpenseRecordId(
                        id);
                paidRecordDao.insertPaidRecord(
                        null, uid, expense, date, remark, id);
            } else {
                paidRecordDao.deletePaidRecordByExpenseRecordId(
                        id);
                unpaidRecordDao.insertUnpaidRecord(
                        null, uid, expense, date, remark, id);
            }
            return 1;
        }
    }

}
