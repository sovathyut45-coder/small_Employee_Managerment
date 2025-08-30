package com.sovathyut.Employee_Managerment.controller;

import java.time.LocalDate;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.server.ResponseStatusException;

import com.sovathyut.Employee_Managerment.Entity.EmpEntity;
import com.sovathyut.Employee_Managerment.Entity.PayRollEntity;
import com.sovathyut.Employee_Managerment.Repository.EmpRepository;
import com.sovathyut.Employee_Managerment.Repository.PayrollRepository;
import com.sovathyut.Employee_Managerment.Request.payrollRequest;

import jakarta.validation.Valid;

@RestController
@RequestMapping("/paroll")
public class PayrollController {
    @Autowired PayrollRepository payrollRepository;
     @Autowired EmpRepository empRepository;

    // Add payroll 
    @PostMapping()
    public PayRollEntity savePayroll(
        @RequestBody @Valid payrollRequest payrollRequest
    ){
        EmpEntity empEntity = empRepository.findById(payrollRequest.getEmpid()).orElseThrow();

        PayRollEntity payroll = new PayRollEntity();
        
        payroll.setEmpid(empEntity);
        payroll.setBasicsalary(payrollRequest.getBasicsalary());
        payroll.setBounus(payrollRequest.getBounus());
        payroll.setDeduction(payrollRequest.getDeduction());
        payroll.setPaydate(LocalDate.now());
        double netSalary = payroll.getBasicsalary() 
        + payroll.getBounus() 
        - payroll.getDeduction();
        payroll.setNetsalary(netSalary);
        return this.payrollRepository.save(payroll);
    }

    // show payRoll 
    @GetMapping()
    public List <PayRollEntity> findAll(){
        return payrollRepository.findAll();
    }

    // find by Id
    @GetMapping("/{payrollId}")
    public PayRollEntity findById(
        @PathVariable("payrollId") Long payrollId
    ){
        return payrollRepository.findById(payrollId)
            .orElseThrow(() -> new ResponseStatusException(
                HttpStatus.NOT_FOUND, "Payroll not found with ID: " + payrollId));
    }
    // Update payroll 

    @PutMapping("/{payrollId}")
    public PayRollEntity UpdatePayroll(
        @PathVariable("payrollId") Long payrollId , 
        @RequestBody  payrollRequest payrollRequest
    ){
        EmpEntity empEntity = empRepository.findById(payrollRequest.getEmpid()).orElseThrow();
        PayRollEntity payroll = payrollRepository.findById(payrollId).orElseThrow();

        payroll.setBasicsalary(payrollRequest.getBasicsalary());
        payroll.setBounus(payrollRequest.getBounus());
        payroll.setDeduction(payrollRequest.getDeduction());
    
        double netSalary = payrollRequest.getBasicsalary()
                           + payrollRequest.getBounus()
                           - payrollRequest.getDeduction();
        payroll.setNetsalary(netSalary);
    
        payroll.setPaydate(LocalDate.now());
        payroll.setEmpid(empEntity);
        
        return payrollRepository.save(payroll);
    }

        // ✅ Delete payroll
    @DeleteMapping("/{payrollId}")
    public void deletePayroll(@PathVariable Long payrollId) {
        if (!payrollRepository.existsById(payrollId)) {
            throw new ResponseStatusException(HttpStatus.NOT_FOUND, "Payroll not found with ID " + payrollId);
        }
        payrollRepository.deleteById(payrollId);
    }
}


