package com.checkpass.controller;

import lombok.extern.log4j.Log4j2;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
@Log4j2
public class MainController {

    @GetMapping("/chackpass")
    public void mainPage() {
        log.info("mainPage..!");
    }

}
