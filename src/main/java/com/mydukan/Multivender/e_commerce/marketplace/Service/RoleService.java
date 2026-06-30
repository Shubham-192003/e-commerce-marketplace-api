package com.mydukan.Multivender.e_commerce.marketplace.Service;

import com.mydukan.Multivender.e_commerce.marketplace.Repository.RoleRepo;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;
import org.springframework.stereotype.Service;

@Service
public class RoleService {
    @Autowired
    private RoleRepo roleRepo;
}
