package com.abesproject.hrmsdatabase.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service 
public class EmployeeService {
    @Autowired 
    private EmployeeRepository employeeRepository;
    
    public String createNewEmployee(){
        Employee emp1=new Employee(emp_id:2001, emp_name:"John", stack:"Java");
        employeeRepository.save(emp1);
        return "Employee created successfully";
    }
    
}
