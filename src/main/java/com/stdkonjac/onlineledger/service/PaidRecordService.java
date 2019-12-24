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
            String remark) {
        return paidRecordDao.selectPaidRecord(
                id, uid, value, date, remark);
    }

    public List<PaidRecord> selectAllPaidRecord() {
        return paidRecordDao.selectAllPaidRecord();
    }

    public void insertPaidRecord(
            Integer id,
            Integer uid,
            Double value,
            Date date,
            String remark) {
        paidRecordDao.insertPaidRecord(
                id, uid, value, date, remark);
    }

    public void deletePaidRecord(
            Integer id,
            Integer uid,
            Double value,
            Date date,
            String remark) {
        paidRecordDao.deletePaidRecord(
                id, uid, value, date, remark);
    }

    public void updatePaidRecord(
            Integer id,
            Integer uid,
            Double value,
            Date date,
            String remark) {
        paidRecordDao.updatePaidRecord(
                id, uid, value, date, remark);
    }

}
