package com.stdkonjac.onlineledger.controller;

import com.stdkonjac.onlineledger.service.LoginValidatorService;
import com.stdkonjac.onlineledger.util.CookieUtil;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import javax.servlet.http.Cookie;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

@RestController
public class LoginValidatorController {
    @Autowired
    LoginValidatorService loginValidatorService;

    @RequestMapping("/loginValidator")
    public Integer handleLogin(HttpServletRequest request,
                               HttpServletResponse response) {
        String username = request.getParameter("username");
        String password = request.getParameter("password");
        Integer uid = loginValidatorService.verifyUser(username, password);
        if (uid >= 1 &&
                CookieUtil.getCookieValue(request, "uid") == null) {
            CookieUtil.setCookie(response, "uid", String.valueOf(uid));
        }
        return uid;
    }
}
