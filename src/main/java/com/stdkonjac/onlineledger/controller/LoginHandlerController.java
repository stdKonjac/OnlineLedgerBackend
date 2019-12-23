package com.stdkonjac.onlineledger.controller;

import com.stdkonjac.onlineledger.service.LoginRecordService;
import com.stdkonjac.onlineledger.service.LoginHandlerService;
import com.stdkonjac.onlineledger.util.CookieUtil;
import com.stdkonjac.onlineledger.util.DateUtil;
import com.stdkonjac.onlineledger.util.IpUtil;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.util.Date;

@RestController
public class LoginHandlerController {
    @Autowired
    private LoginHandlerService loginHandlerService;
    @Autowired
    private LoginRecordService loginRecordService;

    @RequestMapping("/loginHandler")
    public Integer handleLogin(HttpServletRequest request,
                               HttpServletResponse response) {
        String username = request.getParameter("username");
        String password = request.getParameter("password");
        Integer uid = loginHandlerService.verifyUser(username, password);
        if (uid >= 1) {
            CookieUtil.setCookie(response, "uid", String.valueOf(uid));
            String ip = IpUtil.getIpAddress(request);
            Date loginTime = DateUtil.dateFormatter(new Date(), "yyyy-MM-dd HH-mm-ss");
            loginRecordService.insertLoginRecord(ip, uid, username, loginTime);
        }
        return uid;
    }
}
