package com.stdkonjac.onlineledger.dao;

import com.stdkonjac.onlineledger.entity.ExpenseRecord;
import org.apache.ibatis.annotations.Mapper;
import org.apache.ibatis.annotations.Param;

import java.util.Date;
import java.util.List;

@Mapper
public interface ExpenseRecordDao {

    List<ExpenseRecord> selectExpenseRecord(
            @Param("id") Integer id,
            @Param("uid") Integer uid,
            @Param("date") Date date,
            @Param("category") String category,
            @Param("type") String type,
            @Param("expense") Double expense,
            @Param("prepay") Integer prepay,
            @Param("remark") String remark,
            @Param("ledger_book") String ledgerBook);

    List<ExpenseRecord> selectAllExpenseRecord();

    void insertExpenseRecord(
            @Param("id") Integer id,
            @Param("uid") Integer uid,
            @Param("date") Date date,
            @Param("category") String category,
            @Param("type") String type,
            @Param("expense") Double expense,
            @Param("prepay") Integer prepay,
            @Param("remark") String remark,
            @Param("ledger_book") String ledgerBook);


    void deleteExpenseRecord(
            @Param("id") Integer id,
            @Param("uid") Integer uid,
            @Param("date") Date date,
            @Param("category") String category,
            @Param("type") String type,
            @Param("expense") Double expense,
            @Param("prepay") Integer prepay,
            @Param("remark") String remark,
            @Param("ledger_book") String ledgerBook);


    void updateExpenseRecord(
            @Param("id") Integer id,
            @Param("uid") Integer uid,
            @Param("date") Date date,
            @Param("category") String category,
            @Param("type") String type,
            @Param("expense") Double expense,
            @Param("prepay") Integer prepay,
            @Param("remark") String remark,
            @Param("ledger_book") String ledgerBook);

    Integer getLastExpenseRecordId();

}
