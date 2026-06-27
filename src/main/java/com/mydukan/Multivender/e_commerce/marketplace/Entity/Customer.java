package com.mydukan.Multivender.e_commerce.marketplace.Entity;

import lombok.Data;

@Data
public class Customer {
    private int id;
    private String firstName;
    private String address;
    private String email;
    private String phone;
}
