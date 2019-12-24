package com.stdkonjac.onlineledger.controller;

import com.stdkonjac.onlineledger.entity.ExpenseRecord;
import com.stdkonjac.onlineledger.entity.IncomeRecord;
import com.stdkonjac.onlineledger.service.IncomeRecordService;
import com.stdkonjac.onlineledger.util.ParseUtil;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

import javax.servlet.http.HttpServletRequest;
import java.util.Date;
import java.util.List;
import java.util.Map;

@RestController
@RequestMapping("/incomeRecord")
public class IncomeRecordController {
    @Autowired
    private IncomeRecordService incomeRecordService;

    @RequestMapping(value = "/query", method = {RequestMethod.GET})
    public List<IncomeRecord> query(HttpServletRequest request) {
        Integer uid = ParseUtil.str2Int(request.getParameter("uid"));
        Date date = ParseUtil.str2Date(request.getParameter("date"));
        String category = request.getParameter("category");
        String type = request.getParameter("type");
        Double income = ParseUtil.str2Double(request.getParameter("income"));
        String remark = request.getParameter("remark");
        String ledgerBook = request.getParameter("ledgerBook");
        return incomeRecordService.selectIncomeRecord(
                uid, date, category, type, income, remark, ledgerBook);
    }

    @RequestMapping(value = "/queryAll", method = {RequestMethod.GET})
    public List<IncomeRecord> queryAll() {
        return incomeRecordService.selectAllIncomeRecord();
    }

    @RequestMapping(value = "/insert", method = {RequestMethod.GET})
    public void insert(HttpServletRequest request) {
        Integer uid = ParseUtil.str2Int(request.getParameter("uid"));
        Date date = ParseUtil.str2Date(request.getParameter("date"));
        String category = request.getParameter("category");
        String type = request.getParameter("type");
        Double income = ParseUtil.str2Double(request.getParameter("income"));
        String remark = request.getParameter("remark");
        String ledgerBook = request.getParameter("ledgerBook");
        incomeRecordService.insertIncomeRecord(
                uid, date, category, type, income, remark, ledgerBook);
    }

    @RequestMapping(value = "/delete", method = {RequestMethod.GET})
    public void delete(HttpServletRequest request) {
        Integer uid = ParseUtil.str2Int(request.getParameter("uid"));
        Date date = ParseUtil.str2Date(request.getParameter("date"));
        String category = request.getParameter("category");
        String type = request.getParameter("type");
        Double income = ParseUtil.str2Double(request.getParameter("income"));
        String remark = request.getParameter("remark");
        String ledgerBook = request.getParameter("ledgerBook");
        incomeRecordService.deleteIncomeRecord(
                uid, date, category, type, income, remark, ledgerBook);
    }

    @RequestMapping(value = "/update", method = {RequestMethod.GET})
    public void update(HttpServletRequest request) {
        Integer uid = ParseUtil.str2Int(request.getParameter("uid"));
        Date date = ParseUtil.str2Date(request.getParameter("date"));
        String category = request.getParameter("category");
        String type = request.getParameter("type");
        Double income = ParseUtil.str2Double(request.getParameter("income"));
        String remark = request.getParameter("remark");
        String ledgerBook = request.getParameter("ledgerBook");
        incomeRecordService.updateIncomeRecord(
                uid, date, category, type, income, remark, ledgerBook);
    }

    @RequestMapping(value = "/queryByJson", method = {RequestMethod.POST})
    public List<IncomeRecord> queryByJson(@RequestBody Map params) {
        Integer uid = ParseUtil.obj2Int(params.get("uid"));
        Date date = ParseUtil.obj2Date(params.get("date"));
        String category = ParseUtil.obj2String(params.get("category"));
        String type = ParseUtil.obj2String(params.get("type"));
        Double income = ParseUtil.obj2Double(params.get("income"));
        String remark = ParseUtil.obj2String(params.get("remark"));
        String ledgerBook = ParseUtil.obj2String(params.get("ledgerBook"));
        return incomeRecordService.selectIncomeRecord(
                uid, date, category, type, income, remark, ledgerBook);
    }

    @RequestMapping(value = "/queryAllByJson", method = {RequestMethod.POST})
    public List<IncomeRecord> queryAllByJson(@RequestBody Map params) {
        return incomeRecordService.selectAllIncomeRecord();
    }

    @RequestMapping(value = "/insertByJson", method = {RequestMethod.POST})
    public void insertByJson(@RequestBody Map params) {
        Integer uid = ParseUtil.obj2Int(params.get("uid"));
        Date date = ParseUtil.obj2Date(params.get("date"));
        String category = ParseUtil.obj2String(params.get("category"));
        String type = ParseUtil.obj2String(params.get("type"));
        Double income = ParseUtil.obj2Double(params.get("income"));
        String remark = ParseUtil.obj2String(params.get("remark"));
        String ledgerBook = ParseUtil.obj2String(params.get("ledgerBook"));
        incomeRecordService.insertIncomeRecord(
                uid, date, category, type, income, remark, ledgerBook);
    }

    @RequestMapping(value = "/deleteByJson", method = {RequestMethod.POST})
    public void deleteByJson(@RequestBody Map params) {
        Integer uid = ParseUtil.obj2Int(params.get("uid"));
        Date date = ParseUtil.obj2Date(params.get("date"));
        String category = ParseUtil.obj2String(params.get("category"));
        String type = ParseUtil.obj2String(params.get("type"));
        Double income = ParseUtil.obj2Double(params.get("income"));
        String remark = ParseUtil.obj2String(params.get("remark"));
        String ledgerBook = ParseUtil.obj2String(params.get("ledgerBook"));
        incomeRecordService.deleteIncomeRecord(
                uid, date, category, type, income, remark, ledgerBook);
    }

    @RequestMapping(value = "/updateByJson", method = {RequestMethod.POST})
    public void updateByJson(@RequestBody Map params) {
        Integer uid = ParseUtil.obj2Int(params.get("uid"));
        Date date = ParseUtil.obj2Date(params.get("date"));
        String category = ParseUtil.obj2String(params.get("category"));
        String type = ParseUtil.obj2String(params.get("type"));
        Double income = ParseUtil.obj2Double(params.get("income"));
        String remark = ParseUtil.obj2String(params.get("remark"));
        String ledgerBook = ParseUtil.obj2String(params.get("ledgerBook"));
        incomeRecordService.updateIncomeRecord(
                uid, date, category, type, income, remark, ledgerBook);
    }


}
