package com.stdkonjac.onlineledger.dao;

import com.stdkonjac.onlineledger.entity.PaidRecord;
import org.apache.ibatis.annotations.Mapper;
import org.apache.ibatis.annotations.Param;

import java.util.Date;
import java.util.List;

@Mapper
public interface PaidRecordDao {

    List<PaidRecord> selectPaidRecord(
            @Param("id") Integer id,
            @Param("uid") Integer uid,
            @Param("value") Double value,
            @Param("date") Date date,
            @Param("remark") String remark,
            @Param("expense_record_id") Integer expenseRecordId);

    List<PaidRecord> selectAllPaidRecord();

    void insertPaidRecord(
            @Param("id") Integer id,
            @Param("uid") Integer uid,
            @Param("value") Double value,
            @Param("date") Date date,
            @Param("remark") String remark,
            @Param("expense_record_id") Integer expenseRecordId);


    void deletePaidRecord(
            @Param("id") Integer id,
            @Param("uid") Integer uid,
            @Param("value") Double value,
            @Param("date") Date date,
            @Param("remark") String remark,
            @Param("expense_record_id") Integer expenseRecordId);


    void updatePaidRecord(
            @Param("id") Integer id,
            @Param("uid") Integer uid,
            @Param("value") Double value,
            @Param("date") Date date,
            @Param("remark") String remark,
            @Param("expense_record_id") Integer expenseRecordId);

    void deletePaidRecordByExpenseRecordId(
            @Param("expense_record_id") Integer expenseRecordId);

}
