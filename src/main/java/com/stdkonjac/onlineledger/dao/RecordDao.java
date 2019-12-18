package com.stdkonjac.onlineledger.dao;

import com.stdkonjac.onlineledger.entity.Record;
import org.apache.ibatis.annotations.Mapper;
import org.apache.ibatis.annotations.Param;

import java.util.Date;
import java.util.List;

@Mapper
public interface RecordDao {

    List<Record> selectRecord(
            @Param("uid") Integer uid,
            @Param("date") Date date,
            @Param("category") String category,
            @Param("type") String type,
            @Param("cost") Double cost);

    List<Record> selectAllRecord();

    void insertRecord(
            @Param("uid") Integer uid,
            @Param("date") Date date,
            @Param("category") String category,
            @Param("type") String type,
            @Param("cost") Double cost);


    void deleteRecord(
            @Param("uid") Integer uid,
            @Param("date") Date date,
            @Param("category") String category,
            @Param("type") String type,
            @Param("cost") Double cost);


    void updateRecord(
            @Param("uid") Integer uid,
            @Param("date") Date date,
            @Param("category") String category,
            @Param("type") String type,
            @Param("cost") Double cost);

}
