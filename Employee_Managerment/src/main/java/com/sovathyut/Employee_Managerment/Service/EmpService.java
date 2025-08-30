package com.sovathyut.Employee_Managerment.Service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.sovathyut.Employee_Managerment.Entity.EmpEntity;
import com.sovathyut.Employee_Managerment.Repository.EmpRepository;

@Service
public class EmpService {

    @Autowired 
    EmpRepository empRepository;
    public EmpEntity save(EmpEntity emp ){
        return empRepository.save(emp);
    } 

}
