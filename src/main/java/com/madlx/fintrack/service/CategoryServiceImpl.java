package com.madlx.fintrack.service;

import com.madlx.fintrack.entity.Category;
import com.madlx.fintrack.repository.CategoryRepository;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class CategoryServiceImpl implements CategoryService{

    private final CategoryRepository categoryRepository;

    public CategoryServiceImpl(CategoryRepository categoryRepository) {
        this.categoryRepository = categoryRepository;
    }

    @Override
    public Category createCategory(Category category) {
        return null;
    }

    @Override
    public boolean deleteCategory(Long id) {
        return false;
    }

    @Override
    public List<Category> allCategory() {
        return List.of();
    }
}
