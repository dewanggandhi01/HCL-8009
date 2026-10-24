package com.abesproject.hrmsdatabase.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController 
public class EmployeeController {
    @Autowired 
    private EmployeeService employeeService;
    
    @GetMapping("/")
    public String () {
        return "List of employees";
    }
    
    @GetMapping ("/addEmp")
    public String adnewEmployee(){
        return employeeService.createNewEmployee();        
    }
}
