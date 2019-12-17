package com.stdkonjac.onlineledger.dao;

import com.stdkonjac.onlineledger.entity.User;
import org.apache.ibatis.annotations.Mapper;
import org.apache.ibatis.annotations.Param;

import java.util.List;

@Mapper
public interface UserDao {

    List<User> selectUser(
            @Param("id") int id,
            @Param("username") String username,
            @Param("password") String password);

    List<User> selectAllUser();

    void insertUser(
            @Param("id") int id,
            @Param("username") String username,
            @Param("password") String password);


    void deleteUser(
            @Param("id") int id,
            @Param("username") String username,
            @Param("password") String password);


    void updateUser(
            @Param("id") int id,
            @Param("username") String username,
            @Param("password") String password);
}
