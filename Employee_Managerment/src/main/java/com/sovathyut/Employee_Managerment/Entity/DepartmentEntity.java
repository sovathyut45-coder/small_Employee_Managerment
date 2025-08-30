package com.sovathyut.Employee_Managerment.Entity;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.JoinColumn;
import jakarta.persistence.OneToOne;
import jakarta.persistence.Table;

@Entity
@Table(name = "tbdepartment")
public class DepartmentEntity {
    @Id
    @GeneratedValue(strategy =  GenerationType.IDENTITY)
    @Column(name = "DepartmentsID")
    private Long departmentID;
    @Column(name = "DepartmentsName")
    private String departmentName;
    @OneToOne
    @JoinColumn(name = "manager_id")
    private EmpEntity empid;
    public Long getDepartmentID() {
        return departmentID;
    }
    public void setDepartmentID(Long departmentID) {
        this.departmentID = departmentID;
    }
    public String getDepartmentName() {
        return departmentName;
    }
    public void setDepartmentName(String departmentName) {
        this.departmentName = departmentName;
    }
    public EmpEntity getEmpid() {
        return empid;
    }
    public void setEmpid(EmpEntity empid) {
        this.empid = empid;
    }
    
    

    

}
