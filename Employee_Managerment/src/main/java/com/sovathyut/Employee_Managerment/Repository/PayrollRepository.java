package com.sovathyut.Employee_Managerment.Repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.sovathyut.Employee_Managerment.Entity.PayRollEntity;

public interface PayrollRepository extends JpaRepository <PayRollEntity ,Long> {

}
