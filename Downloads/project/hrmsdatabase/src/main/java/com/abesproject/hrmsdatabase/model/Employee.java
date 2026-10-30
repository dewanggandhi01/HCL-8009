package com.abesproject.hrmsdatabase.model;

import com.fasterxml.jackson.annotation.JsonAlias;
import jakarta.persistence.*;

@Entity
@Table(name = "employee")
public class Employee {

    @Id
    @Column(name = "emp_id")
    @JsonAlias({"emp_id", "empId"})
    private Long empid;

    @Column(name = "emp_name")
    @JsonAlias({"name", "empName"})
    private String emp_name;

    private String email;
    private String designation;
    private String stack;
    private String password;

    public Employee() {
    }

    public Employee(Long empid, String emp_name, String email, String designation, String stack, String password) {
        this.empid = empid;
        this.emp_name = emp_name;
        this.email = email;
        this.designation = designation;
        this.stack = stack;
        this.password = password;
    }

    public Long getEmpid() {
        return empid;
    }

    public void setEmpid(Long empid) {
        this.empid = empid;
    }

    public String getEmp_name() {
        return emp_name;
    }

    public void setEmp_name(String emp_name) {
        this.emp_name = emp_name;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public String getDesignation() {
        return designation;
    }

    public void setDesignation(String designation) {
        this.designation = designation;
    }

    public String getStack() {
        return stack;
    }

    public void setStack(String stack) {
        this.stack = stack;
    }

    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password;
    }
}
