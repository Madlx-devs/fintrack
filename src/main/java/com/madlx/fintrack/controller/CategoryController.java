package com.madlx.fintrack.controller;


import com.madlx.fintrack.entity.Category;
import com.madlx.fintrack.service.CategoryService;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping(path = "api/v1/category")
public class CategoryController {

    private final CategoryService categoryService;
    public CategoryController( @RequestBody CategoryService categoryService) {
        this.categoryService = categoryService;
    }
    @PostMapping(path = "create")
    public Category create(@RequestBody Category category){
       return categoryService.createCategory(category);
    }
    @DeleteMapping(path = "/delete")
    public boolean delete(@RequestParam  Long id){
        return categoryService.deleteCategory(id);
    }
    @GetMapping("/getAll")
    public List<Category> getAll(){
        return categoryService.allCategory();
    }
}
