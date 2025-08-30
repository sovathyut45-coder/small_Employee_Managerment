package com.sovathyut.Employee_Managerment.DTO;

import java.time.LocalDate;
import jakarta.validation.constraints.NotNull;

public class PayrollDTO {

    @NotNull(message = "EmpID cannot be empty")
    private Long empid;
    @NotNull(message = "BasicSalary cannot be empty")
    private Double basicsalary = 0.0;
    private Double bounus = 0.0;
    @NotNull(message = "Deduction cannot be empty")
    private Double deduction = 0.0;
    @NotNull(message = "PayDate cannot be empty")
    private LocalDate paydate;
    public Long getEmpId() {
        return empid;
    }
    public void setEmpId(Long empId) {
        this.empid = empId;
    }
    public Double getBasicsalary() {
        return basicsalary;
    }
    public void setBasicsalary(Double basicsalary) {
        this.basicsalary = basicsalary;
    }
    public Double getBounus() {
        return bounus;
    }
    public void setBounus(Double bounus) {
        this.bounus = bounus;
    }
    public Double getDeduction() {
        return deduction;
    }
    public void setDeduction(Double deduction) {
        this.deduction = deduction;
    }
    public LocalDate getPaydate() {
        return paydate;
    }
    public void setPaydate(LocalDate paydate) {
        this.paydate = paydate;
    }

    

}
