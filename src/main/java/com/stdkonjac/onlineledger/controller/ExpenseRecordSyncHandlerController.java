package com.stdkonjac.onlineledger.controller;

import com.stdkonjac.onlineledger.service.ExpenseRecordSyncHandlerService;
import com.stdkonjac.onlineledger.util.ParseUtil;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

import javax.servlet.http.HttpServletRequest;
import java.util.Date;
import java.util.Map;

@RestController
public class ExpenseRecordSyncHandlerController {
    @Autowired
    private ExpenseRecordSyncHandlerService expenseRecordSyncHandlerService;

    @RequestMapping(value = "/expenseRecordInsertHandler", method = {RequestMethod.GET})
    Integer syncInsert(HttpServletRequest request) {
        Integer id = ParseUtil.str2Int(request.getParameter("id"));
        Integer uid = ParseUtil.str2Int(request.getParameter("uid"));
        Date date = ParseUtil.str2Date(request.getParameter("date"));
        String category = request.getParameter("category");
        String type = request.getParameter("type");
        Double expense = ParseUtil.str2Double(request.getParameter("expense"));
        Integer prepay = ParseUtil.str2Int(request.getParameter("prepay"));
        String remark = request.getParameter("remark");
        String ledgerBook = request.getParameter("ledgerBook");
        return expenseRecordSyncHandlerService.syncInsert(
                id, uid, date, category, type, expense, prepay, remark, ledgerBook);
    }

    @RequestMapping(value = "/expenseRecordDeleteHandler", method = {RequestMethod.GET})
    Integer syncDelete(HttpServletRequest request) {
        Integer id = ParseUtil.str2Int(request.getParameter("id"));
        Integer uid = ParseUtil.str2Int(request.getParameter("uid"));
        Date date = ParseUtil.str2Date(request.getParameter("date"));
        String category = request.getParameter("category");
        String type = request.getParameter("type");
        Double expense = ParseUtil.str2Double(request.getParameter("expense"));
        Integer prepay = ParseUtil.str2Int(request.getParameter("prepay"));
        String remark = request.getParameter("remark");
        String ledgerBook = request.getParameter("ledgerBook");
        return expenseRecordSyncHandlerService.syncDelete(
                id, uid, date, category, type, expense, prepay, remark, ledgerBook);
    }

    @RequestMapping(value = "/expenseRecordUpdateHandler", method = {RequestMethod.GET})
    Integer syncUpdate(HttpServletRequest request) {
        Integer id = ParseUtil.str2Int(request.getParameter("id"));
        Integer uid = ParseUtil.str2Int(request.getParameter("uid"));
        Date date = ParseUtil.str2Date(request.getParameter("date"));
        String category = request.getParameter("category");
        String type = request.getParameter("type");
        Double expense = ParseUtil.str2Double(request.getParameter("expense"));
        Integer prepay = ParseUtil.str2Int(request.getParameter("prepay"));
        String remark = request.getParameter("remark");
        String ledgerBook = request.getParameter("ledgerBook");
        return expenseRecordSyncHandlerService.syncUpdate(
                id, uid, date, category, type, expense, prepay, remark, ledgerBook);
    }

    @RequestMapping(value = "/jsonExpenseRecordInsertHandler", method = {RequestMethod.POST})
    Integer syncInsert(@RequestBody Map params) {
        Integer id = ParseUtil.obj2Int(params.get("id"));
        Integer uid = ParseUtil.obj2Int(params.get("uid"));
        Date date = ParseUtil.obj2Date(params.get("date"));
        String category = ParseUtil.obj2String(params.get("category"));
        String type = ParseUtil.obj2String(params.get("type"));
        Double expense = ParseUtil.obj2Double(params.get("expense"));
        Integer prepay = ParseUtil.obj2Int(params.get("prepay"));
        String remark = ParseUtil.obj2String(params.get("remark"));
        String ledgerBook = ParseUtil.obj2String(params.get("ledgerBook"));
        return expenseRecordSyncHandlerService.syncInsert(
                id, uid, date, category, type, expense, prepay, remark, ledgerBook);
    }

    @RequestMapping(value = "/jsonExpenseRecordDeleteHandler", method = {RequestMethod.POST})
    Integer syncDelete(@RequestBody Map params) {
        Integer id = ParseUtil.obj2Int(params.get("id"));
        Integer uid = ParseUtil.obj2Int(params.get("uid"));
        Date date = ParseUtil.obj2Date(params.get("date"));
        String category = ParseUtil.obj2String(params.get("category"));
        String type = ParseUtil.obj2String(params.get("type"));
        Double expense = ParseUtil.obj2Double(params.get("expense"));
        Integer prepay = ParseUtil.obj2Int(params.get("prepay"));
        String remark = ParseUtil.obj2String(params.get("remark"));
        String ledgerBook = ParseUtil.obj2String(params.get("ledgerBook"));
        return expenseRecordSyncHandlerService.syncDelete(
                id, uid, date, category, type, expense, prepay, remark, ledgerBook);
    }

    @RequestMapping(value = "/jsonExpenseRecordUpdateHandler", method = {RequestMethod.POST})
    Integer syncUpdate(@RequestBody Map params) {
        Integer id = ParseUtil.obj2Int(params.get("id"));
        Integer uid = ParseUtil.obj2Int(params.get("uid"));
        Date date = ParseUtil.obj2Date(params.get("date"));
        String category = ParseUtil.obj2String(params.get("category"));
        String type = ParseUtil.obj2String(params.get("type"));
        Double expense = ParseUtil.obj2Double(params.get("expense"));
        Integer prepay = ParseUtil.obj2Int(params.get("prepay"));
        String remark = ParseUtil.obj2String(params.get("remark"));
        String ledgerBook = ParseUtil.obj2String(params.get("ledgerBook"));
        return expenseRecordSyncHandlerService.syncUpdate(
                id, uid, date, category, type, expense, prepay, remark, ledgerBook);
    }
}
