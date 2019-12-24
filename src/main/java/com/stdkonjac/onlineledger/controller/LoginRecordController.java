package com.stdkonjac.onlineledger.controller;

import com.stdkonjac.onlineledger.entity.LoginRecord;
import com.stdkonjac.onlineledger.service.LoginRecordService;
import com.stdkonjac.onlineledger.util.*;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

import javax.servlet.http.HttpServletRequest;
import java.sql.Timestamp;
import java.util.List;
import java.util.Map;

@RestController
@RequestMapping("/loginRecord")
public class LoginRecordController {
    @Autowired
    private LoginRecordService loginRecordService;

    @RequestMapping(value = "/query", method = {RequestMethod.GET})
    public List<LoginRecord> query(HttpServletRequest request) {
        Integer id = ParseUtil.str2Int(request.getParameter("id"));
        String ip = request.getParameter("ip");
        Integer uid = ParseUtil.str2Int(request.getParameter("uid"));
        String username = request.getParameter("username");
        Timestamp loginTime = ParseUtil.str2Timestamp(request.getParameter("loginTime"));
        return loginRecordService.selectLoginRecord(
                id, ip, uid, username, loginTime);
    }

    @RequestMapping(value = "/queryAll", method = {RequestMethod.GET})
    public List<LoginRecord> queryAll() {
        return loginRecordService.selectAllLoginRecord();
    }

    @RequestMapping(value = "/insert", method = {RequestMethod.GET})
    public void insert(HttpServletRequest request) {
        Integer id = ParseUtil.str2Int(request.getParameter("id"));
        String ip = request.getParameter("ip");
        Integer uid = ParseUtil.str2Int(request.getParameter("uid"));
        String username = request.getParameter("username");
        Timestamp loginTime = ParseUtil.str2Timestamp(request.getParameter("loginTime"));
        loginRecordService.insertLoginRecord(
                id, ip, uid, username, loginTime);
    }

    @RequestMapping(value = "/delete", method = {RequestMethod.GET})
    public void delete(HttpServletRequest request) {
        Integer id = ParseUtil.str2Int(request.getParameter("id"));
        String ip = request.getParameter("ip");
        Integer uid = ParseUtil.str2Int(request.getParameter("uid"));
        String username = request.getParameter("username");
        Timestamp loginTime = ParseUtil.str2Timestamp(request.getParameter("loginTime"));
        loginRecordService.deleteLoginRecord(
                id, ip, uid, username, loginTime);
    }

    @RequestMapping(value = "/update", method = {RequestMethod.GET})
    public void update(HttpServletRequest request) {
        Integer id = ParseUtil.str2Int(request.getParameter("id"));
        String ip = request.getParameter("ip");
        Integer uid = ParseUtil.str2Int(request.getParameter("uid"));
        String username = request.getParameter("username");
        Timestamp loginTime = ParseUtil.str2Timestamp(request.getParameter("loginTime"));
        loginRecordService.updateLoginRecord(
                id, ip, uid, username, loginTime);
    }

    @RequestMapping(value = "/queryByJson", method = {RequestMethod.POST})
    public List<LoginRecord> queryByJson(@RequestBody Map params) {
        Integer id = ParseUtil.obj2Int(params.get("id"));
        String ip = ParseUtil.obj2String(params.get("ip"));
        Integer uid = ParseUtil.obj2Int(params.get("uid"));
        String username = ParseUtil.obj2String(params.get("username"));
        Timestamp loginTime = ParseUtil.obj2Timestamp(params.get("loginTime"));
        return loginRecordService.selectLoginRecord(
                id, ip, uid, username, loginTime);
    }

    @RequestMapping(value = "/queryAllByJson", method = {RequestMethod.POST})
    public List<LoginRecord> queryAllByJson(@RequestBody Map params) {
        return loginRecordService.selectAllLoginRecord();
    }

    @RequestMapping(value = "/insertByJson", method = {RequestMethod.POST})
    public void insertByJson(@RequestBody Map params) {
        Integer id = ParseUtil.obj2Int(params.get("id"));
        String ip = ParseUtil.obj2String(params.get("ip"));
        Integer uid = ParseUtil.obj2Int(params.get("uid"));
        String username = ParseUtil.obj2String(params.get("username"));
        Timestamp loginTime = ParseUtil.obj2Timestamp(params.get("loginTime"));
        loginRecordService.insertLoginRecord(
                id, ip, uid, username, loginTime);
    }

    @RequestMapping(value = "/deleteByJson", method = {RequestMethod.POST})
    public void deleteByJson(@RequestBody Map params) {
        Integer id = ParseUtil.obj2Int(params.get("id"));
        String ip = ParseUtil.obj2String(params.get("ip"));
        Integer uid = ParseUtil.obj2Int(params.get("uid"));
        String username = ParseUtil.obj2String(params.get("username"));
        Timestamp loginTime = ParseUtil.obj2Timestamp(params.get("loginTime"));
        loginRecordService.deleteLoginRecord(
                id, ip, uid, username, loginTime);
    }

    @RequestMapping(value = "/updateByJson", method = {RequestMethod.POST})
    public void updateByJson(@RequestBody Map params) {
        Integer id = ParseUtil.obj2Int(params.get("id"));
        String ip = ParseUtil.obj2String(params.get("ip"));
        Integer uid = ParseUtil.obj2Int(params.get("uid"));
        String username = ParseUtil.obj2String(params.get("username"));
        Timestamp loginTime = ParseUtil.obj2Timestamp(params.get("loginTime"));
        loginRecordService.updateLoginRecord(
                id, ip, uid, username, loginTime);
    }

}
