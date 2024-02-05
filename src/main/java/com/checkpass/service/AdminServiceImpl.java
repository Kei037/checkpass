package com.checkpass.service;

import com.checkpass.domain.Admin;
import com.checkpass.dto.AdminDTO;
import com.checkpass.repository.AdminRepository;
import jakarta.transaction.Transactional;
import lombok.RequiredArgsConstructor;
import lombok.extern.log4j.Log4j2;
import org.modelmapper.ModelMapper;
import org.springframework.stereotype.Service;

import java.util.Optional;

@Service
@Log4j2
@RequiredArgsConstructor
@Transactional
public class AdminServiceImpl implements AdminService {
    private final ModelMapper modelMapper;
    private final AdminRepository adminRepository;

    @Override
    public Long register(AdminDTO adminDTO) {
        Admin admin = modelMapper.map(adminDTO, Admin.class);
        Long ano = adminRepository.save(admin).getAno();
        return ano;
    }

    @Override
    public AdminDTO readOne(Long ano) {
        Optional<Admin> optionalAdmin = adminRepository.findById(ano);
        Admin admin = optionalAdmin.orElseThrow();
        return modelMapper.map(admin, AdminDTO.class);
    }
}
