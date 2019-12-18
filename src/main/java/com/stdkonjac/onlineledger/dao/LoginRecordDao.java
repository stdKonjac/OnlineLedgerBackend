package com.stdkonjac.onlineledger.dao;

import com.stdkonjac.onlineledger.entity.LoginRecord;
import com.stdkonjac.onlineledger.entity.User;
import org.apache.ibatis.annotations.Mapper;
import org.apache.ibatis.annotations.Param;

import java.util.Date;
import java.util.List;

@Mapper
public interface LoginRecordDao {

    List<LoginRecord> selectLoginRecord(
            @Param("IP") String IP,
            @Param("uid") Integer uid,
            @Param("username") String username,
            @Param("date") Date date);

    List<LoginRecord> selectAllLoginRecord();

    void insertLoginRecord(
            @Param("IP") String IP,
            @Param("uid") Integer uid,
            @Param("username") String username,
            @Param("date") Date date);


    void deleteLoginRecord(
            @Param("IP") String IP,
            @Param("uid") Integer uid,
            @Param("username") String username,
            @Param("date") Date date);


    void updateLoginRecord(
            @Param("IP") String IP,
            @Param("uid") Integer uid,
            @Param("username") String username,
            @Param("date") Date date);

    List<LoginRecord> executeSelect(@Param("sql") String sql);

    void executeInsert(@Param("sql") String sql);

    void executeDelete(@Param("sql") String sql);

    void executeUpdate(@Param("sql") String sql);
}
