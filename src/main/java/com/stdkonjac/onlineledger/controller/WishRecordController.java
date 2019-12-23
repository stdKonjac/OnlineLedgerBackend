package com.stdkonjac.onlineledger.controller;

import com.stdkonjac.onlineledger.entity.WishRecord;
import com.stdkonjac.onlineledger.service.WishRecordService;
import com.stdkonjac.onlineledger.util.*;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import javax.servlet.http.HttpServletRequest;
import java.util.List;

@RestController
@RequestMapping("/wishRecord")
public class WishRecordController {
    @Autowired
    private WishRecordService wishRecordService;

    @RequestMapping("/query")
    public List<WishRecord> query(HttpServletRequest request) {
        Integer uid = ParseUtil.str2Int(request.getParameter("uid"));
        String wish = request.getParameter("wish");
        String remark = request.getParameter("remark");
        return wishRecordService.selectWishRecord(uid, wish, remark);
    }

    @RequestMapping("/queryAll")
    public List<WishRecord> queryAll() {
        return wishRecordService.selectAllWishRecord();
    }

    @RequestMapping("/insert")
    public void insert(HttpServletRequest request) {
        Integer uid = ParseUtil.str2Int(request.getParameter("uid"));
        String wish = request.getParameter("wish");
        String remark = request.getParameter("remark");
        wishRecordService.insertWishRecord(uid, wish, remark);
    }

    @RequestMapping("/delete")
    public void delete(HttpServletRequest request) {
        Integer uid = ParseUtil.str2Int(request.getParameter("uid"));
        String wish = request.getParameter("wish");
        String remark = request.getParameter("remark");
        wishRecordService.deleteWishRecord(uid, wish, remark);
    }

    @RequestMapping("/update")
    public void update(HttpServletRequest request) {
        Integer uid = ParseUtil.str2Int(request.getParameter("uid"));
        String wish = request.getParameter("wish");
        String remark = request.getParameter("remark");
        wishRecordService.updateWishRecord(uid, wish, remark);
    }

}
