package com.stdkonjac.onlineledger.controller;

import com.stdkonjac.onlineledger.entity.ExpenseRecord;
import com.stdkonjac.onlineledger.service.ExpenseRecordService;
import com.stdkonjac.onlineledger.util.*;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import javax.servlet.http.HttpServletRequest;
import java.util.Date;
import java.util.List;

@RestController
@RequestMapping("/expenseRecord")
public class ExpenseRecordController {
    @Autowired
    private ExpenseRecordService expenseRecordService;

    @RequestMapping("/query")
    public List<ExpenseRecord> query(HttpServletRequest request) {
        Integer uid = ParseUtil.str2Int(request.getParameter("uid"));
        Date date = ParseUtil.str2Date(request.getParameter("date"));
        String category = request.getParameter("category");
        String type = request.getParameter("type");
        Double expense = ParseUtil.str2Double(request.getParameter("expense"));
        Integer prepay = ParseUtil.str2Int(request.getParameter("prepay"));
        String remark = request.getParameter("remark");
        String ledgerBook = request.getParameter("ledgerBook");
        return expenseRecordService.selectExpenseRecord(
                uid, date, category, type, expense, prepay, remark, ledgerBook);
    }

    @RequestMapping("/queryAll")
    public List<ExpenseRecord> queryAll() {
        return expenseRecordService.selectAllExpenseRecord();
    }

    @RequestMapping("/insert")
    public void insert(HttpServletRequest request) {
        Integer uid = ParseUtil.str2Int(request.getParameter("uid"));
        Date date = ParseUtil.str2Date(request.getParameter("date"));
        String category = request.getParameter("category");
        String type = request.getParameter("type");
        Double expense = ParseUtil.str2Double(request.getParameter("expense"));
        Integer prepay = ParseUtil.str2Int(request.getParameter("prepay"));
        String remark = request.getParameter("remark");
        String ledgerBook = request.getParameter("ledgerBook");
        expenseRecordService.insertExpenseRecord(
                uid, date, category, type, expense, prepay, remark, ledgerBook);
    }

    @RequestMapping("/delete")
    public void delete(HttpServletRequest request) {
        Integer uid = ParseUtil.str2Int(request.getParameter("uid"));
        Date date = ParseUtil.str2Date(request.getParameter("date"));
        String category = request.getParameter("category");
        String type = request.getParameter("type");
        Double expense = ParseUtil.str2Double(request.getParameter("expense"));
        Integer prepay = ParseUtil.str2Int(request.getParameter("prepay"));
        String remark = request.getParameter("remark");
        String ledgerBook = request.getParameter("ledgerBook");
        expenseRecordService.deleteExpenseRecord(
                uid, date, category, type, expense, prepay, remark, ledgerBook);
    }

    @RequestMapping("/update")
    public void update(HttpServletRequest request) {
        Integer uid = ParseUtil.str2Int(request.getParameter("uid"));
        Date date = ParseUtil.str2Date(request.getParameter("date"));
        String category = request.getParameter("category");
        String type = request.getParameter("type");
        Double expense = ParseUtil.str2Double(request.getParameter("expense"));
        Integer prepay = ParseUtil.str2Int(request.getParameter("prepay"));
        String remark = request.getParameter("remark");
        String ledgerBook = request.getParameter("ledgerBook");
        expenseRecordService.updateExpenseRecord(
                uid, date, category, type, expense, prepay, remark, ledgerBook);
    }

}
