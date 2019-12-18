package com.stdkonjac.onlineledger.dao;

import com.stdkonjac.onlineledger.entity.Category;
import com.stdkonjac.onlineledger.entity.User;
import org.apache.ibatis.annotations.Mapper;
import org.apache.ibatis.annotations.Param;

import java.util.List;

@Mapper
public interface CategoryDao {

    List<Category> selectCategory(
            @Param("uid") Integer uid,
            @Param("name") String name,
            @Param("record_count") Integer recordCount);

    List<Category> selectAllCategory();

    void insertCategory(
            @Param("uid") Integer uid,
            @Param("name") String name,
            @Param("record_count") Integer recordCount);


    void deleteCategory(
            @Param("uid") Integer uid,
            @Param("name") String name,
            @Param("record_count") Integer recordCount);


    void updateCategory(
            @Param("uid") Integer uid,
            @Param("name") String name,
            @Param("record_count") Integer recordCount);

    List<Category> executeSelect(@Param("sql") String sql);

    void executeInsert(@Param("sql") String sql);

    void executeDelete(@Param("sql") String sql);

    void executeUpdate(@Param("sql") String sql);
}
