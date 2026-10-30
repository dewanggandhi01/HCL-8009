package com.abesproject.hclhrms;

import com.abesproject.hclhrms.entity.Employee;
import com.abesproject.hclhrms.repository.EmployeeRepo;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class EmployeeServiceImp {
    @Autowired 
    private final EmployeeRepo employeeRepo;

    public EmployeeServiceImp(EmployeeRepo employeeRepo) {
        this.employeeRepo = employeeRepo;
    }

    public Employee addEmp(Employee emp) {
        return employeeRepo.addEmp(emp);
    }

    public List<Employee> getEmp() {
        return employeeRepo.getEmp();
    }

    public Employee getEmpById(long empid) {
        return employeeRepo.getEmpById(empid);
    }

    public boolean deleteById(long empid) {
        return employeeRepo.deleteById(empid);
    }

    public List<Employee> addEmpbulk(List<Employee> bulkEmp) {
        return employeeRepo.addEmpbulk(bulkEmp);
    }

    public Employee updateById(
            long empid, Employee updatedEmp) {

        return employeeRepo.updateById(empid, updatedEmp);
    }
}

// package com.abesproject.hclhrms;

// import com.abesproject.hclhrms.entity.Employee;
// import com.abesproject.hclhrms.repository.EmpRepInf;
// import com.abesproject.hclhrms.repository.EmployeeRepo;
// import org.springframework.beans.factory.annotation.Autowired;
// import org.springframework.stereotype.Service;

// import java.util.List;

// @Service

// public class EmployeeServiceImp {
//     @Autowired
//     private EmpRepInf emprepo;
//     public String addEmp(){
//         Employee empl=new Employee(200, "Rahul", "FSD",
//                 "java", "rahul@gmail.com");
//         return emprepo.addemp(empl);


//     }
//     public List<Employee> getemp(){
//         return emprepo.getEmp();
//     }
    
//     public Employee getEmpById(){
//         return emprepo.getEmpById(2001L);
//     }
    
//     public String deleteById(long empid){
//         return emprepo.deleteById(empid);
//     }
//     public String addEmpbulk(List<Employee> bulkEmp){
//         return emprepo.addEmpbulk(bulkEmp);
//     }
// }