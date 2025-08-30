package com.sovathyut.Employee_Managerment.Entity;

import java.time.LocalDate;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.JoinColumn;
import jakarta.persistence.ManyToOne;
import jakarta.persistence.Table;

@Entity
@Table(name = "Payroll")
public class PayRollEntity {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "PayrollId")
    private Long payrollId;
    @ManyToOne
    @JoinColumn(name = "empid", nullable = false) // ✅ employee must exist
    private EmpEntity empid;
    @Column(name = "BasicSalary")
    private Double basicsalary = 0.0 ;
    @Column(name = "Bounus")
    private Double bounus = 0.0 ;
    @Column(name = "Deduction")
    private Double deduction = 0.0 ;
    @Column(name = "Net_salary")
    private Double netsalary;
    @Column(name = "PayDate")
    private LocalDate paydate;
    public Long getPayrollId() {
        return payrollId;
    }
    public void setPayrollId(Long payrollId) {
        this.payrollId = payrollId;
    }
    public EmpEntity getEmpid() {
        return empid;
    }
    public void setEmpid(EmpEntity empid) {
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
    public Double getNetsalary() {
        return netsalary;
    }
    public void setNetsalary(Double netsalary) {
        this.netsalary = netsalary;
    }
    public LocalDate getPaydate() {
        return paydate;
    }
    public void setPaydate(LocalDate paydate) {
        this.paydate = paydate;
    }

    


}
