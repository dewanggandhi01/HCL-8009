package com.abesproject.hclhrms.repository;

import com.abesproject.hclhrms.entity.Employee;
import org.springframework.stereotype.Repository;

import java.util.ArrayList;
import java.util.List;

@Repository
public class EmpRepInf implements EmployeeRepo {

    List<Employee> emplist = new ArrayList<>();

    @Override
    public String addEmp(Employee emp) {

        if (emp == null) {
            return "Employee data cannot be empty!";
        }

        if (getEmpById(emp.getEmp_id()) != null) {
            return "Employee ID already exists!";
        }

        emplist.add(emp);
        return "Employee added successfully!";
    }

    @Override
    public String addEmpbulk(List<Employee> bulkEmp) {

        if (bulkEmp == null || bulkEmp.isEmpty()) {
            return "Employee list cannot be empty!";
        }

        int count = 0;

        for (Employee emp : bulkEmp) {
            if (emp != null && getEmpById(emp.getEmp_id()) == null) {
                emplist.add(emp);
                count++;
            }
        }

        if (count == 0) {
            return "No new employees were added!";
        }

        return count + " employees added successfully!";
    }

    @Override
    public List<Employee> getEmp() {
        return emplist;
    }

    @Override
    public Employee getEmpById(long empid) {

        for (Employee emp : emplist) {
            if (emp.getEmp_id() == empid) {
                return emp;
            }
        }

        return null;
    }

    @Override
    public String deleteById(long empid) {

        boolean status = emplist.removeIf(
                emp -> emp.getEmp_id() == empid
        );

        if (status) {
            return "Employee deleted successfully!";
        }

        return "Employee not found!";
    }

    @Override
    public String updateById(long empid, Employee updatedEmp) {

        if (updatedEmp == null) {
            return "Updated employee data cannot be empty!";
        }

        for (int i = 0; i < emplist.size(); i++) {

            Employee emp = emplist.get(i);

            if (emp.getEmp_id() == empid) {

                updatedEmp.setEmp_id(empid);
                emplist.set(i, updatedEmp);

                return "Employee updated successfully!";
            }
        }

        return "Employee not found!";
    }
}

// package com.abesproject.hclhrms.repository;

// import com.abesproject.hclhrms.entity.Employee;

// import org.springframework.stereotype.Repository;

// import java.util.ArrayList;
// import java.util.List;

// @Repository
// public class EmpRepInf implements EmployeeRepo{
//     List<Employee> emplist= new ArrayList<>();
//     @Override
//     public String addEmp(Employee emp) {
//         emplist.add(emp);
//         return "Employee added successfully!";
//     }
    
//     public String addEmpbulk(List<Employee> bulkEmp){
//         List < Employee> newlist=List.of(new Employee(890, "John Doe", "Test Engineer", "Java", "john.doe@example.com"));
//         this.emplist.addAll(newlist);
//         return "";
//     }

//     @Override
//     public List<Employee> getEmp() {
//         return emplist;
//     }

//     @Override
//     public Employee getEmpById(long empid) {
//         return null;
//     }

//     @Override 
//     public String deleteById(long empid){
//         boolean status=false;
//         if(getEmpById(empid)!=null){
//             status=emplist.removeIf(Employee e->e.getEmp_id()==empid);
//         }
//         if(status){
//             return "Employee deleted successfully!";
//         }
//     }
//     @Override
//     public String updateById(long empid, Employee updatedEmp) {
//         return "";
//     }
// }