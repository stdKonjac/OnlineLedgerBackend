package com.stdkonjac.onlineledger.controller;

import com.stdkonjac.onlineledger.service.LogoutHandlerService;
import com.stdkonjac.onlineledger.util.CookieUtil;
import com.stdkonjac.onlineledger.util.DateUtil;
import com.stdkonjac.onlineledger.util.IpUtil;
import com.stdkonjac.onlineledger.util.ParseUtil;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.util.Date;

@RestController
public class LogoutHandlerController {
    @Autowired
    private LogoutHandlerService logoutHandlerService;

    @RequestMapping("/logoutHandler")
    public Integer handleLogout(HttpServletRequest request,
                                HttpServletResponse response) {
        Integer uid = ParseUtil.str2Int(request.getParameter("uid"));
        if (logoutHandlerService.verifyUser(uid) != -1) {
            CookieUtil.deleteCookie(request, response, "uid");
            String ip = IpUtil.getIpAddress(request);
            Date date = DateUtil.dateFormatter(new Date(), "yyyy-MM-dd");

        }
        return 1;
    }
}
