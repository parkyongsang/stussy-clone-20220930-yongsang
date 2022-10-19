package com.stussy.stussyclone20220930yongsang.controller.admin;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
@RequestMapping("/admin")
public class ProductManagementController {

    @GetMapping("/product")
    public String loadProductRegister() {
        return "admin/registration";
    }
}
