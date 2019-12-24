package com.stdkonjac.onlineledger.dao;

import com.stdkonjac.onlineledger.entity.PaidRecord;
import com.stdkonjac.onlineledger.entity.UnpaidRecord;
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
            @Param("remark") String remark);

    List<PaidRecord> selectAllPaidRecord();

    void insertPaidRecord(
            @Param("id") Integer id,
            @Param("uid") Integer uid,
            @Param("value") Double value,
            @Param("date") Date date,
            @Param("remark") String remark);


    void deletePaidRecord(
            @Param("id") Integer id,
            @Param("uid") Integer uid,
            @Param("value") Double value,
            @Param("date") Date date,
            @Param("remark") String remark);


    void updatePaidRecord(
            @Param("id") Integer id,
            @Param("uid") Integer uid,
            @Param("value") Double value,
            @Param("date") Date date,
            @Param("remark") String remark);

}
