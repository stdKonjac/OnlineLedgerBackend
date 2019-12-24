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
public class ExpenseRecordSyncHandlerService {
    @Autowired
    private ExpenseRecordDao expenseRecordDao;
    @Autowired
    private PaidRecordDao paidRecordDao;
    @Autowired
    private UnpaidRecordDao unpaidRecordDao;

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
        List<ExpenseRecord> expenseRecordList =
                expenseRecordDao.selectExpenseRecord(
                        id, uid, date, category, type, expense, prepay, remark, ledgerBook);
        if (expenseRecordList.size() != 1) {
            return -1;
        } else if (prepay == null) {
            return 0;
        } else {
            Integer expenseRecordId = expenseRecordList.get(0).getId();
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
        List<ExpenseRecord> expenseRecordList =
                expenseRecordDao.selectExpenseRecord(
                        id, uid, date, category, type, expense, prepay, remark, ledgerBook);
        expenseRecordDao.deleteExpenseRecord(
                id, uid, date, category, type, expense, prepay, remark, ledgerBook);
        if (expenseRecordList.size() != 1) {
            return -1;
        } else if (prepay == null) {
            return 0;
        } else {
            Integer expenseRecordId = expenseRecordList.get(0).getId();
            if (prepay == 0) {
                paidRecordDao.deletePaidRecordByExpenseRecordId(
                        expenseRecordId);
            } else {
                unpaidRecordDao.deleteUnpaidRecordByExpenseRecordId(
                        expenseRecordId);
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
        List<ExpenseRecord> expenseRecordList =
                expenseRecordDao.selectExpenseRecord(
                        id, uid, date, category, type, expense, prepay, remark, ledgerBook);
        if (expenseRecordList.size() != 1) {
            return -1;
        } else if (prepay == null) {
            return 0;
        } else {
            Integer expenseRecordId = expenseRecordList.get(0).getId();
            if (prepay == 0) {
                unpaidRecordDao.deleteUnpaidRecordByExpenseRecordId(
                        expenseRecordId);
                paidRecordDao.insertPaidRecord(
                        null, uid, expense, date, remark, expenseRecordId);
            } else {
                paidRecordDao.deletePaidRecordByExpenseRecordId(
                        expenseRecordId);
                unpaidRecordDao.insertUnpaidRecord(
                        null, uid, expense, date, remark, expenseRecordId);
            }
            return 1;
        }
    }
}
