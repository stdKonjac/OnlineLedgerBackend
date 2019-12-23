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
            @Param("ip") String ip,
            @Param("uid") Integer uid,
            @Param("username") String username,
            @Param("login_time") Date loginTime);

    List<LoginRecord> selectAllLoginRecord();

    void insertLoginRecord(
            @Param("ip") String ip,
            @Param("uid") Integer uid,
            @Param("username") String username,
            @Param("login_time") Date loginTime);


    void deleteLoginRecord(
            @Param("ip") String ip,
            @Param("uid") Integer uid,
            @Param("username") String username,
            @Param("login_time") Date loginTime);


    void updateLoginRecord(
            @Param("ip") String ip,
            @Param("uid") Integer uid,
            @Param("username") String username,
            @Param("login_time") Date loginTime);

}
