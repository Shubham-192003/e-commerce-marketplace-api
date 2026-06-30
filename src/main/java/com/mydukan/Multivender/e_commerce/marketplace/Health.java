package com.mydukan.Multivender.e_commerce.marketplace;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class Health {
    @GetMapping("check")
    public String check() {
        return "e-commerce project";
    }
}
