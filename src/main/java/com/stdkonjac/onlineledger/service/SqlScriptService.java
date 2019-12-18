package com.stdkonjac.onlineledger.service;

import com.stdkonjac.onlineledger.dao.SqlScriptDao;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class SqlScriptService {
    @Autowired
    private SqlScriptDao sqlScriptDao;

    public List<Object> executeSelect(String sql) {
        return sqlScriptDao.executeSelect(sql);
    }

    public void executeInsert(String sql) {
        sqlScriptDao.executeInsert(sql);
    }

    public void executeDelete(String sql) {
        sqlScriptDao.executeDelete(sql);
    }

    public void executeUpdate(String sql) {
        sqlScriptDao.executeUpdate(sql);
    }

}
