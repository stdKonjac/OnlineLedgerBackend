package com.stdkonjac.onlineledger.controller;

import com.stdkonjac.onlineledger.entity.LogoutRecord;
import com.stdkonjac.onlineledger.service.LogoutRecordService;
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
@RequestMapping("/logoutRecord")
public class LogoutRecordController {
    @Autowired
    private LogoutRecordService logoutRecordService;

    @RequestMapping(value = "/query", method = {RequestMethod.GET})
    public List<LogoutRecord> query(HttpServletRequest request) {
        Integer id = ParseUtil.str2Int(request.getParameter("id"));
        String ip = IpUtil.getIpAddress(request);
        Integer uid = ParseUtil.str2Int(request.getParameter("uid"));
        String username = request.getParameter("username");
        Timestamp logoutTime = ParseUtil.str2Timestamp(request.getParameter("logoutTime"));
        return logoutRecordService.selectLogoutRecord(
                id, ip, uid, username, logoutTime);
    }

    @RequestMapping(value = "/queryAll", method = {RequestMethod.GET})
    public List<LogoutRecord> queryAll() {
        return logoutRecordService.selectAllLogoutRecord();
    }

    @RequestMapping(value = "/insert", method = {RequestMethod.GET})
    public void insert(HttpServletRequest request) {
        Integer id = ParseUtil.str2Int(request.getParameter("id"));
        String ip = IpUtil.getIpAddress(request);
        Integer uid = ParseUtil.str2Int(request.getParameter("uid"));
        String username = request.getParameter("username");
        Timestamp logoutTime = ParseUtil.str2Timestamp(request.getParameter("logoutTime"));
        logoutRecordService.insertLogoutRecord(
                id, ip, uid, username, logoutTime);
    }

    @RequestMapping(value = "/delete", method = {RequestMethod.GET})
    public void delete(HttpServletRequest request) {
        Integer id = ParseUtil.str2Int(request.getParameter("id"));
        String ip = IpUtil.getIpAddress(request);
        Integer uid = ParseUtil.str2Int(request.getParameter("uid"));
        String username = request.getParameter("username");
        Timestamp logoutTime = ParseUtil.str2Timestamp(request.getParameter("logoutTime"));
        logoutRecordService.deleteLogoutRecord(
                id, ip, uid, username, logoutTime);
    }

    @RequestMapping(value = "/update", method = {RequestMethod.GET})
    public void update(HttpServletRequest request) {
        Integer id = ParseUtil.str2Int(request.getParameter("id"));
        String ip = IpUtil.getIpAddress(request);
        Integer uid = ParseUtil.str2Int(request.getParameter("uid"));
        String username = request.getParameter("username");
        Timestamp logoutTime = ParseUtil.str2Timestamp(request.getParameter("logoutTime"));
        logoutRecordService.updateLogoutRecord(
                id, ip, uid, username, logoutTime);
    }

    @RequestMapping(value = "/queryByJson", method = {RequestMethod.POST})
    public List<LogoutRecord> queryByJson(@RequestBody Map params) {
        Integer id = ParseUtil.obj2Int(params.get("id"));
        String ip = ParseUtil.obj2String(params.get("ip"));
        Integer uid = ParseUtil.obj2Int(params.get("uid"));
        String username = ParseUtil.obj2String(params.get("username"));
        Timestamp logoutTime = ParseUtil.obj2Timestamp(params.get("logoutTime"));
        return logoutRecordService.selectLogoutRecord(
                id, ip, uid, username, logoutTime);
    }

    @RequestMapping(value = "/queryAllByJson", method = {RequestMethod.POST})
    public List<LogoutRecord> queryAllByJson(@RequestBody Map params) {
        return logoutRecordService.selectAllLogoutRecord();
    }

    @RequestMapping(value = "/insertByJson", method = {RequestMethod.POST})
    public void insertByJson(@RequestBody Map params) {
        Integer id = ParseUtil.obj2Int(params.get("id"));
        String ip = ParseUtil.obj2String(params.get("ip"));
        Integer uid = ParseUtil.obj2Int(params.get("uid"));
        String username = ParseUtil.obj2String(params.get("username"));
        Timestamp logoutTime = ParseUtil.obj2Timestamp(params.get("logoutTime"));
        logoutRecordService.insertLogoutRecord(
                id, ip, uid, username, logoutTime);
    }

    @RequestMapping(value = "/deleteByJson", method = {RequestMethod.POST})
    public void deleteByJson(@RequestBody Map params) {
        Integer id = ParseUtil.obj2Int(params.get("id"));
        String ip = ParseUtil.obj2String(params.get("ip"));
        Integer uid = ParseUtil.obj2Int(params.get("uid"));
        String username = ParseUtil.obj2String(params.get("username"));
        Timestamp logoutTime = ParseUtil.obj2Timestamp(params.get("logoutTime"));
        logoutRecordService.deleteLogoutRecord(
                id, ip, uid, username, logoutTime);
    }

    @RequestMapping(value = "/updateByJson", method = {RequestMethod.POST})
    public void updateByJson(@RequestBody Map params) {
        Integer id = ParseUtil.obj2Int(params.get("id"));
        String ip = ParseUtil.obj2String(params.get("ip"));
        Integer uid = ParseUtil.obj2Int(params.get("uid"));
        String username = ParseUtil.obj2String(params.get("username"));
        Timestamp logoutTime = ParseUtil.obj2Timestamp(params.get("logoutTime"));
        logoutRecordService.updateLogoutRecord(
                id, ip, uid, username, logoutTime);
    }

}
