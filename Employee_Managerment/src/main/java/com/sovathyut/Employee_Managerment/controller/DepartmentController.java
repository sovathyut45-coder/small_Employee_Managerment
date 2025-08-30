package com.sovathyut.Employee_Managerment.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.sovathyut.Employee_Managerment.DTO.DepartmentDTO;
import com.sovathyut.Employee_Managerment.Entity.DepartmentEntity;
import com.sovathyut.Employee_Managerment.Entity.EmpEntity;
import com.sovathyut.Employee_Managerment.Repository.DepartmentRepository;
import com.sovathyut.Employee_Managerment.Repository.EmpRepository;

@RestController
@RequestMapping("/department")
public class DepartmentController {
    @Autowired DepartmentRepository departmentRepository;
    @Autowired EmpRepository empRepository;
    // add Department
    @PostMapping()
    public DepartmentEntity saveDepartment( 
        @RequestBody DepartmentDTO department
        ){
            DepartmentEntity departmentEntity = new DepartmentEntity();
            EmpEntity empEntity = empRepository.findById(department.getEmpid()).orElseThrow();
            departmentEntity.setEmpid(empEntity);
            departmentEntity.setDepartmentName(department.getDepartmentName());

            return this.departmentRepository.save(departmentEntity);
    }

    // show all department 
    @GetMapping()
    public List<DepartmentEntity> findAll(){
        return departmentRepository.findAll();
    }

    // find department By Id 
    @GetMapping("/{departmentID}")
    public DepartmentEntity findById(
    @PathVariable("departmentID") Long departmentID
    ){
        return departmentRepository.findById(departmentID).orElseThrow();
    }

    // Update Department 
    @PutMapping("/{departmentID}")
    public DepartmentEntity UpdateDepartment(
        @PathVariable Long departmentID , 
        @RequestBody DepartmentEntity updateDepartment ,
        @RequestBody DepartmentDTO department
    ){
        DepartmentEntity deparment = departmentRepository.findById(departmentID).orElseThrow();
        EmpEntity empEntity = empRepository.findById(department.getEmpid()).orElseThrow();
        deparment.setEmpid(empEntity);
        deparment.setDepartmentName(department.getDepartmentName());

        return departmentRepository.save(deparment);
    }

    

}
