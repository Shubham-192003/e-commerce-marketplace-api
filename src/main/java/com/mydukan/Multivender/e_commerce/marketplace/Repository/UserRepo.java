package com.mydukan.Multivender.e_commerce.marketplace.Repository;

import com.mydukan.Multivender.e_commerce.marketplace.Entity.User;
import org.springframework.data.jpa.repository.JpaRepository;

public interface UserRepo extends JpaRepository<User,Long>
{
}
