package com.stdkonjac.onlineledger.dao;

import com.stdkonjac.onlineledger.entity.LogoutRecord;
import org.apache.ibatis.annotations.Mapper;
import org.apache.ibatis.annotations.Param;

import java.sql.Timestamp;
import java.util.List;

@Mapper
public interface LogoutRecordDao {

    List<LogoutRecord> selectLogoutRecord(
            @Param("id") Integer id,
            @Param("ip") String ip,
            @Param("uid") Integer uid,
            @Param("username") String username,
            @Param("logout_time") Timestamp logoutTime);

    List<LogoutRecord> selectAllLogoutRecord();

    void insertLogoutRecord(
            @Param("id") Integer id,
            @Param("ip") String ip,
            @Param("uid") Integer uid,
            @Param("username") String username,
            @Param("logout_time") Timestamp logoutTime);


    void deleteLogoutRecord(
            @Param("id") Integer id,
            @Param("ip") String ip,
            @Param("uid") Integer uid,
            @Param("username") String username,
            @Param("logout_time") Timestamp logoutTime);


    void updateLogoutRecord(
            @Param("id") Integer id,
            @Param("ip") String ip,
            @Param("uid") Integer uid,
            @Param("username") String username,
            @Param("logout_time") Timestamp logoutTime);

}
