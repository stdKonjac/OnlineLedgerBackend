package com.stdkonjac.onlineledger.service;

import com.stdkonjac.onlineledger.dao.UserProfileDao;
import com.stdkonjac.onlineledger.entity.UserProfile;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class UserProfileService {
    @Autowired
    private UserProfileDao userProfileDao;

    public List<UserProfile> selectUserProfile(
            Integer id,
            Integer uid,
            String nickname,
            String phone,
            String email) {
        return userProfileDao.selectUserProfile(
                id, uid, nickname, phone, email);
    }

    public List<UserProfile> selectAllUserProfile() {
        return userProfileDao.selectAllUserProfile();
    }

    public void insertUserProfile(
            Integer id,
            Integer uid,
            String nickname,
            String phone,
            String email) {
        userProfileDao.insertUserProfile(
                id, uid, nickname, phone, email);
    }

    public void deleteUserProfile(
            Integer id,
            Integer uid,
            String nickname,
            String phone,
            String email) {
        userProfileDao.deleteUserProfile(
                id, uid, nickname, phone, email);
    }

    public void updateUserProfile(
            Integer id,
            Integer uid,
            String nickname,
            String phone,
            String email) {
        userProfileDao.updateUserProfile(
                id, uid, nickname, phone, email);
    }

}
