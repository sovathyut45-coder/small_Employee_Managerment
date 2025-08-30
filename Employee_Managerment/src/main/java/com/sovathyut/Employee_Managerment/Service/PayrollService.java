package com.sovathyut.Employee_Managerment.Service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.sovathyut.Employee_Managerment.Entity.PayRollEntity;
import com.sovathyut.Employee_Managerment.Repository.PayrollRepository;

@Service
public class PayrollService {
    @Autowired PayrollRepository payrollRepository;

    public PayRollEntity save(
        PayRollEntity payroll
    ){
        return payrollRepository.save(payroll);
    }

}
