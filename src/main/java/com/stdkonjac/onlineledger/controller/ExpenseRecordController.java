package com.stdkonjac.onlineledger.controller;

import com.stdkonjac.onlineledger.entity.ExpenseRecord;
import com.stdkonjac.onlineledger.service.ExpenseRecordService;
import com.stdkonjac.onlineledger.util.*;
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
@RequestMapping("/expenseRecord")
public class ExpenseRecordController {
    @Autowired
    private ExpenseRecordService expenseRecordService;

    @RequestMapping(value = "/query", method = {RequestMethod.GET})
    public List<ExpenseRecord> query(HttpServletRequest request) {
        Integer id = ParseUtil.str2Int(request.getParameter("id"));
        Integer uid = ParseUtil.str2Int(request.getParameter("uid"));
        Date date = ParseUtil.str2Date(request.getParameter("date"));
        String category = request.getParameter("category");
        String type = request.getParameter("type");
        Double expense = ParseUtil.str2Double(request.getParameter("expense"));
        Integer prepay = ParseUtil.str2Int(request.getParameter("prepay"));
        String remark = request.getParameter("remark");
        String ledgerBook = request.getParameter("ledgerBook");
        return expenseRecordService.selectExpenseRecord(
                id, uid, date, category, type, expense, prepay, remark, ledgerBook);
    }

    @RequestMapping(value = "/queryAll", method = {RequestMethod.GET})
    public List<ExpenseRecord> queryAll() {
        return expenseRecordService.selectAllExpenseRecord();
    }

    @RequestMapping(value = "/insert", method = {RequestMethod.GET})
    public void insert(HttpServletRequest request) {
        Integer id = ParseUtil.str2Int(request.getParameter("id"));
        Integer uid = ParseUtil.str2Int(request.getParameter("uid"));
        Date date = ParseUtil.str2Date(request.getParameter("date"));
        String category = request.getParameter("category");
        String type = request.getParameter("type");
        Double expense = ParseUtil.str2Double(request.getParameter("expense"));
        Integer prepay = ParseUtil.str2Int(request.getParameter("prepay"));
        String remark = request.getParameter("remark");
        String ledgerBook = request.getParameter("ledgerBook");
        expenseRecordService.insertExpenseRecord(
                id, uid, date, category, type, expense, prepay, remark, ledgerBook);
    }

    @RequestMapping(value = "/delete", method = {RequestMethod.GET})
    public void delete(HttpServletRequest request) {
        Integer id = ParseUtil.str2Int(request.getParameter("id"));
        Integer uid = ParseUtil.str2Int(request.getParameter("uid"));
        Date date = ParseUtil.str2Date(request.getParameter("date"));
        String category = request.getParameter("category");
        String type = request.getParameter("type");
        Double expense = ParseUtil.str2Double(request.getParameter("expense"));
        Integer prepay = ParseUtil.str2Int(request.getParameter("prepay"));
        String remark = request.getParameter("remark");
        String ledgerBook = request.getParameter("ledgerBook");
        expenseRecordService.deleteExpenseRecord(
                id, uid, date, category, type, expense, prepay, remark, ledgerBook);
    }

    @RequestMapping(value = "/update", method = {RequestMethod.GET})
    public void update(HttpServletRequest request) {
        Integer id = ParseUtil.str2Int(request.getParameter("id"));
        Integer uid = ParseUtil.str2Int(request.getParameter("uid"));
        Date date = ParseUtil.str2Date(request.getParameter("date"));
        String category = request.getParameter("category");
        String type = request.getParameter("type");
        Double expense = ParseUtil.str2Double(request.getParameter("expense"));
        Integer prepay = ParseUtil.str2Int(request.getParameter("prepay"));
        String remark = request.getParameter("remark");
        String ledgerBook = request.getParameter("ledgerBook");
        expenseRecordService.updateExpenseRecord(
                id, uid, date, category, type, expense, prepay, remark, ledgerBook);
    }

