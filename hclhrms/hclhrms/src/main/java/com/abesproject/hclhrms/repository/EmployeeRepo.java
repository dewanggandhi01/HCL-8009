package com.abesproject.hclhrms.repository;

import com.abesproject.hclhrms.entity.Employee;
import java.util.List;

import org.springframework.stereotype.Repository;

@Repository 
public interface EmployeeRepo {

    Employee addEmp(Employee emp);

    List<Employee> getEmp();

    List<Employee> addEmpbulk(List<Employee> bulkEmp);

    Employee getEmpById(long empid);

    boolean deleteById(long empid);

    Employee updateById(long empid, Employee updatedEmp);
}

// package com.abesproject.hclhrms.repository;

// import com.abesproject.hclhrms.entity.Employee;
// import org.springframework.stereotype.Repository;

// import java.util.List;

// @Repository
// public interface EmployeeRepo {
//     String addEmp(Employee emp);
//     default String addemp(Employee emp) {
//         return addEmp(emp);
//     }
//     List<Employee> getEmp();
//     String addEmpbulk(List<Employee> bulkEmp);
//     Employee getEmpById(long empid);
//     String deleteById(long empid);
//     String updateById(long empid, Employee updatedEmp);
// }