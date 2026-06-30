package com.mydukan.Multivender.e_commerce.marketplace.Controller;

import com.mydukan.Multivender.e_commerce.marketplace.Entity.Category;
import com.mydukan.Multivender.e_commerce.marketplace.Service.CategoryService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/category")
public class CategoryController {
    @Autowired
    private CategoryService categoryService;

    @PostMapping("/save")
    public String saveCategory(@RequestBody Category category) {
        categoryService.addCategory(category);
        return "success";
    }
    @GetMapping("/all")
    public List<Category> getAllCategories(){
        return categoryService.getAllCategory();
    }
}
