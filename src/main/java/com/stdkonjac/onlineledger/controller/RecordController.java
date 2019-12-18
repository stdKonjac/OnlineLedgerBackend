package com.stdkonjac.onlineledger.controller;

import com.stdkonjac.onlineledger.entity.Record;
import com.stdkonjac.onlineledger.entity.User;
import com.stdkonjac.onlineledger.service.RecordService;
import com.stdkonjac.onlineledger.util.*;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import javax.servlet.http.HttpServletRequest;
import java.util.Date;
import java.util.List;

@RestController
@RequestMapping("/record")
public class RecordController {
    @Autowired
    private RecordService recordService;

    @RequestMapping("/query")
    public List<Record> query(HttpServletRequest request) {
        Integer uid = ParseUtil.str2Int(request.getParameter("uid"));
        Date date = ParseUtil.str2Date(request.getParameter("date"));
        String category = request.getParameter("category");
        String type = request.getParameter("type");
        Double cost = ParseUtil.str2Double(request.getParameter("cost"));
        return recordService.selectRecord(uid, date, category, type, cost);
    }

    @RequestMapping("/queryAll")
    public List<Record> queryAll() {
        return recordService.selectAllRecord();
    }

    @RequestMapping("/insert")
    public void insert(HttpServletRequest request) {
        Integer uid = ParseUtil.str2Int(request.getParameter("uid"));
        Date date = ParseUtil.str2Date(request.getParameter("date"));
        String category = request.getParameter("category");
        String type = request.getParameter("type");
        Double cost = ParseUtil.str2Double(request.getParameter("cost"));
        recordService.insertRecord(uid, date, category, type, cost);
    }

    @RequestMapping("/delete")
    public void delete(HttpServletRequest request) {
        Integer uid = ParseUtil.str2Int(request.getParameter("uid"));
        Date date = ParseUtil.str2Date(request.getParameter("date"));
        String category = request.getParameter("category");
        String type = request.getParameter("type");
        Double cost = ParseUtil.str2Double(request.getParameter("cost"));
        recordService.deleteRecord(uid, date, category, type, cost);
    }

    @RequestMapping("/update")
    public void update(HttpServletRequest request) {
        Integer uid = ParseUtil.str2Int(request.getParameter("uid"));
        Date date = ParseUtil.str2Date(request.getParameter("date"));
        String category = request.getParameter("category");
        String type = request.getParameter("type");
        Double cost = ParseUtil.str2Double(request.getParameter("cost"));
        recordService.updateRecord(uid, date, category, type, cost);
    }

    @RequestMapping("/executeQuery")
    public List<Record> executeQuery(HttpServletRequest request) {
        String sql = request.getParameter("sql");
        return recordService.executeSelect(sql);
    }

    @RequestMapping("/executeInsert")
    public void executeInsert(HttpServletRequest request) {
        String sql = request.getParameter("sql");
        recordService.executeInsert(sql);
    }

    @RequestMapping("/executeDelete")
    public void executeDelete(HttpServletRequest request) {
        String sql = request.getParameter("sql");
        recordService.executeDelete(sql);
    }

    @RequestMapping("/executeUpdate")
    public void executeUpdate(HttpServletRequest request) {
        String sql = request.getParameter("sql");
        recordService.executeUpdate(sql);
    }
}
