package com.stdkonjac.onlineledger.dao;

import com.stdkonjac.onlineledger.entity.WishRecord;
import org.apache.ibatis.annotations.Mapper;
import org.apache.ibatis.annotations.Param;

import java.util.List;

@Mapper
public interface WishRecordDao {

    List<WishRecord> selectWishRecord(
            @Param("id") Integer id,
            @Param("uid") Integer uid,
            @Param("wish") String wish,
            @Param("remark") String remark);

    List<WishRecord> selectAllWishRecord();

    void insertWishRecord(
            @Param("id") Integer id,
            @Param("uid") Integer uid,
            @Param("wish") String wish,
            @Param("remark") String remark);


    void deleteWishRecord(
            @Param("id") Integer id,
            @Param("uid") Integer uid,
            @Param("wish") String wish,
            @Param("remark") String remark);


    void updateWishRecord(
            @Param("id") Integer id,
            @Param("uid") Integer uid,
            @Param("wish") String wish,
            @Param("remark") String remark);

}
