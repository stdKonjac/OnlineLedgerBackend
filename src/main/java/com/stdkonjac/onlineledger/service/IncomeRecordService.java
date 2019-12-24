package com.stdkonjac.onlineledger.service;

import com.stdkonjac.onlineledger.dao.IncomeRecordDao;
import com.stdkonjac.onlineledger.entity.IncomeRecord;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.Date;
import java.util.List;

@Service
public class IncomeRecordService {
    @Autowired
    private IncomeRecordDao incomeRecordDao;

    public List<IncomeRecord> selectIncomeRecord(
            Integer id,
            Integer uid,
            Date date,
            String category,
            String type,
            Double income,
            String remark,
            String ledgerBook) {
        return incomeRecordDao.selectIncomeRecord(
                id, uid, date, category, type, income, remark, ledgerBook);
    }

    public List<IncomeRecord> selectAllIncomeRecord() {
        return incomeRecordDao.selectAllIncomeRecord();
    }

    public void insertIncomeRecord(
            Integer id,
            Integer uid,
            Date date,
            String category,
            String type,
            Double income,
            String remark,
            String ledgerBook) {
        incomeRecordDao.insertIncomeRecord(
                id, uid, date, category, type, income, remark, ledgerBook);
    }

    public void deleteIncomeRecord(
            Integer id,
            Integer uid,
            Date date,
            String category,
            String type,
            Double income,
            String remark,
            String ledgerBook) {
        incomeRecordDao.deleteIncomeRecord(
                id, uid, date, category, type, income, remark, ledgerBook);
    }

    public void updateIncomeRecord(
            Integer id,
            Integer uid,
            Date date,
            String category,
            String type,
            Double income,
            String remark,
            String ledgerBook) {
        incomeRecordDao.updateIncomeRecord(
                id, uid, date, category, type, income, remark, ledgerBook);
    }

}