    @RequestMapping(value = "/queryByJson", method = {RequestMethod.POST})
    public List<ExpenseRecord> queryByJson(@RequestBody Map params) {
        Integer id = ParseUtil.obj2Int(params.get("id"));
        Integer uid = ParseUtil.obj2Int(params.get("uid"));
        Date date = ParseUtil.obj2Date(params.get("date"));
        String category = ParseUtil.obj2String(params.get("category"));
        String type = ParseUtil.obj2String(params.get("type"));
        Double expense = ParseUtil.obj2Double(params.get("expense"));
        Integer prepay = ParseUtil.obj2Int(params.get("prepay"));
        String remark = ParseUtil.obj2String(params.get("remark"));
        String ledgerBook = ParseUtil.obj2String(params.get("ledgerBook"));
        return expenseRecordService.selectExpenseRecord(
                id, uid, date, category, type, expense, prepay, remark, ledgerBook);
    }

    @RequestMapping(value = "/queryAllByJson", method = {RequestMethod.POST})
    public List<ExpenseRecord> queryAllByJson(@RequestBody Map params) {
        return expenseRecordService.selectAllExpenseRecord();
    }

    @RequestMapping(value = "/insertByJson", method = {RequestMethod.POST})
    public void insertByJson(@RequestBody Map params) {
        Integer id = ParseUtil.obj2Int(params.get("id"));
        Integer uid = ParseUtil.obj2Int(params.get("uid"));
        Date date = ParseUtil.obj2Date(params.get("date"));
        String category = ParseUtil.obj2String(params.get("category"));
        String type = ParseUtil.obj2String(params.get("type"));
        Double expense = ParseUtil.obj2Double(params.get("expense"));
        Integer prepay = ParseUtil.obj2Int(params.get("prepay"));
        String remark = ParseUtil.obj2String(params.get("remark"));
        String ledgerBook = ParseUtil.obj2String(params.get("ledgerBook"));
        expenseRecordService.insertExpenseRecord(
                id, uid, date, category, type, expense, prepay, remark, ledgerBook);
    }

    @RequestMapping(value = "/deleteByJson", method = {RequestMethod.POST})
    public void deleteByJson(@RequestBody Map params) {
        Integer id = ParseUtil.obj2Int(params.get("id"));
        Integer uid = ParseUtil.obj2Int(params.get("uid"));
        Date date = ParseUtil.obj2Date(params.get("date"));
        String category = ParseUtil.obj2String(params.get("category"));
        String type = ParseUtil.obj2String(params.get("type"));
        Double expense = ParseUtil.obj2Double(params.get("expense"));
        Integer prepay = ParseUtil.obj2Int(params.get("prepay"));
        String remark = ParseUtil.obj2String(params.get("remark"));
        String ledgerBook = ParseUtil.obj2String(params.get("ledgerBook"));
        expenseRecordService.deleteExpenseRecord(
                id, uid, date, category, type, expense, prepay, remark, ledgerBook);
    }

    @RequestMapping(value = "/updateByJson", method = {RequestMethod.POST})
    public void updateByJson(@RequestBody Map params) {
        Integer id = ParseUtil.obj2Int(params.get("id"));
        Integer uid = ParseUtil.obj2Int(params.get("uid"));
        Date date = ParseUtil.obj2Date(params.get("date"));
        String category = ParseUtil.obj2String(params.get("category"));
        String type = ParseUtil.obj2String(params.get("type"));
        Double expense = ParseUtil.obj2Double(params.get("expense"));
        Integer prepay = ParseUtil.obj2Int(params.get("prepay"));
        String remark = ParseUtil.obj2String(params.get("remark"));
        String ledgerBook = ParseUtil.obj2String(params.get("ledgerBook"));
        expenseRecordService.updateExpenseRecord(
                id, uid, date, category, type, expense, prepay, remark, ledgerBook);
    }

}
