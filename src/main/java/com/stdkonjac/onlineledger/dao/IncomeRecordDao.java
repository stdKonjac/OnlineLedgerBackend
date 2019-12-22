package com.stdkonjac.onlineledger.dao;

import com.stdkonjac.onlineledger.entity.IncomeRecord;
import org.apache.ibatis.annotations.Mapper;
import org.apache.ibatis.annotations.Param;

import java.util.Date;
import java.util.List;

@Mapper
public interface IncomeRecordDao {

    List<IncomeRecord> selectIncomeRecord(
            @Param("uid") Integer uid,
            @Param("date") Date date,
            @Param("category") String category,
            @Param("type") String type,
            @Param("income") Double income);

    List<IncomeRecord> selectAllIncomeRecord();

    void insertIncomeRecord(
            @Param("uid") Integer uid,
            @Param("date") Date date,
            @Param("category") String category,
            @Param("type") String type,
            @Param("income") Double income);


    void deleteIncomeRecord(
            @Param("uid") Integer uid,
            @Param("date") Date date,
            @Param("category") String category,
            @Param("type") String type,
            @Param("income") Double income);


    void updateIncomeRecord(
            @Param("uid") Integer uid,
            @Param("date") Date date,
            @Param("category") String category,
            @Param("type") String type,
            @Param("income") Double income);

}
