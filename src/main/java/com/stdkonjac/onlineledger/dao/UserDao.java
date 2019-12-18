package com.stdkonjac.onlineledger.dao;

import com.stdkonjac.onlineledger.entity.User;
import org.apache.ibatis.annotations.Mapper;
import org.apache.ibatis.annotations.Param;

import java.util.List;

@Mapper
public interface UserDao {

    List<User> selectUser(
            @Param("id") Integer id,
            @Param("username") String username,
            @Param("password") String password);

    List<User> selectAllUser();

    void insertUser(
            @Param("id") Integer id,
            @Param("username") String username,
            @Param("password") String password);


    void deleteUser(
            @Param("id") Integer id,
            @Param("username") String username,
            @Param("password") String password);


    void updateUser(
            @Param("id") Integer id,
            @Param("username") String username,
            @Param("password") String password);

    List<User> executeSelect(@Param("sql") String sql);

    void executeInsert(@Param("sql") String sql);

    void executeDelete(@Param("sql") String sql);

    void executeUpdate(@Param("sql") String sql);
}
