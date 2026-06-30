package com.mydukan.Multivender.e_commerce.marketplace.Repository;

import com.mydukan.Multivender.e_commerce.marketplace.Entity.Category;
import org.springframework.data.jpa.repository.JpaRepository;

import java.util.Optional;

public interface CategoryRepo extends JpaRepository<Category,Long> {
    boolean existsByName(String name);
    Optional<Category> findByName(String name);
}
