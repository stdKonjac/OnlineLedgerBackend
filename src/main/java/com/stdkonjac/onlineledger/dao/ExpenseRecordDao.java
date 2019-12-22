package com.stdkonjac.onlineledger.dao;

import com.stdkonjac.onlineledger.entity.ExpenseRecord;
import org.apache.ibatis.annotations.Mapper;
import org.apache.ibatis.annotations.Param;

import java.util.Date;
import java.util.List;

@Mapper
public interface ExpenseRecordDao {

    List<ExpenseRecord> selectExpenseRecord(
            @Param("uid") Integer uid,
            @Param("date") Date date,
            @Param("category") String category,
            @Param("type") String type,
            @Param("expense") Double expense,
            @Param("prepay") Integer prepay);

    List<ExpenseRecord> selectAllExpenseRecord();

    void insertExpenseRecord(
            @Param("uid") Integer uid,
            @Param("date") Date date,
            @Param("category") String category,
            @Param("type") String type,
            @Param("expense") Double expense,
            @Param("prepay") Integer prepay);


    void deleteExpenseRecord(
            @Param("uid") Integer uid,
            @Param("date") Date date,
            @Param("category") String category,
            @Param("type") String type,
            @Param("expense") Double expense,
            @Param("prepay") Integer prepay);


    void updateExpenseRecord(
            @Param("uid") Integer uid,
            @Param("date") Date date,
            @Param("category") String category,
            @Param("type") String type,
            @Param("expense") Double expense,
            @Param("prepay") Integer prepay);

}
