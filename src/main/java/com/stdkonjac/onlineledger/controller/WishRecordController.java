package com.stdkonjac.onlineledger.controller;

import com.stdkonjac.onlineledger.entity.UserProfile;
import com.stdkonjac.onlineledger.entity.WishRecord;
import com.stdkonjac.onlineledger.service.WishRecordService;
import com.stdkonjac.onlineledger.util.*;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

import javax.servlet.http.HttpServletRequest;
import java.util.List;
import java.util.Map;

@RestController
@RequestMapping("/wishRecord")
public class WishRecordController {
    @Autowired
    private WishRecordService wishRecordService;

    @RequestMapping(value = "/query", method = {RequestMethod.GET})
    public List<WishRecord> query(HttpServletRequest request) {
        Integer uid = ParseUtil.str2Int(request.getParameter("uid"));
        String wish = request.getParameter("wish");
        String remark = request.getParameter("remark");
        return wishRecordService.selectWishRecord(uid, wish, remark);
    }

    @RequestMapping(value = "/queryAll", method = {RequestMethod.GET})
    public List<WishRecord> queryAll() {
        return wishRecordService.selectAllWishRecord();
    }

    @RequestMapping(value = "/insert", method = {RequestMethod.GET})
    public void insert(HttpServletRequest request) {
        Integer uid = ParseUtil.str2Int(request.getParameter("uid"));
        String wish = request.getParameter("wish");
        String remark = request.getParameter("remark");
        wishRecordService.insertWishRecord(uid, wish, remark);
    }

    @RequestMapping(value = "/delete", method = {RequestMethod.GET})
    public void delete(HttpServletRequest request) {
        Integer uid = ParseUtil.str2Int(request.getParameter("uid"));
        String wish = request.getParameter("wish");
        String remark = request.getParameter("remark");
        wishRecordService.deleteWishRecord(uid, wish, remark);
    }

    @RequestMapping(value = "/update", method = {RequestMethod.GET})
    public void update(HttpServletRequest request) {
        Integer uid = ParseUtil.str2Int(request.getParameter("uid"));
        String wish = request.getParameter("wish");
        String remark = request.getParameter("remark");
        wishRecordService.updateWishRecord(uid, wish, remark);
    }

    @RequestMapping(value = "/queryByJson", method = {RequestMethod.POST})
    public List<WishRecord> queryByJson(@RequestBody Map params) {
        Integer uid = ParseUtil.obj2Int(params.get("uid"));
        String wish = ParseUtil.obj2String(params.get("wish"));
        String remark = ParseUtil.obj2String(params.get("remark"));
        return wishRecordService.selectWishRecord(uid, wish, remark);
    }

    @RequestMapping(value = "/queryAllByJson", method = {RequestMethod.POST})
    public List<WishRecord> queryAllByJson(@RequestBody Map params) {
        return wishRecordService.selectAllWishRecord();
    }

    @RequestMapping(value = "/insertByJson", method = {RequestMethod.POST})
    public void insertByJson(@RequestBody Map params) {
        Integer uid = ParseUtil.obj2Int(params.get("uid"));
        String wish = ParseUtil.obj2String(params.get("wish"));
        String remark = ParseUtil.obj2String(params.get("remark"));
        wishRecordService.insertWishRecord(uid, wish, remark);
    }

    @RequestMapping(value = "/deleteByJson", method = {RequestMethod.POST})
    public void deleteByJson(@RequestBody Map params) {
        Integer uid = ParseUtil.obj2Int(params.get("uid"));
        String wish = ParseUtil.obj2String(params.get("wish"));
        String remark = ParseUtil.obj2String(params.get("remark"));
        wishRecordService.deleteWishRecord(uid, wish, remark);
    }

    @RequestMapping(value = "/updateByJson", method = {RequestMethod.POST})
    public void updateByJson(@RequestBody Map params) {
        Integer uid = ParseUtil.obj2Int(params.get("uid"));
        String wish = ParseUtil.obj2String(params.get("wish"));
        String remark = ParseUtil.obj2String(params.get("remark"));
        wishRecordService.updateWishRecord(uid, wish, remark);
    }

}
