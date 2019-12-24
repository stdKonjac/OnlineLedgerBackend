package com.stdkonjac.onlineledger.service;

import com.stdkonjac.onlineledger.dao.UnpaidRecordDao;
import com.stdkonjac.onlineledger.entity.UnpaidRecord;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

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
            String remark) {
        return unpaidRecordDao.selectUnpaidRecord(
                id, uid, value, date, remark);
    }

    public List<UnpaidRecord> selectAllUnpaidRecord() {
        return unpaidRecordDao.selectAllUnpaidRecord();
    }

    public void insertUnpaidRecord(
            Integer id,
            Integer uid,
            Double value,
            Date date,
            String remark) {
        unpaidRecordDao.insertUnpaidRecord(
                id, uid, value, date, remark);
    }

    public void deleteUnpaidRecord(
            Integer id,
            Integer uid,
            Double value,
            Date date,
            String remark) {
        unpaidRecordDao.deleteUnpaidRecord(
                id, uid, value, date, remark);
    }

    public void updateUnpaidRecord(
            Integer id,
            Integer uid,
            Double value,
            Date date,
            String remark) {
        unpaidRecordDao.updateUnpaidRecord(
                id, uid, value, date, remark);
    }

}
