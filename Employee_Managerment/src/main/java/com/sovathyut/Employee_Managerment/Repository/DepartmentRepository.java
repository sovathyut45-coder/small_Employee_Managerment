package com.sovathyut.Employee_Managerment.Repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.sovathyut.Employee_Managerment.Entity.DepartmentEntity;

public interface DepartmentRepository extends JpaRepository<DepartmentEntity , Long> {

}
