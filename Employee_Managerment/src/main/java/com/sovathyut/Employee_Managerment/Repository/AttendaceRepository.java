package com.sovathyut.Employee_Managerment.Repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.sovathyut.Employee_Managerment.Entity.AttendanceEntity;

public interface AttendaceRepository extends JpaRepository<AttendanceEntity , Long> {

}
