package com.abesproject.hrmsdatabase.controller;

import com.abesproject.hrmsdatabase.model.Attendance;
import com.abesproject.hrmsdatabase.service.AttendanceService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@CrossOrigin(origins = "http://localhost:5173")
@RequestMapping("/v1/user/attendance")
public class AttendanceController {

    @Autowired
    private AttendanceService attendanceService;

    @PostMapping("/markattendance")
    public String markAttendance(@RequestBody Attendance attendance) {
        System.out.println("InTime received: " + attendance.getInTime());
        return attendanceService.markAttendance(attendance);
    }
    
    @GetMapping("/employee/{empid}")
    public List<Attendance> getAttendanceByEmployee(@PathVariable Long empid) {
        return attendanceService.getAttendanceByEmpId(empid);
    }

    @GetMapping("/all")
    public List<Attendance> getAllAttendance() {
        return attendanceService.getAllAttendance();
    }
}

