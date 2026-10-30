package com.abesproject.hrmsdatabase.service;

import com.abesproject.hrmsdatabase.model.Attendance;
import com.abesproject.hrmsdatabase.repository.AttendanceRepository;
import com.abesproject.hrmsdatabase.repository.EmployeeRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.time.LocalDate;
import java.util.List;

@Service
public class AttendanceService {

    @Autowired
    private AttendanceRepository attendanceRepository;

    @Autowired
    private EmployeeRepository employeeRepository;

    public String markAttendance(Attendance attendance) {
        if (attendance.getEmployee() == null || attendance.getEmployee().getEmpid() == null) {
            return "Attendance not marked: Employee information missing";
        }

        Long empId = attendance.getEmployee().getEmpid();

        if (employeeRepository.existsById(empId)) {
            boolean alreadyMarked = attendanceRepository.existsByEmployee_EmpidAndAttendancedate(empId, LocalDate.now());

            if (!alreadyMarked) {
                attendance.setAttendancedate(LocalDate.now());
                attendanceRepository.save(attendance);
                return "Attendance Marked Successfully";
            } else {
                return "Attendance already marked for today";
            }
        } else {
            return "Attendance not marked: Employee does not exist";
        }
    }
    
    public List<Attendance> getAttendanceByEmpId(Long empid) {
        return attendanceRepository.findByEmployee_Empid(empid);
    }

    public List<Attendance> getAllAttendance() {
        return attendanceRepository.findAll();
    }
}
