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
            int uid,
            String nickname,
            String phone,
            String email) {
        return userProfileDao.selectUserProfile(uid, nickname, phone, email);
    }

    public List<UserProfile> selectAllUserProfile() {
        return userProfileDao.selectAllUserProfile();
    }

    public void insertUserProfile(
            int uid,
            String nickname,
            String phone,
            String email) {
        userProfileDao.insertUserProfile(uid, nickname, phone, email);
    }

    public void deleteUserProfile(
            int uid,
            String nickname,
            String phone,
            String email) {
        userProfileDao.deleteUserProfile(uid, nickname, phone, email);
    }

    public void updateUserProfile(
            int uid,
            String nickname,
            String phone,
            String email) {
        userProfileDao.updateUserProfile(uid, nickname, phone, email);
    }
}
