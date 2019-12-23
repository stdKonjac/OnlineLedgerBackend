package com.stdkonjac.onlineledger.dao;

import com.stdkonjac.onlineledger.entity.WishRecord;
import org.apache.ibatis.annotations.Mapper;
import org.apache.ibatis.annotations.Param;

import java.util.List;

@Mapper
public interface WishRecordDao {

    List<WishRecord> selectWishRecord(
            @Param("uid") Integer uid,
            @Param("wish") String wish,
            @Param("remark") String remark);

    List<WishRecord> selectAllWishRecord();

    void insertWishRecord(
            @Param("uid") Integer uid,
            @Param("wish") String wish,
            @Param("remark") String remark);


    void deleteWishRecord(
            @Param("uid") Integer uid,
            @Param("wish") String wish,
            @Param("remark") String remark);


    void updateWishRecord(
            @Param("uid") Integer uid,
            @Param("wish") String wish,
            @Param("remark") String remark);

}
