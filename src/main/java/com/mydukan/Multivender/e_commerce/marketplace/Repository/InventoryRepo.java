package com.mydukan.Multivender.e_commerce.marketplace.Repository;

import com.mydukan.Multivender.e_commerce.marketplace.Entity.Inventory;
import org.springframework.data.jpa.repository.JpaRepository;

public interface InventoryRepo extends JpaRepository<Inventory,Long> {
}
