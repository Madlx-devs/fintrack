package com.madlx.fintrack.service;

import com.madlx.fintrack.entity.Category;

import java.util.List;

public interface CategoryService {

    Category createCategory(Category category);
    boolean deleteCategory(Long id);
    List<Category> allCategory();

}
