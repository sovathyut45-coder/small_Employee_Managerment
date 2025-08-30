package com.sovathyut.Employee_Managerment.Repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.sovathyut.Employee_Managerment.Entity.EmpEntity;

@Repository
public interface EmpRepository extends JpaRepository<EmpEntity , Long>{

}
