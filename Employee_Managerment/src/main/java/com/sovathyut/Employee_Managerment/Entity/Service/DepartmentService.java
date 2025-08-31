package com.sovathyut.Employee_Managerment.Service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.sovathyut.Employee_Managerment.Entity.DepartmentEntity;
import com.sovathyut.Employee_Managerment.Repository.DepartmentRepository;

@Service
public class DepartmentService {
    @Autowired DepartmentRepository departmentRepository;

    public DepartmentEntity save (
        DepartmentEntity department
    ){
        return departmentRepository.save(department);
    }

}
