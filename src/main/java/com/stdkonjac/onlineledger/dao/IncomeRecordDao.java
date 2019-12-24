package com.stdkonjac.onlineledger.dao;

import com.stdkonjac.onlineledger.entity.IncomeRecord;
import org.apache.ibatis.annotations.Mapper;
import org.apache.ibatis.annotations.Param;

import java.util.Date;
import java.util.List;

@Mapper
public interface IncomeRecordDao {

    List<IncomeRecord> selectIncomeRecord(
            @Param("id") Integer id,
            @Param("uid") Integer uid,
            @Param("date") Date date,
            @Param("category") String category,
            @Param("type") String type,
            @Param("income") Double income,
            @Param("remark") String remark,
            @Param("ledger_book") String ledgerBook);

    List<IncomeRecord> selectAllIncomeRecord();

    void insertIncomeRecord(
            @Param("id") Integer id,
            @Param("uid") Integer uid,
            @Param("date") Date date,
            @Param("category") String category,
            @Param("type") String type,
            @Param("income") Double income,
            @Param("remark") String remark,
            @Param("ledger_book") String ledgerBook);


    void deleteIncomeRecord(
            @Param("id") Integer id,
            @Param("uid") Integer uid,
            @Param("date") Date date,
            @Param("category") String category,
            @Param("type") String type,
            @Param("income") Double income,
            @Param("remark") String remark,
            @Param("ledger_book") String ledgerBook);


    void updateIncomeRecord(
            @Param("id") Integer id,
            @Param("uid") Integer uid,
            @Param("date") Date date,
            @Param("category") String category,
            @Param("type") String type,
            @Param("income") Double income,
            @Param("remark") String remark,
            @Param("ledger_book") String ledgerBook);

}
