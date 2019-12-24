package com.stdkonjac.onlineledger.controller;

import com.stdkonjac.onlineledger.service.RegisterHandlerService;
import com.stdkonjac.onlineledger.util.ParseUtil;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

import javax.servlet.http.HttpServletRequest;
import java.util.Map;

@RestController
public class RegisterHandlerController {
    @Autowired
    private RegisterHandlerService registerHandlerService;

    @RequestMapping(value = "/registerHandler", method = {RequestMethod.GET})
    public Integer handleRegister(HttpServletRequest request) {
        String username = request.getParameter("username");
        String password = request.getParameter("password");
        if (registerHandlerService.verifyUser(username) == 1) {
            registerHandlerService.registerUser(username, password);
            return 1;
        } else {
            return 0;
        }
    }

    @RequestMapping(value = "/jsonRegisterHandler", method = {RequestMethod.POST})
    public Integer handleRegisterByJson(@RequestBody Map params) {
        String username = ParseUtil.obj2String(params.get("username"));
        String password = ParseUtil.obj2String(params.get("password"));
        if (registerHandlerService.verifyUser(username) == 1) {
            registerHandlerService.registerUser(username, password);
            return 1;
        } else {
            return 0;
        }
    }
}
