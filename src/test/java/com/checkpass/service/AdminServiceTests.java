package com.checkpass.service;

import com.checkpass.dto.AdminDTO;
import lombok.extern.log4j.Log4j2;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;

@SpringBootTest
@Log4j2
public class AdminServiceTests {
    @Autowired
    private AdminService adminService;

    @Test
    public void testRegister() {
        log.info(adminService.getClass().getName());

        AdminDTO adminDTO= AdminDTO.builder()
                .adId("adminRegi").adpw("adminRegi").build();
        Long ano = adminService.register(adminDTO);
        log.info("ano: " + ano);
    }
}
