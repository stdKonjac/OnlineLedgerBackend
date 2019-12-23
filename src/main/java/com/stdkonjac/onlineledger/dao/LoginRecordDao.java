package com.stdkonjac.onlineledger.dao;

import com.stdkonjac.onlineledger.entity.LoginRecord;
import org.apache.ibatis.annotations.Mapper;
import org.apache.ibatis.annotations.Param;

import java.sql.Timestamp;
import java.util.Date;
import java.util.List;

@Mapper
public interface LoginRecordDao {

    List<LoginRecord> selectLoginRecord(
            @Param("ip") String ip,
            @Param("uid") Integer uid,
            @Param("username") String username,
            @Param("login_time") Timestamp loginTime);

    List<LoginRecord> selectAllLoginRecord();

    void insertLoginRecord(
            @Param("ip") String ip,
            @Param("uid") Integer uid,
            @Param("username") String username,
            @Param("login_time") Timestamp loginTime);


    void deleteLoginRecord(
            @Param("ip") String ip,
            @Param("uid") Integer uid,
            @Param("username") String username,
            @Param("login_time") Timestamp loginTime);


    void updateLoginRecord(
            @Param("ip") String ip,
            @Param("uid") Integer uid,
            @Param("username") String username,
            @Param("login_time") Timestamp loginTime);

}
