package com.stdkonjac.onlineledger.dao;

import com.stdkonjac.onlineledger.entity.LoginRecord;
import org.apache.ibatis.annotations.Mapper;
import org.apache.ibatis.annotations.Param;

import java.sql.Timestamp;
import java.util.List;

@Mapper
public interface LoginRecordDao {

    List<LoginRecord> selectLoginRecord(
            @Param("id") Integer id,
            @Param("ip") String ip,
            @Param("uid") Integer uid,
            @Param("username") String username,
            @Param("login_time") Timestamp loginTime);

    List<LoginRecord> selectAllLoginRecord();

    void insertLoginRecord(
            @Param("id") Integer id,
            @Param("ip") String ip,
            @Param("uid") Integer uid,
            @Param("username") String username,
            @Param("login_time") Timestamp loginTime);


    void deleteLoginRecord(
            @Param("id") Integer id,
            @Param("ip") String ip,
            @Param("uid") Integer uid,
            @Param("username") String username,
            @Param("login_time") Timestamp loginTime);


    void updateLoginRecord(
            @Param("id") Integer id,
            @Param("ip") String ip,
            @Param("uid") Integer uid,
            @Param("username") String username,
            @Param("login_time") Timestamp loginTime);

}
