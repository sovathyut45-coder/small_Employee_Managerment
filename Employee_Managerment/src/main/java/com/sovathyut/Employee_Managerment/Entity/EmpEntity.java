package com.sovathyut.Employee_Managerment.Entity;


import java.time.LocalDate;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.Table;

@Entity
@Table(name = "tbemp")
public class EmpEntity {
    @Id
    
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "EmpID")
    private Long empid ;
    @Column(name = "EmpName")
    private String name;
    @Column(name =  "Sex")
    private String sex;
    @Column(name = "Salary")
    private Double salary;
    @Column(name = "Positon")
    private String position;
    @Column(name = "HireDate")
    private LocalDate hirDate;
    @Column(name = "Address")
    private String address;
    @Column (name = "Phone")
    private String phone;
    @Column(name = "IsStopWork")
    private Boolean Isstop;
    public Long getEmpid() {
        return empid;
    }
    public void setEmpid(Long empid) {
        this.empid = empid;
    }
    public String getName() {
        return name;
    }
    public void setName(String name) {
        this.name = name;
    }
    public String getSex() {
        return sex;
    }
    public void setSex(String sex) {
        this.sex = sex;
    }
    public Double getSalary() {
        return salary;
    }
    public void setSalary(Double salary) {
        this.salary = salary;
    }
    public String getPosition() {
        return position;
    }
    public void setPosition(String position) {
        this.position = position;
    }
    public LocalDate getHirDate() {
        return hirDate;
    }
    public void setHirDate(LocalDate hirDate) {
        this.hirDate = hirDate;
    }
    public String getAddress() {
        return address;
    }
    public void setAddress(String address) {
        this.address = address;
    }
    public String getPhone() {
        return phone;
    }
    public void setPhone(String phone) {
        this.phone = phone;
    }
    public Boolean getIsstop() {
        return Isstop;
    }
    public void setIsstop(Boolean isstop) {
        Isstop = isstop;
    }





}
