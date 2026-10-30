package com.abesproject.hrmsdatabase.controller;

import com.abesproject.hrmsdatabase.model.Employee;
import com.abesproject.hrmsdatabase.service.EmployeeService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;
import java.util.Map;
import java.util.Optional;

@RestController
@CrossOrigin(origins = "http://localhost:5173") // Enables React app on port 5173 to access this API
@RequestMapping("/v1/user")
public class EmployeeController {

    @Autowired
    private EmployeeService employeeService;

    @GetMapping("/")
    public String msg() {
        return "HRMS Backend is running!";
    }

    @PostMapping("/addemp")
    public String addnewEmployee(@RequestBody Employee employee) {
        return employeeService.createNewEmployee(employee);
    }

    @GetMapping("/getall")
    public List<Employee> getallEmployee() {
        return employeeService.getAllEmployee();
    }

    @GetMapping("/getbyid/{empid}")
    public Optional<Employee> getbyId(@PathVariable Long empid) {
        return employeeService.getById(empid);
    }

    @DeleteMapping("/deletebyid/{empid}")
    public String deleteById(@PathVariable Long empid) {
        return employeeService.deletebyid(empid);
    }

    @DeleteMapping("/deleteall")
    public String deleteall() {
        return employeeService.deleteall();
    }
    
    @PostMapping("/login")
    public ResponseEntity<?> login(@RequestBody Map<String, String> loginData) {
        String email = loginData.get("email");
        String password = loginData.get("password");

        Employee employee = employeeService.login(email, password);
        if (employee != null) {
            return ResponseEntity.ok(employee);
        } else {
            return ResponseEntity.status(HttpStatus.UNAUTHORIZED).body("Invalid email or password");
        }
    }
}

