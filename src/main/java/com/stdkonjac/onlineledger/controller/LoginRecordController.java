package com.stdkonjac.onlineledger.controller;

import com.stdkonjac.onlineledger.entity.LedgerBook;
import com.stdkonjac.onlineledger.entity.LoginRecord;
import com.stdkonjac.onlineledger.service.LoginRecordService;
import com.stdkonjac.onlineledger.util.*;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

import javax.servlet.http.HttpServletRequest;
import java.net.PasswordAuthentication;
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
        String ip = request.getParameter("ip");
        Integer uid = ParseUtil.str2Int(request.getParameter("uid"));
        String username = request.getParameter("username");
        Timestamp loginTime = ParseUtil.str2Timestamp(request.getParameter("loginTime"));
        return loginRecordService.selectLoginRecord(ip, uid, username, loginTime);
    }

    @RequestMapping(value = "/queryAll", method = {RequestMethod.GET})
    public List<LoginRecord> queryAll() {
        return loginRecordService.selectAllLoginRecord();
    }

    @RequestMapping(value = "/insert", method = {RequestMethod.GET})
    public void insert(HttpServletRequest request) {
        String ip = request.getParameter("ip");
        Integer uid = ParseUtil.str2Int(request.getParameter("uid"));
        String username = request.getParameter("username");
        Timestamp loginTime = ParseUtil.str2Timestamp(request.getParameter("loginTime"));
        loginRecordService.insertLoginRecord(ip, uid, username, loginTime);
    }

    @RequestMapping(value = "/delete", method = {RequestMethod.GET})
    public void delete(HttpServletRequest request) {
        String ip = request.getParameter("ip");
        Integer uid = ParseUtil.str2Int(request.getParameter("uid"));
        String username = request.getParameter("username");
        Timestamp loginTime = ParseUtil.str2Timestamp(request.getParameter("loginTime"));
        loginRecordService.deleteLoginRecord(ip, uid, username, loginTime);
    }

    @RequestMapping(value = "/update", method = {RequestMethod.GET})
    public void update(HttpServletRequest request) {
        String ip = request.getParameter("ip");
        Integer uid = ParseUtil.str2Int(request.getParameter("uid"));
        String username = request.getParameter("username");
        Timestamp loginTime = ParseUtil.str2Timestamp(request.getParameter("loginTime"));
        loginRecordService.updateLoginRecord(ip, uid, username, loginTime);
    }

    @RequestMapping(value = "/queryByJson", method = {RequestMethod.POST})
    public List<LoginRecord> queryByJson(@RequestBody Map params) {
        String ip = ParseUtil.obj2String(params.get("ip"));
        Integer uid = ParseUtil.obj2Int(params.get("uid"));
        String username = ParseUtil.obj2String(params.get("username"));
        Timestamp loginTime = ParseUtil.obj2Timestamp(params.get("loginTime"));
        return loginRecordService.selectLoginRecord(ip, uid, username, loginTime);
    }

    @RequestMapping(value = "/queryAllByJson", method = {RequestMethod.POST})
    public List<LoginRecord> queryAllByJson(@RequestBody Map params) {
        return loginRecordService.selectAllLoginRecord();
    }

    @RequestMapping(value = "/insertByJson", method = {RequestMethod.POST})
    public void insertByJson(@RequestBody Map params) {
        String ip = ParseUtil.obj2String(params.get("ip"));
        Integer uid = ParseUtil.obj2Int(params.get("uid"));
        String username = ParseUtil.obj2String(params.get("username"));
        Timestamp loginTime = ParseUtil.obj2Timestamp(params.get("loginTime"));
        loginRecordService.insertLoginRecord(ip, uid, username, loginTime);
    }

    @RequestMapping(value = "/deleteByJson", method = {RequestMethod.POST})
    public void deleteByJson(@RequestBody Map params) {
        String ip = ParseUtil.obj2String(params.get("ip"));
        Integer uid = ParseUtil.obj2Int(params.get("uid"));
        String username = ParseUtil.obj2String(params.get("username"));
        Timestamp loginTime = ParseUtil.obj2Timestamp(params.get("loginTime"));
        loginRecordService.deleteLoginRecord(ip, uid, username, loginTime);
    }

    @RequestMapping(value = "/updateByJson", method = {RequestMethod.POST})
    public void updateByJson(@RequestBody Map params) {
        String ip = ParseUtil.obj2String(params.get("ip"));
        Integer uid = ParseUtil.obj2Int(params.get("uid"));
        String username = ParseUtil.obj2String(params.get("username"));
        Timestamp loginTime = ParseUtil.obj2Timestamp(params.get("loginTime"));
        loginRecordService.updateLoginRecord(ip, uid, username, loginTime);
    }

}
