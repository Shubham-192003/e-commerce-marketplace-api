package com.mydukan.Multivender.e_commerce.marketplace.Repository;

import com.mydukan.Multivender.e_commerce.marketplace.Entity.Product;
import org.springframework.data.jpa.repository.JpaRepository;

public interface ProductRepo extends JpaRepository<Product,Long> {
}
