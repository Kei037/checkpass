package com.checkpass.repository;

import com.checkpass.domain.Admin;
import lombok.extern.log4j.Log4j2;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;

import java.util.Optional;

@SpringBootTest
@Log4j2
public class AdminRepositoryTests {
    @Autowired
    private AdminRepository adminRepository;

    @Test
    public void testSelect() {
        Long ano = 1L;
        Optional<Admin> result = adminRepository.findById(ano);
        Admin admin = result.orElseThrow();
        log.info(admin);
    }
/*
    @Test
    public void testUpdate() {
        Long ano = 2L;
        Optional<Admin> result = adminRepository.findById(ano);
        Admin admin = result.orElseThrow();

        admin.change("adminTest", "adminTest");
        adminRepository.save(admin);
    }
 */
    @Test
    public void deleteTest() {
        Long ano = 2L;
        adminRepository.deleteById(ano);
    }
}
