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
            Integer uid,
            String name,
            Integer recordCount,
            Double budget) {
        return ledgerBookDao.selectLedgerBook(
                uid, name, recordCount, budget);
    }

    public List<LedgerBook> selectAllLedgerBook() {
        return ledgerBookDao.selectAllLedgerBook();
    }

    public void insertLedgerBook(
            Integer uid,
            String name,
            Integer recordCount,
            Double budget) {
        ledgerBookDao.insertLedgerBook(
                uid, name, recordCount, budget);
    }

    public void deleteLedgerBook(
            Integer uid,
            String name,
            Integer recordCount,
            Double budget) {
        ledgerBookDao.deleteLedgerBook(
                uid, name, recordCount, budget);
    }

    public void updateLedgerBook(
            Integer uid,
            String name,
            Integer recordCount,
            Double budget) {
        ledgerBookDao.updateLedgerBook(
                uid, name, recordCount, budget);
    }

}
