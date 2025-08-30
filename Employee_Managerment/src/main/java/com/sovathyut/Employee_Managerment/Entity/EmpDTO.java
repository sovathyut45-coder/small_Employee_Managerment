package com.sovathyut.Employee_Managerment.Entity;

import java.time.LocalDate;

import jakarta.validation.constraints.NotBlank;
import jakarta.validation.constraints.NotNull;
import jakarta.validation.constraints.Size;

public class EmpDTO {
    
    @NotBlank(message = "Name cannot be empty")
    @Size(min = 3, max = 15, message = "ISBN must be between 3 and 20 characters")

    private String name;
    @NotBlank(message = "Sex cannot be empty")
    private String sex;
    @NotNull(message = "Salary cannot be empty")
    private Double salary;
    @NotBlank(message = "Position cannot be empty")
    @Size(min = 3, max = 20, message = "Position must be between 3 and 20 characters")
    private String position;
    @NotBlank(message = "Address cannot be empty")
    @Size(min = 3, max = 20, message = "Address must be between 3 and 20 characters")
    private String address;
    @NotBlank(message = "Phone cannot be empty")
    @Size(min = 3, max = 20, message = "Phone must be between 3 and 20 characters")
    private String phone;
    @NotNull(message = "IsStop must be specified (true/false)")
    private Boolean Isstop;
    
    @NotNull(message = "Hire date is required")
    private LocalDate hirDate;
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
    public LocalDate getHirDate() {
        return hirDate;
    }
    public void setHirDate(LocalDate hirDate) {
        this.hirDate = hirDate;
    }

}
