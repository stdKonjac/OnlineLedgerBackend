package com.stdkonjac.onlineledger.controller;

import com.stdkonjac.onlineledger.entity.LoginRecord;
import com.stdkonjac.onlineledger.service.LoginRecordService;
import com.stdkonjac.onlineledger.util.*;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import javax.servlet.http.HttpServletRequest;
import java.util.Date;
import java.util.List;

@RestController
@RequestMapping("/loginRecord")
public class LoginRecordController {
    @Autowired
    private LoginRecordService loginRecordService;

    @RequestMapping("/query")
    public List<LoginRecord> query(HttpServletRequest request) {
        String IP = IpUtil.getIpAddress(request);
        int uid = ParseUtil.str2Int(request.getParameter("uid"));
        String username = request.getParameter("username");
        Date date = ParseUtil.str2Date(request.getParameter("date"));
        return loginRecordService.selectLoginRecord(IP, uid, username, date);
    }

    @RequestMapping("/queryAll")
    public List<LoginRecord> queryAll() {
        return loginRecordService.selectAllLoginRecord();
    }

    @RequestMapping("/insert")
    public void insert(HttpServletRequest request) {
        String IP = IpUtil.getIpAddress(request);
        int uid = ParseUtil.str2Int(request.getParameter("uid"));
        String username = request.getParameter("username");
        Date date = ParseUtil.str2Date(request.getParameter("date"));
        loginRecordService.insertLoginRecord(IP, uid, username, date);
    }

    @RequestMapping("/delete")
    public void delete(HttpServletRequest request) {
        String IP = IpUtil.getIpAddress(request);
        int uid = ParseUtil.str2Int(request.getParameter("uid"));
        String username = request.getParameter("username");
        Date date = ParseUtil.str2Date(request.getParameter("date"));
        loginRecordService.deleteLoginRecord(IP, uid, username, date);
    }

    @RequestMapping("/update")
    public void update(HttpServletRequest request) {
        String IP = IpUtil.getIpAddress(request);
        int uid = ParseUtil.str2Int(request.getParameter("uid"));
        String username = request.getParameter("username");
        Date date = ParseUtil.str2Date(request.getParameter("date"));
        loginRecordService.updateLoginRecord(IP, uid, username, date);
    }
}
