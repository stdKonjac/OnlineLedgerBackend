package com.stdkonjac.onlineledger.controller;

import com.stdkonjac.onlineledger.entity.User;
import com.stdkonjac.onlineledger.service.LogoutHandlerService;
import com.stdkonjac.onlineledger.util.*;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

@RestController
public class LogoutHandlerController {
    @Autowired
    private LogoutHandlerService logoutHandlerService;

    @RequestMapping("/logoutHandler")
    public Integer handleLogout(HttpServletRequest request,
                                HttpServletResponse response) {
        Integer uid = ParseUtil.str2Int(request.getParameter("uid"));
        Integer cookieUid =
                ParseUtil.str2Int(CookieUtil.getCookieValue(request, "uid"));
        User user = logoutHandlerService.verifyUser(uid, cookieUid);
        if (user != null) {
            CookieUtil.deleteCookie(request, response, "uid");
            String ip = IpUtil.getIpAddress(request);
            logoutHandlerService.recordLogoutAction(ip, user);
        }
        return 1;
    }
}
