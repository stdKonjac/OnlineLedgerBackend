package com.stdkonjac.onlineledger.dao;

import org.apache.ibatis.annotations.Mapper;
import org.apache.ibatis.annotations.Param;

import java.util.List;

@Mapper
public interface SqlScriptDao {
    List<Object> executeSelect(@Param("sql") String sql);

    void executeInsert(@Param("sql") String sql);

    void executeDelete(@Param("sql") String sql);

    void executeUpdate(@Param("sql") String sql);

}
