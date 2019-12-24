package com.stdkonjac.onlineledger.controller;

import com.stdkonjac.onlineledger.entity.UnpaidRecord;
import com.stdkonjac.onlineledger.service.UnpaidRecordService;
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
@RequestMapping("/unpaidRecord")
public class UnpaidRecordController {
    @Autowired
    private UnpaidRecordService unpaidRecordService;

    @RequestMapping(value = "/query", method = {RequestMethod.GET})
    public List<UnpaidRecord> query(HttpServletRequest request) {
        Integer id = ParseUtil.str2Int(request.getParameter("id"));
        Integer uid = ParseUtil.str2Int(request.getParameter("uid"));
        Double value = ParseUtil.str2Double(request.getParameter("value"));
        Date date = ParseUtil.str2Date(request.getParameter("date"));
        String remark = request.getParameter("remark");
        Integer expenseRecordId = ParseUtil.str2Int(request.getParameter("expenseRecordId"));
        return unpaidRecordService.selectUnpaidRecord(
                id, uid, value, date, remark, expenseRecordId);
    }

    @RequestMapping(value = "/queryAll", method = {RequestMethod.GET})
    public List<UnpaidRecord> queryAll() {
        return unpaidRecordService.selectAllUnpaidRecord();
    }

    @RequestMapping(value = "/insert", method = {RequestMethod.GET})
    public void insert(HttpServletRequest request) {
        Integer id = ParseUtil.str2Int(request.getParameter("id"));
        Integer uid = ParseUtil.str2Int(request.getParameter("uid"));
        Double value = ParseUtil.str2Double(request.getParameter("value"));
        Date date = ParseUtil.str2Date(request.getParameter("date"));
        String remark = request.getParameter("remark");
        Integer expenseRecordId = ParseUtil.str2Int(request.getParameter("expenseRecordId"));
        unpaidRecordService.insertUnpaidRecord(
                id, uid, value, date, remark, expenseRecordId);
    }

    @RequestMapping(value = "/delete", method = {RequestMethod.GET})
    public void delete(HttpServletRequest request) {
        Integer id = ParseUtil.str2Int(request.getParameter("id"));
        Integer uid = ParseUtil.str2Int(request.getParameter("uid"));
        Double value = ParseUtil.str2Double(request.getParameter("value"));
        Date date = ParseUtil.str2Date(request.getParameter("date"));
        String remark = request.getParameter("remark");
        Integer expenseRecordId = ParseUtil.str2Int(request.getParameter("expenseRecordId"));
        unpaidRecordService.deleteUnpaidRecord(
                id, uid, value, date, remark, expenseRecordId);
    }

    @RequestMapping(value = "/update", method = {RequestMethod.GET})
    public void update(HttpServletRequest request) {
        Integer id = ParseUtil.str2Int(request.getParameter("id"));
        Integer uid = ParseUtil.str2Int(request.getParameter("uid"));
        Double value = ParseUtil.str2Double(request.getParameter("value"));
        Date date = ParseUtil.str2Date(request.getParameter("date"));
        String remark = request.getParameter("remark");
        Integer expenseRecordId = ParseUtil.str2Int(request.getParameter("expenseRecordId"));
        unpaidRecordService.updateUnpaidRecord(
                id, uid, value, date, remark, expenseRecordId);
    }

    @RequestMapping(value = "/queryByJson", method = {RequestMethod.POST})
    public List<UnpaidRecord> queryByJson(@RequestBody Map params) {
        Integer id = ParseUtil.obj2Int(params.get("id"));
        Integer uid = ParseUtil.obj2Int(params.get("uid"));
        Double value = ParseUtil.obj2Double(params.get("value"));
        Date date = ParseUtil.obj2Date(params.get("date"));
        String remark = ParseUtil.obj2String(params.get("remark"));
        Integer expenseRecordId = ParseUtil.obj2Int(params.get("expenseRecordId"));
        return unpaidRecordService.selectUnpaidRecord(
                id, uid, value, date, remark, expenseRecordId);
    }

    @RequestMapping(value = "/queryAllByJson", method = {RequestMethod.POST})
    public List<UnpaidRecord> queryAllByJson(@RequestBody Map params) {
        return unpaidRecordService.selectAllUnpaidRecord();
    }

    @RequestMapping(value = "/insertByJson", method = {RequestMethod.POST})
    public void insertByJson(@RequestBody Map params) {
        Integer id = ParseUtil.obj2Int(params.get("id"));
        Integer uid = ParseUtil.obj2Int(params.get("uid"));
        Double value = ParseUtil.obj2Double(params.get("value"));
        Date date = ParseUtil.obj2Date(params.get("date"));
        String remark = ParseUtil.obj2String(params.get("remark"));
        Integer expenseRecordId = ParseUtil.obj2Int(params.get("expenseRecordId"));
        unpaidRecordService.insertUnpaidRecord(
                id, uid, value, date, remark, expenseRecordId);
    }

    @RequestMapping(value = "/deleteByJson", method = {RequestMethod.POST})
    public void deleteByJson(@RequestBody Map params) {
        Integer id = ParseUtil.obj2Int(params.get("id"));
        Integer uid = ParseUtil.obj2Int(params.get("uid"));
        Double value = ParseUtil.obj2Double(params.get("value"));
        Date date = ParseUtil.obj2Date(params.get("date"));
        String remark = ParseUtil.obj2String(params.get("remark"));
        Integer expenseRecordId = ParseUtil.obj2Int(params.get("expenseRecordId"));
        unpaidRecordService.deleteUnpaidRecord(
                id, uid, value, date, remark, expenseRecordId);
    }

    @RequestMapping(value = "/updateByJson", method = {RequestMethod.POST})
    public void updateByJson(@RequestBody Map params) {
        Integer id = ParseUtil.obj2Int(params.get("id"));
        Integer uid = ParseUtil.obj2Int(params.get("uid"));
        Double value = ParseUtil.obj2Double(params.get("value"));
        Date date = ParseUtil.obj2Date(params.get("date"));
        String remark = ParseUtil.obj2String(params.get("remark"));
        Integer expenseRecordId = ParseUtil.obj2Int(params.get("expenseRecordId"));
        unpaidRecordService.updateUnpaidRecord(
                id, uid, value, date, remark, expenseRecordId);
    }

}
