package com.employeemgmt.employeemanagementsystem;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import lombok.Getter;
import lombok.Setter;

@Getter
@Setter
@Entity
public class EmployeeData {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private int empID;
    private String empName;
    private int age;
    private double salary;
    private String designation;
    private long contactNo;

    @Override
    public String toString() {
        return "EmployeeData{" +
                "empID=" + empID +
                ", empName='" + empName + '\'' +
                ", age=" + age +
                ", salary=" + salary +
                ", designation='" + designation + '\'' +
                ", contactNo=" + contactNo +
                '}';
    }

}
