package com.stdkonjac.onlineledger.controller;

import com.stdkonjac.onlineledger.entity.User;
import com.stdkonjac.onlineledger.service.LoginHandlerService;
import com.stdkonjac.onlineledger.util.*;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.util.Map;

@RestController
public class LoginHandlerController {
    @Autowired
    private LoginHandlerService loginHandlerService;

    @RequestMapping(value = "/loginHandler", method = {RequestMethod.GET})
    public Integer handleLogin(HttpServletRequest request,
                               HttpServletResponse response) {
        String username = request.getParameter("username");
        String password = request.getParameter("password");
        User user = loginHandlerService.verifyUser(username, password);
        if (user != null) {
            Integer uid = user.getId();
            CookieUtil.setCookie(response, "uid", String.valueOf(uid));
            CookieUtil.setCookie(response, "username", username);
            String ip = IpUtil.getIpAddress(request);
            loginHandlerService.recordLoginAction(ip, user);
            return uid;
        } else {
            return 0;
        }
    }

    @RequestMapping(value = "/jsonLoginHandler", method = {RequestMethod.POST})
    public Integer handleLoginByJson(HttpServletRequest request,
                                     HttpServletResponse response,
                                     @RequestBody Map params) {
        String username = ParseUtil.obj2String(params.get("username"));
        String password = ParseUtil.obj2String(params.get("password"));
        User user = loginHandlerService.verifyUser(username, password);
        if (user != null) {
            Integer uid = user.getId();
            CookieUtil.setCookie(response, "uid", String.valueOf(uid));
            CookieUtil.setCookie(response, "username", username);
            String ip = IpUtil.getIpAddress(request);
            loginHandlerService.recordLoginAction(ip, user);
            return uid;
        } else {
            return 0;
        }
    }
}
