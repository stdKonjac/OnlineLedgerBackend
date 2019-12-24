package com.stdkonjac.onlineledger.controller;

import com.stdkonjac.onlineledger.entity.LedgerBook;
import com.stdkonjac.onlineledger.service.LedgerBookService;
import com.stdkonjac.onlineledger.util.*;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import javax.servlet.http.HttpServletRequest;
import java.util.List;

@RestController
@RequestMapping("/ledgerBook")
public class LedgerBookController {
    @Autowired
    private LedgerBookService ledgerBookService;

    @RequestMapping("/query")
    public List<LedgerBook> query(HttpServletRequest request) {
        Integer uid = ParseUtil.str2Int(request.getParameter("uid"));
        String name = request.getParameter("name");
        Integer recordCount = ParseUtil.str2Int(request.getParameter("recordCount"));
        Double budget = ParseUtil.str2Double(request.getParameter("budget"));
        return ledgerBookService.selectLedgerBook(uid, name, recordCount, budget);
    }

    @RequestMapping("/queryAll")
    public List<LedgerBook> queryAll() {
        return ledgerBookService.selectAllLedgerBook();
    }

    @RequestMapping("/insert")
    public void insert(HttpServletRequest request) {
        Integer uid = ParseUtil.str2Int(request.getParameter("uid"));
        String name = request.getParameter("name");
        Integer recordCount = ParseUtil.str2Int(request.getParameter("recordCount"));
        Double budget = ParseUtil.str2Double(request.getParameter("budget"));
        ledgerBookService.insertLedgerBook(uid, name, recordCount, budget);
    }

    @RequestMapping("/delete")
    public void delete(HttpServletRequest request) {
        Integer uid = ParseUtil.str2Int(request.getParameter("uid"));
        String name = request.getParameter("name");
        Integer recordCount = ParseUtil.str2Int(request.getParameter("recordCount"));
        Double budget = ParseUtil.str2Double(request.getParameter("budget"));
        ledgerBookService.deleteLedgerBook(uid, name, recordCount, budget);
    }

    @RequestMapping("/update")
    public void update(HttpServletRequest request) {
        Integer uid = ParseUtil.str2Int(request.getParameter("uid"));
        String name = request.getParameter("name");
        Integer recordCount = ParseUtil.str2Int(request.getParameter("recordCount"));
        Double budget = ParseUtil.str2Double(request.getParameter("budget"));
        ledgerBookService.updateLedgerBook(uid, name, recordCount, budget);
    }

}
