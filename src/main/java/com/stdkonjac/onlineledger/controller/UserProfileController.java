package com.stdkonjac.onlineledger.controller;

import com.stdkonjac.onlineledger.entity.User;
import com.stdkonjac.onlineledger.entity.UserProfile;
import com.stdkonjac.onlineledger.service.UserProfileService;
import com.stdkonjac.onlineledger.util.*;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import javax.servlet.http.HttpServletRequest;
import java.util.List;

@RestController
@RequestMapping("/UserProfile")
public class UserProfileController {
    @Autowired
    private UserProfileService userProfileService;

    @RequestMapping("/query")
    public List<UserProfile> query(HttpServletRequest request) {
        int uid = ParseUtil.str2Int(request.getParameter("uid"));
        String nickname = request.getParameter("nickname");
        String phone = request.getParameter("phone");
        String email = request.getParameter("email");
        return userProfileService.selectUserProfile(uid, nickname, phone, email);
    }

    @RequestMapping("/queryAll")
    public List<UserProfile> queryAll() {
        return userProfileService.selectAllUserProfile();
    }

    @RequestMapping("/insert")
    public void insert(HttpServletRequest request) {
        Integer uid = ParseUtil.str2Int(request.getParameter("uid"));
        String nickname = request.getParameter("nickname");
        String phone = request.getParameter("phone");
        String email = request.getParameter("email");
        userProfileService.insertUserProfile(uid, nickname, phone, email);
    }

    @RequestMapping("/delete")
    public void delete(HttpServletRequest request) {
        Integer uid = ParseUtil.str2Int(request.getParameter("uid"));
        String nickname = request.getParameter("nickname");
        String phone = request.getParameter("phone");
        String email = request.getParameter("email");
        userProfileService.deleteUserProfile(uid, nickname, phone, email);
    }

    @RequestMapping("/update")
    public void update(HttpServletRequest request) {
        Integer uid = ParseUtil.str2Int(request.getParameter("uid"));
        String nickname = request.getParameter("nickname");
        String phone = request.getParameter("phone");
        String email = request.getParameter("email");
        userProfileService.updateUserProfile(uid, nickname, phone, email);
    }

    @RequestMapping("/executeQuery")
    public List<UserProfile> executeQuery(HttpServletRequest request) {
        String sql = request.getParameter("sql");
        return userProfileService.executeSelect(sql);
    }

    @RequestMapping("/executeInsert")
    public void executeInsert(HttpServletRequest request) {
        String sql = request.getParameter("sql");
        userProfileService.executeInsert(sql);
    }

    @RequestMapping("/executeDelete")
    public void executeDelete(HttpServletRequest request) {
        String sql = request.getParameter("sql");
        userProfileService.executeDelete(sql);
    }

    @RequestMapping("/executeUpdate")
    public void executeUpdate(HttpServletRequest request) {
        String sql = request.getParameter("sql");
        userProfileService.executeUpdate(sql);
    }
}
