package com.stdkonjac.onlineledger.controller;

import com.stdkonjac.onlineledger.entity.User;
import com.stdkonjac.onlineledger.service.UserService;
import com.stdkonjac.onlineledger.util.*;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import javax.servlet.http.HttpServletRequest;
import java.util.List;

@RestController
@RequestMapping("/user")
public class UserController {
    @Autowired
    private UserService userService;

    @RequestMapping("/query")
    public List<User> query(HttpServletRequest request) {
        Integer id = ParseUtil.str2Int(request.getParameter("id"));
        String username = request.getParameter("username");
        String password = request.getParameter("password");
        return userService.selectUser(id, username, password);
    }

    @RequestMapping("/queryAll")
    public List<User> queryAll() {
        return userService.selectAllUser();
    }

    @RequestMapping("/insert")
    public void insert(HttpServletRequest request) {
        Integer id = ParseUtil.str2Int(request.getParameter("id"));
        String username = request.getParameter("username");
        String password = request.getParameter("password");
        userService.insertUser(id, username, password);
    }

    @RequestMapping("/delete")
    public void delete(HttpServletRequest request) {
        Integer id = ParseUtil.str2Int(request.getParameter("id"));
        String username = request.getParameter("username");
        String password = request.getParameter("password");
        userService.deleteUser(id, username, password);
    }

    @RequestMapping("/update")
    public void update(HttpServletRequest request) {
        Integer id = ParseUtil.str2Int(request.getParameter("id"));
        String username = request.getParameter("username");
        String password = request.getParameter("password");
        userService.updateUser(id, username, password);
    }

    @RequestMapping("/executeQuery")
    public List<User> executeQuery(HttpServletRequest request) {
        String sql = request.getParameter("sql");
        return userService.executeSelect(sql);
    }

    @RequestMapping("/executeInsert")
    public void executeInsert(HttpServletRequest request) {
        String sql = request.getParameter("sql");
        userService.executeInsert(sql);
    }

    @RequestMapping("/executeDelete")
    public void executeDelete(HttpServletRequest request) {
        String sql = request.getParameter("sql");
        userService.executeDelete(sql);
    }

    @RequestMapping("/executeUpdate")
    public void executeUpdate(HttpServletRequest request) {
        String sql = request.getParameter("sql");
        userService.executeUpdate(sql);
    }

}
