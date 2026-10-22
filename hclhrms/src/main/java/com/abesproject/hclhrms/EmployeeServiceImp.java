package com.abesproject.hclhrms;

import com.abesproject.hclhrms.entity.Employee;
import com.abesproject.hclhrms.repository.EmpRepInf;
import com.abesproject.hclhrms.repository.EmployeeRepo;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service

public class EmployeeServiceImp {
    @Autowired
    private EmpRepInf emprepo;
    public String addEmp(){
        Employee empl=new Employee(200, "Rahul", "FSD",
                "java", "rahul@gmail.com");
        return emprepo.addemp(empl);


    }
    public List<Employee> getemp(){
        return emprepo.getEmp();
    }
    
    public Employee getEmpById(){
        return emprepo.getEmpById(2001L);
    }
}