package com.stdkonjac.onlineledger.controller;

import com.stdkonjac.onlineledger.entity.LogoutRecord;
import com.stdkonjac.onlineledger.entity.User;
import com.stdkonjac.onlineledger.service.UserService;
import com.stdkonjac.onlineledger.util.*;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

import javax.servlet.http.HttpServletRequest;
import java.net.PasswordAuthentication;
import java.sql.Timestamp;
import java.util.List;
import java.util.Map;

@RestController
@RequestMapping("/user")
public class UserController {
    @Autowired
    private UserService userService;

    @RequestMapping(value = "/query", method = {RequestMethod.GET})
    public List<User> query(HttpServletRequest request) {
        Integer id = ParseUtil.str2Int(request.getParameter("id"));
        String username = request.getParameter("username");
        String password = request.getParameter("password");
        return userService.selectUser(id, username, password);
    }

    @RequestMapping(value = "/queryAll", method = {RequestMethod.GET})
    public List<User> queryAll() {
        return userService.selectAllUser();
    }

    @RequestMapping(value = "/insert", method = {RequestMethod.GET})
    public void insert(HttpServletRequest request) {
        Integer id = ParseUtil.str2Int(request.getParameter("id"));
        String username = request.getParameter("username");
        String password = request.getParameter("password");
        userService.insertUser(id, username, password);
    }

    @RequestMapping(value = "/delete", method = {RequestMethod.GET})
    public void delete(HttpServletRequest request) {
        Integer id = ParseUtil.str2Int(request.getParameter("id"));
        String username = request.getParameter("username");
        String password = request.getParameter("password");
        userService.deleteUser(id, username, password);
    }

    @RequestMapping(value = "/update", method = {RequestMethod.GET})
    public void update(HttpServletRequest request) {
        Integer id = ParseUtil.str2Int(request.getParameter("id"));
        String username = request.getParameter("username");
        String password = request.getParameter("password");
        userService.updateUser(id, username, password);
    }

    @RequestMapping(value = "/queryByJson", method = {RequestMethod.POST})
    public List<User> queryByJson(@RequestBody Map params) {
        Integer id = ParseUtil.obj2Int(params.get("id"));
        String username = ParseUtil.obj2String(params.get("username"));
        String password = ParseUtil.obj2String(params.get("password"));
        return userService.selectUser(id, username, password);
    }

    @RequestMapping(value = "/queryAllByJson", method = {RequestMethod.POST})
    public List<User> queryAllByJson(@RequestBody Map params) {
        return userService.selectAllUser();
    }

    @RequestMapping(value = "/insertByJson", method = {RequestMethod.POST})
    public void insertByJson(@RequestBody Map params) {
        Integer id = ParseUtil.obj2Int(params.get("id"));
        String username = ParseUtil.obj2String(params.get("username"));
        String password = ParseUtil.obj2String(params.get("password"));
        userService.insertUser(id, username, password);
    }

    @RequestMapping(value = "/deleteByJson", method = {RequestMethod.POST})
    public void deleteByJson(@RequestBody Map params) {
        Integer id = ParseUtil.obj2Int(params.get("id"));
        String username = ParseUtil.obj2String(params.get("username"));
        String password = ParseUtil.obj2String(params.get("password"));
        userService.deleteUser(id, username, password);
    }

    @RequestMapping(value = "/updateByJson", method = {RequestMethod.POST})
    public void updateByJson(@RequestBody Map params) {
        Integer id = ParseUtil.obj2Int(params.get("id"));
        String username = ParseUtil.obj2String(params.get("username"));
        String password = ParseUtil.obj2String(params.get("password"));
        userService.updateUser(id, username, password);
    }
}
