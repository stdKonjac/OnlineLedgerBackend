package com.stdkonjac.onlineledger.dao;

import com.stdkonjac.onlineledger.entity.UserProfile;
import org.apache.ibatis.annotations.Mapper;
import org.apache.ibatis.annotations.Param;

import java.util.List;

@Mapper
public interface UserProfileDao {

    List<UserProfile> selectUserProfile(
            @Param("uid") Integer uid,
            @Param("nickname") String nickname,
            @Param("phone") String phone,
            @Param("email") String email);

    List<UserProfile> selectAllUserProfile();

    void insertUserProfile(
            @Param("uid") Integer uid,
            @Param("nickname") String nickname,
            @Param("phone") String phone,
            @Param("email") String email);


    void deleteUserProfile(
            @Param("uid") Integer uid,
            @Param("nickname") String nickname,
            @Param("phone") String phone,
            @Param("email") String email);


    void updateUserProfile(
            @Param("uid") Integer uid,
            @Param("nickname") String nickname,
            @Param("phone") String phone,
            @Param("email") String email);

}
