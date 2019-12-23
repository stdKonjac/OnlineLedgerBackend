package com.stdkonjac.onlineledger.dao;

import com.stdkonjac.onlineledger.entity.LogoutRecord;
import org.apache.ibatis.annotations.Mapper;
import org.apache.ibatis.annotations.Param;

import java.sql.Timestamp;
import java.util.Date;
import java.util.List;

@Mapper
public interface LogoutRecordDao {

    List<LogoutRecord> selectLogoutRecord(
            @Param("ip") String ip,
            @Param("uid") Integer uid,
            @Param("username") String username,
            @Param("logout_time") Timestamp logoutTime);

    List<LogoutRecord> selectAllLogoutRecord();

    void insertLogoutRecord(
            @Param("ip") String ip,
            @Param("uid") Integer uid,
            @Param("username") String username,
            @Param("logout_time") Timestamp logoutTime);


    void deleteLogoutRecord(
            @Param("ip") String ip,
            @Param("uid") Integer uid,
            @Param("username") String username,
            @Param("logout_time") Timestamp logoutTime);


    void updateLogoutRecord(
            @Param("ip") String ip,
            @Param("uid") Integer uid,
            @Param("username") String username,
            @Param("logout_time") Timestamp logoutTime);

}
