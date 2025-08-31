package com.sovathyut.Employee_Managerment.controller;

import java.time.LocalDate;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.sovathyut.Employee_Managerment.Entity.EmpDTO;
import com.sovathyut.Employee_Managerment.Entity.EmpEntity;
import com.sovathyut.Employee_Managerment.Repository.EmpRepository;

import jakarta.validation.Valid;

@RestController
@RequestMapping("/emp")
public class EmpCotroller {
    
    @Autowired EmpRepository empRepository;


    // // Add Emp
    // @PostMapping()
    // public EmpEntity saveEmp(
    //     @RequestBody EmpEntity emp
    // ){
    //     emp.setHirDate(LocalDateTime.now());
    //     return this.empRepository.save(emp);

    // } basic test
    @PostMapping()
    public EmpEntity saveEmp(
        @RequestBody @Valid EmpDTO emp 
    ){
        EmpEntity empEntity = new EmpEntity();
        empEntity.setName(emp.getName());
        empEntity.setSex(emp.getSex());
        empEntity.setSalary(emp.getSalary());
        empEntity.setAddress(emp.getAddress());
        empEntity.setPhone(emp.getPhone());
        empEntity.setPosition(emp.getPosition());
        empEntity.setHirDate(emp.getHirDate());
        empEntity.setIsstop(emp.getIsstop());
        return empRepository.save(empEntity);
    }

    // Show Employee
    @GetMapping()
    public List<EmpEntity>findAll(){
        return empRepository.findAll();
    }

    // show by id 
    @GetMapping("/{empid}")
    public EmpEntity findEmpById(@PathVariable Long empid){
        return empRepository.findById(empid).orElseThrow();
    }

    // update Emp 
    @PutMapping("/{empid}")
    public EmpEntity UpdateEmp(
        @PathVariable("empid") Long empid ,
        @RequestBody EmpEntity updateEmp
    ){
        // find emp 
        EmpEntity emp = empRepository.findById(empid).orElseThrow();
        emp.setName(updateEmp.getName());
        emp.setSex(updateEmp.getSex());
        emp.setAddress(updateEmp.getAddress());
        updateEmp.getHirDate();
        emp.setHirDate(LocalDate.now());
        emp.setSalary(updateEmp.getSalary());
        emp.setIsstop(updateEmp.getIsstop());
        emp.setPhone(updateEmp.getPhone());
        // update
        return empRepository.save(emp);
    }


}
