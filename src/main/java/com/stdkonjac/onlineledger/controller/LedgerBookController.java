package com.stdkonjac.onlineledger.controller;

import com.stdkonjac.onlineledger.entity.LedgerBook;
import com.stdkonjac.onlineledger.service.LedgerBookService;
import com.stdkonjac.onlineledger.util.*;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

import javax.servlet.http.HttpServletRequest;
import java.util.List;
import java.util.Map;

@RestController
@RequestMapping("/ledgerBook")
public class LedgerBookController {
    @Autowired
    private LedgerBookService ledgerBookService;

    @RequestMapping("/query")
    public List<LedgerBook> query(HttpServletRequest request) {
        Integer id = ParseUtil.str2Int(request.getParameter("id"));
        Integer uid = ParseUtil.str2Int(request.getParameter("uid"));
        String name = request.getParameter("name");
        Integer recordCount = ParseUtil.str2Int(request.getParameter("recordCount"));
        Double budget = ParseUtil.str2Double(request.getParameter("budget"));
        return ledgerBookService.selectLedgerBook(
                id, uid, name, recordCount, budget);
    }

    @RequestMapping("/queryAll")
    public List<LedgerBook> queryAll() {
        return ledgerBookService.selectAllLedgerBook();
    }

    @RequestMapping("/insert")
    public void insert(HttpServletRequest request) {
        Integer id = ParseUtil.str2Int(request.getParameter("id"));
        Integer uid = ParseUtil.str2Int(request.getParameter("uid"));
        String name = request.getParameter("name");
        Integer recordCount = ParseUtil.str2Int(request.getParameter("recordCount"));
        Double budget = ParseUtil.str2Double(request.getParameter("budget"));
        ledgerBookService.insertLedgerBook(
                id, uid, name, recordCount, budget);
    }

    @RequestMapping("/delete")
    public void delete(HttpServletRequest request) {
        Integer id = ParseUtil.str2Int(request.getParameter("id"));
        Integer uid = ParseUtil.str2Int(request.getParameter("uid"));
        String name = request.getParameter("name");
        Integer recordCount = ParseUtil.str2Int(request.getParameter("recordCount"));
        Double budget = ParseUtil.str2Double(request.getParameter("budget"));
        ledgerBookService.deleteLedgerBook(
                id, uid, name, recordCount, budget);
    }

    @RequestMapping("/update")
    public void update(HttpServletRequest request) {
        Integer id = ParseUtil.str2Int(request.getParameter("id"));
        Integer uid = ParseUtil.str2Int(request.getParameter("uid"));
        String name = request.getParameter("name");
        Integer recordCount = ParseUtil.str2Int(request.getParameter("recordCount"));
        Double budget = ParseUtil.str2Double(request.getParameter("budget"));
        ledgerBookService.updateLedgerBook(
                id, uid, name, recordCount, budget);
    }

    @RequestMapping(value = "/queryByJson", method = {RequestMethod.POST})
    public List<LedgerBook> queryByJson(@RequestBody Map params) {
        Integer id = ParseUtil.obj2Int(params.get("id"));
        Integer uid = ParseUtil.obj2Int(params.get("uid"));
        String name = ParseUtil.obj2String(params.get("name"));
        Integer recordCount = ParseUtil.obj2Int(params.get("recordCount"));
        Double budget = ParseUtil.obj2Double(params.get("budget"));
        return ledgerBookService.selectLedgerBook(
                id, uid, name, recordCount, budget);
    }

    @RequestMapping(value = "/queryAllByJson", method = {RequestMethod.POST})
    public List<LedgerBook> queryAllByJson(@RequestBody Map params) {
        return ledgerBookService.selectAllLedgerBook();
    }

    @RequestMapping(value = "/insertByJson", method = {RequestMethod.POST})
    public void insertByJson(@RequestBody Map params) {
        Integer id = ParseUtil.obj2Int(params.get("id"));
        Integer uid = ParseUtil.obj2Int(params.get("uid"));
        String name = ParseUtil.obj2String(params.get("name"));
        Integer recordCount = ParseUtil.obj2Int(params.get("recordCount"));
        Double budget = ParseUtil.obj2Double(params.get("budget"));
        ledgerBookService.insertLedgerBook(
                id, uid, name, recordCount, budget);
    }

    @RequestMapping(value = "/deleteByJson", method = {RequestMethod.POST})
    public void deleteByJson(@RequestBody Map params) {
        Integer id = ParseUtil.obj2Int(params.get("id"));
        Integer uid = ParseUtil.obj2Int(params.get("uid"));
        String name = ParseUtil.obj2String(params.get("name"));
        Integer recordCount = ParseUtil.obj2Int(params.get("recordCount"));
        Double budget = ParseUtil.obj2Double(params.get("budget"));
        ledgerBookService.deleteLedgerBook(
                id, uid, name, recordCount, budget);
    }

    @RequestMapping(value = "/updateByJson", method = {RequestMethod.POST})
    public void updateByJson(@RequestBody Map params) {
        Integer id = ParseUtil.obj2Int(params.get("id"));
        Integer uid = ParseUtil.obj2Int(params.get("uid"));
        String name = ParseUtil.obj2String(params.get("name"));
        Integer recordCount = ParseUtil.obj2Int(params.get("recordCount"));
        Double budget = ParseUtil.obj2Double(params.get("budget"));
        ledgerBookService.updateLedgerBook(
                id, uid, name, recordCount, budget);
    }
}
