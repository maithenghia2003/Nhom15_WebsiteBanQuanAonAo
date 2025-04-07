package com.example.Admin.service;


import com.example.Admin.dto.AdminDto;
import com.example.Admin.model.Admin;

public interface AdminService {
    Admin save(AdminDto adminDto);

    Admin findByUsername(String username);
}
