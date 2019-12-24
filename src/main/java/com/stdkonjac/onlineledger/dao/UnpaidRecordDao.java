package com.stdkonjac.onlineledger.dao;

import com.stdkonjac.onlineledger.entity.UnpaidRecord;
import org.apache.ibatis.annotations.Mapper;
import org.apache.ibatis.annotations.Param;

import java.util.Date;
import java.util.List;

@Mapper
public interface UnpaidRecordDao {

    List<UnpaidRecord> selectUnpaidRecord(
            @Param("id") Integer id,
            @Param("uid") Integer uid,
            @Param("value") Double value,
            @Param("date") Date date,
            @Param("remark") String remark,
            @Param("expense_record_id") Integer expenseRecordId);

    List<UnpaidRecord> selectAllUnpaidRecord();

    void insertUnpaidRecord(
            @Param("id") Integer id,
            @Param("uid") Integer uid,
            @Param("value") Double value,
            @Param("date") Date date,
            @Param("remark") String remark,
            @Param("expense_record_id") Integer expenseRecordId);


    void deleteUnpaidRecord(
            @Param("id") Integer id,
            @Param("uid") Integer uid,
            @Param("value") Double value,
            @Param("date") Date date,
            @Param("remark") String remark,
            @Param("expense_record_id") Integer expenseRecordId);


    void updateUnpaidRecord(
            @Param("id") Integer id,
            @Param("uid") Integer uid,
            @Param("value") Double value,
            @Param("date") Date date,
            @Param("remark") String remark,
            @Param("expense_record_id") Integer expenseRecordId);

    void deleteUnpaidRecordByExpenseRecordId(
            @Param("expense_record_id") Integer expenseRecordId);

}
