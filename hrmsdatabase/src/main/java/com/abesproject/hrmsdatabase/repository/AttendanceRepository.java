package com.abesproject.hrmsdatabase.repository;

import com.abesproject.hrmsdatabase.model.Attendance;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import java.time.LocalDate;
import java.util.List;

@Repository
public interface AttendanceRepository extends JpaRepository<Attendance, Long> {
    boolean existsByEmployee_EmpidAndAttendancedate(Long empid, LocalDate attendancedate);
    List<Attendance> findByEmployee_Empid(Long empid); // Naya method
}