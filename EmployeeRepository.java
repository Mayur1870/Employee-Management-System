package com.employeemgmt.employeemanagementsystem;

import org.springframework.data.jpa.repository.JpaRepository;

public interface EmployeeRepository extends JpaRepository<EmployeeData, Integer> {

}
