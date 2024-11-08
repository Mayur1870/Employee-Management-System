package com.employeemgmt.employeemanagementsystem.repo;

import com.employeemgmt.employeemanagementsystem.entity.EmployeeData;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;

import java.util.List;

public interface EmployeeRepository extends JpaRepository<EmployeeData, Integer> {

    @Query("SELECT e FROM EmployeeData e WHERE e.salary > ?1 ORDER BY e.salary ASC")
    List<EmployeeData> findBySalaryGreaterThan(double salary);

    @Query("SELECT e FROM EmployeeData e WHERE e.salary = (SELECT MAX(e2.salary) FROM EmployeeData e2)")
    List<EmployeeData> findEmployeesWithMaxSalary();

    @Query("SELECT e from EmployeeData e where e.age > ?1")
    List<EmployeeData> findEmployeesWithAge(int age);
}
