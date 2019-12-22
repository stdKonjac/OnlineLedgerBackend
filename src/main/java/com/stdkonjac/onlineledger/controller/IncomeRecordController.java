package com.stdkonjac.onlineledger.controller;

import com.stdkonjac.onlineledger.entity.IncomeRecord;
import com.stdkonjac.onlineledger.service.IncomeRecordService;
import com.stdkonjac.onlineledger.util.ParseUtil;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import javax.servlet.http.HttpServletRequest;
import java.util.Date;
import java.util.List;

@RestController
@RequestMapping("/incomeRecord")
public class IncomeRecordController {
    @Autowired
    private IncomeRecordService incomeRecordService;

    @RequestMapping("/query")
    public List<IncomeRecord> query(HttpServletRequest request) {
        Integer uid = ParseUtil.str2Int(request.getParameter("uid"));
        Date date = ParseUtil.str2Date(request.getParameter("date"));
        String category = request.getParameter("category");
        String type = request.getParameter("type");
        Double income = ParseUtil.str2Double(request.getParameter("income"));
        return incomeRecordService.selectIncomeRecord(uid, date, category, type, income);
    }

    @RequestMapping("/queryAll")
    public List<IncomeRecord> queryAll() {
        return incomeRecordService.selectAllIncomeRecord();
    }

    @RequestMapping("/insert")
    public void insert(HttpServletRequest request) {
        Integer uid = ParseUtil.str2Int(request.getParameter("uid"));
        Date date = ParseUtil.str2Date(request.getParameter("date"));
        String category = request.getParameter("category");
        String type = request.getParameter("type");
        Double income = ParseUtil.str2Double(request.getParameter("income"));
        incomeRecordService.insertIncomeRecord(uid, date, category, type, income);
    }

    @RequestMapping("/delete")
    public void delete(HttpServletRequest request) {
        Integer uid = ParseUtil.str2Int(request.getParameter("uid"));
        Date date = ParseUtil.str2Date(request.getParameter("date"));
        String category = request.getParameter("category");
        String type = request.getParameter("type");
        Double income = ParseUtil.str2Double(request.getParameter("income"));
        incomeRecordService.deleteIncomeRecord(uid, date, category, type, income);
    }

    @RequestMapping("/update")
    public void update(HttpServletRequest request) {
        Integer uid = ParseUtil.str2Int(request.getParameter("uid"));
        Date date = ParseUtil.str2Date(request.getParameter("date"));
        String category = request.getParameter("category");
        String type = request.getParameter("type");
        Double income = ParseUtil.str2Double(request.getParameter("income"));
        incomeRecordService.updateIncomeRecord(uid, date, category, type, income);
    }

}