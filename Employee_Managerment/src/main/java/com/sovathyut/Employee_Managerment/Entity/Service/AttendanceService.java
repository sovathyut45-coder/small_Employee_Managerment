package com.sovathyut.Employee_Managerment.Service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.sovathyut.Employee_Managerment.Entity.AttendanceEntity;
import com.sovathyut.Employee_Managerment.Repository.AttendaceRepository;

@Service

public class AttendanceService {
    @Autowired AttendaceRepository attendaceRepository;

    public AttendanceEntity saveAttendance(
        AttendanceEntity attendance
    ){
        return attendaceRepository.save(attendance);
    }

}
