package com.abesproject.hclhrms.repository;

import com.abesproject.hclhrms.entity.Employee;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public interface EmployeeRepo {
    String addEmp(Employee emp);
    default String addemp(Employee emp) {
        return addEmp(emp);
    }
    List<Employee> getEmp();
    String getEmpbulk(List<Employee> bulkEmp);
    Employee getEmpById(long empid);
    String deleteById(long empid);
    String updateById(long empid, Employee updatedEmp);
}