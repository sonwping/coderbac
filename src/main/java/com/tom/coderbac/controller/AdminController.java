package com.tom.coderbac.controller;

import com.tom.coderbac.service.AdminService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ResponseBody;

@Controller
public class AdminController {
    @Autowired
    private AdminService adminService;

    @GetMapping("/admin")
    public @ResponseBody String admintest() {
        System.out.println("...controller begin");
        return adminService.getAll().toString();
    }
}
