package com.stdkonjac.onlineledger.controller;

import com.stdkonjac.onlineledger.entity.LogoutRecord;
import com.stdkonjac.onlineledger.service.LogoutRecordService;
import com.stdkonjac.onlineledger.util.*;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import javax.servlet.http.HttpServletRequest;
import java.sql.Timestamp;
import java.util.List;

@RestController
@RequestMapping("/logoutRecord")
public class LogoutRecordController {
    @Autowired
    private LogoutRecordService logoutRecordService;

    @RequestMapping("/query")
    public List<LogoutRecord> query(HttpServletRequest request) {
        String ip = IpUtil.getIpAddress(request);
        Integer uid = ParseUtil.str2Int(request.getParameter("uid"));
        String username = request.getParameter("username");
        Timestamp logoutTime = ParseUtil.str2Timestamp(request.getParameter("logoutTime"));
        return logoutRecordService.selectLogoutRecord(ip, uid, username, logoutTime);
    }

    @RequestMapping("/queryAll")
    public List<LogoutRecord> queryAll() {
        return logoutRecordService.selectAllLogoutRecord();
    }

    @RequestMapping("/insert")
    public void insert(HttpServletRequest request) {
        String ip = IpUtil.getIpAddress(request);
        Integer uid = ParseUtil.str2Int(request.getParameter("uid"));
        String username = request.getParameter("username");
        Timestamp logoutTime = ParseUtil.str2Timestamp(request.getParameter("logoutTime"));
        logoutRecordService.insertLogoutRecord(ip, uid, username, logoutTime);
    }

    @RequestMapping("/delete")
    public void delete(HttpServletRequest request) {
        String ip = IpUtil.getIpAddress(request);
        Integer uid = ParseUtil.str2Int(request.getParameter("uid"));
        String username = request.getParameter("username");
        Timestamp logoutTime = ParseUtil.str2Timestamp(request.getParameter("logoutTime"));
        logoutRecordService.deleteLogoutRecord(ip, uid, username, logoutTime);
    }

    @RequestMapping("/update")
    public void update(HttpServletRequest request) {
        String ip = IpUtil.getIpAddress(request);
        Integer uid = ParseUtil.str2Int(request.getParameter("uid"));
        String username = request.getParameter("username");
        Timestamp logoutTime = ParseUtil.str2Timestamp(request.getParameter("logoutTime"));
        logoutRecordService.updateLogoutRecord(ip, uid, username, logoutTime);
    }

}
