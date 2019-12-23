package com.stdkonjac.onlineledger.controller;

import com.stdkonjac.onlineledger.entity.Category;
import com.stdkonjac.onlineledger.entity.User;
import com.stdkonjac.onlineledger.service.CategoryService;
import com.stdkonjac.onlineledger.util.*;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import javax.servlet.http.HttpServletRequest;
import java.util.List;

@RestController
@RequestMapping("/category")
public class CategoryController {
    @Autowired
    private CategoryService categoryService;

    @RequestMapping("/query")
    public List<Category> query(HttpServletRequest request) {
        Integer uid = ParseUtil.str2Int(request.getParameter("uid"));
        String name = request.getParameter("name");
        Integer recordCount = ParseUtil.str2Int(request.getParameter("recordCount"));
        return categoryService.selectCategory(uid, name, recordCount);
    }

    @RequestMapping("/queryAll")
    public List<Category> queryAll() {
        return categoryService.selectAllCategory();
    }

    @RequestMapping("/insert")
    public void insert(HttpServletRequest request) {
        Integer uid = ParseUtil.str2Int(request.getParameter("uid"));
        String name = request.getParameter("name");
        Integer recordCount = ParseUtil.str2Int(request.getParameter("recordCount"));
        categoryService.insertCategory(uid, name, recordCount);
    }

    @RequestMapping("/delete")
    public void delete(HttpServletRequest request) {
        Integer uid = ParseUtil.str2Int(request.getParameter("uid"));
        String name = request.getParameter("name");
        Integer recordCount = ParseUtil.str2Int(request.getParameter("recordCount"));
        categoryService.deleteCategory(uid, name, recordCount);
    }

    @RequestMapping("/update")
    public void update(HttpServletRequest request) {
        Integer uid = ParseUtil.str2Int(request.getParameter("uid"));
        String name = request.getParameter("name");
        Integer recordCount = ParseUtil.str2Int(request.getParameter("recordCount"));
        categoryService.updateCategory(uid, name, recordCount);
    }

}
