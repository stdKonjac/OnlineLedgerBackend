package com.stdkonjac.onlineledger.service;

import com.stdkonjac.onlineledger.dao.WishRecordDao;
import com.stdkonjac.onlineledger.entity.WishRecord;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class WishRecordService {
    @Autowired
    private WishRecordDao wishRecordDao;

    public List<WishRecord> selectWishRecord(
            Integer id,
            Integer uid,
            String wish,
            String remark) {
        return wishRecordDao.selectWishRecord(
                id, uid, wish, remark);
    }

    public List<WishRecord> selectAllWishRecord() {
        return wishRecordDao.selectAllWishRecord();
    }

    public void insertWishRecord(
            Integer id,
            Integer uid,
            String wish,
            String remark) {
        wishRecordDao.insertWishRecord(
                id, uid, wish, remark);
    }

    public void deleteWishRecord(
            Integer id,
            Integer uid,
            String wish,
            String remark) {
        wishRecordDao.deleteWishRecord(
                id, uid, wish, remark);
    }

    public void updateWishRecord(
            Integer id,
            Integer uid,
            String wish,
            String remark) {
        wishRecordDao.updateWishRecord(
                id, uid, wish, remark);
    }

}
