package com.abesproject.hrmsdatabase.service;

import com.abesproject.hrmsdatabase.model.Employee;
import com.abesproject.hrmsdatabase.repository.EmployeeRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

@Service
public class EmployeeService {

    @Autowired
    private EmployeeRepository employeeRepository;

    public String createNewEmployee(Employee employee) {
        employeeRepository.save(employee);
        return "Employee added successfully";
    }

    public List<Employee> getAllEmployee() {
        return employeeRepository.findAll();
    }

    public Optional<Employee> getById(long id) {
        return employeeRepository.findById(id);
    }

    public String deletebyid(long id) {
        employeeRepository.deleteById(id);
        return "Deleted successfully";
    }

    public String deleteall() {
        employeeRepository.deleteAll();
        return "All records deleted";
    }
    
    public Employee login(String email, String password) {
        Optional<Employee> optionalEmp = employeeRepository.findByEmail(email);
        if (optionalEmp.isPresent()) {
            Employee emp = optionalEmp.get();
            if (emp.getPassword() != null && emp.getPassword().equals(password)) {
                return emp; // Success: return employee object
            }
        }
        return null; // Invalid credentials
    }
}