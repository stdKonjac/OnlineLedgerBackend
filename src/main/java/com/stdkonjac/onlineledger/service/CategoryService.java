package com.stdkonjac.onlineledger.service;

import com.stdkonjac.onlineledger.dao.CategoryDao;
import com.stdkonjac.onlineledger.entity.Category;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class CategoryService {
    @Autowired
    private CategoryDao categoryDao;

    public List<Category> selectCategory(
            Integer uid,
            String name,
            Integer recordCount,
            Double budget) {
        return categoryDao.selectCategory(uid, name, recordCount, budget);
    }

    public List<Category> selectAllCategory() {
        return categoryDao.selectAllCategory();
    }

    public void insertCategory(
            Integer uid,
            String name,
            Integer recordCount,
            Double budget) {
        categoryDao.insertCategory(uid, name, recordCount, budget);
    }

    public void deleteCategory(
            Integer uid,
            String name,
            Integer recordCount,
            Double budget) {
        categoryDao.deleteCategory(uid, name, recordCount, budget);
    }

    public void updateCategory(
            Integer uid,
            String name,
            Integer recordCount,
            Double budget) {
        categoryDao.updateCategory(uid, name, recordCount, budget);
    }

}
