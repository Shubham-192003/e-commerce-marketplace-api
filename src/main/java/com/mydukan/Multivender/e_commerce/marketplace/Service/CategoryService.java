package com.mydukan.Multivender.e_commerce.marketplace.Service;

import com.mydukan.Multivender.e_commerce.marketplace.Entity.Category;
import com.mydukan.Multivender.e_commerce.marketplace.Repository.CategoryRepo;
import jakarta.persistence.Column;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

@Service
public class CategoryService {
    @Autowired
    private CategoryRepo categoryRepo;

    public String getCategoryNameById(long id) {
        Optional<Category> category = categoryRepo.findById(id);
        if (category.isPresent()) {
            return category.get().getName();
        }else{
            return "Not Found";
        }
    }
    public List<Category> getAllCategory() {
        return categoryRepo.findAll();
    }
    public void addCategory(Category category) {
        if(categoryRepo.existsByName(category.getName())){
            throw new RuntimeException("Category Already Exists");
        }
        else {
            categoryRepo.save(category);
        }
    }
}
