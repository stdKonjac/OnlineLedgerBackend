package com.stdkonjac.onlineledger.dao;

import com.stdkonjac.onlineledger.entity.Category;
import org.apache.ibatis.annotations.Mapper;
import org.apache.ibatis.annotations.Param;

import java.util.List;

@Mapper
public interface CategoryDao {

    List<Category> selectCategory(
            @Param("uid") int uid,
            @Param("name") String name,
            @Param("record_count") int record_count);

    List<Category> selectAllCategory();

    void insertCategory(
            @Param("uid") int uid,
            @Param("name") String name,
            @Param("record_count") int record_count);


    void deleteCategory(
            @Param("uid") int uid,
            @Param("name") String name,
            @Param("record_count") int record_count);


    void updateCategory(
            @Param("uid") int uid,
            @Param("name") String name,
            @Param("record_count") int record_count);
}
