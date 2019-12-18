package com.stdkonjac.onlineledger.controller;

import com.stdkonjac.onlineledger.service.SqlScriptService;
import com.stdkonjac.onlineledger.util.*;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import javax.servlet.http.HttpServletRequest;
import java.util.List;

@RestController
@RequestMapping("/sqlScript")
public class SqlScriptController {
    @Autowired
    private SqlScriptService sqlScriptService;

    @RequestMapping("/executeQuery")
    public List<Object> executeQuery(HttpServletRequest request) {
        String sql = request.getParameter("sql");
        return sqlScriptService.executeSelect(sql);
    }

    @RequestMapping("/executeInsert")
    public void executeInsert(HttpServletRequest request) {
        String sql = request.getParameter("sql");
        sqlScriptService.executeInsert(sql);
    }

    @RequestMapping("/executeDelete")
    public void executeDelete(HttpServletRequest request) {
        String sql = request.getParameter("sql");
        sqlScriptService.executeDelete(sql);
    }

    @RequestMapping("/executeUpdate")
    public void executeUpdate(HttpServletRequest request) {
        String sql = request.getParameter("sql");
        sqlScriptService.executeUpdate(sql);
    }

}
