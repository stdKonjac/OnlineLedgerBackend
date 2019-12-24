package com.stdkonjac.onlineledger.controller;

import com.stdkonjac.onlineledger.entity.User;
import com.stdkonjac.onlineledger.entity.UserProfile;
import com.stdkonjac.onlineledger.service.UserProfileService;
import com.stdkonjac.onlineledger.util.*;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

import javax.servlet.http.HttpServletRequest;
import java.util.List;
import java.util.Map;

@RestController
@RequestMapping("/userProfile")
public class UserProfileController {
    @Autowired
    private UserProfileService userProfileService;

    @RequestMapping(value = "/query", method = {RequestMethod.GET})
    public List<UserProfile> query(HttpServletRequest request) {
        int uid = ParseUtil.str2Int(request.getParameter("uid"));
        String nickname = request.getParameter("nickname");
        String phone = request.getParameter("phone");
        String email = request.getParameter("email");
        return userProfileService.selectUserProfile(uid, nickname, phone, email);
    }

    @RequestMapping(value = "/queryAll", method = {RequestMethod.GET})
    public List<UserProfile> queryAll() {
        return userProfileService.selectAllUserProfile();
    }

    @RequestMapping(value = "/insert", method = {RequestMethod.GET})
    public void insert(HttpServletRequest request) {
        Integer uid = ParseUtil.str2Int(request.getParameter("uid"));
        String nickname = request.getParameter("nickname");
        String phone = request.getParameter("phone");
        String email = request.getParameter("email");
        userProfileService.insertUserProfile(uid, nickname, phone, email);
    }

    @RequestMapping(value = "/delete", method = {RequestMethod.GET})
    public void delete(HttpServletRequest request) {
        Integer uid = ParseUtil.str2Int(request.getParameter("uid"));
        String nickname = request.getParameter("nickname");
        String phone = request.getParameter("phone");
        String email = request.getParameter("email");
        userProfileService.deleteUserProfile(uid, nickname, phone, email);
    }

    @RequestMapping(value = "/update", method = {RequestMethod.GET})
    public void update(HttpServletRequest request) {
        Integer uid = ParseUtil.str2Int(request.getParameter("uid"));
        String nickname = request.getParameter("nickname");
        String phone = request.getParameter("phone");
        String email = request.getParameter("email");
        userProfileService.updateUserProfile(uid, nickname, phone, email);
    }

    @RequestMapping(value = "/queryByJson", method = {RequestMethod.POST})
    public List<UserProfile> queryByJson(@RequestBody Map params) {
        Integer uid = ParseUtil.obj2Int(params.get("uid"));
        String nickname = ParseUtil.obj2String(params.get("nickname"));
        String phone = ParseUtil.obj2String(params.get("phone"));
        String email = ParseUtil.obj2String(params.get("email"));
        return userProfileService.selectUserProfile(uid, nickname, phone, email);
    }

    @RequestMapping(value = "/queryAllByJson", method = {RequestMethod.POST})
    public List<UserProfile> queryAllByJson(@RequestBody Map params) {
        return userProfileService.selectAllUserProfile();
    }

    @RequestMapping(value = "/insertByJson", method = {RequestMethod.POST})
    public void insertByJson(@RequestBody Map params) {
        Integer uid = ParseUtil.obj2Int(params.get("uid"));
        String nickname = ParseUtil.obj2String(params.get("nickname"));
        String phone = ParseUtil.obj2String(params.get("phone"));
        String email = ParseUtil.obj2String(params.get("email"));
        userProfileService.insertUserProfile(uid, nickname, phone, email);
    }

    @RequestMapping(value = "/deleteByJson", method = {RequestMethod.POST})
    public void deleteByJson(@RequestBody Map params) {
        Integer uid = ParseUtil.obj2Int(params.get("uid"));
        String nickname = ParseUtil.obj2String(params.get("nickname"));
        String phone = ParseUtil.obj2String(params.get("phone"));
        String email = ParseUtil.obj2String(params.get("email"));
        userProfileService.deleteUserProfile(uid, nickname, phone, email);
    }

    @RequestMapping(value = "/updateByJson", method = {RequestMethod.POST})
    public void updateByJson(@RequestBody Map params) {
        Integer uid = ParseUtil.obj2Int(params.get("uid"));
        String nickname = ParseUtil.obj2String(params.get("nickname"));
        String phone = ParseUtil.obj2String(params.get("phone"));
        String email = ParseUtil.obj2String(params.get("email"));
        userProfileService.updateUserProfile(uid, nickname, phone, email);
    }
}
