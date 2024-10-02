package com.example.userservice.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;

@Controller
public class UserViewController {

    @GetMapping("/addUser")
    public String showAddUserForm() {
        return "addUser"; // This will look for addUser.html in the resources/static directory
    }

    // Additional mappings can be added here
}
