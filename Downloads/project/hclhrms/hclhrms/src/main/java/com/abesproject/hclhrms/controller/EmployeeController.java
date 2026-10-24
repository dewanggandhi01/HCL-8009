

package com.abesproject.hclhrms.controller;

import com.abesproject.hclhrms.EmployeeServiceImp;
import com.abesproject.hclhrms.entity.Employee;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
public class EmployeeController {
    @Autowired
    private EmployeeServiceImp employeeServiceImp;

    @GetMapping("/")
    public String home() {
        return "HCL HRMS application is running successfully!";
    }
    @PostMapping("/addemp")
    public String addnewEmployee(@RequestBody Employee emp) {
        return employeeServiceImp.addEmp(emp);
    }

    @GetMapping("/getemp")
    public List<Employee> getEmp() {
        return employeeServiceImp.getEmp();
    }

    @GetMapping("/getempbyid")
    public Employee getEmpById(@RequestParam long empid) {
        return employeeServiceImp.getEmpById(empid);
    }

    @DeleteMapping("/deletebyid")
    public String deleteById(@RequestParam long empid) {
        return employeeServiceImp.deleteById(empid);
    }

    @PostMapping("/addempbulk")
    public String addEmpbulk(@RequestBody List<Employee> bulkEmp) {
        return employeeServiceImp.addEmpbulk(bulkEmp);
    }

    @PutMapping("/updatebyid")
    public String updateById(
            @RequestParam long empid,
            @RequestBody Employee updatedEmp) {
        return employeeServiceImp.updateById(empid, updatedEmp);
    }
}
// package com.abesproject.hclhrms.controller;

// import com.abesproject.hclhrms.EmployeeServiceImp;
// import com.abesproject.hclhrms.entity.Employee;
// import org.springframework.beans.factory.annotation.Autowired;
// import org.springframework.web.bind.annotation.GetMapping;
// import org.springframework.web.bind.annotation.RestController;

// import java.util.List;

// @RestController
// public class EmployeeController {
//     @Autowired
//     private EmployeeServiceImp employeeServiceImp;


//         @GetMapping("/addemp")
//     public  String addnewEmployee(){
//         return employeeServiceImp.addEmp();
//     }


//     @GetMapping("/getemp")
//     public List<Employee> getEmp(){
//         return employeeServiceImp.getemp();
//     }
    
//     @GetMapping ("/getempbyid")
//     public Employee getEmpById(){
//         return employeeServiceImp.getEmpById();
//     }
    
//     @GetMapping ("/deletebyid")
//     public String deleteById(long empid){
//         return employeeServiceImp.deleteById(empid);
//     }
    
//     @GetMapping ("/addempbulk")
//     public String addEmpbulk(){
//         return employeeServiceImp.addEmpbulk(null);
//     }
// }
