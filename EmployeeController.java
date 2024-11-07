package com.employeemgmt.employeemanagementsystem;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;
import java.util.Optional;

@RestController
@RequestMapping("/employees")
public class EmployeeController {

    private final EmployeeRepository employeeRepository;

    public EmployeeController(EmployeeRepository employeeRepository) {
        this.employeeRepository = employeeRepository;
    }

    // Create a new employee
    @PostMapping
    public ResponseEntity<EmployeeData> createEmployee(@RequestBody EmployeeData employee) {
        EmployeeData savedEmployee = employeeRepository.save(employee);
        return new ResponseEntity<>(savedEmployee, HttpStatus.CREATED);
    }

    // Get all employees
    @GetMapping
    public ResponseEntity<List<EmployeeData>> getAllEmployees() {
        List<EmployeeData> employees = employeeRepository.findAll();
        return new ResponseEntity<>(employees, HttpStatus.OK);
    }

    // Get employee by ID
    @GetMapping("/{id}")
    public ResponseEntity<EmployeeData> getEmployeeById(@PathVariable int id) {
        Optional<EmployeeData> employee = employeeRepository.findById(id);
        return employee.map(value -> new ResponseEntity<>(value, HttpStatus.OK))
                .orElseGet(() -> new ResponseEntity<>(HttpStatus.NOT_FOUND));
    }

    // Update an existing employee
    @PutMapping("/{id}")
    public ResponseEntity<EmployeeData> updateEmployee(@PathVariable int id, @RequestBody EmployeeData employeeDetails) {
        Optional<EmployeeData> employee = employeeRepository.findById(id);

        if (employee.isPresent()) {
            EmployeeData updatedEmployee = employee.get();
            updatedEmployee.setEmpName(employeeDetails.getEmpName());
            updatedEmployee.setAge(employeeDetails.getAge());
            updatedEmployee.setSalary(employeeDetails.getSalary());
            updatedEmployee.setDesignation(employeeDetails.getDesignation());
            updatedEmployee.setContactNo(employeeDetails.getContactNo());

            employeeRepository.save(updatedEmployee);
            return new ResponseEntity<>(updatedEmployee, HttpStatus.OK);
        } else {
            return new ResponseEntity<>(HttpStatus.NOT_FOUND);
        }
    }

    // Delete an employee
    @DeleteMapping("/{id}")
    public ResponseEntity<Void> deleteEmployee(@PathVariable int id) {
        if (employeeRepository.existsById(id)) {
            employeeRepository.deleteById(id);
            return new ResponseEntity<>(HttpStatus.NO_CONTENT);
        } else {
            return new ResponseEntity<>(HttpStatus.NOT_FOUND);
        }
    }
}
