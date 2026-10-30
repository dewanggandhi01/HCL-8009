package com.abes.hrms.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import com.abes.hrms.model.DemoEmployee;

@RestController
public class EmployeeController {

    @Autowired
    private DemoEmployee demoEmployee;

    @GetMapping("/")
    public String welcome() {
        return "Welcome to Springboot Application";
    }

    @GetMapping("/add")
    public int sum(@RequestParam(defaultValue = "0") int a, @RequestParam(defaultValue = "0") int b) {
        int result = demoEmployee.add(a, b);
        return result;
    }
}
