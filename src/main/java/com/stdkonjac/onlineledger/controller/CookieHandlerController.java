package com.stdkonjac.onlineledger.controller;

import com.stdkonjac.onlineledger.util.CookieUtil;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.util.Map;

@RestController
public class CookieHandlerController {
    @RequestMapping(value = "/getCookie", method = {RequestMethod.GET})
    public Map<String, String> getCookie(HttpServletRequest request) {
        return CookieUtil.getAllCookies(request);
    }

    @RequestMapping(value = "/getCookieByJson", method = {RequestMethod.POST})
    public Map<String, String> getCookie(HttpServletRequest request,
                                         HttpServletResponse response,
                                         @RequestBody Map params) {
        return CookieUtil.getAllCookies(request);
    }
}
