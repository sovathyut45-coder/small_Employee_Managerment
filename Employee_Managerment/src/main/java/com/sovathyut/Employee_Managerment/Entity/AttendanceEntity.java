package com.sovathyut.Employee_Managerment.Entity;


import java.time.LocalDateTime;
import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.JoinColumn;
import jakarta.persistence.ManyToOne;
import jakarta.persistence.Table;

@Entity
@Table(name = "tbattendance")
public class AttendanceEntity {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "AttendanceID")
    private Long attendanceid ;
    @ManyToOne
    @JoinColumn(name = "empid" , nullable = false)
    private EmpEntity empid;
    @Column(name = "Date")
    private LocalDateTime date;
    @Column(name = "CheckIn")
    private LocalDateTime checkin;
    @Column(name = "CheckOut")
    private LocalDateTime checkout;

    @Column(name = "Status")

    private String status ="Pending";

    public Long getAttendanceid() {
        return attendanceid;
    }

    public void setAttendanceid(Long attendanceid) {
        this.attendanceid = attendanceid;
    }

    public EmpEntity getEmpid() {
        return empid;
    }

    public void setEmpid(EmpEntity empid) {
        this.empid = empid;
    }


    public LocalDateTime getDate() {
        return date;
    }

    public void setDate(LocalDateTime date) {
        this.date = date;
    }


    public LocalDateTime getCheckin() {
        return checkin;
    }

    public String getStatus() {
        return status;
    }

    public void setStatus(String status) {
        this.status = status;
    }

    public void setCheckin(LocalDateTime checkin) {
        this.checkin = checkin;
    }

    public LocalDateTime getCheckout() {
        return checkout;
    }

    public void setCheckout(LocalDateTime checkout) {
        this.checkout = checkout;
    }

    


}
