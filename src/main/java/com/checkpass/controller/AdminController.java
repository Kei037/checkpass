package com.checkpass.controller;

import com.checkpass.dto.AdminDTO;
import com.checkpass.service.AdminService;
import jakarta.validation.Valid;
import lombok.RequiredArgsConstructor;
import lombok.extern.log4j.Log4j2;
import org.springframework.stereotype.Controller;
import org.springframework.validation.BindingResult;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.servlet.mvc.support.RedirectAttributes;

@Controller
@Log4j2
@RequestMapping("/admin")
@RequiredArgsConstructor
public class AdminController {
    private final AdminService adminService;

    @GetMapping("/login")
    public void adminLoginPage() {
        log.info("adminLoginPage...");
    }

    @GetMapping("/join")
    public void adminJoinPage() {
        log.info("joinPage...");
    }

    @PostMapping("/join")
    public String joinPost(@Valid AdminDTO adminDTO, BindingResult bindingresult,
                         RedirectAttributes redirectAttributes) {
        log.info("joinPost..!!");
        Long ano = adminService.register(adminDTO);
        redirectAttributes.addFlashAttribute("result", ano);
        return "redirect:/admin/login";
    }
}
