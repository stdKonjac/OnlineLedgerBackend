package com.stdkonjac.onlineledger.service;

import com.stdkonjac.onlineledger.dao.LedgerBookDao;
import com.stdkonjac.onlineledger.entity.LedgerBook;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class LedgerBookService {
    @Autowired
    private LedgerBookDao ledgerBookDao;

    public List<LedgerBook> selectLedgerBook(
            Integer id,
            Integer uid,
            String name,
            Integer recordCount,
            Double budget) {
        return ledgerBookDao.selectLedgerBook(
                id, uid, name, recordCount, budget);
    }

    public List<LedgerBook> selectAllLedgerBook() {
        return ledgerBookDao.selectAllLedgerBook();
    }

    public void insertLedgerBook(
            Integer id,
            Integer uid,
            String name,
            Integer recordCount,
            Double budget) {
        ledgerBookDao.insertLedgerBook(
                id, uid, name, recordCount, budget);
    }

    public void deleteLedgerBook(
            Integer id,
            Integer uid,
            String name,
            Integer recordCount,
            Double budget) {
        ledgerBookDao.deleteLedgerBook(
                id, uid, name, recordCount, budget);
    }

    public void updateLedgerBook(
            Integer id,
            Integer uid,
            String name,
            Integer recordCount,
            Double budget) {
        ledgerBookDao.updateLedgerBook(
                id, uid, name, recordCount, budget);
    }

}
