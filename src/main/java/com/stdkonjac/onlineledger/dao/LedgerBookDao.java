package com.stdkonjac.onlineledger.dao;

import com.stdkonjac.onlineledger.entity.LedgerBook;
import org.apache.ibatis.annotations.Mapper;
import org.apache.ibatis.annotations.Param;

import java.util.List;

@Mapper
public interface LedgerBookDao {

    List<LedgerBook> selectLedgerBook(
            @Param("uid") Integer uid,
            @Param("name") String name,
            @Param("record_count") Integer recordCount,
            @Param("budget") Double budget);

    List<LedgerBook> selectAllLedgerBook();

    void insertLedgerBook(
            @Param("uid") Integer uid,
            @Param("name") String name,
            @Param("record_count") Integer recordCount,
            @Param("budget") Double budget);


    void deleteLedgerBook(
            @Param("uid") Integer uid,
            @Param("name") String name,
            @Param("record_count") Integer recordCount,
            @Param("budget") Double budget);


    void updateLedgerBook(
            @Param("uid") Integer uid,
            @Param("name") String name,
            @Param("record_count") Integer recordCount,
            @Param("budget") Double budget);

}
