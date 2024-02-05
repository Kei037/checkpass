package com.checkpass.service;

import com.checkpass.dto.AdminDTO;

public interface AdminService {
    Long register(AdminDTO adminDTO);
    AdminDTO readOne(Long ano);
}
