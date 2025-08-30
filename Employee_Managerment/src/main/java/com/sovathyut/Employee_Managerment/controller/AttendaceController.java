package com.sovathyut.Employee_Managerment.controller;

import java.time.LocalDateTime;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.server.ResponseStatusException;

import com.sovathyut.Employee_Managerment.Entity.AttendanceEntity;
import com.sovathyut.Employee_Managerment.Entity.EmpEntity;
import com.sovathyut.Employee_Managerment.Repository.AttendaceRepository;
import com.sovathyut.Employee_Managerment.Repository.EmpRepository;
import com.sovathyut.Employee_Managerment.Request.AttendencRquest;

@RestController
@RequestMapping("/Attendace")
public class AttendaceController {
    @Autowired AttendaceRepository attendaceRepository;
    @Autowired EmpRepository empRepository;

    // Add Attendace 
    @PostMapping()
    public AttendanceEntity saveAttendace(
        @RequestBody AttendencRquest attendencRquest
    ){
        EmpEntity empEntity = empRepository.findById(attendencRquest.getEmpid()).orElseThrow();


        AttendanceEntity attendace = new AttendanceEntity();
        attendace.setEmpid(empEntity);
        attendace.setCheckin(LocalDateTime.now());
        attendace.setDate(LocalDateTime.now());
        attendace.setStatus(attendencRquest.getStatus());
        

        return this.attendaceRepository.save(attendace);
    }

    // show Attendance 
    @GetMapping()
    public List <AttendanceEntity> findAll(){
        return attendaceRepository.findAll();
    }

   // find by id 
    @GetMapping("/{attendanceid}")
    public AttendanceEntity findById(
        @PathVariable("attendanceid") Long attendanceid
    ){
        return attendaceRepository.findById(attendanceid).orElseThrow();
    }

    // update Attendance 
   @PutMapping("/{attendanceId}")
public AttendanceEntity checkout(
    @PathVariable("attendanceId") Long attendanceId
    
){
    AttendanceEntity attendance = attendaceRepository.findById(attendanceId)
        .orElseThrow(() -> new ResponseStatusException(
            HttpStatus.NOT_FOUND, "Attendance not found with ID: " + attendanceId
        ));

    // Update checkout time
        attendance.setCheckout(LocalDateTime.now());
        return attendaceRepository.save(attendance);
    }

}
