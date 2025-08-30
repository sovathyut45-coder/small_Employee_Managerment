package com.sovathyut.Employee_Managerment.Request;

import java.time.LocalDate;

public class payrollRequest {
    private Long empid;

    private Double basicsalary;
    private Double bounus; 
    private Double deduction;

    private LocalDate paydate;




    public Long getEmpid() {
        return empid;
    }

    public void setEmpid(Long empid) {
        this.empid = empid;
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
